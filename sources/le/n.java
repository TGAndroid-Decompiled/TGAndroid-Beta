package le;

import android.graphics.RectF;
public final class n {
    public final RectF e = new RectF();
    public final m f14211a = new m(0.0f);
    public final m f14212b = new m(0.0f);
    public final m f14213c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f14211a.a(f7);
        if (!this.f14212b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f14213c.a(f7) && !z10) {
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
        if (!this.f14211a.b(f7) && !this.f14212b.b(f10) && !this.f14213c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f14211a.c(z10);
        this.f14212b.c(z10);
        this.f14213c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f14211a.d(f7);
        this.f14212b.d(f10);
        this.f14213c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f14211a.f14210c = f7;
        this.f14212b.f14210c = f10;
        this.f14213c.f14210c = f11;
        this.d.f14210c = f12;
    }
}
