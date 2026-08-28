package h3;

import android.media.MediaFormat;
public final class i0 implements e5.n, d2 {
    public e5.n f9489a;
    public i0 f9490b;

    @Override
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        e5.n nVar = this.f9489a;
        if (nVar != null) {
            nVar.a(j10, j11, t0Var, mediaFormat);
        }
    }

    public final void b() {
        i0 i0Var = this.f9490b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public final void c() {
        i0 i0Var = this.f9490b;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void handleMessage(int i9, Object obj) {
        if (i9 != 7) {
            if (i9 != 8) {
                if (i9 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f9490b = (i0) obj;
            return;
        }
        this.f9489a = (e5.n) obj;
    }
}
