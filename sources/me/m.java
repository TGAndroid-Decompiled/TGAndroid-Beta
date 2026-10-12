package me;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f16115a;
    public float f16116b;
    public float f16117c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f16116b;
        float y3 = e2.y(this.f16117c, f10, f7, f10);
        if (this.f16115a != y3) {
            this.f16115a = y3;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f16117c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f16117c;
            this.f16115a = f7;
            this.f16116b = f7;
            return;
        }
        this.f16116b = this.f16115a;
    }

    public final void d(float f7) {
        this.f16116b = f7;
        this.f16117c = f7;
        this.f16115a = f7;
    }
}
