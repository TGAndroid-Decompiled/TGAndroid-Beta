package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.m2;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
public final class o1 implements TextView.OnEditorActionListener {
    public final z0 f18434a;
    public final int f18435b;
    public final u1 f18436c;
    public final TextView d;
    public final m2 f18437e;
    public final x10 f18438f;
    public final org.telegram.ui.ActionBar.t1[] f18439g;
    public final View h;

    public o1(z0 z0Var, int i7, u1 u1Var, TextView textView, m2 m2Var, x10 x10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f18434a = z0Var;
        this.f18435b = i7;
        this.f18436c = u1Var;
        this.d = textView;
        this.f18437e = m2Var;
        this.f18438f = x10Var;
        this.f18439g = t1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        z0 z0Var = this.f18434a;
        String obj = z0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            v1 f10 = v1.f(this.f18435b);
            u1 u1Var = this.f18436c;
            if (u1Var == null) {
                i10 = -1;
            } else {
                i10 = u1Var.f18530a;
            }
            u1 d = f10.d(obj);
            if (d != null && d.f18530a != i10) {
                org.telegram.messenger.g0.D3(z0Var);
                this.d.setText(gd.N0(2131752650, null));
                this.f18437e.a(Boolean.TRUE);
                return true;
            }
            this.f18438f.a(obj);
            org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18439g;
            org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
            if (t1Var != null) {
                t1Var.dismiss();
            }
            if (t1VarArr[0] == s1.f18505f) {
                s1.f18505f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.g0.D3(z0Var);
        return true;
    }
}
