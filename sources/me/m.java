package me;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f16369a;
    public float f16370b;
    public float f16371c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f16370b;
        float y3 = e2.y(this.f16371c, f10, f7, f10);
        if (this.f16369a != y3) {
            this.f16369a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f16371c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f16371c;
            this.f16369a = f7;
            this.f16370b = f7;
            return;
        }
        this.f16370b = this.f16369a;
    }

    public final void d(float f7) {
        this.f16370b = f7;
        this.f16371c = f7;
        this.f16369a = f7;
    }
}
