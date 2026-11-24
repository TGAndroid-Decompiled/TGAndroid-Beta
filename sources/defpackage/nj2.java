package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class nj2 extends NestedScrollView {
    public boolean W;
    public final rj2 a0;

    public nj2(rj2 rj2Var, Activity activity) {
        super(activity);
        this.a0 = rj2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rj2 rj2Var = this.a0;
        int scrollY = (int) ((getScrollY() + (rj2Var.q1 - rj2Var.t0)) - getTranslationY());
        Drawable drawable = rj2Var.l1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), gm.L(19.0f) + rj2Var.n1.getMeasuredHeight() + scrollY + rj2Var.t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            rj2 rj2Var = this.a0;
            if (rj2Var.q1 != 0 && motionEvent.getY() < rj2Var.q1) {
                rj2Var.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj2.onMeasure(int, int):void");
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
