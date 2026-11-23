package f3;

import com.google.android.gms.internal.vision.e2;
import java.io.EOFException;
public final class n implements i0 {
    public final byte[] f11189a = new byte[4096];

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        xVar.O(i7);
    }

    @Override
    public final void b(int i7, h2.x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        byte[] bArr = this.f11189a;
        int read = nVar.read(bArr, 0, Math.min(bArr.length, i7));
        if (read == -1) {
            if (z10) {
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
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
    }
}
