package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class st5 extends FrameLayout {
    public final xt5 a;

    public st5(xt5 xt5Var, Context context) {
        super(context);
        this.a = xt5Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xt5 xt5Var = this.a;
        Drawable drawable = xt5Var.l1;
        drawable.setBounds(0, xt5Var.u1 - xt5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xt5 xt5Var = this.a;
            if (xt5Var.u1 != 0 && motionEvent.getY() < xt5Var.u1) {
                xt5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.H0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2) - gl.m;
        xt5 xt5Var = this.a;
        TextView textView = xt5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        tt5 tt5Var = xt5Var.p1;
        ((FrameLayout.LayoutParams) tt5Var.getLayoutParams()).topMargin = gl.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int w = de9.w(55.0f, de9.y(58.0f, xt5Var.s1.size(), gl.L(80.0f)) + xt5Var.t0, measuredHeight);
        int i4 = size / 5;
        if (w < i4 * 3) {
            i3 = size - w;
        } else {
            i3 = i4 << 1;
        }
        if (tt5Var.getPaddingTop() != i3) {
            xt5Var.t1 = true;
            tt5Var.setPadding(0, i3, 0, 0);
            xt5Var.t1 = false;
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
