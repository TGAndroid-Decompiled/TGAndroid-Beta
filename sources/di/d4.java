package di;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
public final class d4 extends TextView {
    public final float f8656a;

    public d4(Context context, float f10) {
        super(context);
        this.f8656a = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float measureText;
        float f10;
        if (View.MeasureSpec.getMode(i7) != 0) {
            int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
            TextPaint textPaint = new TextPaint(getPaint());
            float f11 = this.f8656a;
            textPaint.setTextSize(f11);
            if (textPaint.measureText("0000 0000 0000 0000") > size && size > 0) {
                f11 = (float) Math.floor((f11 * f10) / measureText);
            }
            if (getTextSize() != f11) {
                setTextSize(0, f11);
            }
        }
        super.onMeasure(i7, i10);
    }
}
