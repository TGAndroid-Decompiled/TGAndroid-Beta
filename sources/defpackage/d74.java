package defpackage;

import android.media.MediaFormat;
public final class d74 implements vcc, ze8 {
    public vcc a;
    public d74 b;

    public final void a() {
        d74 d74Var = this.b;
        if (d74Var != null) {
            d74Var.a();
        }
    }

    public final void b() {
        d74 d74Var = this.b;
        if (d74Var != null) {
            d74Var.b();
        }
    }

    @Override
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        vcc vccVar = this.a;
        if (vccVar != null) {
            vccVar.c(j, j2, go4Var, mediaFormat);
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000 || obj == null) {
                    return;
                }
                rjb.p();
                return;
            }
            this.b = (d74) obj;
            return;
        }
        this.a = (vcc) obj;
    }
}
