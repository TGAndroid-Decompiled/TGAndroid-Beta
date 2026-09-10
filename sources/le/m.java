package le;

import com.google.android.gms.internal.vision.e2;
public final class m {
    public float f12893a;
    public float f12894b;
    public float f12895c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f12894b;
        float z10 = e2.z(this.f12895c, f10, f7, f10);
        if (this.f12893a != z10) {
            this.f12893a = z10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f12895c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f12895c;
            this.f12893a = f7;
            this.f12894b = f7;
            return;
        }
        this.f12894b = this.f12893a;
    }

    public final void d(float f7) {
        this.f12894b = f7;
        this.f12895c = f7;
        this.f12893a = f7;
    }
}
