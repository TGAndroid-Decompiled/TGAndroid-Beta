package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class qb1 extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final oy8 h;
    public final j7b i;
    public final j7b j;

    public qb1(j7b j7bVar, j7b j7bVar2) {
        this.j = j7bVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = j7bVar2;
        oy8 oy8Var = new oy8(2131623976, gl.L(28.0f), gl.L(28.0f), false, null);
        this.h = oy8Var;
        oy8Var.p0 = true;
        paint.setColor(-2406842);
        oy8Var.a0 = true;
        oy8Var.L(-2406842, "Cup Red");
        oy8Var.L(-2406842, "Box");
        oy8Var.j();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z = this.g;
        oy8 oy8Var = this.h;
        if (z) {
            oy8Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.b * 255.0f * this.c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.g) {
            float f = this.b - (((float) currentTimeMillis) / 600.0f);
            this.b = f;
            if (f <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        } else {
            float f2 = (((float) currentTimeMillis) / 600.0f) + this.b;
            this.b = f2;
            if (f2 >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        oy8Var.setBounds(getBounds());
        if (this.g) {
            oy8Var.draw(canvas);
        }
        if (!this.g || !oy8Var.p()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), gl.L(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.c = i / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
