package ai;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f1 extends EditTextBoldCursor {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
