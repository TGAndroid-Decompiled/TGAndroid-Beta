package le;

import android.graphics.RectF;
public final class n {
    public final RectF f15470e = new RectF();
    public final m f15467a = new m(0.0f);
    public final m f15468b = new m(0.0f);
    public final m f15469c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f15467a.a(f7);
        if (!this.f15468b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f15469c.a(f7) && !z10) {
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
        if (!this.f15467a.b(f7) && !this.f15468b.b(f10) && !this.f15469c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f15467a.c(z10);
        this.f15468b.c(z10);
        this.f15469c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f15467a.d(f7);
        this.f15468b.d(f10);
        this.f15469c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f15467a.f15466c = f7;
        this.f15468b.f15466c = f10;
        this.f15469c.f15466c = f11;
        this.d.f15466c = f12;
    }
}
