package org.telegram.messenger.audioinfo.mp3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public class ID3v2TagBody {
    private final ID3v2DataInput data;
    private final RangeInputStream input;
    private final ID3v2TagHeader tagHeader;

    public ID3v2TagBody(InputStream inputStream, long j, int i, ID3v2TagHeader iD3v2TagHeader) throws IOException {
        RangeInputStream rangeInputStream = new RangeInputStream(inputStream, j, i);
        this.input = rangeInputStream;
        this.data = new ID3v2DataInput(rangeInputStream);
        this.tagHeader = iD3v2TagHeader;
    }

    public ID3v2DataInput getData() {
        return this.data;
    }

    public long getPosition() {
        return this.input.getPosition();
    }

    public long getRemainingLength() {
        return this.input.getRemainingLength();
    }

    public ID3v2TagHeader getTagHeader() {
        return this.tagHeader;
    }

    public ID3v2FrameBody frameBody(ID3v2FrameHeader iD3v2FrameHeader) throws IOException, ID3v2Exception {
        int i;
        InputStream inputStream;
        int bodySize = iD3v2FrameHeader.getBodySize();
        InputStream inputStream2 = this.input;
        if (iD3v2FrameHeader.isUnsynchronization()) {
            byte[] readFully = this.data.readFully(iD3v2FrameHeader.getBodySize());
            int length = readFully.length;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                byte b = readFully[i3];
                if (!z || b != 0) {
                    readFully[i2] = b;
                    i2++;
                }
                z = b == -1;
            }
            inputStream2 = new ByteArrayInputStream(readFully, 0, i2);
            bodySize = i2;
        }
        if (iD3v2FrameHeader.isEncryption()) {
            throw new ID3v2Exception("Frame encryption is not supported");
        }
        if (iD3v2FrameHeader.isCompression()) {
            i = iD3v2FrameHeader.getDataLengthIndicator();
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            i = bodySize;
            inputStream = inputStream2;
        }
        return new ID3v2FrameBody(inputStream, iD3v2FrameHeader.getHeaderSize(), i, this.tagHeader, iD3v2FrameHeader);
    }

    public String toString() {
        return "id3v2tag[pos=" + getPosition() + ", " + getRemainingLength() + " left]";
    }
}
