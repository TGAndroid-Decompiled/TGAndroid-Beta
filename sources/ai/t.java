package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t extends EditTextBoldCursor {
    public final int f2177b;

    public t(Context context, int i10) {
        super(context);
        this.f2177b = i10;
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2177b) {
            case 0:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                return;
            case 1:
            default:
                super.onDetachedFromWindow();
                return;
            case 2:
                super.onDetachedFromWindow();
                AndroidUtilities.hideKeyboard(this);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2177b) {
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f2177b) {
            case 1:
                if (!isEnabled()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
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
