package cg;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a0 implements TextView.OnEditorActionListener {
    public final int f2289a;

    public a0(int i10) {
        this.f2289a = i10;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f2289a) {
            case 0:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return false;
                }
                return false;
            case 1:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return false;
                }
                return false;
            case 2:
                AndroidUtilities.hideKeyboard(textView);
                return false;
            case 3:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 4:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            default:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
        }
    }
}
