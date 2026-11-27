package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
public final class q56 extends EditText {
    public final byte a;

    public q56(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
