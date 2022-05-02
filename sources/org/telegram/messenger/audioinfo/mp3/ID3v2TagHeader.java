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
        boolean z = false;
        this.version = 0;
        this.revision = 0;
        this.headerSize = 0;
        this.totalTagSize = 0;
        this.footerSize = 0;
        long position = positionInputStream.getPosition();
        ID3v2DataInput iD3v2DataInput = new ID3v2DataInput(positionInputStream);
        String str = new String(iD3v2DataInput.readFully(3), "ISO-8859-1");
        if ("ID3".equals(str)) {
            byte readByte = iD3v2DataInput.readByte();
            this.version = readByte;
            if (readByte == 2 || readByte == 3 || readByte == 4) {
                this.revision = iD3v2DataInput.readByte();
                byte readByte2 = iD3v2DataInput.readByte();
                this.totalTagSize = iD3v2DataInput.readSyncsafeInt() + 10;
                int i = this.version;
                if (i == 2) {
                    this.unsynchronization = (readByte2 & 128) != 0;
                    this.compression = (readByte2 & 64) != 0 ? true : z;
                } else {
                    this.unsynchronization = (readByte2 & 128) != 0 ? true : z;
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
                return;
            }
            throw new ID3v2Exception("Unsupported ID3v2 version: " + this.version);
        }
        throw new ID3v2Exception("Invalid ID3 identifier: " + str);
    }

    public ID3v2TagBody tagBody(InputStream inputStream) throws IOException, ID3v2Exception {
        if (this.compression) {
            throw new ID3v2Exception("Tag compression is not supported");
        } else if (this.version >= 4 || !this.unsynchronization) {
            int i = this.headerSize;
            return new ID3v2TagBody(inputStream, i, (this.totalTagSize - i) - this.footerSize, this);
        } else {
            byte[] readFully = new ID3v2DataInput(inputStream).readFully(this.totalTagSize - this.headerSize);
            int length = readFully.length;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                byte b = readFully[i3];
                if (!z || b != 0) {
                    i2++;
                    readFully[i2] = b;
                }
                z = b == -1;
            }
            return new ID3v2TagBody(new ByteArrayInputStream(readFully, 0, i2), this.headerSize, i2, this);
        }
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
