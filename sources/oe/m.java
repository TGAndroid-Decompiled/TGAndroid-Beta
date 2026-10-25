package oe;

import c3.h0;
public final class m {
    public float f19351a;
    public float f19352b;
    public float f19353c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f19352b;
        float z10 = h0.z(this.f19353c, f10, f7, f10);
        if (this.f19351a != z10) {
            this.f19351a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f19353c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f19353c;
            this.f19351a = f7;
            this.f19352b = f7;
            return;
        }
        this.f19352b = this.f19351a;
    }

    public final void d(float f7) {
        this.f19352b = f7;
        this.f19353c = f7;
        this.f19351a = f7;
    }
}
