package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class q extends Drawable {
    public final Paint f12629a;
    public float f12630b;
    public float f12631c;
    public long d;
    public boolean f12632e;
    public boolean f12633f;
    public boolean f12634g;
    public final zg0 h;
    public final la f12635i;
    public final la f12636j;

    public q(la laVar, la laVar2) {
        this.f12636j = laVar;
        Paint paint = new Paint(1);
        this.f12629a = paint;
        this.f12631c = 1.0f;
        this.f12635i = laVar2;
        zg0 zg0Var = new zg0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = zg0Var;
        zg0Var.f40968o0 = true;
        paint.setColor(-2406842);
        zg0Var.Z = true;
        zg0Var.Q(-2406842, "Cup Red");
        zg0Var.Q(-2406842, "Box");
        zg0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z9 = this.f12634g;
        zg0 zg0Var = this.h;
        if (z9) {
            zg0Var.setAlpha((int) (this.f12630b * 255.0f * this.f12631c));
        }
        Paint paint = this.f12629a;
        paint.setAlpha((int) (this.f12630b * 255.0f * this.f12631c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f12632e && !this.f12634g) {
            float f10 = this.f12630b - (((float) currentTimeMillis) / 600.0f);
            this.f12630b = f10;
            if (f10 <= 0.0f) {
                this.f12630b = 0.0f;
                this.f12632e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f12630b;
            this.f12630b = f11;
            if (f11 >= 1.0f) {
                this.f12630b = 1.0f;
                this.f12632e = false;
            }
        }
        this.d = System.currentTimeMillis();
        zg0Var.setBounds(getBounds());
        if (this.f12634g) {
            zg0Var.draw(canvas);
        }
        if (!this.f12634g || !zg0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f12636j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f12631c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
