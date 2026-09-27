package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kj0;
public final class q extends Drawable {
    public final Paint f5314a;
    public float f5315b;
    public float f5316c;
    public long d;
    public boolean e;
    public boolean f5317f;
    public boolean f5318g;
    public final kj0 h;
    public final ac f5319i;
    public final ac f5320j;

    public q(ac acVar, ac acVar2) {
        this.f5320j = acVar;
        Paint paint = new Paint(1);
        this.f5314a = paint;
        this.f5316c = 1.0f;
        this.f5319i = acVar2;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = kj0Var;
        kj0Var.f25763o0 = true;
        paint.setColor(-2406842);
        kj0Var.Z = true;
        kj0Var.Q(-2406842, "Cup Red");
        kj0Var.Q(-2406842, "Box");
        kj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5318g;
        kj0 kj0Var = this.h;
        if (z10) {
            kj0Var.setAlpha((int) (this.f5315b * 255.0f * this.f5316c));
        }
        Paint paint = this.f5314a;
        paint.setAlpha((int) (this.f5315b * 255.0f * this.f5316c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5318g) {
            float f7 = this.f5315b - (((float) currentTimeMillis) / 600.0f);
            this.f5315b = f7;
            if (f7 <= 0.0f) {
                this.f5315b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5315b;
            this.f5315b = f10;
            if (f10 >= 1.0f) {
                this.f5315b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        kj0Var.setBounds(getBounds());
        if (this.f5318g) {
            kj0Var.draw(canvas);
        }
        if (!this.f5318g || !kj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5320j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5316c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
