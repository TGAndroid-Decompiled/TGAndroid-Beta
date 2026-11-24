package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class nf6 extends View implements tjb {
    public final TextPaint a;
    public final Paint b;
    public final String c;
    public final Rect d;
    public View e;

    public nf6(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        this.d = new Rect();
        this.c = k96.M0(2131748535, null);
        textPaint.setTextSize(gl.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - gl.L(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f;
        } else {
            L = gl.L(64.0f);
        }
        Paint paint = this.b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - gl.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - gl.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + gl.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + gl.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.a);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = this.e;
        if (view != null) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i, i2);
        String str = this.c;
        this.a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }

    @Override
    public final void updateColors() {
        this.a.setColor(bkb.w0(null, bkb.x6, false));
        this.b.setColor(bkb.w0(null, bkb.yj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
