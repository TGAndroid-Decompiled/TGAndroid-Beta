package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s extends EditTextBoldCursor {
    public final int H1;

    public s(Context context, int i3) {
        super(context);
        this.H1 = i3;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 1:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.H1) {
            case 0:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.v1(this);
                return;
            case 3:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.v1(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.H1) {
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
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
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
