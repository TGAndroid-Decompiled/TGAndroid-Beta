package gg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class d2 implements TextView.OnEditorActionListener {
    public final a2 f8844a;
    public final int f8845b;
    public final j2 f8846c;
    public final TextView d;
    public final u1 e;
    public final Utilities.Callback f8847f;
    public final org.telegram.ui.ActionBar.d2[] f8848g;
    public final View h;

    public d2(a2 a2Var, int i10, j2 j2Var, TextView textView, u1 u1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f8844a = a2Var;
        this.f8845b = i10;
        this.f8846c = j2Var;
        this.d = textView;
        this.e = u1Var;
        this.f8847f = callback;
        this.f8848g = d2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.f8844a;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            k2 f7 = k2.f(this.f8845b);
            j2 j2Var = this.f8846c;
            if (j2Var == null) {
                i11 = -1;
            } else {
                i11 = j2Var.f8917a;
            }
            j2 d = f7.d(obj);
            if (d != null && d.f8917a != i11) {
                AndroidUtilities.shakeView(a2Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f8847f.run(obj);
            org.telegram.ui.ActionBar.d2[] d2VarArr = this.f8848g;
            org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                d2Var.dismiss();
            }
            if (d2VarArr[0] == h2.h) {
                h2.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(a2Var);
        return true;
    }
}
