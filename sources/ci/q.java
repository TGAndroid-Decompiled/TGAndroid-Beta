package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kj0;
public final class q extends Drawable {
    public final Paint f5722a;
    public float f5723b;
    public float f5724c;
    public long d;
    public boolean f5725e;
    public boolean f5726f;
    public boolean f5727g;
    public final kj0 h;
    public final ac f5728i;
    public final ac f5729j;

    public q(ac acVar, ac acVar2) {
        this.f5729j = acVar;
        Paint paint = new Paint(1);
        this.f5722a = paint;
        this.f5724c = 1.0f;
        this.f5728i = acVar2;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = kj0Var;
        kj0Var.f28137o0 = true;
        paint.setColor(-2406842);
        kj0Var.Z = true;
        kj0Var.Q(-2406842, "Cup Red");
        kj0Var.Q(-2406842, "Box");
        kj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5727g;
        kj0 kj0Var = this.h;
        if (z10) {
            kj0Var.setAlpha((int) (this.f5723b * 255.0f * this.f5724c));
        }
        Paint paint = this.f5722a;
        paint.setAlpha((int) (this.f5723b * 255.0f * this.f5724c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f5725e && !this.f5727g) {
            float f7 = this.f5723b - (((float) currentTimeMillis) / 600.0f);
            this.f5723b = f7;
            if (f7 <= 0.0f) {
                this.f5723b = 0.0f;
                this.f5725e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5723b;
            this.f5723b = f10;
            if (f10 >= 1.0f) {
                this.f5723b = 1.0f;
                this.f5725e = false;
            }
        }
        this.d = System.currentTimeMillis();
        kj0Var.setBounds(getBounds());
        if (this.f5727g) {
            kj0Var.draw(canvas);
        }
        if (!this.f5727g || !kj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5729j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5724c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
