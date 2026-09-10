package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
public final class u extends Drawable {
    public final Paint f3701a;
    public float f3702b;
    public float f3703c;
    public long d;
    public boolean e;
    public boolean f3704f;
    public boolean f3705g;
    public final hj0 h;
    public final qd f3706i;
    public final qd f3707j;

    public u(qd qdVar, qd qdVar2) {
        this.f3707j = qdVar;
        Paint paint = new Paint(1);
        this.f3701a = paint;
        this.f3703c = 1.0f;
        this.f3706i = qdVar2;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = hj0Var;
        hj0Var.f23664p0 = true;
        paint.setColor(-2406842);
        hj0Var.f23646a0 = true;
        hj0Var.Q(-2406842, "Cup Red");
        hj0Var.Q(-2406842, "Box");
        hj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f3705g;
        hj0 hj0Var = this.h;
        if (z10) {
            hj0Var.setAlpha((int) (this.f3702b * 255.0f * this.f3703c));
        }
        Paint paint = this.f3701a;
        paint.setAlpha((int) (this.f3702b * 255.0f * this.f3703c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f3705g) {
            float f7 = this.f3702b - (((float) currentTimeMillis) / 600.0f);
            this.f3702b = f7;
            if (f7 <= 0.0f) {
                this.f3702b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f3702b;
            this.f3702b = f10;
            if (f10 >= 1.0f) {
                this.f3702b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        hj0Var.setBounds(getBounds());
        if (this.f3705g) {
            hj0Var.draw(canvas);
        }
        if (!this.f3705g || !hj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f3707j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3703c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
