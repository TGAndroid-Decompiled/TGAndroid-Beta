package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class yb1 extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final b29 h;
    public final ibb i;
    public final ibb j;

    public yb1(ibb ibbVar, ibb ibbVar2) {
        this.j = ibbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = ibbVar2;
        b29 b29Var = new b29(2131623976, hl.L(28.0f), hl.L(28.0f), false, null);
        this.h = b29Var;
        b29Var.p0 = true;
        paint.setColor(-2406842);
        b29Var.a0 = true;
        b29Var.L(-2406842, "Cup Red");
        b29Var.L(-2406842, "Box");
        b29Var.j();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z = this.g;
        b29 b29Var = this.h;
        if (z) {
            b29Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        b29Var.setBounds(getBounds());
        if (this.g) {
            b29Var.draw(canvas);
        }
        if (!this.g || !b29Var.p()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), hl.L(5.0f), paint);
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
