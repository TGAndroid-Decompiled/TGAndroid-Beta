package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class wv5 extends FrameLayout {
    public final bw5 a;

    public wv5(bw5 bw5Var, Context context) {
        super(context);
        this.a = bw5Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bw5 bw5Var = this.a;
        Drawable drawable = bw5Var.l1;
        drawable.setBounds(0, bw5Var.u1 - bw5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bw5 bw5Var = this.a;
            if (bw5Var.u1 != 0 && motionEvent.getY() < bw5Var.u1) {
                bw5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.I0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2) - hl.m;
        bw5 bw5Var = this.a;
        TextView textView = bw5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        xv5 xv5Var = bw5Var.p1;
        ((FrameLayout.LayoutParams) xv5Var.getLayoutParams()).topMargin = hl.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int w = uh9.w(55.0f, uh9.y(58.0f, bw5Var.s1.size(), hl.L(80.0f)) + bw5Var.t0, measuredHeight);
        int i4 = size / 5;
        if (w < i4 * 3) {
            i3 = size - w;
        } else {
            i3 = i4 << 1;
        }
        if (xv5Var.getPaddingTop() != i3) {
            bw5Var.t1 = true;
            xv5Var.setPadding(0, i3, 0, 0);
            bw5Var.t1 = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.a.t1) {
            return;
        }
        super.requestLayout();
    }
}
