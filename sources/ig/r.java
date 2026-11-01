package ig;

import android.view.KeyEvent;
import android.widget.TextView;
public final class r implements TextView.OnEditorActionListener {
    public final int f8436a;

    public r(int i10) {
        this.f8436a = i10;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f8436a) {
            case 0:
                if (i10 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return false;
                }
                return false;
            case 1:
                if (i10 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return false;
                }
                return false;
            case 2:
                org.telegram.messenger.i0.v1(textView);
                return false;
            case 3:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 4:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            default:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
        }
    }
}
