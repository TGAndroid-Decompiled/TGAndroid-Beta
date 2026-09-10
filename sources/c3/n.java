package c3;

import java.io.EOFException;
public final class n implements h0 {
    public final byte[] f4210a = new byte[4096];

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void d(int i10, e2.v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        byte[] bArr = this.f4210a;
        int read = kVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void f(e2.v vVar, int i10, int i11) {
        vVar.K(i10);
    }

    @Override
    public final void b(b2.s sVar) {
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
    }
}
