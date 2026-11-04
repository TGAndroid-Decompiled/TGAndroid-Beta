package lg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
public final class n1 implements TextView.OnEditorActionListener {
    public final y0 f18375a;
    public final int f18376b;
    public final t1 f18377c;
    public final TextView d;
    public final ai.v1 f18378e;
    public final u10 f18379f;
    public final org.telegram.ui.ActionBar.s1[] f18380g;
    public final View h;

    public n1(y0 y0Var, int i3, t1 t1Var, TextView textView, ai.v1 v1Var, u10 u10Var, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.f18375a = y0Var;
        this.f18376b = i3;
        this.f18377c = t1Var;
        this.d = textView;
        this.f18378e = v1Var;
        this.f18379f = u10Var;
        this.f18380g = s1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        int i10;
        if (i3 != 6) {
            return false;
        }
        y0 y0Var = this.f18375a;
        String obj = y0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            u1 f10 = u1.f(this.f18376b);
            t1 t1Var = this.f18377c;
            if (t1Var == null) {
                i10 = -1;
            } else {
                i10 = t1Var.f18473a;
            }
            t1 d = f10.d(obj);
            if (d != null && d.f18473a != i10) {
                org.telegram.messenger.g0.F3(y0Var);
                this.d.setText(bd.M0(2131752662, null));
                this.f18378e.a(Boolean.TRUE);
                return true;
            }
            this.f18379f.a(obj);
            org.telegram.ui.ActionBar.s1[] s1VarArr = this.f18380g;
            org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
            if (s1Var != null) {
                s1Var.dismiss();
            }
            if (s1VarArr[0] == r1.f18449f) {
                r1.f18449f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.g0.F3(y0Var);
        return true;
    }
}
