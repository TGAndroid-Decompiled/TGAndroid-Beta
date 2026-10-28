package i2;

import android.media.MediaFormat;
public final class e0 implements a3.y, m1 {
    public a3.y f13521a;
    public e0 f13522b;

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f13521a;
        if (yVar != null) {
            yVar.a(j10, j11, xVar, mediaFormat);
        }
    }

    public final void b() {
        e0 e0Var = this.f13522b;
        if (e0Var != null) {
            e0Var.b();
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
            this.f13522b = (e0) obj;
            return;
        }
        this.f13521a = (a3.y) obj;
    }

    public final void d() {
        e0 e0Var = this.f13522b;
        if (e0Var != null) {
            e0Var.d();
        }
    }
}
