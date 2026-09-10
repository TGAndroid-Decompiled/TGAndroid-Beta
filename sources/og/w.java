package og;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w implements TextView.OnEditorActionListener {
    public final int f14537a;

    public w(int i10) {
        this.f14537a = i10;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f14537a) {
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
