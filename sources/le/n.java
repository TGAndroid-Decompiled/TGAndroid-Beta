package le;

import com.google.android.gms.internal.vision.e2;
public final class n {
    public float f13986a;
    public float f13987b;
    public float f13988c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f13987b;
        float z10 = e2.z(this.f13988c, f10, f7, f10);
        if (this.f13986a != z10) {
            this.f13986a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f13988c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f13988c;
            this.f13986a = f7;
            this.f13987b = f7;
            return;
        }
        this.f13987b = this.f13986a;
    }

    public final void d(float f7) {
        this.f13987b = f7;
        this.f13988c = f7;
        this.f13986a = f7;
    }
}
