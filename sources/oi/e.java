package oi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public final Rect f21071a = new Rect();
    public r f21072b = q.f();
    public int f21073c = 255;
    public float d;
    public float f21074e;

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

    public abstract void f(int i7);

    public abstract void g(r rVar);

    @Override
    public final int getAlpha() {
        return this.f21073c;
    }

    public final void i(float f10, float f11) {
        if (this.d == f10 && this.f21074e == f11) {
            return;
        }
        this.d = f10;
        this.f21074e = f11;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i7) {
        if (this.f21073c != i7) {
            this.f21073c = i7;
            f(i7);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
