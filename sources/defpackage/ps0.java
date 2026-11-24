package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ps0 extends EditTextBoldCursor {
    public final byte M1;

    public ps0(js9 js9Var, Context context) {
        super(context);
        this.M1 = (byte) 5;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 4:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.M1) {
            case 0:
                super.onDetachedFromWindow();
                gl.t1(this);
                return;
            case 1:
                super.onDetachedFromWindow();
                gl.t1(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
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
                if (motionEvent.getAction() == 0 && !gl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getAction() == 0 && !gl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public ps0(Context context, byte b) {
        super(context);
        this.M1 = b;
    }
}
