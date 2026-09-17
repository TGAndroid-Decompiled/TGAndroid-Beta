package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class u1 implements TextView.OnEditorActionListener {
    public final r1 f12264a;
    public final int f12265b;
    public final a2 f12266c;
    public final TextView d;
    public final r3 f12267e;
    public final Utilities.Callback f12268f;
    public final org.telegram.ui.ActionBar.b2[] f12269g;
    public final View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, r3 r3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f12264a = r1Var;
        this.f12265b = i10;
        this.f12266c = a2Var;
        this.d = textView;
        this.f12267e = r3Var;
        this.f12268f = callback;
        this.f12269g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.f12264a;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f12265b);
            a2 a2Var = this.f12266c;
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f12018a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f12018a != i11) {
                AndroidUtilities.shakeView(r1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f12267e.run(Boolean.TRUE);
                return true;
            }
            this.f12268f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f12269g;
            org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
            if (b2Var != null) {
                b2Var.dismiss();
            }
            if (b2VarArr[0] == y1.h) {
                y1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(r1Var);
        return true;
    }
}
