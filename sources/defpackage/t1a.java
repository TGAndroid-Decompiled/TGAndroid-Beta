package defpackage;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t1a extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !hl.E3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
