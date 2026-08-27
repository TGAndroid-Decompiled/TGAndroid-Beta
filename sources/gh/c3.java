package gh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class c3 implements TextView.OnEditorActionListener {

    public final b3 f7181a;

    public final Utilities.Callback f7182b;

    public final org.telegram.ui.ActionBar.b2[] f7183c;
    public final View d;

    public c3(b3 b3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f7181a = b3Var;
        this.f7182b = callback;
        this.f7183c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        b3 b3Var = this.f7181a;
        String string = b3Var.getText().toString();
        if (string.length() <= 0 || string.length() > 12) {
            AndroidUtilities.shakeView(b3Var);
            return true;
        }
        this.f7182b.run(string);
        org.telegram.ui.ActionBar.b2 b2Var = this.f7183c[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
