package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class nh6 extends View implements vlb {
    public final TextPaint a;
    public final Paint b;
    public final String c;
    public final Rect d;
    public View e;

    public nh6(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        this.d = new Rect();
        this.c = jb6.M0(2131748484, null);
        textPaint.setTextSize(gm.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - gm.L(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f;
        } else {
            L = gm.L(64.0f);
        }
        Paint paint = this.b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - gm.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - gm.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + gm.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + gm.L(8.0f) + L, getHeight() / 2.0f, paint);
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
        this.a.setColor(cmb.w0(null, cmb.x6, false));
        this.b.setColor(cmb.w0(null, cmb.yj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
