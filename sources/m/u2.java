package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class u2 implements TextView.OnEditorActionListener {
    public final int f14991a;
    public final Object f14992b;

    public u2(Object obj, int i10) {
        this.f14991a = i10;
        this.f14992b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f14991a) {
            case 0:
                ((SearchView) this.f14992b).p();
                return true;
            case 1:
                if (i10 == 6) {
                    ((org.telegram.ui.Cells.g) this.f14992b).run();
                    return true;
                }
                return false;
            case 2:
                if (i10 == 6) {
                    ((Runnable) this.f14992b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f14992b;
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
