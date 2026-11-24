package defpackage;

import java.io.EOFException;
public final class ip3 implements yzb {
    public final byte[] a = new byte[4096];

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        yw7Var.O(i);
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = s73Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override
    public final void d(long j) {
    }

    @Override
    public final void g(go4 go4Var) {
    }

    @Override
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
    }
}
