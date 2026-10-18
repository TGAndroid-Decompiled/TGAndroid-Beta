package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class t1 implements TextView.OnEditorActionListener {
    public final q1 f13042a;
    public final int f13043b;
    public final z1 f13044c;
    public final TextView d;
    public final z2 e;
    public final Utilities.Callback f13045f;
    public final org.telegram.ui.ActionBar.b2[] f13046g;
    public final View h;

    public t1(q1 q1Var, int i10, z1 z1Var, TextView textView, z2 z2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f13042a = q1Var;
        this.f13043b = i10;
        this.f13044c = z1Var;
        this.d = textView;
        this.e = z2Var;
        this.f13045f = callback;
        this.f13046g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        q1 q1Var = this.f13042a;
        String obj = q1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            a2 f7 = a2.f(this.f13043b);
            z1 z1Var = this.f13044c;
            if (z1Var == null) {
                i11 = -1;
            } else {
                i11 = z1Var.f13100a;
            }
            z1 d = f7.d(obj);
            if (d != null && d.f13100a != i11) {
                AndroidUtilities.shakeView(q1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f13045f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f13046g;
            org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
            if (b2Var != null) {
                b2Var.dismiss();
            }
            if (b2VarArr[0] == x1.h) {
                x1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(q1Var);
        return true;
    }
}
