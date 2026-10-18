package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uj0;
public final class q extends Drawable {
    public final Paint f9610a;
    public float f9611b;
    public float f9612c;
    public long d;
    public boolean e;
    public boolean f9613f;
    public boolean f9614g;
    public final uj0 h;
    public final lb f9615i;
    public final lb f9616j;

    public q(lb lbVar, lb lbVar2) {
        this.f9616j = lbVar;
        Paint paint = new Paint(1);
        this.f9610a = paint;
        this.f9612c = 1.0f;
        this.f9615i = lbVar2;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = uj0Var;
        uj0Var.f31018o0 = true;
        paint.setColor(-2406842);
        uj0Var.Z = true;
        uj0Var.Q(-2406842, "Cup Red");
        uj0Var.Q(-2406842, "Box");
        uj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f9614g;
        uj0 uj0Var = this.h;
        if (z10) {
            uj0Var.setAlpha((int) (this.f9611b * 255.0f * this.f9612c));
        }
        Paint paint = this.f9610a;
        paint.setAlpha((int) (this.f9611b * 255.0f * this.f9612c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f9614g) {
            float f7 = this.f9611b - (((float) currentTimeMillis) / 600.0f);
            this.f9611b = f7;
            if (f7 <= 0.0f) {
                this.f9611b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f9611b;
            this.f9611b = f10;
            if (f10 >= 1.0f) {
                this.f9611b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        uj0Var.setBounds(getBounds());
        if (this.f9614g) {
            uj0Var.draw(canvas);
        }
        if (!this.f9614g || !uj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f9616j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9612c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
