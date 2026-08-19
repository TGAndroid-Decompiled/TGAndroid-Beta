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

    ID3v2TagBody(InputStream inputStream, long j, int i, ID3v2TagHeader iD3v2TagHeader) {
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
        InputStream inflaterInputStream;
        int bodySize = iD3v2FrameHeader.getBodySize();
        InputStream byteArrayInputStream = this.input;
        if (iD3v2FrameHeader.isUnsynchronization()) {
            byte[] fully = this.data.readFully(iD3v2FrameHeader.getBodySize());
            int length = fully.length;
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = fully[i2];
                if (!z || b != 0) {
                    fully[i] = b;
                    i++;
                }
                z = b == -1;
            }
            byteArrayInputStream = new ByteArrayInputStream(fully, 0, i);
            bodySize = i;
        }
        if (iD3v2FrameHeader.isEncryption()) {
            throw new ID3v2Exception("Frame encryption is not supported");
        }
        if (iD3v2FrameHeader.isCompression()) {
            bodySize = iD3v2FrameHeader.getDataLengthIndicator();
            inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        } else {
            inflaterInputStream = byteArrayInputStream;
        }
        return new ID3v2FrameBody(inflaterInputStream, iD3v2FrameHeader.getHeaderSize(), bodySize, this.tagHeader, iD3v2FrameHeader);
    }

    public String toString() {
        return "id3v2tag[pos=" + getPosition() + ", " + getRemainingLength() + " left]";
    }
}
