package le;

import android.graphics.RectF;
public final class n {
    public final RectF f15402e = new RectF();
    public final m f15399a = new m(0.0f);
    public final m f15400b = new m(0.0f);
    public final m f15401c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f15399a.a(f7);
        if (!this.f15400b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f15401c.a(f7) && !z10) {
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
        if (!this.f15399a.b(f7) && !this.f15400b.b(f10) && !this.f15401c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f15399a.c(z10);
        this.f15400b.c(z10);
        this.f15401c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f15399a.d(f7);
        this.f15400b.d(f10);
        this.f15401c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f15399a.f15398c = f7;
        this.f15400b.f15398c = f10;
        this.f15401c.f15398c = f11;
        this.d.f15398c = f12;
    }
}
