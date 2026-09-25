package le;

import android.graphics.RectF;
public final class o {
    public final RectF e = new RectF();
    public final n f14227a = new n(0.0f);
    public final n f14228b = new n(0.0f);
    public final n f14229c = new n(0.0f);
    public final n d = new n(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f14227a.a(f7);
        if (!this.f14228b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f14229c.a(f7) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.d.a(f7) || z11) {
            return true;
        }
        return false;
    }

    public final boolean b(float f7, float f10, float f11, float f12) {
        if (!this.f14227a.b(f7) && !this.f14228b.b(f10) && !this.f14229c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f14227a.c(z10);
        this.f14228b.c(z10);
        this.f14229c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f14227a.d(f7);
        this.f14228b.d(f10);
        this.f14229c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f14227a.f14226c = f7;
        this.f14228b.f14226c = f10;
        this.f14229c.f14226c = f11;
        this.d.f14226c = f12;
    }
}
