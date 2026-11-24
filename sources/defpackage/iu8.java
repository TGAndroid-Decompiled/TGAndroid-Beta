package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class iu8 extends FrameLayout {
    public final ku8 a;

    public iu8(ku8 ku8Var, Context context) {
        super(context);
        this.a = ku8Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ku8 ku8Var = this.a;
        in3 in3Var = ku8Var.M;
        RectF rectF = ku8Var.N;
        RectF rectF2 = ku8Var.O;
        soc socVar = ku8Var.r;
        if (view == socVar && ku8Var.K > 0.0f) {
            rectF2.set(0.0f, 0.0f, socVar.getWidth(), socVar.getHeight());
            socVar.getMatrix().mapRect(rectF2);
            rectF2.offset(socVar.getLeft(), socVar.getTop());
            rectF2.inset(-gm.L(4.0f), -gm.L(4.0f));
            float L = gm.L(28.0f);
            if (rectF2.top < ku8Var.K + L && rectF2.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(rectF2, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                rectF.set(rectF2.left, rectF2.top, rectF2.right, Math.min(rectF2.bottom, ku8Var.K));
                if (rectF.height() > 0.0f) {
                    canvas.drawRect(rectF, in3Var.w(1.0f, 1));
                }
                float f = rectF2.left;
                float f2 = ku8Var.K;
                rectF.set(f, f2, rectF2.right, L + f2);
                in3Var.r(canvas, rectF, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ku8 ku8Var = this.a;
        TextView textView = ku8Var.x;
        a6 a6Var = ku8Var.w;
        soc socVar = ku8Var.r;
        getLocationOnScreen(ku8Var.W);
        int i7 = ku8Var.I.a;
        int width = getWidth();
        iq5 iq5Var = ku8Var.I;
        int g = wi8.g(width - iq5Var.a, iq5Var.c, 2, i7);
        int height = (getHeight() - ku8Var.I.d) - gm.L(16.0f);
        if (ku8Var.c()) {
            i5 = a6Var.getMeasuredHeight();
        } else {
            i5 = 0;
        }
        int i8 = height - i5;
        a6Var.layout(g - (a6Var.getMeasuredWidth() / 2), i8, ((a6Var.getMeasuredWidth() + 1) / 2) + g, a6Var.getMeasuredHeight() + i8);
        int L = gm.L(36.0f) + Math.max(ku8Var.I.b, gm.m);
        textView.layout(g - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + g, textView.getMeasuredHeight() + L);
        ku8Var.d();
        int L2 = gm.L(24.0f) + Math.max(ku8Var.I.b, gm.m);
        if (textView.getVisibility() == 0) {
            i6 = textView.getMeasuredHeight() + gm.L(12.0f);
        } else {
            i6 = 0;
        }
        int i9 = i6 + L2;
        int max = Math.max(i9, Math.min(Math.max(i9, (i8 - gm.L(24.0f)) - socVar.getMeasuredHeight()), (getHeight() - socVar.getMeasuredHeight()) / 2));
        int measuredWidth = g - (socVar.getMeasuredWidth() / 2);
        socVar.layout(measuredWidth, max, socVar.getMeasuredWidth() + measuredWidth, socVar.getMeasuredHeight() + max);
        ku8Var.s.layout(0, 0, getWidth(), getHeight());
        ku8Var.n.layout(0, 0, getWidth(), getHeight());
        tl0.c(ku8Var.F, this);
        ku8Var.e();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        ku8 ku8Var = this.a;
        soc socVar = ku8Var.r;
        iq5 iq5Var = ku8Var.I;
        int max = Math.max(1, (size - iq5Var.a) - iq5Var.c);
        ku8Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gm.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
        TextView textView = ku8Var.x;
        float f = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gm.L(48.0f)), Integer.MIN_VALUE), 0);
        int min = Math.min(gm.L(420.0f), Math.max(1, max - gm.L(24.0f)));
        int max2 = (size2 - Math.max(ku8Var.I.b, gm.m)) - ku8Var.I.d;
        if (ku8Var.c()) {
            f = 120.0f;
        }
        int L = max2 - gm.L(f);
        if (textView.getVisibility() == 0) {
            i3 = textView.getMeasuredHeight() + gm.L(12.0f);
        } else {
            i3 = 0;
        }
        int max3 = Math.max(1, L - i3);
        socVar.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), 0);
        if (socVar.getMeasuredHeight() > max3) {
            int paddingRight = socVar.getPaddingRight() + socVar.getPaddingLeft();
            int paddingBottom = socVar.getPaddingBottom() + socVar.getPaddingTop();
            socVar.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, socVar.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), 0);
        }
        ku8Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ku8Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
