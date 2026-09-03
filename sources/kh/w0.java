package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class w0 extends View {
    public final v0 f11011a;

    public w0(Context context) {
        super(context);
        v0 v0Var = new v0();
        this.f11011a = v0Var;
        v0Var.f10995r = this;
        v0Var.d.setParentView(this);
    }

    public v0 getDrawable() {
        return this.f11011a;
    }

    public TextPaint getTextPaint() {
        return this.f11011a.f10983c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11011a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v0 v0Var = this.f11011a;
        v0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release((View) null, v0Var.f10994q);
        v0Var.f10994q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        v0 v0Var = this.f11011a;
        v0Var.setBounds(paddingLeft, paddingTop, width, height);
        v0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        v0 v0Var = this.f11011a;
        v0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + v0Var.f10997t, getPaddingBottom() + getPaddingTop() + v0Var.f10998u);
    }

    public void setMessage(CharSequence charSequence) {
        v0 v0Var = this.f11011a;
        v0Var.f10990m = charSequence;
        v0Var.f10996s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f11011a.c(tLObject);
        invalidate();
    }
}
