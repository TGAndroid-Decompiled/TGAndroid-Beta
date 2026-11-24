package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class zh2 extends NestedScrollView {
    public boolean W;
    public final di2 a0;

    public zh2(di2 di2Var, Activity activity) {
        super(activity);
        this.a0 = di2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        di2 di2Var = this.a0;
        int scrollY = (int) ((getScrollY() + (di2Var.q1 - di2Var.t0)) - getTranslationY());
        Drawable drawable = di2Var.l1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), gl.L(19.0f) + di2Var.n1.getMeasuredHeight() + scrollY + di2Var.t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            di2 di2Var = this.a0;
            if (di2Var.q1 != 0 && motionEvent.getY() < di2Var.q1) {
                di2Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.D0();
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh2.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.a0.D0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.a0.D0();
    }
}
