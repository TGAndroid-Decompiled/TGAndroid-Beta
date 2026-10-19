package i2;

import android.media.MediaFormat;
public final class d0 implements a3.y, l1 {
    public a3.y f12331a;
    public d0 f12332b;

    public final void a() {
        d0 d0Var = this.f12332b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f12331a;
        if (yVar != null) {
            yVar.b(j10, j11, wVar, mediaFormat);
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
            this.f12332b = (d0) obj;
            return;
        }
        this.f12331a = (a3.y) obj;
    }

    public final void d() {
        d0 d0Var = this.f12332b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
