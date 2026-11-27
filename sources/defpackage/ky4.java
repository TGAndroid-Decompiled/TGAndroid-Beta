package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class ky4 extends Drawable {
    public final Rect a = new Rect();
    public lz4 b = vy4.f();
    public int c = 255;
    public float d;
    public float e;

    public abstract void a();

    public void b(Rect rect) {
        rect.set(getBounds());
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public abstract boolean e();

    public abstract void f(int i);

    public abstract void g(lz4 lz4Var);

    @Override
    public final int getAlpha() {
        return this.c;
    }

    public final void i(float f, float f2) {
        if (this.d == f && this.e == f2) {
            return;
        }
        this.d = f;
        this.e = f2;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            f(i);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
