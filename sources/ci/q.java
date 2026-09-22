package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class q extends Drawable {
    public final Paint f5319a;
    public float f5320b;
    public float f5321c;
    public long d;
    public boolean e;
    public boolean f5322f;
    public boolean f5323g;
    public final xi0 h;
    public final ec f5324i;
    public final ec f5325j;

    public q(ec ecVar, ec ecVar2) {
        this.f5325j = ecVar;
        Paint paint = new Paint(1);
        this.f5319a = paint;
        this.f5321c = 1.0f;
        this.f5324i = ecVar2;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xi0Var;
        xi0Var.f29960o0 = true;
        paint.setColor(-2406842);
        xi0Var.Z = true;
        xi0Var.Q(-2406842, "Cup Red");
        xi0Var.Q(-2406842, "Box");
        xi0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5323g;
        xi0 xi0Var = this.h;
        if (z10) {
            xi0Var.setAlpha((int) (this.f5320b * 255.0f * this.f5321c));
        }
        Paint paint = this.f5319a;
        paint.setAlpha((int) (this.f5320b * 255.0f * this.f5321c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5323g) {
            float f7 = this.f5320b - (((float) currentTimeMillis) / 600.0f);
            this.f5320b = f7;
            if (f7 <= 0.0f) {
                this.f5320b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5320b;
            this.f5320b = f10;
            if (f10 >= 1.0f) {
                this.f5320b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xi0Var.setBounds(getBounds());
        if (this.f5323g) {
            xi0Var.draw(canvas);
        }
        if (!this.f5323g || !xi0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5325j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5321c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
