package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.UndoView;
public final class vqb implements View.OnTouchListener {
    public final byte a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            default:
                int i = UndoView.j0;
                break;
        }
        return true;
    }
}
