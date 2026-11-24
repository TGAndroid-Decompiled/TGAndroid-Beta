package defpackage;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b0a extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !gm.E3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
