package ne;

import com.google.android.gms.internal.play_billing.k3;
public final class m {
    public float f16316a;
    public float f16317b;
    public float f16318c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f16317b;
        float y3 = k3.y(this.f16318c, f10, f7, f10);
        if (this.f16316a != y3) {
            this.f16316a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f16318c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f16318c;
            this.f16316a = f7;
            this.f16317b = f7;
            return;
        }
        this.f16317b = this.f16316a;
    }

    public final void d(float f7) {
        this.f16317b = f7;
        this.f16318c = f7;
        this.f16316a = f7;
    }
}
