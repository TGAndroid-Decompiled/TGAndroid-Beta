package me;

import android.graphics.RectF;
public final class n {
    public final RectF f16435e = new RectF();
    public final m f16432a = new m(0.0f);
    public final m f16433b = new m(0.0f);
    public final m f16434c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f16432a.a(f7);
        if (!this.f16433b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f16434c.a(f7) && !z10) {
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
        if (!this.f16432a.b(f7) && !this.f16433b.b(f10) && !this.f16434c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f16432a.c(z10);
        this.f16433b.c(z10);
        this.f16434c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f16432a.d(f7);
        this.f16433b.d(f10);
        this.f16434c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f16432a.f16431c = f7;
        this.f16433b.f16431c = f10;
        this.f16434c.f16431c = f11;
        this.d.f16431c = f12;
    }
}
