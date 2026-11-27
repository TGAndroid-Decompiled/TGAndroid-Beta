package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class q94 extends ViewGroup implements fn7 {
    public static final int e = 0;
    public final vnb a;
    public final TextView b;
    public final int c;
    public ArrayList d;

    public q94(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = vnbVar;
        this.c = i;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(ob6.M0(2131747989, null));
        textView.setTextSize(13.0f);
        textView.setTypeface(hl.o());
        textView.setIncludeFontPadding(false);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            getChildAt(i3).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        jn7.e().n(this, jn7.l4);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(hl.L(14.0f), getHeight() - 1, getWidth() - hl.L(14.0f), getHeight() - 1, aob.j0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.b.layout(hl.L(14.0f), hl.L(10.0f), getWidth() - hl.L(14.0f), hl.L(24.0f));
        int L = hl.L(14.0f);
        int L2 = hl.L(32.0f);
        for (int i6 = 1; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (L > hl.L(14.0f) && childAt.getMeasuredWidth() + L > getWidth() - hl.L(14.0f)) {
                L = hl.L(14.0f);
                L2 = hl.L(34.0f) + L2;
            }
            if (ob6.a0) {
                i5 = (getWidth() - L) - childAt.getMeasuredWidth();
            } else {
                i5 = L;
            }
            childAt.layout(i5, L2, childAt.getMeasuredWidth() + i5, hl.L(28.0f) + L2);
            L = uh9.w(5.0f, childAt.getMeasuredWidth(), L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(28.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), 1073741824));
        int L2 = hl.L(32.0f);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 1; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), 1073741824));
            if (i4 > 0 && childAt.getMeasuredWidth() + i4 > L) {
                L2 = hl.L(34.0f) + L2;
                i4 = 0;
            }
            i4 = uh9.w(5.0f, childAt.getMeasuredWidth(), i4);
        }
        if (getChildCount() > 1) {
            i3 = hl.L(28.0f);
        }
        setMeasuredDimension(size, hl.L(12.0f) + L2 + i3);
    }
}
