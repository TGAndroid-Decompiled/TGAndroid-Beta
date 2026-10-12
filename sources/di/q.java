package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yj0;
public final class q extends Drawable {
    public final Paint f7604a;
    public float f7605b;
    public float f7606c;
    public long d;
    public boolean e;
    public boolean f7607f;
    public boolean f7608g;
    public final yj0 h;
    public final ac f7609i;
    public final ac f7610j;

    public q(ac acVar, ac acVar2) {
        this.f7610j = acVar;
        Paint paint = new Paint(1);
        this.f7604a = paint;
        this.f7606c = 1.0f;
        this.f7609i = acVar2;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = yj0Var;
        yj0Var.f31619o0 = true;
        paint.setColor(-2406842);
        yj0Var.Z = true;
        yj0Var.Q(-2406842, "Cup Red");
        yj0Var.Q(-2406842, "Box");
        yj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f7608g;
        yj0 yj0Var = this.h;
        if (z10) {
            yj0Var.setAlpha((int) (this.f7605b * 255.0f * this.f7606c));
        }
        Paint paint = this.f7604a;
        paint.setAlpha((int) (this.f7605b * 255.0f * this.f7606c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f7608g) {
            float f7 = this.f7605b - (((float) currentTimeMillis) / 600.0f);
            this.f7605b = f7;
            if (f7 <= 0.0f) {
                this.f7605b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f7605b;
            this.f7605b = f10;
            if (f10 >= 1.0f) {
                this.f7605b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        yj0Var.setBounds(getBounds());
        if (this.f7608g) {
            yj0Var.draw(canvas);
        }
        if (!this.f7608g || !yj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f7610j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f7606c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
