package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class q extends Drawable {
    public final Paint f7955a;
    public float f7956b;
    public float f7957c;
    public long d;
    public boolean f7958e;
    public boolean f7959f;
    public boolean f7960g;
    public final xi0 h;
    public final fc f7961i;
    public final fc f7962j;

    public q(fc fcVar, fc fcVar2) {
        this.f7962j = fcVar;
        Paint paint = new Paint(1);
        this.f7955a = paint;
        this.f7957c = 1.0f;
        this.f7961i = fcVar2;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xi0Var;
        xi0Var.f32597p0 = true;
        paint.setColor(-2406842);
        xi0Var.f32578a0 = true;
        xi0Var.O(-2406842, "Cup Red");
        xi0Var.O(-2406842, "Box");
        xi0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f7960g;
        xi0 xi0Var = this.h;
        if (z10) {
            xi0Var.setAlpha((int) (this.f7956b * 255.0f * this.f7957c));
        }
        Paint paint = this.f7955a;
        paint.setAlpha((int) (this.f7956b * 255.0f * this.f7957c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f7958e && !this.f7960g) {
            float f7 = this.f7956b - (((float) currentTimeMillis) / 600.0f);
            this.f7956b = f7;
            if (f7 <= 0.0f) {
                this.f7956b = 0.0f;
                this.f7958e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f7956b;
            this.f7956b = f10;
            if (f10 >= 1.0f) {
                this.f7956b = 1.0f;
                this.f7958e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xi0Var.setBounds(getBounds());
        if (this.f7960g) {
            xi0Var.draw(canvas);
        }
        if (!this.f7960g || !xi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f7962j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f7957c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
