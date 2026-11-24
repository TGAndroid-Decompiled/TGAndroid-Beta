package defpackage;

import java.io.EOFException;
public final class yn3 implements wxb {
    public final byte[] a = new byte[4096];

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        xu7Var.O(i);
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = g63Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override
    public final void d(long j) {
    }

    @Override
    public final void g(fm4 fm4Var) {
    }

    @Override
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
    }
}
