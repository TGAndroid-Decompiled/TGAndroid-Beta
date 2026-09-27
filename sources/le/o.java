package le;

import android.graphics.RectF;
public final class o {
    public final RectF e = new RectF();
    public final n f14229a = new n(0.0f);
    public final n f14230b = new n(0.0f);
    public final n f14231c = new n(0.0f);
    public final n d = new n(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f14229a.a(f7);
        if (!this.f14230b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f14231c.a(f7) && !z10) {
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
        if (!this.f14229a.b(f7) && !this.f14230b.b(f10) && !this.f14231c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f14229a.c(z10);
        this.f14230b.c(z10);
        this.f14231c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f14229a.d(f7);
        this.f14230b.d(f10);
        this.f14231c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f14229a.f14228c = f7;
        this.f14230b.f14228c = f10;
        this.f14231c.f14228c = f11;
        this.d.f14228c = f12;
    }
}
