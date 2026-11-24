package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vc extends EditTextBoldCursor {
    public final byte M1;

    public vc(lu9 lu9Var, Context context) {
        super(context);
        this.M1 = (byte) 6;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 5:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.M1) {
            case 1:
                super.onDetachedFromWindow();
                gm.t1(this);
                return;
            case 2:
                super.onDetachedFromWindow();
                gm.t1(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                if (motionEvent.getAction() == 1 && !hasFocus()) {
                    requestFocus();
                    gm.E3(this);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
            case 2:
            case 4:
            case 5:
            default:
                return super.onTouchEvent(motionEvent);
            case 3:
                if (!isEnabled()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 6:
                if (!isEnabled()) {
                    return false;
                }
                motionEvent.getAction();
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public vc(Context context, byte b) {
        super(context);
        this.M1 = b;
    }
}
