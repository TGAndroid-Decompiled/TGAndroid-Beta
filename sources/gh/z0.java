package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

public final class z0 extends View {

    public final y0 f7693a;

    public z0(Context context) {
        super(context);
        y0 y0Var = new y0();
        this.f7693a = y0Var;
        y0Var.f7649r = this;
        y0Var.d.setParentView(this);
    }

    public y0 getDrawable() {
        return this.f7693a;
    }

    public TextPaint getTextPaint() {
        return this.f7693a.f7636c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7693a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y0 y0Var = this.f7693a;
        y0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, y0Var.f7648q);
        y0Var.f7648q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        y0 y0Var = this.f7693a;
        y0Var.setBounds(paddingLeft, paddingTop, width, height);
        y0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        y0 y0Var = this.f7693a;
        y0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + y0Var.f7651t, getPaddingBottom() + getPaddingTop() + y0Var.f7652u);
    }

    public void setMessage(CharSequence charSequence) {
        y0 y0Var = this.f7693a;
        y0Var.f7644m = charSequence;
        y0Var.f7650s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f7693a.c(tLObject);
        invalidate();
    }
}
