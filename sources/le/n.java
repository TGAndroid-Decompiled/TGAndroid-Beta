package le;

import android.graphics.RectF;
public final class n {
    public final RectF e = new RectF();
    public final m f14196a = new m(0.0f);
    public final m f14197b = new m(0.0f);
    public final m f14198c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f14196a.a(f7);
        if (!this.f14197b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f14198c.a(f7) && !z10) {
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
        if (!this.f14196a.b(f7) && !this.f14197b.b(f10) && !this.f14198c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f14196a.c(z10);
        this.f14197b.c(z10);
        this.f14198c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f14196a.d(f7);
        this.f14197b.d(f10);
        this.f14198c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f14196a.f14195c = f7;
        this.f14197b.f14195c = f10;
        this.f14198c.f14195c = f11;
        this.d.f14195c = f12;
    }
}
