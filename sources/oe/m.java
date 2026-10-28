package oe;

import c3.h0;
public final class m {
    public float f19350a;
    public float f19351b;
    public float f19352c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f19351b;
        float z10 = h0.z(this.f19352c, f10, f7, f10);
        if (this.f19350a != z10) {
            this.f19350a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f19352c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f19352c;
            this.f19350a = f7;
            this.f19351b = f7;
            return;
        }
        this.f19351b = this.f19350a;
    }

    public final void d(float f7) {
        this.f19351b = f7;
        this.f19352c = f7;
        this.f19350a = f7;
    }
}
