package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
public final class nh implements TextView.OnEditorActionListener {
    public final byte a;

    public nh(byte b) {
        this.a = b;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                gm.t1(textView);
                return false;
            case 1:
                if (i != 6) {
                    return false;
                }
                gm.t1(textView);
                return true;
            case 2:
                if (i == 6) {
                    textView.clearFocus();
                    gm.t1(textView);
                }
                return false;
            case 3:
                if (i == 6) {
                    textView.clearFocus();
                    gm.t1(textView);
                }
                return false;
            case 4:
                if (i != 6) {
                    return false;
                }
                gm.t1(textView);
                return true;
            default:
                if (i != 6) {
                    return false;
                }
                gm.t1(textView);
                return true;
        }
    }
}
