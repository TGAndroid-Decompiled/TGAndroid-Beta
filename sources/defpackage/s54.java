package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
public final class s54 extends MediaDataSource {
    public long a;
    public final x54 b;

    public s54(x54 x54Var) {
        this.b = x54Var;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        x54 x54Var = this.b;
        DataInputStream dataInputStream = x54Var.a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        x54Var.b(j);
                        this.a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = x54Var.read(bArr, i, i2);
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
