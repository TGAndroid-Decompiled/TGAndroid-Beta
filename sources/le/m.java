package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f13998a;
    public float f13999b;
    public float f14000c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f13999b;
        float z10 = e2.z(this.f14000c, f10, f7, f10);
        if (this.f13998a != z10) {
            this.f13998a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14000c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14000c;
            this.f13998a = f7;
            this.f13999b = f7;
            return;
        }
        this.f13999b = this.f13998a;
    }

    public final void d(float f7) {
        this.f13999b = f7;
        this.f14000c = f7;
        this.f13998a = f7;
    }
}
