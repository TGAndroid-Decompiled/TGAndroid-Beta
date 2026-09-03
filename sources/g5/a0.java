package g5;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class a0 extends g {
    public RandomAccessFile f6359a;
    public Uri f6360b;
    public long f6361c;
    public boolean d;

    @Override
    public final void close() {
        this.f6360b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6359a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new n(e, 2000);
            }
        } finally {
            this.f6359a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f6360b;
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
        long j10 = this.f6361c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6359a;
            int i12 = h5.d0.f6924a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f6361c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new n(e, 2000);
        }
    }
}
