package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xs0 extends EditTextBoldCursor {
    public final byte N1;

    public xs0(cw9 cw9Var, Context context) {
        super(context);
        this.N1 = (byte) 5;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 4:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.N1) {
            case 0:
                super.onDetachedFromWindow();
                hl.t1(this);
                return;
            case 1:
                super.onDetachedFromWindow();
                hl.t1(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.N1) {
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 2:
                if (!isEnabled()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 3:
            case 4:
            default:
                return super.onTouchEvent(motionEvent);
            case 5:
                if (!isEnabled()) {
                    return false;
                }
                motionEvent.getAction();
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public xs0(Context context, byte b) {
        super(context);
        this.N1 = b;
    }
}
