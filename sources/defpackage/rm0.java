package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class rm0 extends r59 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (gda.f()) {
            this.f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
            return;
        }
        this.f3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 != 0 && !Z0()) {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() < this.f3 && !this.j3 && !Z0()) {
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
        A1();
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.h3 = true;
        A1();
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

    public int z1() {
        return gm.L(203.0f);
    }
}
