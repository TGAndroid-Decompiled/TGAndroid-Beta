package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class yx0 extends View {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public final RectF e;
    public final ggc f;
    public final int h;
    public int n;
    public int r;

    public yx0(Context context, ggc ggcVar, int i) {
        super(context);
        this.a = new Paint(1);
        this.e = new RectF();
        this.n = -1;
        this.r = -1;
        this.f = ggcVar;
        this.h = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        RectF rectF;
        int L;
        gm.L(5.0f);
        int i2 = this.n;
        Paint paint = this.a;
        if (i2 >= 0) {
            paint.setColor((cmb.w0(null, i2, false) & 16777215) | (-1275068416));
        } else {
            if (cmb.B0().o()) {
                i = -11184811;
            } else {
                i = -4473925;
            }
            paint.setColor(i);
        }
        this.d = this.f.getCurrentItem();
        int i3 = 0;
        while (true) {
            int i4 = this.h;
            rectF = this.e;
            if (i3 >= i4) {
                break;
            }
            if (i3 != this.d) {
                rectF.set(gm.L(11.0f) * i3, 0.0f, gm.L(5.0f) + L, gm.L(5.0f));
                canvas.drawRoundRect(rectF, gm.L(2.5f), gm.L(2.5f), paint);
            }
            i3++;
        }
        int i5 = this.r;
        if (i5 >= 0) {
            paint.setColor(cmb.w0(null, i5, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = gm.L(11.0f) * this.d;
        if (this.b != 0.0f) {
            if (this.c >= this.d) {
                rectF.set(L2, 0.0f, (gm.L(11.0f) * this.b) + gm.L(5.0f) + L2, gm.L(5.0f));
            } else {
                rectF.set(kt6.B(1.0f, this.b, gm.L(11.0f), L2), 0.0f, gm.L(5.0f) + L2, gm.L(5.0f));
            }
        } else {
            rectF.set(L2, 0.0f, gm.L(5.0f) + L2, gm.L(5.0f));
        }
        canvas.drawRoundRect(rectF, gm.L(2.5f), gm.L(2.5f), paint);
    }

    public void setCurrentPage(int i) {
        this.d = i;
        invalidate();
    }
}
