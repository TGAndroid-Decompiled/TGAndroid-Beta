package org.telegram.messenger.audioinfo.mp3;

import androidx.recyclerview.widget.DiffUtil;
import com.stripe.android.Stripe;
import java.io.IOException;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public final class ID3v2TagHeader {
    public final boolean compression;
    public final int footerSize;
    public final int headerSize;
    public final int revision;
    public final int totalTagSize;
    public final boolean unsynchronization;
    public final int version;

    public ID3v2TagHeader(MP3Input mP3Input) throws IOException, ID3v2Exception {
        PositionInputStream positionInputStream = new PositionInputStream(mP3Input);
        this.version = 0;
        this.revision = 0;
        this.headerSize = 0;
        this.totalTagSize = 0;
        this.footerSize = 0;
        Stripe stripe = new Stripe(positionInputStream, 12);
        byte[] bArr = new byte[3];
        stripe.readFully(3, bArr);
        String str = new String(bArr, "ISO-8859-1");
        if (!"ID3".equals(str)) {
            throw new ID3v2Exception("Invalid ID3 identifier: ".concat(str));
        }
        byte b = stripe.readByte();
        this.version = b;
        if (b != 2 && b != 3 && b != 4) {
            throw new ID3v2Exception(DiffUtil.m(b, "Unsupported ID3v2 version: "));
        }
        this.revision = stripe.readByte();
        byte b2 = stripe.readByte();
        int syncsafeInt = stripe.readSyncsafeInt();
        this.totalTagSize = syncsafeInt + 10;
        if (b == 2) {
            this.unsynchronization = (b2 & 128) != 0;
            this.compression = (b2 & 64) != 0;
        } else {
            this.unsynchronization = (b2 & 128) != 0;
            if ((b2 & 64) != 0) {
                if (b == 3) {
                    int i = stripe.readInt();
                    stripe.readByte();
                    stripe.readByte();
                    stripe.readInt();
                    stripe.skipFully(i - 6);
                } else {
                    stripe.skipFully(stripe.readSyncsafeInt() - 4);
                }
            }
            if (b >= 4 && (b2 & 16) != 0) {
                this.footerSize = 10;
                this.totalTagSize = syncsafeInt + 20;
            }
        }
        this.headerSize = (int) positionInputStream.position;
    }

    public final String toString() {
        return String.format("%s[version=%s, totalTagSize=%d]", "ID3v2TagHeader", Integer.valueOf(this.version), Integer.valueOf(this.totalTagSize));
    }
}
