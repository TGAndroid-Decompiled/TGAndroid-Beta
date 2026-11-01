package ei;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class f extends Drawable {
    public final Rect f6648a = new Rect();
    public s f6649b = r.f();
    public int f6650c = 255;
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

    public abstract void f(int i10);

    public abstract void g(s sVar);

    @Override
    public final int getAlpha() {
        return this.f6650c;
    }

    public final void i(float f7, float f10) {
        if (this.d == f7 && this.e == f10) {
            return;
        }
        this.d = f7;
        this.e = f10;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i10) {
        if (this.f6650c != i10) {
            this.f6650c = i10;
            f(i10);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
