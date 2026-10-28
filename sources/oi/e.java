package oi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public r f19459a = q.f();
    public int f19460b = 255;
    public float f19461c;
    public float d;

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

    @Override
    public final int getAlpha() {
        return this.f19460b;
    }

    public final void i(float f7, float f10) {
        if (this.f19461c == f7 && this.d == f10) {
            return;
        }
        this.f19461c = f7;
        this.d = f10;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i10) {
        if (this.f19460b != i10) {
            this.f19460b = i10;
            f(i10);
        }
    }

    public abstract void updateColors();

    public void f(int i10) {
    }

    public void g(r rVar) {
    }

    public void h() {
    }
}
