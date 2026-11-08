package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import di.s2;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
public final class m1 implements TextView.OnEditorActionListener {
    public final x0 f17438a;
    public final int f17439b;
    public final s1 f17440c;
    public final TextView d;
    public final s2 f17441e;
    public final c20 f17442f;
    public final org.telegram.ui.ActionBar.u1[] f17443g;
    public final View h;

    public m1(x0 x0Var, int i7, s1 s1Var, TextView textView, s2 s2Var, c20 c20Var, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f17438a = x0Var;
        this.f17439b = i7;
        this.f17440c = s1Var;
        this.d = textView;
        this.f17441e = s2Var;
        this.f17442f = c20Var;
        this.f17443g = u1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        x0 x0Var = this.f17438a;
        String obj = x0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            t1 f10 = t1.f(this.f17439b);
            s1 s1Var = this.f17440c;
            if (s1Var == null) {
                i10 = -1;
            } else {
                i10 = s1Var.f17532a;
            }
            s1 d = f10.d(obj);
            if (d != null && d.f17532a != i10) {
                org.telegram.messenger.g0.F3(x0Var);
                this.d.setText(id.M0(2131752662, null));
                this.f17441e.a(Boolean.TRUE);
                return true;
            }
            this.f17442f.a(obj);
            org.telegram.ui.ActionBar.u1[] u1VarArr = this.f17443g;
            org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
            if (u1Var != null) {
                u1Var.dismiss();
            }
            if (u1VarArr[0] == q1.f17511f) {
                q1.f17511f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.g0.F3(x0Var);
        return true;
    }
}
