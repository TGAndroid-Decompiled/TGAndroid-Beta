package fh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h3 implements TextView.OnEditorActionListener {
    public final g3 f6500a;
    public final Utilities.Callback f6501b;
    public final org.telegram.ui.ActionBar.c2[] f6502c;
    public final View d;

    public h3(g3 g3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f6500a = g3Var;
        this.f6501b = callback;
        this.f6502c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        g3 g3Var = this.f6500a;
        String obj = g3Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f6501b.run(obj);
            org.telegram.ui.ActionBar.c2 c2Var = this.f6502c[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(g3Var);
        return true;
    }
}
