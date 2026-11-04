package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class k1 extends View {
    public final j1 f761a;

    public k1(Context context) {
        super(context);
        j1 j1Var = new j1();
        this.f761a = j1Var;
        j1Var.f744r = this;
        j1Var.d.H0(this);
    }

    public j1 getDrawable() {
        return this.f761a;
    }

    public TextPaint getTextPaint() {
        return this.f761a.f731c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f761a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j1 j1Var = this.f761a;
        j1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, j1Var.f743q);
        j1Var.f743q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j1 j1Var = this.f761a;
        j1Var.setBounds(paddingLeft, paddingTop, width, height);
        j1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
        j1 j1Var = this.f761a;
        j1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j1Var.f746t, getPaddingBottom() + getPaddingTop() + j1Var.f747u);
    }

    public void setMessage(CharSequence charSequence) {
        j1 j1Var = this.f761a;
        j1Var.f739m = charSequence;
        j1Var.f745s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f761a.c(tLObject);
        invalidate();
    }
}
