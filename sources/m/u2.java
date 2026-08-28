package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class u2 implements TextView.OnEditorActionListener {
    public final int f17107a;
    public final Object f17108b;

    public u2(Object obj, int i9) {
        this.f17107a = i9;
        this.f17108b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.f17107a) {
            case 0:
                ((SearchView) this.f17108b).p();
                return true;
            case 1:
                if (i9 == 6) {
                    ((org.telegram.ui.Cells.g) this.f17108b).run();
                    return true;
                }
                return false;
            case 2:
                if (i9 == 6) {
                    ((Runnable) this.f17108b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17108b;
                if (i9 == 4) {
                    chatActivityEnterView.S0();
                    return true;
                } else if (keyEvent != null && i9 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.f26199w2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.U1 == null) {
                    chatActivityEnterView.S0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
