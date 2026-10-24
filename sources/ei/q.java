package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xj0;
public final class q extends Drawable {
    public final Paint f9625a;
    public float f9626b;
    public float f9627c;
    public long d;
    public boolean e;
    public boolean f9628f;
    public boolean f9629g;
    public final xj0 h;
    public final lb f9630i;
    public final lb f9631j;

    public q(lb lbVar, lb lbVar2) {
        this.f9631j = lbVar;
        Paint paint = new Paint(1);
        this.f9625a = paint;
        this.f9627c = 1.0f;
        this.f9630i = lbVar2;
        xj0 xj0Var = new xj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xj0Var;
        xj0Var.f32611o0 = true;
        paint.setColor(-2406842);
        xj0Var.Z = true;
        xj0Var.Q(-2406842, "Cup Red");
        xj0Var.Q(-2406842, "Box");
        xj0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f9629g;
        xj0 xj0Var = this.h;
        if (z10) {
            xj0Var.setAlpha((int) (this.f9626b * 255.0f * this.f9627c));
        }
        Paint paint = this.f9625a;
        paint.setAlpha((int) (this.f9626b * 255.0f * this.f9627c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f9629g) {
            float f7 = this.f9626b - (((float) currentTimeMillis) / 600.0f);
            this.f9626b = f7;
            if (f7 <= 0.0f) {
                this.f9626b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f9626b;
            this.f9626b = f10;
            if (f10 >= 1.0f) {
                this.f9626b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        xj0Var.setBounds(getBounds());
        if (this.f9629g) {
            xj0Var.draw(canvas);
        }
        if (!this.f9629g || !xj0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f9631j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9627c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
