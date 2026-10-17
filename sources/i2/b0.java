package i2;

import android.media.MediaFormat;
public final class b0 implements a3.y, k1 {
    public a3.y f12323a;
    public b0 f12324b;

    @Override
    public final void a(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f12323a;
        if (yVar != null) {
            yVar.a(j10, j11, wVar, mediaFormat);
        }
    }

    public final void b() {
        b0 b0Var = this.f12324b;
        if (b0Var != null) {
            b0Var.b();
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
            this.f12324b = (b0) obj;
            return;
        }
        this.f12323a = (a3.y) obj;
    }

    public final void d() {
        b0 b0Var = this.f12324b;
        if (b0Var != null) {
            b0Var.d();
        }
    }
}
