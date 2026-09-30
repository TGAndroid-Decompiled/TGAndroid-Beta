package i2;

import android.media.MediaFormat;
public final class d0 implements a3.y, j1 {
    public a3.y f10637a;
    public d0 f10638b;

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f10637a;
        if (yVar != null) {
            yVar.a(j3, j10, sVar, mediaFormat);
        }
    }

    public final void b() {
        d0 d0Var = this.f10638b;
        if (d0Var != null) {
            d0Var.b();
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
            this.f10638b = (d0) obj;
            return;
        }
        this.f10637a = (a3.y) obj;
    }

    public final void d() {
        d0 d0Var = this.f10638b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
