package defpackage;

import java.io.EOFException;
public final class po3 implements x1c {
    public final byte[] a = new byte[4096];

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        ey7Var.O(i);
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = z63Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void d(long j) {
    }

    @Override
    public final void g(ko4 ko4Var) {
    }

    @Override
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
    }
}
