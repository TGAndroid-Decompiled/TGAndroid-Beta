package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
public final class x44 extends MediaDataSource {
    public long a;
    public final c54 b;

    public x44(c54 c54Var) {
        this.b = c54Var;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        c54 c54Var = this.b;
        DataInputStream dataInputStream = c54Var.a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        c54Var.b(j);
                        this.a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = c54Var.read(bArr, i, i2);
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
