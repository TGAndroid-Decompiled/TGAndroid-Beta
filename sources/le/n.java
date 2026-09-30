package le;

import com.google.android.gms.internal.vision.e2;
public final class n {
    public float f14240a;
    public float f14241b;
    public float f14242c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14241b;
        float z10 = e2.z(this.f14242c, f10, f7, f10);
        if (this.f14240a != z10) {
            this.f14240a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14242c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14242c;
            this.f14240a = f7;
            this.f14241b = f7;
            return;
        }
        this.f14241b = this.f14240a;
    }

    public final void d(float f7) {
        this.f14241b = f7;
        this.f14242c = f7;
        this.f14240a = f7;
    }
}
