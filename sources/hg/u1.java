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
    public final r1 f10430a;
    public final int f10431b;
    public final a2 f10432c;
    public final TextView d;
    public final e4 e;
    public final Utilities.Callback f10433f;
    public final org.telegram.ui.ActionBar.c2[] f10434g;
    public final View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, e4 e4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f10430a = r1Var;
        this.f10431b = i10;
        this.f10432c = a2Var;
        this.d = textView;
        this.e = e4Var;
        this.f10433f = callback;
        this.f10434g = c2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.f10430a;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f10431b);
            a2 a2Var = this.f10432c;
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f10210a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f10210a != i11) {
                AndroidUtilities.shakeView(r1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.e.run(Boolean.TRUE);
                return true;
            }
            this.f10433f.run(obj);
            org.telegram.ui.ActionBar.c2[] c2VarArr = this.f10434g;
            org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            if (c2VarArr[0] == y1.h) {
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
