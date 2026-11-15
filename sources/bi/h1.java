package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class h1 extends View {
    public final g1 f3560a;

    public h1(Context context) {
        super(context);
        g1 g1Var = new g1();
        this.f3560a = g1Var;
        g1Var.f3540r = this;
        g1Var.d.H0(this);
    }

    public g1 getDrawable() {
        return this.f3560a;
    }

    public TextPaint getTextPaint() {
        return this.f3560a.f3527c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3560a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g1 g1Var = this.f3560a;
        g1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, g1Var.f3539q);
        g1Var.f3539q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        g1 g1Var = this.f3560a;
        g1Var.setBounds(paddingLeft, paddingTop, width, height);
        g1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        g1 g1Var = this.f3560a;
        g1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + g1Var.f3542t, getPaddingBottom() + getPaddingTop() + g1Var.f3543u);
    }

    public void setMessage(CharSequence charSequence) {
        g1 g1Var = this.f3560a;
        g1Var.f3535m = charSequence;
        g1Var.f3541s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f3560a.c(tLObject);
        invalidate();
    }
}
