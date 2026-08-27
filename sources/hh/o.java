package hh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class o extends EditTextBoldCursor {

    public final int f9795b;

    public o(Context context, int i10) {
        super(context);
        this.f9795b = i10;
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9795b) {
            case 0:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                break;
            case 1:
            default:
                super.onDetachedFromWindow();
                break;
            case 2:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9795b) {
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f9795b) {
            case 1:
                if (isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            case 2:
            case 3:
            default:
                return super.onTouchEvent(motionEvent);
            case 4:
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 5:
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
