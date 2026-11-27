package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class or extends LinearLayout implements snb {
    public static final int h = 0;
    public Paint a;
    public Paint b;
    public nr c;
    public TextView d;
    public float e;
    public boolean f;

    public final void a(float f) {
        this.e = f;
        this.f = true;
        TextView textView = this.d;
        int w0 = aob.w0(null, aob.G6, false);
        int i = aob.I6;
        textView.setTextColor(vm2.f(f, w0, aob.w0(null, i, false)));
        Paint paint = this.a;
        paint.setColor(vm2.f(f, vm2.o(aob.w0(null, aob.M6, false), 63), aob.w0(null, i, false)));
        paint.setStrokeWidth(Math.max(2, hl.L(hl.R1(0.5f, 2.0f, f))));
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
            duration.setInterpolator(dt3.e);
            duration.addUpdateListener(new g0(this, (byte) 6));
            duration.start();
            return;
        }
        a(f);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = hl.P;
        nr nrVar = this.c;
        rectF.set(nrVar.getLeft() + strokeWidth, nrVar.getTop() + strokeWidth, nrVar.getRight() - strokeWidth, nrVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f && this.d != null) {
                a(this.e);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
