package ne;

import com.google.android.gms.internal.play_billing.k3;
public final class m {
    public float f17409a;
    public float f17410b;
    public float f17411c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f17410b;
        float y3 = k3.y(this.f17411c, f10, f7, f10);
        if (this.f17409a != y3) {
            this.f17409a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f17411c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f17411c;
            this.f17409a = f7;
            this.f17410b = f7;
            return;
        }
        this.f17410b = this.f17409a;
    }

    public final void d(float f7) {
        this.f17410b = f7;
        this.f17411c = f7;
        this.f17409a = f7;
    }
}
