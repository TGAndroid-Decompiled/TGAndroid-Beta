package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class u2 implements TextView.OnEditorActionListener {

    public final int f17482a;

    public final Object f17483b;

    public u2(Object obj, int i10) {
        this.f17482a = i10;
        this.f17483b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f17482a) {
            case 0:
                ((SearchView) this.f17483b).p();
                return true;
            case 1:
                if (i10 != 6) {
                    return false;
                }
                ((org.telegram.ui.Cells.g) this.f17483b).run();
                return true;
            case 2:
                if (i10 != 6) {
                    return false;
                }
                ((Runnable) this.f17483b).run();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17483b;
                if (i10 == 4) {
                    chatActivityEnterView.S0();
                    return true;
                }
                if (keyEvent == null || i10 != 0 || keyEvent.isShiftPressed() || (!chatActivityEnterView.f26195w2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) || keyEvent.getAction() != 0 || chatActivityEnterView.U1 != null) {
                    return false;
                }
                chatActivityEnterView.S0();
                return true;
        }
    }
}
