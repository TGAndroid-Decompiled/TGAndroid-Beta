package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class q extends Drawable {
    public final Paint f14886a;
    public float f14887b;
    public float f14888c;
    public long d;
    public boolean f14889e;
    public boolean f14890f;
    public boolean f14891g;
    public final ch0 h;
    public final ia f14892i;
    public final ia f14893j;

    public q(ia iaVar, ia iaVar2) {
        this.f14893j = iaVar;
        Paint paint = new Paint(1);
        this.f14886a = paint;
        this.f14888c = 1.0f;
        this.f14892i = iaVar2;
        ch0 ch0Var = new ch0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = ch0Var;
        ch0Var.f33592p0 = true;
        paint.setColor(-2406842);
        ch0Var.f33573a0 = true;
        ch0Var.Q(-2406842, "Cup Red");
        ch0Var.Q(-2406842, "Box");
        ch0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f14891g;
        ch0 ch0Var = this.h;
        if (z10) {
            ch0Var.setAlpha((int) (this.f14887b * 255.0f * this.f14888c));
        }
        Paint paint = this.f14886a;
        paint.setAlpha((int) (this.f14887b * 255.0f * this.f14888c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f14889e && !this.f14891g) {
            float f10 = this.f14887b - (((float) currentTimeMillis) / 600.0f);
            this.f14887b = f10;
            if (f10 <= 0.0f) {
                this.f14887b = 0.0f;
                this.f14889e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f14887b;
            this.f14887b = f11;
            if (f11 >= 1.0f) {
                this.f14887b = 1.0f;
                this.f14889e = false;
            }
        }
        this.d = System.currentTimeMillis();
        ch0Var.setBounds(getBounds());
        if (this.f14891g) {
            ch0Var.draw(canvas);
        }
        if (!this.f14891g || !ch0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f14893j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f14888c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
