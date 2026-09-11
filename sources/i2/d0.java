package i2;

import android.media.MediaFormat;
public final class d0 implements a3.x, i1 {
    public a3.x f11476a;
    public d0 f11477b;

    public final void a() {
        d0 d0Var = this.f11477b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public final void b() {
        d0 d0Var = this.f11477b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.x xVar = this.f11476a;
        if (xVar != null) {
            xVar.c(j3, j10, sVar, mediaFormat);
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
            this.f11477b = (d0) obj;
            return;
        }
        this.f11476a = (a3.x) obj;
    }
}
