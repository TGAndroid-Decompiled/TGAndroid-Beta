package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class zkb extends FrameLayout {
    public static Paint d;
    public final TextView a;
    public int b;
    public float c;

    public zkb(Context context) {
        super(context);
        int i;
        int i2;
        this.c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-14606047);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        textView.setPadding(0, 0, 0, hl.L(3.0f));
        boolean z = ob6.a0;
        int i3 = (z ? 5 : 3) | 48;
        if (z) {
            i2 = 21;
        } else {
            i2 = 57;
        }
        addView(textView, tre.d(-1, -1.0f, i3, i2, 0.0f, z ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i = this.b;
        if (i != 0) {
            d.setColor(i);
            d.setAlpha((int) (this.c * 255.0f));
            if (!ob6.a0) {
                measuredWidth = hl.L(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - hl.L(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, hl.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        this.c = f;
        invalidate();
    }
}
