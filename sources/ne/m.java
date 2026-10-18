package ne;

import com.google.android.gms.internal.play_billing.k3;
public final class m {
    public float f17410a;
    public float f17411b;
    public float f17412c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f17411b;
        float y3 = k3.y(this.f17412c, f10, f7, f10);
        if (this.f17410a != y3) {
            this.f17410a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f17412c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f17412c;
            this.f17410a = f7;
            this.f17411b = f7;
            return;
        }
        this.f17411b = this.f17410a;
    }

    public final void d(float f7) {
        this.f17411b = f7;
        this.f17412c = f7;
        this.f17410a = f7;
    }
}
