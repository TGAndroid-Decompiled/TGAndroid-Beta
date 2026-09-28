package hg;

import ai.e4;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class v1 implements TextView.OnEditorActionListener {
    public final s1 f10433a;
    public final int f10434b;
    public final b2 f10435c;
    public final TextView d;
    public final e4 e;
    public final Utilities.Callback f10436f;
    public final org.telegram.ui.ActionBar.a2[] f10437g;
    public final View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, e4 e4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f10433a = s1Var;
        this.f10434b = i10;
        this.f10435c = b2Var;
        this.d = textView;
        this.e = e4Var;
        this.f10436f = callback;
        this.f10437g = a2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.f10433a;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f10434b);
            b2 b2Var = this.f10435c;
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f10205a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f10205a != i11) {
                AndroidUtilities.shakeView(s1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f10436f.run(obj);
            org.telegram.ui.ActionBar.a2[] a2VarArr = this.f10437g;
            org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                a2Var.dismiss();
            }
            if (a2VarArr[0] == z1.h) {
                z1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(s1Var);
        return true;
    }
}
