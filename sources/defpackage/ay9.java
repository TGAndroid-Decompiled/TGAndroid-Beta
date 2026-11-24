package defpackage;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ay9 extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !gl.F3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
