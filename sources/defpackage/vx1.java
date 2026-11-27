package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vx1 implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;

    public vx1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i == 4) {
                    chatActivityEnterView.E1();
                } else if (keyEvent == null || i != 0 || keyEvent.isShiftPressed()) {
                    return false;
                } else {
                    if (chatActivityEnterView.q3) {
                        if (keyEvent.isCtrlPressed()) {
                            return false;
                        }
                    } else if (!keyEvent.isCtrlPressed()) {
                        return false;
                    }
                    if (keyEvent.getAction() != 0 || chatActivityEnterView.O2 != null) {
                        return false;
                    }
                    chatActivityEnterView.E1();
                }
                return true;
            case 1:
                if (i != 6) {
                    return false;
                }
                ((zg3) obj).run();
                return true;
            case 2:
                if (i != 6) {
                    return false;
                }
                ((Runnable) obj).run();
                return true;
            default:
                ((SearchView) obj).p();
                return true;
        }
    }
}
