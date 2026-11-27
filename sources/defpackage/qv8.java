package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class qv8 extends FrameLayout {
    public final sv8 a;

    public qv8(sv8 sv8Var, Context context) {
        super(context);
        this.a = sv8Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        sv8 sv8Var = this.a;
        pm3 pm3Var = sv8Var.M;
        RectF rectF = sv8Var.N;
        RectF rectF2 = sv8Var.O;
        frc frcVar = sv8Var.r;
        if (view == frcVar && sv8Var.K > 0.0f) {
            rectF2.set(0.0f, 0.0f, frcVar.getWidth(), frcVar.getHeight());
            frcVar.getMatrix().mapRect(rectF2);
            rectF2.offset(frcVar.getLeft(), frcVar.getTop());
            rectF2.inset(-hl.L(4.0f), -hl.L(4.0f));
            float L = hl.L(28.0f);
            if (rectF2.top < sv8Var.K + L && rectF2.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(rectF2, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                rectF.set(rectF2.left, rectF2.top, rectF2.right, Math.min(rectF2.bottom, sv8Var.K));
                if (rectF.height() > 0.0f) {
                    canvas.drawRect(rectF, pm3Var.w(1.0f, 1));
                }
                float f = rectF2.left;
                float f2 = sv8Var.K;
                rectF.set(f, f2, rectF2.right, L + f2);
                pm3Var.r(canvas, rectF, 1, 1.0f);
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
        sv8 sv8Var = this.a;
        TextView textView = sv8Var.x;
        ir8 ir8Var = sv8Var.w;
        frc frcVar = sv8Var.r;
        getLocationOnScreen(sv8Var.W);
        int i7 = sv8Var.I.a;
        int width = getWidth();
        mq5 mq5Var = sv8Var.I;
        int g = ik8.g(width - mq5Var.a, mq5Var.c, 2, i7);
        int height = (getHeight() - sv8Var.I.d) - hl.L(16.0f);
        if (sv8Var.c()) {
            i5 = ir8Var.getMeasuredHeight();
        } else {
            i5 = 0;
        }
        int i8 = height - i5;
        ir8Var.layout(g - (ir8Var.getMeasuredWidth() / 2), i8, ((ir8Var.getMeasuredWidth() + 1) / 2) + g, ir8Var.getMeasuredHeight() + i8);
        int L = hl.L(36.0f) + Math.max(sv8Var.I.b, hl.m);
        textView.layout(g - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + g, textView.getMeasuredHeight() + L);
        sv8Var.d();
        int L2 = hl.L(24.0f) + Math.max(sv8Var.I.b, hl.m);
        if (textView.getVisibility() == 0) {
            i6 = textView.getMeasuredHeight() + hl.L(12.0f);
        } else {
            i6 = 0;
        }
        int i9 = i6 + L2;
        int max = Math.max(i9, Math.min(Math.max(i9, (i8 - hl.L(24.0f)) - frcVar.getMeasuredHeight()), (getHeight() - frcVar.getMeasuredHeight()) / 2));
        int measuredWidth = g - (frcVar.getMeasuredWidth() / 2);
        frcVar.layout(measuredWidth, max, frcVar.getMeasuredWidth() + measuredWidth, frcVar.getMeasuredHeight() + max);
        sv8Var.s.layout(0, 0, getWidth(), getHeight());
        sv8Var.n.layout(0, 0, getWidth(), getHeight());
        uk0.c(sv8Var.F, this);
        sv8Var.e();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        sv8 sv8Var = this.a;
        frc frcVar = sv8Var.r;
        mq5 mq5Var = sv8Var.I;
        int max = Math.max(1, (size - mq5Var.a) - mq5Var.c);
        sv8Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - hl.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
        TextView textView = sv8Var.x;
        float f = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - hl.L(48.0f)), Integer.MIN_VALUE), 0);
        int min = Math.min(hl.L(420.0f), Math.max(1, max - hl.L(24.0f)));
        int max2 = (size2 - Math.max(sv8Var.I.b, hl.m)) - sv8Var.I.d;
        if (sv8Var.c()) {
            f = 120.0f;
        }
        int L = max2 - hl.L(f);
        if (textView.getVisibility() == 0) {
            i3 = textView.getMeasuredHeight() + hl.L(12.0f);
        } else {
            i3 = 0;
        }
        int max3 = Math.max(1, L - i3);
        frcVar.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), 0);
        if (frcVar.getMeasuredHeight() > max3) {
            int paddingRight = frcVar.getPaddingRight() + frcVar.getPaddingLeft();
            int paddingBottom = frcVar.getPaddingBottom() + frcVar.getPaddingTop();
            frcVar.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, frcVar.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), 0);
        }
        sv8Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        sv8Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
