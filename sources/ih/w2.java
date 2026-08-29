package ih;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w2 implements TextView.OnEditorActionListener {
    public final v2 f9487a;
    public final Utilities.Callback f9488b;
    public final org.telegram.ui.ActionBar.c2[] f9489c;
    public final View d;

    public w2(v2 v2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f9487a = v2Var;
        this.f9488b = callback;
        this.f9489c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        v2 v2Var = this.f9487a;
        String obj = v2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f9488b.run(obj);
            org.telegram.ui.ActionBar.c2 c2Var = this.f9489c[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(v2Var);
        return true;
    }
}
