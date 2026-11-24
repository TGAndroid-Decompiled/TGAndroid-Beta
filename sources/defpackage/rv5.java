package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class rv5 extends FrameLayout {
    public final wv5 a;

    public rv5(wv5 wv5Var, Context context) {
        super(context);
        this.a = wv5Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wv5 wv5Var = this.a;
        Drawable drawable = wv5Var.l1;
        drawable.setBounds(0, wv5Var.u1 - wv5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wv5 wv5Var = this.a;
            if (wv5Var.u1 != 0 && motionEvent.getY() < wv5Var.u1) {
                wv5Var.dismiss();
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
        int size = View.MeasureSpec.getSize(i2) - gm.m;
        wv5 wv5Var = this.a;
        TextView textView = wv5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        sv5 sv5Var = wv5Var.p1;
        ((FrameLayout.LayoutParams) sv5Var.getLayoutParams()).topMargin = gm.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int v = hg9.v(55.0f, hg9.y(58.0f, wv5Var.s1.size(), gm.L(80.0f)) + wv5Var.t0, measuredHeight);
        int i4 = size / 5;
        if (v < i4 * 3) {
            i3 = size - v;
        } else {
            i3 = i4 << 1;
        }
        if (sv5Var.getPaddingTop() != i3) {
            wv5Var.t1 = true;
            sv5Var.setPadding(0, i3, 0, 0);
            wv5Var.t1 = false;
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
