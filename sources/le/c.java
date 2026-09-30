package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class c implements e {
    public final int f14214a;
    public final e f14215b;
    public final Interpolator f14216c;
    public final long d;
    public float e;
    public boolean f14217f;
    public f h;

    public c(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void C(float f7, int i10) {
        this.f14215b.C(f7, this.f14214a);
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f14215b.D(this.f14214a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        c cVar;
        if (this.f14217f != z10 || !z11) {
            this.f14217f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    cVar = this;
                    cVar.h = new f(0, cVar, this.f14216c, this.d, this.e);
                } else {
                    cVar = this;
                }
                cVar.h.a(f7);
                return;
            }
            f fVar = this.h;
            if (fVar != null) {
                fVar.c(f7);
            }
            float f10 = this.e;
            if (f10 != f7) {
                int i10 = this.f14214a;
                e eVar = this.f14215b;
                if (f10 != f7) {
                    this.e = f7;
                    eVar.D(i10, f7, -1.0f, null);
                }
                eVar.C(f7, i10);
            }
        }
    }

    public c(int i10, e eVar, Interpolator interpolator, long j3) {
        this(i10, eVar, interpolator, j3, false);
    }

    public c(int i10, e eVar, Interpolator interpolator, long j3, boolean z10) {
        this.f14214a = i10;
        this.f14215b = eVar;
        this.f14216c = interpolator;
        this.d = j3;
        this.f14217f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
