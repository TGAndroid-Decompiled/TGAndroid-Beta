package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class x0 extends View {
    public final w0 f9497a;

    public x0(Context context) {
        super(context);
        w0 w0Var = new w0();
        this.f9497a = w0Var;
        w0Var.f9480r = this;
        w0Var.d.setParentView(this);
    }

    public w0 getDrawable() {
        return this.f9497a;
    }

    public TextPaint getTextPaint() {
        return this.f9497a.f9467c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9497a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w0 w0Var = this.f9497a;
        w0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release((View) null, w0Var.f9479q);
        w0Var.f9479q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        w0 w0Var = this.f9497a;
        w0Var.setBounds(paddingLeft, paddingTop, width, height);
        w0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        w0 w0Var = this.f9497a;
        w0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + w0Var.f9482t, getPaddingBottom() + getPaddingTop() + w0Var.f9483u);
    }

    public void setMessage(CharSequence charSequence) {
        w0 w0Var = this.f9497a;
        w0Var.f9475m = charSequence;
        w0Var.f9481s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f9497a.c(tLObject);
        invalidate();
    }
}
