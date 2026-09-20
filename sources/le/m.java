package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f14193a;
    public float f14194b;
    public float f14195c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14194b;
        float z10 = e2.z(this.f14195c, f10, f7, f10);
        if (this.f14193a != z10) {
            this.f14193a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14195c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14195c;
            this.f14193a = f7;
            this.f14194b = f7;
            return;
        }
        this.f14194b = this.f14193a;
    }

    public final void d(float f7) {
        this.f14194b = f7;
        this.f14195c = f7;
        this.f14193a = f7;
    }
}
