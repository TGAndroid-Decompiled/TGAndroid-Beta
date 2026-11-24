package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
public final class qz8 extends TextView {
    public final byte a;

    public qz8(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                if (getPaddingLeft() > 0) {
                    canvas.drawCircle((getPaddingLeft() - gm.L(2.5f)) / 2.0f, gm.L(10.0f), gm.L(2.5f), getPaint());
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(gm.L(26.0f)), 1073741824));
                return;
            case 2:
            default:
                super.onMeasure(i, i2);
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), 1073741824));
                return;
        }
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 2:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 3:
            default:
                super.setText(charSequence, bufferType);
                return;
            case 4:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
        }
    }
}
