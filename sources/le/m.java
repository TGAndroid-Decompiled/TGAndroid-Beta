package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f15464a;
    public float f15465b;
    public float f15466c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f15465b;
        float z10 = e2.z(this.f15466c, f10, f7, f10);
        if (this.f15464a != z10) {
            this.f15464a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f15466c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f15466c;
            this.f15464a = f7;
            this.f15465b = f7;
            return;
        }
        this.f15465b = this.f15464a;
    }

    public final void d(float f7) {
        this.f15465b = f7;
        this.f15466c = f7;
        this.f15464a = f7;
    }
}
