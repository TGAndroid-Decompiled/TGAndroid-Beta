package ag;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
public final class v2 implements TextView.OnEditorActionListener {
    public final a2 f756a;
    public final int f757b;
    public final h3 f758c;
    public final TextView d;
    public final m2 e;
    public final q20 f759f;
    public final org.telegram.ui.ActionBar.x1[] f760g;
    public final View h;

    public v2(a2 a2Var, int i10, h3 h3Var, TextView textView, m2 m2Var, q20 q20Var, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.f756a = a2Var;
        this.f757b = i10;
        this.f758c = h3Var;
        this.d = textView;
        this.e = m2Var;
        this.f759f = q20Var;
        this.f760g = x1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.f756a;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            i3 f7 = i3.f(this.f757b);
            h3 h3Var = this.f758c;
            if (h3Var == null) {
                i11 = -1;
            } else {
                i11 = h3Var.f551a;
            }
            h3 d = f7.d(obj);
            if (d != null && d.f551a != i11) {
                org.telegram.messenger.i0.E3(a2Var);
                this.d.setText(cd.L0(2131752662, null));
                this.e.a(Boolean.TRUE);
                return true;
            }
            this.f759f.a(obj);
            org.telegram.ui.ActionBar.x1[] x1VarArr = this.f760g;
            org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
            if (x1Var != null) {
                x1Var.dismiss();
            }
            if (x1VarArr[0] == z2.f819f) {
                z2.f819f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.i0.E3(a2Var);
        return true;
    }
}
