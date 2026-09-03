package kh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v2 implements TextView.OnEditorActionListener {
    public final u2 f11002a;
    public final Utilities.Callback f11003b;
    public final org.telegram.ui.ActionBar.d2[] f11004c;
    public final View d;

    public v2(u2 u2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f11002a = u2Var;
        this.f11003b = callback;
        this.f11004c = d2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        u2 u2Var = this.f11002a;
        String obj = u2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f11003b.run(obj);
            org.telegram.ui.ActionBar.d2 d2Var = this.f11004c[0];
            if (d2Var != null) {
                d2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(u2Var);
        return true;
    }
}
