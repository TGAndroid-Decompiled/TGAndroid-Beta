package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class i1 extends View {
    public final h1 f3682a;

    public i1(Context context) {
        super(context);
        h1 h1Var = new h1();
        this.f3682a = h1Var;
        h1Var.f3654r = this;
        h1Var.d.H0(this);
    }

    public h1 getDrawable() {
        return this.f3682a;
    }

    public TextPaint getTextPaint() {
        return this.f3682a.f3641c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3682a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1 h1Var = this.f3682a;
        h1Var.d.R();
        org.telegram.ui.Components.x5.release((View) null, h1Var.f3653q);
        h1Var.f3653q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        h1 h1Var = this.f3682a;
        h1Var.setBounds(paddingLeft, paddingTop, width, height);
        h1Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        h1 h1Var = this.f3682a;
        h1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + h1Var.f3656t, getPaddingBottom() + getPaddingTop() + h1Var.f3657u);
    }

    public void setMessage(CharSequence charSequence) {
        h1 h1Var = this.f3682a;
        h1Var.f3649m = charSequence;
        h1Var.f3655s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f3682a.c(tLObject);
        invalidate();
    }
}
