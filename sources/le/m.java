package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f15396a;
    public float f15397b;
    public float f15398c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f15397b;
        float z10 = e2.z(this.f15398c, f10, f7, f10);
        if (this.f15396a != z10) {
            this.f15396a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f15398c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f15398c;
            this.f15396a = f7;
            this.f15397b = f7;
            return;
        }
        this.f15397b = this.f15396a;
    }

    public final void d(float f7) {
        this.f15397b = f7;
        this.f15398c = f7;
        this.f15396a = f7;
    }
}
