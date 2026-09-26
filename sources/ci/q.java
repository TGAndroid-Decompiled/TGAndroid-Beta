package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jj0;
public final class q extends Drawable {
    public final Paint f5310a;
    public float f5311b;
    public float f5312c;
    public long d;
    public boolean e;
    public boolean f5313f;
    public boolean f5314g;
    public final jj0 h;
    public final bc f5315i;
    public final bc f5316j;

    public q(bc bcVar, bc bcVar2) {
        this.f5316j = bcVar;
        Paint paint = new Paint(1);
        this.f5310a = paint;
        this.f5312c = 1.0f;
        this.f5315i = bcVar2;
        jj0 jj0Var = new jj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = jj0Var;
        jj0Var.f25439o0 = true;
        paint.setColor(-2406842);
        jj0Var.Z = true;
        jj0Var.Q(-2406842, "Cup Red");
        jj0Var.Q(-2406842, "Box");
        jj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5314g;
        jj0 jj0Var = this.h;
        if (z10) {
            jj0Var.setAlpha((int) (this.f5311b * 255.0f * this.f5312c));
        }
        Paint paint = this.f5310a;
        paint.setAlpha((int) (this.f5311b * 255.0f * this.f5312c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5314g) {
            float f7 = this.f5311b - (((float) currentTimeMillis) / 600.0f);
            this.f5311b = f7;
            if (f7 <= 0.0f) {
                this.f5311b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5311b;
            this.f5311b = f10;
            if (f10 >= 1.0f) {
                this.f5311b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        jj0Var.setBounds(getBounds());
        if (this.f5314g) {
            jj0Var.draw(canvas);
        }
        if (!this.f5314g || !jj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5316j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5312c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
