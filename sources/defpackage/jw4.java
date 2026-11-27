package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class jw4 extends View {
    public final iw4 a;

    public jw4(Context context) {
        super(context);
        iw4 iw4Var = new iw4();
        this.a = iw4Var;
        iw4Var.r = this;
        iw4Var.d.p0(this);
    }

    public iw4 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iw4 iw4Var = this.a;
        iw4Var.d.K();
        hm.release((View) null, iw4Var.q);
        iw4Var.q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        iw4 iw4Var = this.a;
        iw4Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        iw4Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        iw4 iw4Var = this.a;
        iw4Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + iw4Var.t, getPaddingBottom() + getPaddingTop() + iw4Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        iw4 iw4Var = this.a;
        iw4Var.m = charSequence;
        iw4Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
