package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class s extends Drawable {
    public final Paint f15351a;
    public float f15352b;
    public float f15353c;
    public long d;
    public boolean f15354e;
    public boolean f15355f;
    public boolean f15356g;
    public final oh0 h;
    public final ia f15357i;
    public final ia f15358j;

    public s(ia iaVar, ia iaVar2) {
        this.f15358j = iaVar;
        Paint paint = new Paint(1);
        this.f15351a = paint;
        this.f15353c = 1.0f;
        this.f15357i = iaVar2;
        oh0 oh0Var = new oh0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = oh0Var;
        oh0Var.f38230p0 = true;
        paint.setColor(-2406842);
        oh0Var.f38211a0 = true;
        oh0Var.Q(-2406842, "Cup Red");
        oh0Var.Q(-2406842, "Box");
        oh0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f15356g;
        oh0 oh0Var = this.h;
        if (z10) {
            oh0Var.setAlpha((int) (this.f15352b * 255.0f * this.f15353c));
        }
        Paint paint = this.f15351a;
        paint.setAlpha((int) (this.f15352b * 255.0f * this.f15353c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f15354e && !this.f15356g) {
            float f10 = this.f15352b - (((float) currentTimeMillis) / 600.0f);
            this.f15352b = f10;
            if (f10 <= 0.0f) {
                this.f15352b = 0.0f;
                this.f15354e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f15352b;
            this.f15352b = f11;
            if (f11 >= 1.0f) {
                this.f15352b = 1.0f;
                this.f15354e = false;
            }
        }
        this.d = System.currentTimeMillis();
        oh0Var.setBounds(getBounds());
        if (this.f15356g) {
            oh0Var.draw(canvas);
        }
        if (!this.f15356g || !oh0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f15358j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f15353c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
