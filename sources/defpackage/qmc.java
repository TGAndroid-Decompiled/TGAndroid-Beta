package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class qmc extends cm2 {
    public final smc M;

    public qmc(smc smcVar) {
        super(2131232823, 0);
        this.M = smcVar;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        smc smcVar = this.M;
        FrameLayout.LayoutParams layoutParams = smcVar.Q;
        if (!smcVar.j0) {
            this.x = 1.0f;
            if (smcVar.a) {
                float max = Math.max(0.0f, Math.min(1.0f, smcVar.U));
                int i6 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i6 == 0) {
                    float intrinsicWidth = this.c.getIntrinsicWidth() * smcVar.b;
                    float f2 = smcVar.b;
                    float intrinsicHeight = this.c.getIntrinsicHeight() * f2;
                    float f3 = (f2 * f) + layoutParams.leftMargin;
                    float height = ((smcVar.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    smcVar.f.set(f3, height, intrinsicWidth + f3, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (smcVar.i0 == null) {
                        smcVar.i0 = new bnc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                        smcVar.m();
                    }
                    Drawable drawable = this.c;
                    smcVar.i0.setBounds(drawable.getBounds());
                    bnc bncVar = smcVar.i0;
                    bncVar.i = smcVar.g0.c;
                    this.c = bncVar;
                    this.d = false;
                    this.x = 1.0f - max;
                    super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                    this.c = drawable;
                    this.d = true;
                }
                this.x = max;
                if (i6 == 0) {
                    return;
                }
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }
}
