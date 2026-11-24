package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.ui.o;
public final class wb extends TextView {
    public final byte a;

    public wb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                canvas.drawCircle(gl.L(3.5f), gl.L(11.5f), gl.L(2.5f), getPaint());
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 1:
                return Button.class.getName();
            case 2:
                return Button.class.getName();
            case 3:
                return Button.class.getName();
            case 4:
                return Button.class.getName();
            case 5:
                return Button.class.getName();
            case 6:
                return Button.class.getName();
            case 7:
                return Button.class.getName();
            case 8:
                return Button.class.getName();
            case 9:
                return Button.class.getName();
            case 10:
            case 11:
            default:
                return super.getAccessibilityClassName();
            case 12:
                return Button.class.getName();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, o.t1);
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        switch (this.a) {
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(220.0f)), View.MeasureSpec.getMode(i)), i2);
                return;
            case 15:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i4 = 0;
                    while (i3 < layout.getLineCount()) {
                        i4 = Math.max(i4, (int) Math.ceil(layout.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i4, 1073741824);
                }
                super.onMeasure(i, i2);
                return;
            case 16:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i5 = 0;
                    while (i3 < layout2.getLineCount()) {
                        i5 = Math.max(i5, (int) Math.ceil(layout2.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i5, 1073741824);
                }
                super.onMeasure(i, i2);
                return;
            case 17:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i6 = 0;
                    while (i3 < layout3.getLineCount()) {
                        i6 = Math.max(i6, (int) Math.ceil(layout3.getLineWidth(i3)));
                        i3++;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i6, 1073741824);
                }
                super.onMeasure(i, i2);
                return;
            case 18:
                super.onMeasure(i, i2);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() > 1) {
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i3 = Math.max(i3, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i3 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | 1073741824, getMeasuredHeight() | 1073741824);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - gl.L(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - gl.L(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), 1073741824));
                return;
            case 21:
            case 26:
            default:
                super.onMeasure(i, i2);
                return;
            case 22:
                super.onMeasure(i, i2);
                return;
            case 23:
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                    i = ug8.f(52.0f, View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
                }
                super.onMeasure(i, i2);
                return;
            case 24:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), Integer.MIN_VALUE));
                return;
            case 25:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), gl.L(100.0f)), Integer.MIN_VALUE));
                return;
            case 27:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), Integer.MIN_VALUE));
                return;
            case 28:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 10:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 13:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 21:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 26:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
