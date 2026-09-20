package i2;

import android.media.MediaFormat;
public final class c0 implements a3.y, i1 {
    public a3.y f10631a;
    public c0 f10632b;

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f10631a;
        if (yVar != null) {
            yVar.a(j3, j10, sVar, mediaFormat);
        }
    }

    public final void b() {
        c0 c0Var = this.f10632b;
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
            this.f10632b = (c0) obj;
            return;
        }
        this.f10631a = (a3.y) obj;
    }

    public final void d() {
        c0 c0Var = this.f10632b;
        if (c0Var != null) {
            c0Var.d();
        }
    }
}
