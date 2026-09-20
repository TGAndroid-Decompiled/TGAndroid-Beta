package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
public final class q extends Drawable {
    public final Paint f5323a;
    public float f5324b;
    public float f5325c;
    public long d;
    public boolean e;
    public boolean f5326f;
    public boolean f5327g;
    public final hj0 h;
    public final ec f5328i;
    public final ec f5329j;

    public q(ec ecVar, ec ecVar2) {
        this.f5329j = ecVar;
        Paint paint = new Paint(1);
        this.f5323a = paint;
        this.f5325c = 1.0f;
        this.f5328i = ecVar2;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = hj0Var;
        hj0Var.f24695o0 = true;
        paint.setColor(-2406842);
        hj0Var.Z = true;
        hj0Var.Q(-2406842, "Cup Red");
        hj0Var.Q(-2406842, "Box");
        hj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5327g;
        hj0 hj0Var = this.h;
        if (z10) {
            hj0Var.setAlpha((int) (this.f5324b * 255.0f * this.f5325c));
        }
        Paint paint = this.f5323a;
        paint.setAlpha((int) (this.f5324b * 255.0f * this.f5325c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5327g) {
            float f7 = this.f5324b - (((float) currentTimeMillis) / 600.0f);
            this.f5324b = f7;
            if (f7 <= 0.0f) {
                this.f5324b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5324b;
            this.f5324b = f10;
            if (f10 >= 1.0f) {
                this.f5324b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        hj0Var.setBounds(getBounds());
        if (this.f5327g) {
            hj0Var.draw(canvas);
        }
        if (!this.f5327g || !hj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5329j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5325c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
