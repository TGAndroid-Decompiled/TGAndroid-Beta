package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class i1 extends View {
    public final h1 f3717a;

    public i1(Context context) {
        super(context);
        h1 h1Var = new h1();
        this.f3717a = h1Var;
        h1Var.f3680r = this;
        h1Var.d.H0(this);
    }

    public h1 getDrawable() {
        return this.f3717a;
    }

    public TextPaint getTextPaint() {
        return this.f3717a.f3667c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3717a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1 h1Var = this.f3717a;
        h1Var.d.R();
        org.telegram.ui.Components.x5.release((View) null, h1Var.f3679q);
        h1Var.f3679q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        h1 h1Var = this.f3717a;
        h1Var.setBounds(paddingLeft, paddingTop, width, height);
        h1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        h1 h1Var = this.f3717a;
        h1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + h1Var.f3682t, getPaddingBottom() + getPaddingTop() + h1Var.f3683u);
    }

    public void setMessage(CharSequence charSequence) {
        h1 h1Var = this.f3717a;
        h1Var.f3675m = charSequence;
        h1Var.f3681s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f3717a.c(tLObject);
        invalidate();
    }
}
