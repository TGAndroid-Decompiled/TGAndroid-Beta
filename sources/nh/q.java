package nh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class q extends Drawable {
    public final Paint f18381a;
    public float f18382b;
    public float f18383c;
    public long d;
    public boolean f18384e;
    public boolean f18385f;
    public boolean f18386g;
    public final xi0 h;
    public final wa f18387i;
    public final wa f18388j;

    public q(wa waVar, wa waVar2) {
        this.f18388j = waVar;
        Paint paint = new Paint(1);
        this.f18381a = paint;
        this.f18383c = 1.0f;
        this.f18387i = waVar2;
        int i10 = R.raw.chat_audio_record_delete_3;
        xi0 xi0Var = new xi0(i10, j7.l1.k(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xi0Var;
        xi0Var.f34746l0 = true;
        paint.setColor(-2406842);
        xi0Var.W = true;
        xi0Var.O(-2406842, "Cup Red");
        xi0Var.O(-2406842, "Box");
        xi0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f18386g;
        xi0 xi0Var = this.h;
        if (z10) {
            xi0Var.setAlpha((int) (this.f18382b * 255.0f * this.f18383c));
        }
        Paint paint = this.f18381a;
        paint.setAlpha((int) (this.f18382b * 255.0f * this.f18383c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f18384e && !this.f18386g) {
            float f9 = this.f18382b - (((float) currentTimeMillis) / 600.0f);
            this.f18382b = f9;
            if (f9 <= 0.0f) {
                this.f18382b = 0.0f;
                this.f18384e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f18382b;
            this.f18382b = f10;
            if (f10 >= 1.0f) {
                this.f18382b = 1.0f;
                this.f18384e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xi0Var.setBounds(getBounds());
        if (this.f18386g) {
            xi0Var.draw(canvas);
        }
        if (!this.f18386g || !xi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f18388j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f18383c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
