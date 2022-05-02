package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ID3v2DataInput {
    private final InputStream input;

    public ID3v2DataInput(InputStream inputStream) {
        this.input = inputStream;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = this.input.read(bArr, i + i3, i2 - i3);
            if (read > 0) {
                i3 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public byte[] readFully(int i) throws IOException {
        byte[] bArr = new byte[i];
        readFully(bArr, 0, i);
        return bArr;
    }

    public void skipFully(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long skip = this.input.skip(j - j2);
            if (skip > 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public byte readByte() throws IOException {
        int read = this.input.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int readInt() throws IOException {
        return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
    }

    public int readSyncsafeInt() throws IOException {
        return ((readByte() & Byte.MAX_VALUE) << 21) | ((readByte() & Byte.MAX_VALUE) << 14) | ((readByte() & Byte.MAX_VALUE) << 7) | (readByte() & Byte.MAX_VALUE);
    }
}
