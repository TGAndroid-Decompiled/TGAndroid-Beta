package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class h1 extends View {
    public final g1 f3563a;

    public h1(Context context) {
        super(context);
        g1 g1Var = new g1();
        this.f3563a = g1Var;
        g1Var.f3543r = this;
        g1Var.d.H0(this);
    }

    public g1 getDrawable() {
        return this.f3563a;
    }

    public TextPaint getTextPaint() {
        return this.f3563a.f3530c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3563a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g1 g1Var = this.f3563a;
        g1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, g1Var.f3542q);
        g1Var.f3542q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        g1 g1Var = this.f3563a;
        g1Var.setBounds(paddingLeft, paddingTop, width, height);
        g1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        g1 g1Var = this.f3563a;
        g1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + g1Var.f3545t, getPaddingBottom() + getPaddingTop() + g1Var.f3546u);
    }

    public void setMessage(CharSequence charSequence) {
        g1 g1Var = this.f3563a;
        g1Var.f3538m = charSequence;
        g1Var.f3544s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f3563a.c(tLObject);
        invalidate();
    }
}
