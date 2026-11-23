package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nh0;
public final class r extends Drawable {
    public final Paint f15257a;
    public float f15258b;
    public float f15259c;
    public long d;
    public boolean f15260e;
    public boolean f15261f;
    public boolean f15262g;
    public final nh0 h;
    public final db f15263i;
    public final db f15264j;

    public r(db dbVar, db dbVar2) {
        this.f15264j = dbVar;
        Paint paint = new Paint(1);
        this.f15257a = paint;
        this.f15259c = 1.0f;
        this.f15263i = dbVar2;
        nh0 nh0Var = new nh0(2131623976, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = nh0Var;
        nh0Var.f37818p0 = true;
        paint.setColor(-2406842);
        nh0Var.f37799a0 = true;
        nh0Var.Q(-2406842, "Cup Red");
        nh0Var.Q(-2406842, "Box");
        nh0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f15262g;
        nh0 nh0Var = this.h;
        if (z10) {
            nh0Var.setAlpha((int) (this.f15258b * 255.0f * this.f15259c));
        }
        Paint paint = this.f15257a;
        paint.setAlpha((int) (this.f15258b * 255.0f * this.f15259c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f15260e && !this.f15262g) {
            float f10 = this.f15258b - (((float) currentTimeMillis) / 600.0f);
            this.f15258b = f10;
            if (f10 <= 0.0f) {
                this.f15258b = 0.0f;
                this.f15260e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f15258b;
            this.f15258b = f11;
            if (f11 >= 1.0f) {
                this.f15258b = 1.0f;
                this.f15260e = false;
            }
        }
        this.d = System.currentTimeMillis();
        nh0Var.setBounds(getBounds());
        if (this.f15262g) {
            nh0Var.draw(canvas);
        }
        if (!this.f15262g || !nh0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.f15264j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f15259c = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
