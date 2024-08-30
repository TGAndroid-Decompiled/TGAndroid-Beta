package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.InputStream;

public class ID3v2DataInput {
    private final InputStream input;

    public ID3v2DataInput(InputStream inputStream) {
        this.input = inputStream;
    }

    public byte readByte() {
        int read = this.input.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = this.input.read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i3 += read;
        }
    }

    public byte[] readFully(int i) {
        byte[] bArr = new byte[i];
        readFully(bArr, 0, i);
        return bArr;
    }

    public int readInt() {
        return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
    }

    public int readSyncsafeInt() {
        return ((readByte() & Byte.MAX_VALUE) << 21) | ((readByte() & Byte.MAX_VALUE) << 14) | ((readByte() & Byte.MAX_VALUE) << 7) | (readByte() & Byte.MAX_VALUE);
    }

    public void skipFully(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = this.input.skip(j - j2);
            if (skip <= 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }
}
