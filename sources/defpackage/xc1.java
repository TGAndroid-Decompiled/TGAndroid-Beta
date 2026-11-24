package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class xc1 extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final p09 h;
    public final l9b i;
    public final l9b j;

    public xc1(l9b l9bVar, l9b l9bVar2) {
        this.j = l9bVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = l9bVar2;
        p09 p09Var = new p09(2131623976, gm.L(28.0f), gm.L(28.0f), false, null);
        this.h = p09Var;
        p09Var.p0 = true;
        paint.setColor(-2406842);
        p09Var.a0 = true;
        p09Var.L(-2406842, "Cup Red");
        p09Var.L(-2406842, "Box");
        p09Var.j();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z = this.g;
        p09 p09Var = this.h;
        if (z) {
            p09Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        p09Var.setBounds(getBounds());
        if (this.g) {
            p09Var.draw(canvas);
        }
        if (!this.g || !p09Var.p()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), gm.L(5.0f), paint);
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
