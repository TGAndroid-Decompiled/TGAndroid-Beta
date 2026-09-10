package ei;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o extends EditTextBoldCursor {
    public final int f7592b;

    public o(Context context, int i10) {
        super(context);
        this.f7592b = i10;
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f7592b) {
            case 1:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                return;
            case 5:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f7592b) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f7592b) {
            case 0:
                if (!isEnabled()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 1:
            case 2:
            default:
                return super.onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 4:
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
