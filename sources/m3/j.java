package m3;

import h3.t0;
import java.io.EOFException;
public final class j implements w {
    public final byte[] f17242a = new byte[4096];

    @Override
    public final void a(int i9, d5.y yVar) {
        yVar.D(i9);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        byte[] bArr = this.f17242a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i9));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void d(int i9, d5.y yVar) {
        yVar.D(i9);
    }

    @Override
    public final void c(t0 t0Var) {
    }

    @Override
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
    }
}
