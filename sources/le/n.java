package le;

import com.google.android.gms.internal.vision.e2;
public final class n {
    public float f14226a;
    public float f14227b;
    public float f14228c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14227b;
        float z10 = e2.z(this.f14228c, f10, f7, f10);
        if (this.f14226a != z10) {
            this.f14226a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14228c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14228c;
            this.f14226a = f7;
            this.f14227b = f7;
            return;
        }
        this.f14227b = this.f14226a;
    }

    public final void d(float f7) {
        this.f14227b = f7;
        this.f14228c = f7;
        this.f14226a = f7;
    }
}
