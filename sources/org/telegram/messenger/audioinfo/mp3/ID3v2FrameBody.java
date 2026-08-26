package org.telegram.messenger.audioinfo.mp3;

import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.dynamite.zzd;
import com.stripe.android.Stripe;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public final class ID3v2FrameBody {
    public static final zzd textBuffer = new zzd(3);
    public final Stripe.AnonymousClass1 data;
    public final ID3v2FrameHeader frameHeader;
    public final RangeInputStream input;
    public final ID3v2TagHeader tagHeader;

    public final class Buffer {
        public byte[] bytes;
    }

    public ID3v2FrameBody(InputStream inputStream, long j, int i, ID3v2TagHeader iD3v2TagHeader, ID3v2FrameHeader iD3v2FrameHeader) {
        RangeInputStream rangeInputStream = new RangeInputStream(inputStream, j, i);
        this.input = rangeInputStream;
        this.data = new Stripe.AnonymousClass1(rangeInputStream, 12);
        this.tagHeader = iD3v2TagHeader;
        this.frameHeader = iD3v2FrameHeader;
    }

    public static String extractString(byte[] bArr, int i, ID3v2Encoding iD3v2Encoding, boolean z) {
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (bArr[i3] == 0 && (iD3v2Encoding != ID3v2Encoding.UTF_16 || i2 != 0 || i3 % 2 == 0)) {
                    i2++;
                    int i4 = iD3v2Encoding.zeroBytes;
                    if (i2 == i4) {
                        i = (i3 + 1) - i4;
                        break;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i, iD3v2Encoding.charset.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final ID3v2Encoding readEncoding() throws IOException, ID3v2Exception {
        byte b = this.data.readByte();
        if (b == 0) {
            return ID3v2Encoding.ISO_8859_1;
        }
        if (b == 1) {
            return ID3v2Encoding.UTF_16;
        }
        if (b == 2) {
            return ID3v2Encoding.UTF_16BE;
        }
        if (b == 3) {
            return ID3v2Encoding.UTF_8;
        }
        throw new ID3v2Exception(DiffUtil.m(b, "Invalid encoding: "));
    }

    public final String readFixedLengthString(int i, ID3v2Encoding iD3v2Encoding) throws IOException, ID3v2Exception {
        if (i > this.input.getRemainingLength()) {
            throw new ID3v2Exception(DiffUtil.m(i, "Could not read fixed-length string of length: "));
        }
        Buffer buffer = (Buffer) textBuffer.get();
        byte[] bArr = buffer.bytes;
        if (i > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i > length);
            buffer.bytes = new byte[length];
        }
        byte[] bArr2 = buffer.bytes;
        this.data.readFully(i, bArr2);
        return extractString(bArr2, i, iD3v2Encoding, true);
    }

    public final String readZeroTerminatedString(int i, ID3v2Encoding iD3v2Encoding) throws IOException, ID3v2Exception {
        int iMin = Math.min(i, (int) this.input.getRemainingLength());
        Buffer buffer = (Buffer) textBuffer.get();
        byte[] bArr = buffer.bytes;
        if (iMin > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (iMin > length);
            buffer.bytes = new byte[length];
        }
        byte[] bArr2 = buffer.bytes;
        int i2 = 0;
        for (int i3 = 0; i3 < iMin; i3++) {
            byte b = this.data.readByte();
            bArr2[i3] = b;
            if (b != 0 || (iD3v2Encoding == ID3v2Encoding.UTF_16 && i2 == 0 && i3 % 2 != 0)) {
                i2 = 0;
            } else {
                i2++;
                int i4 = iD3v2Encoding.zeroBytes;
                if (i2 == i4) {
                    return extractString(bArr2, (i3 + 1) - i4, iD3v2Encoding, false);
                }
            }
        }
        throw new ID3v2Exception("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        RangeInputStream rangeInputStream = this.input;
        sb.append(rangeInputStream.position);
        sb.append(", ");
        sb.append(rangeInputStream.getRemainingLength());
        sb.append(" left]");
        return sb.toString();
    }
}
