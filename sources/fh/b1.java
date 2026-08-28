package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class b1 extends View {
    public final a1 f6359a;

    public b1(Context context) {
        super(context);
        a1 a1Var = new a1();
        this.f6359a = a1Var;
        a1Var.f6346r = this;
        a1Var.d.setParentView(this);
    }

    public a1 getDrawable() {
        return this.f6359a;
    }

    public TextPaint getTextPaint() {
        return this.f6359a.f6333c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6359a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a1 a1Var = this.f6359a;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.f6345q);
        a1Var.f6345q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        a1 a1Var = this.f6359a;
        a1Var.setBounds(paddingLeft, paddingTop, width, height);
        a1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
        a1 a1Var = this.f6359a;
        a1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + a1Var.f6348t, getPaddingBottom() + getPaddingTop() + a1Var.f6349u);
    }

    public void setMessage(CharSequence charSequence) {
        a1 a1Var = this.f6359a;
        a1Var.f6341m = charSequence;
        a1Var.f6347s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f6359a.c(tLObject);
        invalidate();
    }
}
