package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class s2 implements TextView.OnEditorActionListener {
    public final int f15663a;
    public final Object f15664b;

    public s2(Object obj, int i10) {
        this.f15663a = i10;
        this.f15664b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f15663a) {
            case 0:
                ((SearchView) this.f15664b).p();
                return true;
            case 1:
                if (i10 == 6) {
                    ((org.telegram.ui.Cells.g) this.f15664b).run();
                    return true;
                }
                return false;
            case 2:
                if (i10 == 6) {
                    ((Runnable) this.f15664b).run();
                    return true;
                }
                return false;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f15664b;
                if (i10 == 4) {
                    chatActivityEnterView.S0();
                    return true;
                } else if (keyEvent != null && i10 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.A2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.Y1 == null) {
                    chatActivityEnterView.S0();
                    return true;
                } else {
                    return false;
                }
        }
    }
}
