package gi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class q extends Drawable {
    public final Paint f13403a;
    public float f13404b;
    public float f13405c;
    public long d;
    public boolean f13406e;
    public boolean f13407f;
    public boolean f13408g;
    public final ch0 h;
    public final la f13409i;
    public final la f13410j;

    public q(la laVar, la laVar2) {
        this.f13410j = laVar;
        Paint paint = new Paint(1);
        this.f13403a = paint;
        this.f13405c = 1.0f;
        this.f13409i = laVar2;
        ch0 ch0Var = new ch0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = ch0Var;
        ch0Var.f32738p0 = true;
        paint.setColor(-2406842);
        ch0Var.f32719a0 = true;
        ch0Var.Q(-2406842, "Cup Red");
        ch0Var.Q(-2406842, "Box");
        ch0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f13408g;
        ch0 ch0Var = this.h;
        if (z10) {
            ch0Var.setAlpha((int) (this.f13404b * 255.0f * this.f13405c));
        }
        Paint paint = this.f13403a;
        paint.setAlpha((int) (this.f13404b * 255.0f * this.f13405c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f13406e && !this.f13408g) {
            float f10 = this.f13404b - (((float) currentTimeMillis) / 600.0f);
            this.f13404b = f10;
            if (f10 <= 0.0f) {
                this.f13404b = 0.0f;
                this.f13406e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f13404b;
            this.f13404b = f11;
            if (f11 >= 1.0f) {
                this.f13404b = 1.0f;
                this.f13406e = false;
            }
        }
        this.d = System.currentTimeMillis();
        ch0Var.setBounds(getBounds());
        if (this.f13408g) {
            ch0Var.draw(canvas);
        }
        if (!this.f13408g || !ch0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f13410j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f13405c = i3 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
