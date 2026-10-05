package li;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public q f15649a = p.f();
    public int f15650b = 255;
    public float f15651c;
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
        return this.f15650b;
    }

    public final void i(float f7, float f10) {
        if (this.f15651c == f7 && this.d == f10) {
            return;
        }
        this.f15651c = f7;
        this.d = f10;
        h();
    }

    public abstract boolean j();

    public abstract void k();

    @Override
    public final void setAlpha(int i10) {
        if (this.f15650b != i10) {
            this.f15650b = i10;
            f(i10);
        }
    }

    public void f(int i10) {
    }

    public void g(q qVar) {
    }

    public void h() {
    }
}
