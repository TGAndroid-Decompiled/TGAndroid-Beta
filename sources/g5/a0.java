package g5;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class a0 extends g {
    public RandomAccessFile f6836a;
    public Uri f6837b;
    public long f6838c;
    public boolean d;

    @Override
    public final void close() {
        this.f6837b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6836a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e6) {
                throw new n(e6, 2000);
            }
        } finally {
            this.f6836a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f6837b;
    }

    @Override
    public final long open(g5.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: g5.a0.open(g5.p):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6838c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6836a;
            int i12 = h5.d0.f7237a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f6838c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e6) {
            throw new n(e6, 2000);
        }
    }
}
