package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yi0;
public final class q extends Drawable {
    public final Paint f5322a;
    public float f5323b;
    public float f5324c;
    public long d;
    public boolean e;
    public boolean f5325f;
    public boolean f5326g;
    public final yi0 h;
    public final ec f5327i;
    public final ec f5328j;

    public q(ec ecVar, ec ecVar2) {
        this.f5328j = ecVar;
        Paint paint = new Paint(1);
        this.f5322a = paint;
        this.f5324c = 1.0f;
        this.f5327i = ecVar2;
        yi0 yi0Var = new yi0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = yi0Var;
        yi0Var.f30239o0 = true;
        paint.setColor(-2406842);
        yi0Var.Z = true;
        yi0Var.Q(-2406842, "Cup Red");
        yi0Var.Q(-2406842, "Box");
        yi0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5326g;
        yi0 yi0Var = this.h;
        if (z10) {
            yi0Var.setAlpha((int) (this.f5323b * 255.0f * this.f5324c));
        }
        Paint paint = this.f5322a;
        paint.setAlpha((int) (this.f5323b * 255.0f * this.f5324c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5326g) {
            float f7 = this.f5323b - (((float) currentTimeMillis) / 600.0f);
            this.f5323b = f7;
            if (f7 <= 0.0f) {
                this.f5323b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5323b;
            this.f5323b = f10;
            if (f10 >= 1.0f) {
                this.f5323b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        yi0Var.setBounds(getBounds());
        if (this.f5326g) {
            yi0Var.draw(canvas);
        }
        if (!this.f5326g || !yi0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5328j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5324c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
