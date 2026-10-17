package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uj0;
public final class q extends Drawable {
    public final Paint f9611a;
    public float f9612b;
    public float f9613c;
    public long d;
    public boolean e;
    public boolean f9614f;
    public boolean f9615g;
    public final uj0 h;
    public final lb f9616i;
    public final lb f9617j;

    public q(lb lbVar, lb lbVar2) {
        this.f9617j = lbVar;
        Paint paint = new Paint(1);
        this.f9611a = paint;
        this.f9613c = 1.0f;
        this.f9616i = lbVar2;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = uj0Var;
        uj0Var.f31018o0 = true;
        paint.setColor(-2406842);
        uj0Var.Z = true;
        uj0Var.Q(-2406842, "Cup Red");
        uj0Var.Q(-2406842, "Box");
        uj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f9615g;
        uj0 uj0Var = this.h;
        if (z10) {
            uj0Var.setAlpha((int) (this.f9612b * 255.0f * this.f9613c));
        }
        Paint paint = this.f9611a;
        paint.setAlpha((int) (this.f9612b * 255.0f * this.f9613c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f9615g) {
            float f7 = this.f9612b - (((float) currentTimeMillis) / 600.0f);
            this.f9612b = f7;
            if (f7 <= 0.0f) {
                this.f9612b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f9612b;
            this.f9612b = f10;
            if (f10 >= 1.0f) {
                this.f9612b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        uj0Var.setBounds(getBounds());
        if (this.f9615g) {
            uj0Var.draw(canvas);
        }
        if (!this.f9615g || !uj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f9617j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9613c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
