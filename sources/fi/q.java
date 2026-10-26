package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xj0;
public final class q extends Drawable {
    public final Paint f11456a;
    public float f11457b;
    public float f11458c;
    public long d;
    public boolean e;
    public boolean f11459f;
    public boolean f11460g;
    public final xj0 h;
    public final ib f11461i;
    public final ib f11462j;

    public q(ib ibVar, ib ibVar2) {
        this.f11462j = ibVar;
        Paint paint = new Paint(1);
        this.f11456a = paint;
        this.f11458c = 1.0f;
        this.f11461i = ibVar2;
        xj0 xj0Var = new xj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xj0Var;
        xj0Var.f34753o0 = true;
        paint.setColor(-2406842);
        xj0Var.Z = true;
        xj0Var.Q(-2406842, "Cup Red");
        xj0Var.Q(-2406842, "Box");
        xj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f11460g;
        xj0 xj0Var = this.h;
        if (z10) {
            xj0Var.setAlpha((int) (this.f11457b * 255.0f * this.f11458c));
        }
        Paint paint = this.f11456a;
        paint.setAlpha((int) (this.f11457b * 255.0f * this.f11458c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f11460g) {
            float f7 = this.f11457b - (((float) currentTimeMillis) / 600.0f);
            this.f11457b = f7;
            if (f7 <= 0.0f) {
                this.f11457b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f11457b;
            this.f11457b = f10;
            if (f10 >= 1.0f) {
                this.f11457b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xj0Var.setBounds(getBounds());
        if (this.f11460g) {
            xj0Var.draw(canvas);
        }
        if (!this.f11460g || !xj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f11462j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11458c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
