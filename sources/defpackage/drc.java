package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class drc extends wm2 {
    public final frc M;

    public drc(frc frcVar) {
        super(2131232842, 0);
        this.M = frcVar;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        frc frcVar = this.M;
        FrameLayout.LayoutParams layoutParams = frcVar.Q;
        if (!frcVar.j0) {
            this.x = 1.0f;
            if (frcVar.a) {
                float max = Math.max(0.0f, Math.min(1.0f, frcVar.U));
                int i6 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i6 == 0) {
                    float intrinsicWidth = this.c.getIntrinsicWidth() * frcVar.b;
                    float f2 = frcVar.b;
                    float intrinsicHeight = this.c.getIntrinsicHeight() * f2;
                    float f3 = (f2 * f) + layoutParams.leftMargin;
                    float height = ((frcVar.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    frcVar.f.set(f3, height, intrinsicWidth + f3, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (frcVar.i0 == null) {
                        frcVar.i0 = new orc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                        frcVar.m();
                    }
                    Drawable drawable = this.c;
                    frcVar.i0.setBounds(drawable.getBounds());
                    orc orcVar = frcVar.i0;
                    orcVar.i = frcVar.g0.c;
                    this.c = orcVar;
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
