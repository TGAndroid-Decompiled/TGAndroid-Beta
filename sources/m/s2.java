package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class s2 implements TextView.OnEditorActionListener {
    public final int f19257a;
    public final Object f19258b;

    public s2(Object obj, int i7) {
        this.f19257a = i7;
        this.f19258b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f19257a) {
            case 0:
                ((SearchView) this.f19258b).p();
                return true;
            case 1:
                if (i7 == 6) {
                    ((org.telegram.ui.Cells.f) this.f19258b).run();
                    return true;
                }
                return false;
            case 2:
                if (i7 == 6) {
                    ((Runnable) this.f19258b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19258b;
                if (i7 == 4) {
                    chatActivityEnterView.S0();
                    return true;
                } else if (keyEvent != null && i7 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.B2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.Z1 == null) {
                    chatActivityEnterView.S0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
