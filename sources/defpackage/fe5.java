package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
import org.telegram.ui.Components.EditTextBoldCursor;
public class fe5 extends EditTextBoldCursor {
    public final TextPaint M1;
    public String N1;
    public final Rect O1;

    public fe5(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.M1 = textPaint;
        this.O1 = new Rect();
        textPaint.setColor(bkb.w0(null, bkb.G6, false));
    }

    public String getHintText() {
        return this.N1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Rect rect;
        Canvas canvas2;
        if (this.N1 != null && length() < this.N1.length()) {
            int i = 0;
            float f = 0.0f;
            while (i < this.N1.length()) {
                int length = length();
                TextPaint textPaint = this.M1;
                if (i < length) {
                    measureText = getPaint().measureText(getText(), i, i + 1);
                } else {
                    measureText = textPaint.measureText(this.N1, i, i + 1);
                }
                if (i < length()) {
                    f += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.N1;
                    textPaint.getTextBounds(str, 0, str.length(), this.O1);
                    A(i);
                    canvas2 = canvas;
                    canvas2.drawText(this.N1, i, i + 1, f, (rect.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidate();
    }

    public void setHintText(String str) {
        this.N1 = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.M1.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }

    public void A(int i) {
    }
}
