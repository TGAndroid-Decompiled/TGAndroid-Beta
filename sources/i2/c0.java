package i2;

import android.media.MediaFormat;
public final class c0 implements a3.y, k1 {
    public a3.y f12328a;
    public c0 f12329b;

    @Override
    public final void a(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f12328a;
        if (yVar != null) {
            yVar.a(j10, j11, wVar, mediaFormat);
        }
    }

    public final void b() {
        c0 c0Var = this.f12329b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f12329b = (c0) obj;
            return;
        }
        this.f12328a = (a3.y) obj;
    }

    public final void d() {
        c0 c0Var = this.f12329b;
        if (c0Var != null) {
            c0Var.d();
        }
    }
}
