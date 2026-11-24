package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class hs8 extends FrameLayout {
    public final js8 a;

    public hs8(js8 js8Var, Context context) {
        super(context);
        this.a = js8Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        js8 js8Var = this.a;
        xl3 xl3Var = js8Var.M;
        RectF rectF = js8Var.N;
        RectF rectF2 = js8Var.O;
        smc smcVar = js8Var.r;
        if (view == smcVar && js8Var.K > 0.0f) {
            rectF2.set(0.0f, 0.0f, smcVar.getWidth(), smcVar.getHeight());
            smcVar.getMatrix().mapRect(rectF2);
            rectF2.offset(smcVar.getLeft(), smcVar.getTop());
            rectF2.inset(-gl.L(4.0f), -gl.L(4.0f));
            float L = gl.L(28.0f);
            if (rectF2.top < js8Var.K + L && rectF2.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(rectF2, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                rectF.set(rectF2.left, rectF2.top, rectF2.right, Math.min(rectF2.bottom, js8Var.K));
                if (rectF.height() > 0.0f) {
                    canvas.drawRect(rectF, xl3Var.x(1.0f, 1));
                }
                float f = rectF2.left;
                float f2 = js8Var.K;
                rectF.set(f, f2, rectF2.right, L + f2);
                xl3Var.s(canvas, rectF, 1, 1.0f);
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
        js8 js8Var = this.a;
        TextView textView = js8Var.x;
        a6 a6Var = js8Var.w;
        smc smcVar = js8Var.r;
        getLocationOnScreen(js8Var.W);
        int i7 = js8Var.I.a;
        int width = getWidth();
        io5 io5Var = js8Var.I;
        int g = ug8.g(width - io5Var.a, io5Var.c, 2, i7);
        int height = (getHeight() - js8Var.I.d) - gl.L(16.0f);
        if (js8Var.c()) {
            i5 = a6Var.getMeasuredHeight();
        } else {
            i5 = 0;
        }
        int i8 = height - i5;
        a6Var.layout(g - (a6Var.getMeasuredWidth() / 2), i8, ((a6Var.getMeasuredWidth() + 1) / 2) + g, a6Var.getMeasuredHeight() + i8);
        int L = gl.L(36.0f) + Math.max(js8Var.I.b, gl.m);
        textView.layout(g - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + g, textView.getMeasuredHeight() + L);
        js8Var.d();
        int L2 = gl.L(24.0f) + Math.max(js8Var.I.b, gl.m);
        if (textView.getVisibility() == 0) {
            i6 = textView.getMeasuredHeight() + gl.L(12.0f);
        } else {
            i6 = 0;
        }
        int i9 = i6 + L2;
        int max = Math.max(i9, Math.min(Math.max(i9, (i8 - gl.L(24.0f)) - smcVar.getMeasuredHeight()), (getHeight() - smcVar.getMeasuredHeight()) / 2));
        int measuredWidth = g - (smcVar.getMeasuredWidth() / 2);
        smcVar.layout(measuredWidth, max, smcVar.getMeasuredWidth() + measuredWidth, smcVar.getMeasuredHeight() + max);
        js8Var.s.layout(0, 0, getWidth(), getHeight());
        js8Var.n.layout(0, 0, getWidth(), getHeight());
        tk0.c(js8Var.F, this);
        js8Var.e();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        js8 js8Var = this.a;
        smc smcVar = js8Var.r;
        io5 io5Var = js8Var.I;
        int max = Math.max(1, (size - io5Var.a) - io5Var.c);
        js8Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gl.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824));
        TextView textView = js8Var.x;
        float f = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - gl.L(48.0f)), Integer.MIN_VALUE), 0);
        int min = Math.min(gl.L(420.0f), Math.max(1, max - gl.L(24.0f)));
        int max2 = (size2 - Math.max(js8Var.I.b, gl.m)) - js8Var.I.d;
        if (js8Var.c()) {
            f = 120.0f;
        }
        int L = max2 - gl.L(f);
        if (textView.getVisibility() == 0) {
            i3 = textView.getMeasuredHeight() + gl.L(12.0f);
        } else {
            i3 = 0;
        }
        int max3 = Math.max(1, L - i3);
        smcVar.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), 0);
        if (smcVar.getMeasuredHeight() > max3) {
            int paddingRight = smcVar.getPaddingRight() + smcVar.getPaddingLeft();
            int paddingBottom = smcVar.getPaddingBottom() + smcVar.getPaddingTop();
            smcVar.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, smcVar.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), 0);
        }
        js8Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        js8Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
