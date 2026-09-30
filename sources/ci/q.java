package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lj0;
public final class q extends Drawable {
    public final Paint f5319a;
    public float f5320b;
    public float f5321c;
    public long d;
    public boolean e;
    public boolean f5322f;
    public boolean f5323g;
    public final lj0 h;
    public final bc f5324i;
    public final bc f5325j;

    public q(bc bcVar, bc bcVar2) {
        this.f5325j = bcVar;
        Paint paint = new Paint(1);
        this.f5319a = paint;
        this.f5321c = 1.0f;
        this.f5324i = bcVar2;
        lj0 lj0Var = new lj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = lj0Var;
        lj0Var.f26025o0 = true;
        paint.setColor(-2406842);
        lj0Var.Z = true;
        lj0Var.Q(-2406842, "Cup Red");
        lj0Var.Q(-2406842, "Box");
        lj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f5323g;
        lj0 lj0Var = this.h;
        if (z10) {
            lj0Var.setAlpha((int) (this.f5320b * 255.0f * this.f5321c));
        }
        Paint paint = this.f5319a;
        paint.setAlpha((int) (this.f5320b * 255.0f * this.f5321c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f5323g) {
            float f7 = this.f5320b - (((float) currentTimeMillis) / 600.0f);
            this.f5320b = f7;
            if (f7 <= 0.0f) {
                this.f5320b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f5320b;
            this.f5320b = f10;
            if (f10 >= 1.0f) {
                this.f5320b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        lj0Var.setBounds(getBounds());
        if (this.f5323g) {
            lj0Var.draw(canvas);
        }
        if (!this.f5323g || !lj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f5325j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5321c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
