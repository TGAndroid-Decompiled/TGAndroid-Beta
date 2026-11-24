package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
public final class i64 extends MediaDataSource {
    public long a;
    public final n64 b;

    public i64(n64 n64Var) {
        this.b = n64Var;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        n64 n64Var = this.b;
        DataInputStream dataInputStream = n64Var.a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        n64Var.b(j);
                        this.a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = n64Var.read(bArr, i, i2);
                if (read >= 0) {
                    this.a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.a = -1L;
            return -1;
        }
        return -1;
    }

    @Override
    public final void close() {
    }
}
