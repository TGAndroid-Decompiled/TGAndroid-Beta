package f3;

import java.io.EOFException;
public final class n implements j0 {
    public final byte[] f11068a = new byte[4096];

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        xVar.O(i7);
    }

    @Override
    public final void b(int i7, h2.x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        byte[] bArr = this.f11068a;
        int read = nVar.read(bArr, 0, Math.min(bArr.length, i7));
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void d(long j3) {
    }

    @Override
    public final void g(e2.u uVar) {
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
    }
}
