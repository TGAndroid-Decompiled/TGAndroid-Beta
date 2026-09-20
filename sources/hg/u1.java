package hg;

import ai.e4;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class u1 implements TextView.OnEditorActionListener {
    public final r1 f10443a;
    public final int f10444b;
    public final a2 f10445c;
    public final TextView d;
    public final e4 e;
    public final Utilities.Callback f10446f;
    public final org.telegram.ui.ActionBar.b2[] f10447g;
    public final View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, e4 e4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f10443a = r1Var;
        this.f10444b = i10;
        this.f10445c = a2Var;
        this.d = textView;
        this.e = e4Var;
        this.f10446f = callback;
        this.f10447g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.f10443a;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f10444b);
            a2 a2Var = this.f10445c;
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f10223a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f10223a != i11) {
                AndroidUtilities.shakeView(r1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f10446f.run(obj);
            org.telegram.ui.ActionBar.b2[] b2VarArr = this.f10447g;
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
