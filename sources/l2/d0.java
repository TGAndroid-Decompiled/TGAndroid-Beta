package l2;

import android.media.MediaFormat;
public final class d0 implements d3.w, m1 {
    public d3.w f17787a;
    public d0 f17788b;

    public final void a() {
        d0 d0Var = this.f17788b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.w wVar = this.f17787a;
        if (wVar != null) {
            wVar.b(j3, j10, uVar, mediaFormat);
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        if (i7 != 7) {
            if (i7 != 8) {
                if (i7 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f17788b = (d0) obj;
            return;
        }
        this.f17787a = (d3.w) obj;
    }

    public final void d() {
        d0 d0Var = this.f17788b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
