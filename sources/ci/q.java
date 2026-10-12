package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fk0;
public final class q extends Drawable {
    public final Paint f5741a;
    public float f5742b;
    public float f5743c;
    public long d;
    public boolean f5744e;
    public boolean f5745f;
    public boolean f5746g;
    public final fk0 h;
    public final bc f5747i;
    public final bc f5748j;

    public q(bc bcVar, bc bcVar2) {
        this.f5748j = bcVar;
        Paint paint = new Paint(1);
        this.f5741a = paint;
        this.f5743c = 1.0f;
        this.f5747i = bcVar2;
        fk0 fk0Var = new fk0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = fk0Var;
        fk0Var.f26121o0 = true;
        paint.setColor(-2406842);
        fk0Var.Z = true;
        fk0Var.Q(-2406842, "Cup Red");
        fk0Var.Q(-2406842, "Box");
        fk0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5746g;
        fk0 fk0Var = this.h;
        if (z10) {
            fk0Var.setAlpha((int) (this.f5742b * 255.0f * this.f5743c));
        }
        Paint paint = this.f5741a;
        paint.setAlpha((int) (this.f5742b * 255.0f * this.f5743c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f5744e && !this.f5746g) {
            float f7 = this.f5742b - (((float) currentTimeMillis) / 600.0f);
            this.f5742b = f7;
            if (f7 <= 0.0f) {
                this.f5742b = 0.0f;
                this.f5744e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5742b;
            this.f5742b = f10;
            if (f10 >= 1.0f) {
                this.f5742b = 1.0f;
                this.f5744e = false;
            }
        }
        this.d = System.currentTimeMillis();
        fk0Var.setBounds(getBounds());
        if (this.f5746g) {
            fk0Var.draw(canvas);
        }
        if (!this.f5746g || !fk0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5748j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5743c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
