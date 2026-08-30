package kh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w2 implements TextView.OnEditorActionListener {
    public final v2 f10904a;
    public final Utilities.Callback f10905b;
    public final org.telegram.ui.ActionBar.d2[] f10906c;
    public final View d;

    public w2(v2 v2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f10904a = v2Var;
        this.f10905b = callback;
        this.f10906c = d2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        v2 v2Var = this.f10904a;
        String obj = v2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f10905b.run(obj);
            org.telegram.ui.ActionBar.d2 d2Var = this.f10906c[0];
            if (d2Var != null) {
                d2Var.dismiss();
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
