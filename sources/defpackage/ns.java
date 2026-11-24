package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ns extends LinearLayout implements vlb {
    public static final int h = 0;
    public Paint a;
    public Paint b;
    public ms c;
    public TextView d;
    public float e;
    public boolean f;

    public final void a(float f) {
        this.e = f;
        this.f = true;
        TextView textView = this.d;
        int w0 = cmb.w0(null, cmb.F6, false);
        int i = cmb.H6;
        textView.setTextColor(on2.f(f, w0, cmb.w0(null, i, false)));
        Paint paint = this.a;
        paint.setColor(on2.f(f, on2.p(cmb.w0(null, cmb.L6, false), 63), cmb.w0(null, i, false)));
        paint.setStrokeWidth(Math.max(2, gm.L(gm.R1(0.5f, 2.0f, f))));
        invalidate();
    }

    public final void b(boolean z, boolean z2) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = this.e;
        if (f == f2 && z2) {
            return;
        }
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(250L);
            duration.setInterpolator(vt3.e);
            duration.addUpdateListener(new f0(this, (byte) 7));
            duration.start();
            return;
        }
        a(f);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = gm.P;
        ms msVar = this.c;
        rectF.set(msVar.getLeft() + strokeWidth, msVar.getTop() + strokeWidth, msVar.getRight() - strokeWidth, msVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f && this.d != null) {
                a(this.e);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
