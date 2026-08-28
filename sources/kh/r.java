package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mi0;
public final class r extends Drawable {
    public final Paint f15910a;
    public float f15911b;
    public float f15912c;
    public long d;
    public boolean f15913e;
    public boolean f15914f;
    public boolean f15915g;
    public final mi0 h;
    public final mb f15916i;
    public final mb f15917j;

    public r(mb mbVar, mb mbVar2) {
        this.f15917j = mbVar;
        Paint paint = new Paint(1);
        this.f15910a = paint;
        this.f15912c = 1.0f;
        this.f15916i = mbVar2;
        int i9 = R.raw.chat_audio_record_delete_3;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = mi0Var;
        mi0Var.f30856l0 = true;
        paint.setColor(-2406842);
        mi0Var.W = true;
        mi0Var.O(-2406842, "Cup Red");
        mi0Var.O(-2406842, "Box");
        mi0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f15915g;
        mi0 mi0Var = this.h;
        if (z10) {
            mi0Var.setAlpha((int) (this.f15911b * 255.0f * this.f15912c));
        }
        Paint paint = this.f15910a;
        paint.setAlpha((int) (this.f15911b * 255.0f * this.f15912c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f15913e && !this.f15915g) {
            float f10 = this.f15911b - (((float) currentTimeMillis) / 600.0f);
            this.f15911b = f10;
            if (f10 <= 0.0f) {
                this.f15911b = 0.0f;
                this.f15913e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f15911b;
            this.f15911b = f11;
            if (f11 >= 1.0f) {
                this.f15911b = 1.0f;
                this.f15913e = false;
            }
        }
        this.d = System.currentTimeMillis();
        mi0Var.setBounds(getBounds());
        if (this.f15915g) {
            mi0Var.draw(canvas);
        }
        if (!this.f15915g || !mi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f15917j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f15912c = i9 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
