package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class q extends Drawable {
    public final Paint f7927a;
    public float f7928b;
    public float f7929c;
    public long d;
    public boolean f7930e;
    public boolean f7931f;
    public boolean f7932g;
    public final xi0 h;
    public final fc f7933i;
    public final fc f7934j;

    public q(fc fcVar, fc fcVar2) {
        this.f7934j = fcVar;
        Paint paint = new Paint(1);
        this.f7927a = paint;
        this.f7929c = 1.0f;
        this.f7933i = fcVar2;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xi0Var;
        xi0Var.f32570p0 = true;
        paint.setColor(-2406842);
        xi0Var.f32551a0 = true;
        xi0Var.O(-2406842, "Cup Red");
        xi0Var.O(-2406842, "Box");
        xi0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f7932g;
        xi0 xi0Var = this.h;
        if (z10) {
            xi0Var.setAlpha((int) (this.f7928b * 255.0f * this.f7929c));
        }
        Paint paint = this.f7927a;
        paint.setAlpha((int) (this.f7928b * 255.0f * this.f7929c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f7930e && !this.f7932g) {
            float f7 = this.f7928b - (((float) currentTimeMillis) / 600.0f);
            this.f7928b = f7;
            if (f7 <= 0.0f) {
                this.f7928b = 0.0f;
                this.f7930e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f7928b;
            this.f7928b = f10;
            if (f10 >= 1.0f) {
                this.f7928b = 1.0f;
                this.f7930e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xi0Var.setBounds(getBounds());
        if (this.f7932g) {
            xi0Var.draw(canvas);
        }
        if (!this.f7932g || !xi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f7934j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f7929c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
