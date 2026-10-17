package ne;

import com.google.android.gms.internal.cast.a6;
public final class m {
    public float f17403a;
    public float f17404b;
    public float f17405c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.f17404b;
        float x10 = a6.x(this.f17405c, f10, f7, f10);
        if (this.f17403a != x10) {
            this.f17403a = x10;
            return true;
        }
        return false;
    }

    public final boolean b(float f7) {
        if (this.f17405c != f7) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        if (z10) {
            float f7 = this.f17405c;
            this.f17403a = f7;
            this.f17404b = f7;
            return;
        }
        this.f17404b = this.f17403a;
    }

    public final void d(float f7) {
        this.f17404b = f7;
        this.f17405c = f7;
        this.f17403a = f7;
    }
}
