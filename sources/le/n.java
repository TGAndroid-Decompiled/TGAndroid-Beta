package le;

import com.google.android.gms.internal.vision.e2;
public final class n {
    public float f14209a;
    public float f14210b;
    public float f14211c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14210b;
        float z10 = e2.z(this.f14211c, f10, f7, f10);
        if (this.f14209a != z10) {
            this.f14209a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14211c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14211c;
            this.f14209a = f7;
            this.f14210b = f7;
            return;
        }
        this.f14210b = this.f14209a;
    }

    public final void d(float f7) {
        this.f14210b = f7;
        this.f14211c = f7;
        this.f14209a = f7;
    }
}
