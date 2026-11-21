package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class m1 extends View {
    public final l1 f3867a;

    public m1(Context context) {
        super(context);
        l1 l1Var = new l1();
        this.f3867a = l1Var;
        l1Var.f3827r = this;
        l1Var.d.H0(this);
    }

    public l1 getDrawable() {
        return this.f3867a;
    }

    public TextPaint getTextPaint() {
        return this.f3867a.f3814c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3867a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l1 l1Var = this.f3867a;
        l1Var.d.R();
        org.telegram.ui.Components.y5.release((View) null, l1Var.f3826q);
        l1Var.f3826q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l1 l1Var = this.f3867a;
        l1Var.setBounds(paddingLeft, paddingTop, width, height);
        l1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        l1 l1Var = this.f3867a;
        l1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l1Var.f3829t, getPaddingBottom() + getPaddingTop() + l1Var.f3830u);
    }

    public void setMessage(CharSequence charSequence) {
        l1 l1Var = this.f3867a;
        l1Var.f3822m = charSequence;
        l1Var.f3828s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f3867a.c(tLObject);
        invalidate();
    }
}
