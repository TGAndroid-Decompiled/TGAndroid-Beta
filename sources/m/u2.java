package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class u2 implements TextView.OnEditorActionListener {
    public final int f13655a;
    public final Object f13656b;

    public u2(Object obj, int i10) {
        this.f13655a = i10;
        this.f13656b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f13655a) {
            case 0:
                ((SearchView) this.f13656b).p();
                return true;
            case 1:
                if (i10 == 6) {
                    ((org.telegram.ui.Cells.g) this.f13656b).run();
                    return true;
                }
                return false;
            case 2:
                if (i10 == 6) {
                    ((Runnable) this.f13656b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f13656b;
                if (i10 == 4) {
                    chatActivityEnterView.S0();
                    return true;
                } else if (keyEvent != null && i10 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.f22861x2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.V1 == null) {
                    chatActivityEnterView.S0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
