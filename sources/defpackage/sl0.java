package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class sl0 extends d79 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public int A1() {
        return hl.L(203.0f);
    }

    public final void B1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (xea.f()) {
            this.f3 = A1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
            return;
        }
        this.f3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 != 0 && !a1()) {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() < this.f3 && !this.j3 && !a1()) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.g(canvas, rectF);
        this.j3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.h3 = true;
        B1();
        super.setPadding(getPaddingLeft(), this.g3 + this.f3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i, i2);
    }

    @Override
    public void requestLayout() {
        if (this.h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.g3 = i2;
        super.setPadding(i, i2 + this.f3, i3, i4);
    }
}
