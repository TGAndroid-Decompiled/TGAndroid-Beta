package li;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public n f15647a = m.f();
    public int f15648b = 255;
    public float f15649c;
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
        return this.f15648b;
    }

    public final void i(float f7, float f10) {
        if (this.f15649c == f7 && this.d == f10) {
            return;
        }
        this.f15649c = f7;
        this.d = f10;
        h();
    }

    public abstract boolean j();

    public abstract void k();

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f15648b;
        if (i11 != i10) {
            this.f15648b = i10;
            f(i11, i10);
        }
    }

    public void g(n nVar) {
    }

    public void h() {
    }

    public void f(int i10, int i11) {
    }
}
