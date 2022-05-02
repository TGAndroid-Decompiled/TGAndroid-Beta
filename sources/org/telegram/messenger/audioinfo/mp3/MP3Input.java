package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public class MP3Input extends PositionInputStream {
    public MP3Input(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read > 0) {
                i3 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public void skipFully(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long skip = skip(j - j2);
            if (skip > 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return "mp3[pos=" + getPosition() + "]";
    }
}
