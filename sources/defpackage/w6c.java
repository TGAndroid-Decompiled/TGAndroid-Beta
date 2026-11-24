package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class w6c extends TextView {
    public boolean a;
    public final ln b;
    public wi2 c;

    public w6c(Activity activity) {
        super(activity);
        this.b = new ln(this, 0L, 350L, d53.h);
    }

    public final void a(boolean z, boolean z2) {
        this.a = z;
        boolean z3 = true;
        if (!z2) {
            this.b.f(z, true);
        }
        if (!isPressed() && !z) {
            z3 = false;
        }
        super.setPressed(z3);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(this.a);
        if (d > 0.0f) {
            if (d < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
                float f = 1.0f - (0.2f * d);
                canvas2.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, gm.L(-12.0f) * d);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.c == null) {
                wi2 wi2Var = new wi2(gm.L(16.0f), gm.L(2.0f), getCurrentTextColor());
                this.c = wi2Var;
                wi2Var.setCallback(this);
            }
            this.c.b(getCurrentTextColor());
            float f2 = 1.0f - d;
            this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (gm.L(12.0f) * f2)), getWidth() / 2, (getHeight() / 2) + ((int) (f2 * gm.L(12.0f))));
            this.c.setAlpha((int) (d * 255.0f));
            this.c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z) {
        boolean z2;
        if (!z && !this.a) {
            z2 = false;
        } else {
            z2 = true;
        }
        super.setPressed(z2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
