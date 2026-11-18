package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mh0;
public final class r extends Drawable {
    public final Paint f15298a;
    public float f15299b;
    public float f15300c;
    public long d;
    public boolean f15301e;
    public boolean f15302f;
    public boolean f15303g;
    public final mh0 h;
    public final ja f15304i;
    public final ja f15305j;

    public r(ja jaVar, ja jaVar2) {
        this.f15305j = jaVar;
        Paint paint = new Paint(1);
        this.f15298a = paint;
        this.f15300c = 1.0f;
        this.f15304i = jaVar2;
        mh0 mh0Var = new mh0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = mh0Var;
        mh0Var.f37499p0 = true;
        paint.setColor(-2406842);
        mh0Var.f37480a0 = true;
        mh0Var.Q(-2406842, "Cup Red");
        mh0Var.Q(-2406842, "Box");
        mh0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f15303g;
        mh0 mh0Var = this.h;
        if (z10) {
            mh0Var.setAlpha((int) (this.f15299b * 255.0f * this.f15300c));
        }
        Paint paint = this.f15298a;
        paint.setAlpha((int) (this.f15299b * 255.0f * this.f15300c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f15301e && !this.f15303g) {
            float f10 = this.f15299b - (((float) currentTimeMillis) / 600.0f);
            this.f15299b = f10;
            if (f10 <= 0.0f) {
                this.f15299b = 0.0f;
                this.f15301e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f15299b;
            this.f15299b = f11;
            if (f11 >= 1.0f) {
                this.f15299b = 1.0f;
                this.f15301e = false;
            }
        }
        this.d = System.currentTimeMillis();
        mh0Var.setBounds(getBounds());
        if (this.f15303g) {
            mh0Var.draw(canvas);
        }
        if (!this.f15303g || !mh0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f15305j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f15300c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
