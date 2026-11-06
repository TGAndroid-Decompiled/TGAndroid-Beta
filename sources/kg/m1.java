package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import di.s2;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
public final class m1 implements TextView.OnEditorActionListener {
    public final x0 f17435a;
    public final int f17436b;
    public final s1 f17437c;
    public final TextView d;
    public final s2 f17438e;
    public final c20 f17439f;
    public final org.telegram.ui.ActionBar.u1[] f17440g;
    public final View h;

    public m1(x0 x0Var, int i7, s1 s1Var, TextView textView, s2 s2Var, c20 c20Var, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f17435a = x0Var;
        this.f17436b = i7;
        this.f17437c = s1Var;
        this.d = textView;
        this.f17438e = s2Var;
        this.f17439f = c20Var;
        this.f17440g = u1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        x0 x0Var = this.f17435a;
        String obj = x0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            t1 f10 = t1.f(this.f17436b);
            s1 s1Var = this.f17437c;
            if (s1Var == null) {
                i10 = -1;
            } else {
                i10 = s1Var.f17529a;
            }
            s1 d = f10.d(obj);
            if (d != null && d.f17529a != i10) {
                org.telegram.messenger.g0.F3(x0Var);
                this.d.setText(hd.M0(2131752662, null));
                this.f17438e.a(Boolean.TRUE);
                return true;
            }
            this.f17439f.a(obj);
            org.telegram.ui.ActionBar.u1[] u1VarArr = this.f17440g;
            org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
            if (u1Var != null) {
                u1Var.dismiss();
            }
            if (u1VarArr[0] == q1.f17508f) {
                q1.f17508f = null;
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
