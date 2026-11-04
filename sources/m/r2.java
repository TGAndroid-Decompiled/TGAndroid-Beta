package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class r2 implements TextView.OnEditorActionListener {
    public final int f18720a;
    public final Object f18721b;

    public r2(Object obj, int i3) {
        this.f18720a = i3;
        this.f18721b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f18720a) {
            case 0:
                ((SearchView) this.f18721b).p();
                return true;
            case 1:
                if (i3 == 6) {
                    ((org.telegram.ui.Cells.f) this.f18721b).run();
                    return true;
                }
                return false;
            case 2:
                if (i3 == 6) {
                    ((Runnable) this.f18721b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18721b;
                if (i3 == 4) {
                    chatActivityEnterView.R0();
                    return true;
                } else if (keyEvent != null && i3 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.C2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.f31086a2 == null) {
                    chatActivityEnterView.R0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
