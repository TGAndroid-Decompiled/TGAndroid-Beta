package i2;

import android.media.MediaFormat;
public final class d0 implements a3.y, j1 {
    public a3.y f11626a;
    public d0 f11627b;

    public final void a() {
        d0 d0Var = this.f11627b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public final void b() {
        d0 d0Var = this.f11627b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f11626a;
        if (yVar != null) {
            yVar.c(j3, j10, sVar, mediaFormat);
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
            this.f11627b = (d0) obj;
            return;
        }
        this.f11626a = (a3.y) obj;
    }
}
