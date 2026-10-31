package fe;

import android.graphics.RectF;
public final class o {
    public final RectF e = new RectF();
    public final n f7051a = new n(0.0f);
    public final n f7052b = new n(0.0f);
    public final n f7053c = new n(0.0f);
    public final n d = new n(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f7051a.a(f7);
        if (!this.f7052b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f7053c.a(f7) && !z10) {
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
        if (!this.f7051a.b(f7) && !this.f7052b.b(f10) && !this.f7053c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f7051a.c(z10);
        this.f7052b.c(z10);
        this.f7053c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f7051a.d(f7);
        this.f7052b.d(f10);
        this.f7053c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f7051a.f7050c = f7;
        this.f7052b.f7050c = f10;
        this.f7053c.f7050c = f11;
        this.d.f7050c = f12;
    }
}
