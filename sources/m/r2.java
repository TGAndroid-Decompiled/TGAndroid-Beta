package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class r2 implements TextView.OnEditorActionListener {
    public final int f20193a;
    public final Object f20194b;

    public r2(Object obj, int i7) {
        this.f20193a = i7;
        this.f20194b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f20193a) {
            case 0:
                ((SearchView) this.f20194b).p();
                return true;
            case 1:
                if (i7 == 6) {
                    ((org.telegram.ui.Cells.f) this.f20194b).run();
                    return true;
                }
                return false;
            case 2:
                if (i7 == 6) {
                    ((Runnable) this.f20194b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20194b;
                if (i7 == 4) {
                    chatActivityEnterView.v1();
                    return true;
                } else if (keyEvent != null && i7 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.f32674r3 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.P2 == null) {
                    chatActivityEnterView.v1();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
