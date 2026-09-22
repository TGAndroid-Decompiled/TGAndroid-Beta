package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f13996a;
    public float f13997b;
    public float f13998c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f13997b;
        float z10 = e2.z(this.f13998c, f10, f7, f10);
        if (this.f13996a != z10) {
            this.f13996a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f13998c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f13998c;
            this.f13996a = f7;
            this.f13997b = f7;
            return;
        }
        this.f13997b = this.f13996a;
    }

    public final void d(float f7) {
        this.f13997b = f7;
        this.f13998c = f7;
        this.f13996a = f7;
    }
}
