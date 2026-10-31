package i2;

import android.media.MediaFormat;
public final class d0 implements a3.y, o1 {
    public a3.y f7832a;
    public d0 f7833b;

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f7832a;
        if (yVar != null) {
            yVar.a(j10, j11, xVar, mediaFormat);
        }
    }

    public final void b() {
        d0 d0Var = this.f7833b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void c() {
        d0 d0Var = this.f7833b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override
    public final void d(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f7833b = (d0) obj;
            return;
        }
        this.f7832a = (a3.y) obj;
    }
}
