package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class s11 extends l46 {
    public final byte M;

    public s11(Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.M = b;
    }

    @Override
    public final int a() {
        switch (this.M) {
            case 5:
                return 3;
            default:
                return super.a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 3:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.M) {
            case 0:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 1:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 2:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
