package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yj0;
public final class q extends Drawable {
    public final Paint f11455a;
    public float f11456b;
    public float f11457c;
    public long d;
    public boolean e;
    public boolean f11458f;
    public boolean f11459g;
    public final yj0 h;
    public final ib f11460i;
    public final ib f11461j;

    public q(ib ibVar, ib ibVar2) {
        this.f11461j = ibVar;
        Paint paint = new Paint(1);
        this.f11455a = paint;
        this.f11457c = 1.0f;
        this.f11460i = ibVar2;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = yj0Var;
        yj0Var.f35084o0 = true;
        paint.setColor(-2406842);
        yj0Var.Z = true;
        yj0Var.Q(-2406842, "Cup Red");
        yj0Var.Q(-2406842, "Box");
        yj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f11459g;
        yj0 yj0Var = this.h;
        if (z10) {
            yj0Var.setAlpha((int) (this.f11456b * 255.0f * this.f11457c));
        }
        Paint paint = this.f11455a;
        paint.setAlpha((int) (this.f11456b * 255.0f * this.f11457c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f11459g) {
            float f7 = this.f11456b - (((float) currentTimeMillis) / 600.0f);
            this.f11456b = f7;
            if (f7 <= 0.0f) {
                this.f11456b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f11456b;
            this.f11456b = f10;
            if (f10 >= 1.0f) {
                this.f11456b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        yj0Var.setBounds(getBounds());
        if (this.f11459g) {
            yj0Var.draw(canvas);
        }
        if (!this.f11459g || !yj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f11461j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11457c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
