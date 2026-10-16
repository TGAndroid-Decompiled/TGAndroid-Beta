package ne;

import com.google.android.gms.internal.play_billing.k3;
public final class m {
    public float f16027a;
    public float f16028b;
    public float f16029c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f16028b;
        float y3 = k3.y(this.f16029c, f10, f7, f10);
        if (this.f16027a != y3) {
            this.f16027a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f16029c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f16029c;
            this.f16027a = f7;
            this.f16028b = f7;
            return;
        }
        this.f16028b = this.f16027a;
    }

    public final void d(float f7) {
        this.f16028b = f7;
        this.f16029c = f7;
        this.f16027a = f7;
    }
}
