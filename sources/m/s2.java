package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class s2 implements TextView.OnEditorActionListener {
    public final int f15239a;
    public final Object f15240b;

    public s2(Object obj, int i10) {
        this.f15239a = i10;
        this.f15240b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f15239a) {
            case 0:
                ((SearchView) this.f15240b).p();
                return true;
            case 1:
                if (i10 == 6) {
                    ((org.telegram.ui.Cells.g) this.f15240b).run();
                    return true;
                }
                return false;
            case 2:
                if (i10 == 6) {
                    ((Runnable) this.f15240b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f15240b;
                if (i10 == 4) {
                    chatActivityEnterView.Q0();
                    return true;
                } else if (keyEvent != null && i10 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.B2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.Z1 == null) {
                    chatActivityEnterView.Q0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
