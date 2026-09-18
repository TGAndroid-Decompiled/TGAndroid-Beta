package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f14008a;
    public float f14009b;
    public float f14010c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14009b;
        float z10 = e2.z(this.f14010c, f10, f7, f10);
        if (this.f14008a != z10) {
            this.f14008a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14010c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14010c;
            this.f14008a = f7;
            this.f14009b = f7;
            return;
        }
        this.f14009b = this.f14008a;
    }

    public final void d(float f7) {
        this.f14009b = f7;
        this.f14010c = f7;
        this.f14008a = f7;
    }
}
