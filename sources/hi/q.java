package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class q extends Drawable {
    public final Paint f15205a;
    public float f15206b;
    public float f15207c;
    public long d;
    public boolean f15208e;
    public boolean f15209f;
    public boolean f15210g;
    public final oh0 h;
    public final ja f15211i;
    public final ja f15212j;

    public q(ja jaVar, ja jaVar2) {
        this.f15212j = jaVar;
        Paint paint = new Paint(1);
        this.f15205a = paint;
        this.f15207c = 1.0f;
        this.f15211i = jaVar2;
        oh0 oh0Var = new oh0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = oh0Var;
        oh0Var.f38192p0 = true;
        paint.setColor(-2406842);
        oh0Var.f38173a0 = true;
        oh0Var.Q(-2406842, "Cup Red");
        oh0Var.Q(-2406842, "Box");
        oh0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f15210g;
        oh0 oh0Var = this.h;
        if (z10) {
            oh0Var.setAlpha((int) (this.f15206b * 255.0f * this.f15207c));
        }
        Paint paint = this.f15205a;
        paint.setAlpha((int) (this.f15206b * 255.0f * this.f15207c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f15208e && !this.f15210g) {
            float f10 = this.f15206b - (((float) currentTimeMillis) / 600.0f);
            this.f15206b = f10;
            if (f10 <= 0.0f) {
                this.f15206b = 0.0f;
                this.f15208e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f15206b;
            this.f15206b = f11;
            if (f11 >= 1.0f) {
                this.f15206b = 1.0f;
                this.f15208e = false;
            }
        }
        this.d = System.currentTimeMillis();
        oh0Var.setBounds(getBounds());
        if (this.f15210g) {
            oh0Var.draw(canvas);
        }
        if (!this.f15210g || !oh0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f15212j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f15207c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
