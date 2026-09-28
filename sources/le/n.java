package le;

import com.google.android.gms.internal.vision.e2;
public final class n {
    public float f14225a;
    public float f14226b;
    public float f14227c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f14226b;
        float z10 = e2.z(this.f14227c, f10, f7, f10);
        if (this.f14225a != z10) {
            this.f14225a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f14227c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f14227c;
            this.f14225a = f7;
            this.f14226b = f7;
            return;
        }
        this.f14226b = this.f14225a;
    }

    public final void d(float f7) {
        this.f14226b = f7;
        this.f14227c = f7;
        this.f14225a = f7;
    }
}
