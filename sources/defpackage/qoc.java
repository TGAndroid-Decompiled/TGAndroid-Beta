package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class qoc extends pn2 {
    public final soc M;

    public qoc(soc socVar) {
        super(2131232836, 0);
        this.M = socVar;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        soc socVar = this.M;
        FrameLayout.LayoutParams layoutParams = socVar.Q;
        if (!socVar.j0) {
            this.x = 1.0f;
            if (socVar.a) {
                float max = Math.max(0.0f, Math.min(1.0f, socVar.U));
                int i6 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i6 == 0) {
                    float intrinsicWidth = this.c.getIntrinsicWidth() * socVar.b;
                    float f2 = socVar.b;
                    float intrinsicHeight = this.c.getIntrinsicHeight() * f2;
                    float f3 = (f2 * f) + layoutParams.leftMargin;
                    float height = ((socVar.O.getHeight() / 2.0f) - (intrinsicHeight / 2.0f)) + layoutParams.topMargin;
                    socVar.f.set(f3, height, intrinsicWidth + f3, intrinsicHeight + height);
                }
                if (max < 1.0f) {
                    if (socVar.i0 == null) {
                        socVar.i0 = new bpc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                        socVar.m();
                    }
                    Drawable drawable = this.c;
                    socVar.i0.setBounds(drawable.getBounds());
                    bpc bpcVar = socVar.i0;
                    bpcVar.i = socVar.g0.c;
                    this.c = bpcVar;
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
