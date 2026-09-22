package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f14208a;
    public float f14209b;
    public float f14210c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14209b;
        float z10 = e2.z(this.f14210c, f10, f7, f10);
        if (this.f14208a != z10) {
            this.f14208a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14210c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14210c;
            this.f14208a = f7;
            this.f14209b = f7;
            return;
        }
        this.f14209b = this.f14208a;
    }

    public final void d(float f7) {
        this.f14209b = f7;
        this.f14210c = f7;
        this.f14208a = f7;
    }
}
