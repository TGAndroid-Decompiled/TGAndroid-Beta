package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uj0;
public final class q extends Drawable {
    public final Paint f9609a;
    public float f9610b;
    public float f9611c;
    public long d;
    public boolean e;
    public boolean f9612f;
    public boolean f9613g;
    public final uj0 h;
    public final lb f9614i;
    public final lb f9615j;

    public q(lb lbVar, lb lbVar2) {
        this.f9615j = lbVar;
        Paint paint = new Paint(1);
        this.f9609a = paint;
        this.f9611c = 1.0f;
        this.f9614i = lbVar2;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = uj0Var;
        uj0Var.f30991o0 = true;
        paint.setColor(-2406842);
        uj0Var.Z = true;
        uj0Var.Q(-2406842, "Cup Red");
        uj0Var.Q(-2406842, "Box");
        uj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f9613g;
        uj0 uj0Var = this.h;
        if (z10) {
            uj0Var.setAlpha((int) (this.f9610b * 255.0f * this.f9611c));
        }
        Paint paint = this.f9609a;
        paint.setAlpha((int) (this.f9610b * 255.0f * this.f9611c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f9613g) {
            float f7 = this.f9610b - (((float) currentTimeMillis) / 600.0f);
            this.f9610b = f7;
            if (f7 <= 0.0f) {
                this.f9610b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f9610b;
            this.f9610b = f10;
            if (f10 >= 1.0f) {
                this.f9610b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        uj0Var.setBounds(getBounds());
        if (this.f9613g) {
            uj0Var.draw(canvas);
        }
        if (!this.f9613g || !uj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f9615j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9611c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
