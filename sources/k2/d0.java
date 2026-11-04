package k2;

import android.media.MediaFormat;
public final class d0 implements c3.w, l1 {
    public c3.w f16473a;
    public d0 f16474b;

    @Override
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        c3.w wVar = this.f16473a;
        if (wVar != null) {
            wVar.a(j10, j11, vVar, mediaFormat);
        }
    }

    public final void b() {
        d0 d0Var = this.f16474b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void c() {
        d0 d0Var = this.f16474b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override
    public final void d(int i3, Object obj) {
        if (i3 != 7) {
            if (i3 != 8) {
                if (i3 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f16474b = (d0) obj;
            return;
        }
        this.f16473a = (c3.w) obj;
    }
}
