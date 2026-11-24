package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
public final class cpa extends TextView {
    public final float a;

    public cpa(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float measureText;
        float f;
        if (View.MeasureSpec.getMode(i) != 0) {
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            TextPaint textPaint = new TextPaint(getPaint());
            float f2 = this.a;
            textPaint.setTextSize(f2);
            if (textPaint.measureText("0000 0000 0000 0000") > size && size > 0) {
                f2 = (float) Math.floor((f2 * f) / measureText);
            }
            if (getTextSize() != f2) {
                setTextSize(0, f2);
            }
        }
        super.onMeasure(i, i2);
    }
}
