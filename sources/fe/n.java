package fe;

import c3.i0;
public final class n {
    public float f7048a;
    public float f7049b;
    public float f7050c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f7049b;
        float z10 = i0.z(this.f7050c, f10, f7, f10);
        if (this.f7048a != z10) {
            this.f7048a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f7050c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f7050c;
            this.f7048a = f7;
            this.f7049b = f7;
            return;
        }
        this.f7049b = this.f7048a;
    }

    public final void d(float f7) {
        this.f7049b = f7;
        this.f7050c = f7;
        this.f7048a = f7;
    }
}
