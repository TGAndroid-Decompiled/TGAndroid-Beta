package m3;

import d5.z;
import h3.t0;
import java.io.EOFException;

public final class j implements w {

    public final byte[] f17618a = new byte[4096];

    @Override
    public final void a(int i10, z zVar) {
        zVar.D(i10);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f17618a;
        int i11 = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final void d(int i10, z zVar) {
        zVar.D(i10);
    }

    @Override
    public final void c(t0 t0Var) {
    }

    @Override
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
    }
}
