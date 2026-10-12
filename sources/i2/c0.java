package i2;

import android.media.MediaFormat;
public final class c0 implements a3.y, m1 {
    public a3.y f10929a;
    public c0 f10930b;

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f10929a;
        if (yVar != null) {
            yVar.a(j10, j11, xVar, mediaFormat);
        }
    }

    public final void b() {
        c0 c0Var = this.f10930b;
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
            this.f10930b = (c0) obj;
            return;
        }
        this.f10929a = (a3.y) obj;
    }

    public final void d() {
        c0 c0Var = this.f10930b;
        if (c0Var != null) {
            c0Var.d();
        }
    }
}
