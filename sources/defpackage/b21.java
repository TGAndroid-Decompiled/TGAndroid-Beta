package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class b21 extends p66 {
    public final byte M;

    public b21(Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.M = b;
    }

    @Override
    public final int a() {
        switch (this.M) {
            case 6:
                return 3;
            default:
                return super.a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 4:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 7:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M) {
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M) {
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent && motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.M) {
            case 0:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 1:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 2:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
