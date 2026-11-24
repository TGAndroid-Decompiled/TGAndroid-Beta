package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class fu4 extends View {
    public final eu4 a;

    public fu4(Context context) {
        super(context);
        eu4 eu4Var = new eu4();
        this.a = eu4Var;
        eu4Var.r = this;
        eu4Var.d.p0(this);
    }

    public eu4 getDrawable() {
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
        eu4 eu4Var = this.a;
        eu4Var.d.K();
        gm.release((View) null, eu4Var.q);
        eu4Var.q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eu4 eu4Var = this.a;
        eu4Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        eu4Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        eu4 eu4Var = this.a;
        eu4Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + eu4Var.t, getPaddingBottom() + getPaddingTop() + eu4Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        eu4 eu4Var = this.a;
        eu4Var.m = charSequence;
        eu4Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
