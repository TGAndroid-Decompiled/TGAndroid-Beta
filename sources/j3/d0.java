package j3;

import android.media.MediaFormat;
public final class d0 implements i5.n, b2 {
    public i5.n f8463a;
    public d0 f8464b;

    @Override
    public final void a(long j10, long j11, n0 n0Var, MediaFormat mediaFormat) {
        i5.n nVar = this.f8463a;
        if (nVar != null) {
            nVar.a(j10, j11, n0Var, mediaFormat);
        }
    }

    @Override
    public final void b(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f8464b = (d0) obj;
            return;
        }
        this.f8463a = (i5.n) obj;
    }

    public final void c() {
        d0 d0Var = this.f8464b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    public final void d() {
        d0 d0Var = this.f8464b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
