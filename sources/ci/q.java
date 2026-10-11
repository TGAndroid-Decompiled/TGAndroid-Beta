package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ek0;
public final class q extends Drawable {
    public final Paint f5742a;
    public float f5743b;
    public float f5744c;
    public long d;
    public boolean f5745e;
    public boolean f5746f;
    public boolean f5747g;
    public final ek0 h;
    public final bc f5748i;
    public final bc f5749j;

    public q(bc bcVar, bc bcVar2) {
        this.f5749j = bcVar;
        Paint paint = new Paint(1);
        this.f5742a = paint;
        this.f5744c = 1.0f;
        this.f5748i = bcVar2;
        ek0 ek0Var = new ek0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = ek0Var;
        ek0Var.f26055o0 = true;
        paint.setColor(-2406842);
        ek0Var.Z = true;
        ek0Var.Q(-2406842, "Cup Red");
        ek0Var.Q(-2406842, "Box");
        ek0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5747g;
        ek0 ek0Var = this.h;
        if (z10) {
            ek0Var.setAlpha((int) (this.f5743b * 255.0f * this.f5744c));
        }
        Paint paint = this.f5742a;
        paint.setAlpha((int) (this.f5743b * 255.0f * this.f5744c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f5745e && !this.f5747g) {
            float f7 = this.f5743b - (((float) currentTimeMillis) / 600.0f);
            this.f5743b = f7;
            if (f7 <= 0.0f) {
                this.f5743b = 0.0f;
                this.f5745e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5743b;
            this.f5743b = f10;
            if (f10 >= 1.0f) {
                this.f5743b = 1.0f;
                this.f5745e = false;
            }
        }
        this.d = System.currentTimeMillis();
        ek0Var.setBounds(getBounds());
        if (this.f5747g) {
            ek0Var.draw(canvas);
        }
        if (!this.f5747g || !ek0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5749j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5744c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
