package c3;

import java.io.EOFException;
public final class n implements j0 {
    public final byte[] f4655a = new byte[4096];

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        byte[] bArr = this.f4655a;
        int read = oVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        xVar.O(i10);
    }

    @Override
    public final void b(b2.w wVar) {
    }

    @Override
    public final void e(long j10) {
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
    }
}
