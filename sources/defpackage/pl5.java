package defpackage;

import android.net.Uri;
import java.util.Map;
public final class pl5 implements h73 {
    public final h73 a;
    public final int b;
    public final zv8 c;
    public final byte[] d;
    public int e;

    public pl5(h73 h73Var, int i, zv8 zv8Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        this.a = h73Var;
        this.b = i;
        this.c = zv8Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        this.a.addTransferListener(v2cVar);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override
    public final long open(n73 n73Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        h73 h73Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (h73Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = h73Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        } else if (bArr3[i5 - 1] == 0) {
                            i5--;
                        } else {
                            ey7 ey7Var = new ey7(i5, bArr3);
                            zv8 zv8Var = this.c;
                            if (!zv8Var.y) {
                                max = zv8Var.s;
                            } else {
                                max = Math.max(zv8Var.E.k(true), zv8Var.s);
                            }
                            long j = max;
                            int a = ey7Var.a();
                            x1c x1cVar = zv8Var.x;
                            x1cVar.getClass();
                            x1cVar.e(a, ey7Var);
                            x1cVar.a(j, 1, a, 0, null);
                            zv8Var.y = true;
                        }
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = h73Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
