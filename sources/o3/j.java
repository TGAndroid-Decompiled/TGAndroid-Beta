package o3;

import j3.t0;
import java.io.EOFException;
public final class j implements w {
    public final byte[] f19101a = new byte[4096];

    @Override
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        byte[] bArr = this.f19101a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void d(int i10, f5.w wVar) {
        wVar.D(i10);
    }

    @Override
    public final void e(int i10, f5.w wVar) {
        wVar.D(i10);
    }

    @Override
    public final void b(t0 t0Var) {
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, v vVar) {
    }
}
