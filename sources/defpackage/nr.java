package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class nr extends LinearLayout implements tjb {
    public static final int h = 0;
    public Paint a;
    public Paint b;
    public mr c;
    public TextView d;
    public float e;
    public boolean f;

    public final void a(float f) {
        this.e = f;
        this.f = true;
        TextView textView = this.d;
        int w0 = bkb.w0(null, bkb.F6, false);
        int i = bkb.H6;
        textView.setTextColor(bm2.f(f, w0, bkb.w0(null, i, false)));
        Paint paint = this.a;
        paint.setColor(bm2.f(f, bm2.o(bkb.w0(null, bkb.L6, false), 63), bkb.w0(null, i, false)));
        paint.setStrokeWidth(Math.max(2, gl.L(gl.R1(0.5f, 2.0f, f))));
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
            duration.setInterpolator(ls3.e);
            duration.addUpdateListener(new f0(this, (byte) 6));
            duration.start();
            return;
        }
        a(f);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = gl.P;
        mr mrVar = this.c;
        rectF.set(mrVar.getLeft() + strokeWidth, mrVar.getTop() + strokeWidth, mrVar.getRight() - strokeWidth, mrVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f && this.d != null) {
                a(this.e);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
