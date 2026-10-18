package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uj0;
public final class q extends Drawable {
    public final Paint f9612a;
    public float f9613b;
    public float f9614c;
    public long d;
    public boolean e;
    public boolean f9615f;
    public boolean f9616g;
    public final uj0 h;
    public final lb f9617i;
    public final lb f9618j;

    public q(lb lbVar, lb lbVar2) {
        this.f9618j = lbVar;
        Paint paint = new Paint(1);
        this.f9612a = paint;
        this.f9614c = 1.0f;
        this.f9617i = lbVar2;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = uj0Var;
        uj0Var.f31025o0 = true;
        paint.setColor(-2406842);
        uj0Var.Z = true;
        uj0Var.Q(-2406842, "Cup Red");
        uj0Var.Q(-2406842, "Box");
        uj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f9616g;
        uj0 uj0Var = this.h;
        if (z10) {
            uj0Var.setAlpha((int) (this.f9613b * 255.0f * this.f9614c));
        }
        Paint paint = this.f9612a;
        paint.setAlpha((int) (this.f9613b * 255.0f * this.f9614c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f9616g) {
            float f7 = this.f9613b - (((float) currentTimeMillis) / 600.0f);
            this.f9613b = f7;
            if (f7 <= 0.0f) {
                this.f9613b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f9613b;
            this.f9613b = f10;
            if (f10 >= 1.0f) {
                this.f9613b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        uj0Var.setBounds(getBounds());
        if (this.f9616g) {
            uj0Var.draw(canvas);
        }
        if (!this.f9616g || !uj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f9618j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9614c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
