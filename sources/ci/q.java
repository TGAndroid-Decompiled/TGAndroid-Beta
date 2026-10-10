package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dk0;
public final class q extends Drawable {
    public final Paint f5743a;
    public float f5744b;
    public float f5745c;
    public long d;
    public boolean f5746e;
    public boolean f5747f;
    public boolean f5748g;
    public final dk0 h;
    public final bc f5749i;
    public final bc f5750j;

    public q(bc bcVar, bc bcVar2) {
        this.f5750j = bcVar;
        Paint paint = new Paint(1);
        this.f5743a = paint;
        this.f5745c = 1.0f;
        this.f5749i = bcVar2;
        dk0 dk0Var = new dk0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = dk0Var;
        dk0Var.f25744o0 = true;
        paint.setColor(-2406842);
        dk0Var.Z = true;
        dk0Var.Q(-2406842, "Cup Red");
        dk0Var.Q(-2406842, "Box");
        dk0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5748g;
        dk0 dk0Var = this.h;
        if (z10) {
            dk0Var.setAlpha((int) (this.f5744b * 255.0f * this.f5745c));
        }
        Paint paint = this.f5743a;
        paint.setAlpha((int) (this.f5744b * 255.0f * this.f5745c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f5746e && !this.f5748g) {
            float f7 = this.f5744b - (((float) currentTimeMillis) / 600.0f);
            this.f5744b = f7;
            if (f7 <= 0.0f) {
                this.f5744b = 0.0f;
                this.f5746e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5744b;
            this.f5744b = f10;
            if (f10 >= 1.0f) {
                this.f5744b = 1.0f;
                this.f5746e = false;
            }
        }
        this.d = System.currentTimeMillis();
        dk0Var.setBounds(getBounds());
        if (this.f5748g) {
            dk0Var.draw(canvas);
        }
        if (!this.f5748g || !dk0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5750j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5745c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
