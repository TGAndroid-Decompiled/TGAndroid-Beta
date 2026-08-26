package org.telegram.messenger.audioinfo.mp3;

import com.google.android.exoplayer2.PlaybackInfo;
import com.google.zxing.Result;
import com.stripe.android.Stripe;
import java.io.IOException;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public final class ID3v2FrameHeader {
    public final int $r8$classId = 1;
    public int bodySize;
    public boolean compression;
    public int dataLengthIndicator;
    public boolean encryption;
    public Object frameId;
    public int headerSize;
    public boolean unsynchronization;

    public ID3v2FrameHeader(PlaybackInfo playbackInfo) {
        this.frameId = playbackInfo;
    }

    public void incrementPendingOperationAcks(int i) {
        this.unsynchronization |= i > 0;
        this.headerSize += i;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", "ID3v2FrameHeader", (String) this.frameId, Integer.valueOf(this.bodySize));
            default:
                return super.toString();
        }
    }

    public ID3v2FrameHeader(Result result) throws IOException {
        byte b;
        byte b2;
        RangeInputStream rangeInputStream = (RangeInputStream) result.text;
        long j = rangeInputStream.position;
        ID3v2TagHeader iD3v2TagHeader = (ID3v2TagHeader) result.resultPoints;
        int i = iD3v2TagHeader.version;
        Stripe stripe = (Stripe) result.resultMetadata;
        byte b3 = 2;
        if (i == 2) {
            stripe.getClass();
            byte[] bArr = new byte[3];
            stripe.readFully(3, bArr);
            this.frameId = new String(bArr, "ISO-8859-1");
        } else {
            stripe.getClass();
            byte[] bArr2 = new byte[4];
            stripe.readFully(4, bArr2);
            this.frameId = new String(bArr2, "ISO-8859-1");
        }
        int i2 = iD3v2TagHeader.version;
        byte b4 = 8;
        if (i2 == 2) {
            this.bodySize = ((stripe.readByte() & 255) << 16) | ((stripe.readByte() & 255) << 8) | (stripe.readByte() & 255);
        } else if (i2 == 3) {
            this.bodySize = stripe.readInt();
        } else {
            this.bodySize = stripe.readSyncsafeInt();
        }
        if (i2 > 2) {
            stripe.readByte();
            byte b5 = stripe.readByte();
            byte b6 = 64;
            if (i2 == 3) {
                b4 = 128;
                b3 = 0;
                b = 32;
                b2 = 0;
            } else {
                b6 = 4;
                b = 64;
                b2 = 1;
            }
            boolean z = (b4 & b5) != 0;
            this.compression = z;
            this.unsynchronization = (b3 & b5) != 0;
            boolean z2 = (b5 & b6) != 0;
            this.encryption = z2;
            if (i2 == 3) {
                if (z) {
                    this.dataLengthIndicator = stripe.readInt();
                    this.bodySize -= 4;
                }
                if (z2) {
                    stripe.readByte();
                    this.bodySize--;
                }
                if ((b5 & b) != 0) {
                    stripe.readByte();
                    this.bodySize--;
                }
            } else {
                if ((b5 & b) != 0) {
                    stripe.readByte();
                    this.bodySize--;
                }
                if (z2) {
                    stripe.readByte();
                    this.bodySize--;
                }
                if ((b5 & b2) != 0) {
                    this.dataLengthIndicator = stripe.readSyncsafeInt();
                    this.bodySize -= 4;
                }
            }
        }
        this.headerSize = (int) (rangeInputStream.position - j);
    }
}
