package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;
public final class q extends Drawable {
    public final Paint f12633a;
    public float f12634b;
    public float f12635c;
    public long d;
    public boolean f12636e;
    public boolean f12637f;
    public boolean f12638g;
    public final zg0 h;
    public final la f12639i;
    public final la f12640j;

    public q(la laVar, la laVar2) {
        this.f12640j = laVar;
        Paint paint = new Paint(1);
        this.f12633a = paint;
        this.f12635c = 1.0f;
        this.f12639i = laVar2;
        zg0 zg0Var = new zg0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = zg0Var;
        zg0Var.f40980o0 = true;
        paint.setColor(-2406842);
        zg0Var.Z = true;
        zg0Var.Q(-2406842, "Cup Red");
        zg0Var.Q(-2406842, "Box");
        zg0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z9 = this.f12638g;
        zg0 zg0Var = this.h;
        if (z9) {
            zg0Var.setAlpha((int) (this.f12634b * 255.0f * this.f12635c));
        }
        Paint paint = this.f12633a;
        paint.setAlpha((int) (this.f12634b * 255.0f * this.f12635c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f12636e && !this.f12638g) {
            float f10 = this.f12634b - (((float) currentTimeMillis) / 600.0f);
            this.f12634b = f10;
            if (f10 <= 0.0f) {
                this.f12634b = 0.0f;
                this.f12636e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f12634b;
            this.f12634b = f11;
            if (f11 >= 1.0f) {
                this.f12634b = 1.0f;
                this.f12636e = false;
            }
        }
        this.d = System.currentTimeMillis();
        zg0Var.setBounds(getBounds());
        if (this.f12638g) {
            zg0Var.draw(canvas);
        }
        if (!this.f12638g || !zg0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f12640j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f12635c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
