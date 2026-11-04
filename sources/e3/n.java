package e3;

import java.io.EOFException;
public final class n implements i0 {
    public final byte[] f9504a = new byte[4096];

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        byte[] bArr = this.f9504a;
        int read = oVar.read(bArr, 0, Math.min(bArr.length, i3));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void e(int i3, g2.y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override
    public final void f(g2.y yVar, int i3, int i10) {
        yVar.O(i3);
    }

    @Override
    public final void b(long j10) {
    }

    @Override
    public final void g(d2.v vVar) {
    }

    @Override
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
    }
}
