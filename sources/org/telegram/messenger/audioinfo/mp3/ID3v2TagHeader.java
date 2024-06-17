package org.telegram.messenger.audioinfo.mp3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public class ID3v2TagHeader {
    private boolean compression;
    private int footerSize;
    private int headerSize;
    private int revision;
    private int totalTagSize;
    private boolean unsynchronization;
    private int version;

    public ID3v2TagHeader(InputStream inputStream) throws IOException, ID3v2Exception {
        this(new PositionInputStream(inputStream));
    }

    ID3v2TagHeader(PositionInputStream positionInputStream) throws IOException, ID3v2Exception {
        this.version = 0;
        this.revision = 0;
        this.headerSize = 0;
        this.totalTagSize = 0;
        this.footerSize = 0;
        long position = positionInputStream.getPosition();
        ID3v2DataInput iD3v2DataInput = new ID3v2DataInput(positionInputStream);
        String str = new String(iD3v2DataInput.readFully(3), "ISO-8859-1");
        if (!"ID3".equals(str)) {
            throw new ID3v2Exception("Invalid ID3 identifier: " + str);
        }
        byte readByte = iD3v2DataInput.readByte();
        this.version = readByte;
        if (readByte != 2 && readByte != 3 && readByte != 4) {
            throw new ID3v2Exception("Unsupported ID3v2 version: " + this.version);
        }
        this.revision = iD3v2DataInput.readByte();
        byte readByte2 = iD3v2DataInput.readByte();
        this.totalTagSize = iD3v2DataInput.readSyncsafeInt() + 10;
        int i = this.version;
        if (i == 2) {
            this.unsynchronization = (readByte2 & 128) != 0;
            this.compression = (readByte2 & 64) != 0;
        } else {
            this.unsynchronization = (readByte2 & 128) != 0;
            if ((readByte2 & 64) != 0) {
                if (i == 3) {
                    int readInt = iD3v2DataInput.readInt();
                    iD3v2DataInput.readByte();
                    iD3v2DataInput.readByte();
                    iD3v2DataInput.readInt();
                    iD3v2DataInput.skipFully(readInt - 6);
                } else {
                    iD3v2DataInput.skipFully(iD3v2DataInput.readSyncsafeInt() - 4);
                }
            }
            if (this.version >= 4 && (readByte2 & 16) != 0) {
                this.footerSize = 10;
                this.totalTagSize += 10;
            }
        }
        this.headerSize = (int) (positionInputStream.getPosition() - position);
    }

    public ID3v2TagBody tagBody(InputStream inputStream) throws IOException, ID3v2Exception {
        if (this.compression) {
            throw new ID3v2Exception("Tag compression is not supported");
        }
        if (this.version < 4 && this.unsynchronization) {
            byte[] readFully = new ID3v2DataInput(inputStream).readFully(this.totalTagSize - this.headerSize);
            int length = readFully.length;
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = readFully[i2];
                if (!z || b != 0) {
                    readFully[i] = b;
                    i++;
                }
                z = b == -1;
            }
            return new ID3v2TagBody(new ByteArrayInputStream(readFully, 0, i), this.headerSize, i, this);
        }
        int i3 = this.headerSize;
        return new ID3v2TagBody(inputStream, i3, (this.totalTagSize - i3) - this.footerSize, this);
    }

    public int getVersion() {
        return this.version;
    }

    public int getRevision() {
        return this.revision;
    }

    public int getFooterSize() {
        return this.footerSize;
    }

    public String toString() {
        return String.format("%s[version=%s, totalTagSize=%d]", ID3v2TagHeader.class.getSimpleName(), Integer.valueOf(this.version), Integer.valueOf(this.totalTagSize));
    }
}
