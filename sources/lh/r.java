package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oi0;

public final class r extends Drawable {

    public final Paint f16609a;

    public float f16610b;

    public float f16611c;
    public long d;

    public boolean f16612e;

    public boolean f16613f;

    public boolean f16614g;
    public final oi0 h;

    public final ib f16615i;

    public final ib f16616j;

    public r(ib ibVar, ib ibVar2) {
        this.f16616j = ibVar;
        Paint paint = new Paint(1);
        this.f16609a = paint;
        this.f16611c = 1.0f;
        this.f16615i = ibVar2;
        int i10 = R.raw.chat_audio_record_delete_3;
        oi0 oi0Var = new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = oi0Var;
        oi0Var.f31321l0 = true;
        paint.setColor(-2406842);
        oi0Var.W = true;
        oi0Var.O(-2406842, "Cup Red");
        oi0Var.O(-2406842, "Box");
        oi0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f16614g;
        oi0 oi0Var = this.h;
        if (z10) {
            oi0Var.setAlpha((int) (this.f16610b * 255.0f * this.f16611c));
        }
        int i10 = (int) (this.f16610b * 255.0f * this.f16611c);
        Paint paint = this.f16609a;
        paint.setAlpha(i10);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.f16612e || this.f16614g) {
            float f10 = (jCurrentTimeMillis / 600.0f) + this.f16610b;
            this.f16610b = f10;
            if (f10 >= 1.0f) {
                this.f16610b = 1.0f;
                this.f16612e = false;
            }
        } else {
            float f11 = this.f16610b - (jCurrentTimeMillis / 600.0f);
            this.f16610b = f11;
            if (f11 <= 0.0f) {
                this.f16610b = 0.0f;
                this.f16612e = true;
            }
        }
        this.d = System.currentTimeMillis();
        oi0Var.setBounds(getBounds());
        if (this.f16614g) {
            oi0Var.draw(canvas);
        }
        if (!this.f16614g || !oi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f16616j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f16611c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
