package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kj0;
public final class q extends Drawable {
    public final Paint f5723a;
    public float f5724b;
    public float f5725c;
    public long d;
    public boolean f5726e;
    public boolean f5727f;
    public boolean f5728g;
    public final kj0 h;
    public final ac f5729i;
    public final ac f5730j;

    public q(ac acVar, ac acVar2) {
        this.f5730j = acVar;
        Paint paint = new Paint(1);
        this.f5723a = paint;
        this.f5725c = 1.0f;
        this.f5729i = acVar2;
        kj0 kj0Var = new kj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = kj0Var;
        kj0Var.f28142o0 = true;
        paint.setColor(-2406842);
        kj0Var.Z = true;
        kj0Var.Q(-2406842, "Cup Red");
        kj0Var.Q(-2406842, "Box");
        kj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5728g;
        kj0 kj0Var = this.h;
        if (z10) {
            kj0Var.setAlpha((int) (this.f5724b * 255.0f * this.f5725c));
        }
        Paint paint = this.f5723a;
        paint.setAlpha((int) (this.f5724b * 255.0f * this.f5725c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f5726e && !this.f5728g) {
            float f7 = this.f5724b - (((float) currentTimeMillis) / 600.0f);
            this.f5724b = f7;
            if (f7 <= 0.0f) {
                this.f5724b = 0.0f;
                this.f5726e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5724b;
            this.f5724b = f10;
            if (f10 >= 1.0f) {
                this.f5724b = 1.0f;
                this.f5726e = false;
            }
        }
        this.d = System.currentTimeMillis();
        kj0Var.setBounds(getBounds());
        if (this.f5728g) {
            kj0Var.draw(canvas);
        }
        if (!this.f5728g || !kj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5730j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5725c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
