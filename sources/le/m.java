package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f15463a;
    public float f15464b;
    public float f15465c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f15464b;
        float z10 = e2.z(this.f15465c, f10, f7, f10);
        if (this.f15463a != z10) {
            this.f15463a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f15465c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f15465c;
            this.f15463a = f7;
            this.f15464b = f7;
            return;
        }
        this.f15464b = this.f15463a;
    }

    public final void d(float f7) {
        this.f15464b = f7;
        this.f15465c = f7;
        this.f15463a = f7;
    }
}
