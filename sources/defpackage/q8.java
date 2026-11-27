package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class q8 implements View.OnTouchListener {
    public final byte a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            case 28:
                int i = ChatActivityEnterView.X7;
                break;
        }
        return true;
    }
}
