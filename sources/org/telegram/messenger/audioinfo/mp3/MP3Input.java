package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public class MP3Input extends PositionInputStream {
    public MP3Input(InputStream inputStream) {
        super(inputStream);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i3 += read;
        }
    }

    public void skipFully(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = skip(j - j2);
            if (skip <= 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }

    public String toString() {
        return "mp3[pos=" + getPosition() + "]";
    }
}
