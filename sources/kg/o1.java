package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.m2;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
public final class o1 implements TextView.OnEditorActionListener {
    public final z0 f18437a;
    public final int f18438b;
    public final u1 f18439c;
    public final TextView d;
    public final m2 f18440e;
    public final y10 f18441f;
    public final org.telegram.ui.ActionBar.t1[] f18442g;
    public final View h;

    public o1(z0 z0Var, int i7, u1 u1Var, TextView textView, m2 m2Var, y10 y10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f18437a = z0Var;
        this.f18438b = i7;
        this.f18439c = u1Var;
        this.d = textView;
        this.f18440e = m2Var;
        this.f18441f = y10Var;
        this.f18442g = t1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        z0 z0Var = this.f18437a;
        String obj = z0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            v1 f10 = v1.f(this.f18438b);
            u1 u1Var = this.f18439c;
            if (u1Var == null) {
                i10 = -1;
            } else {
                i10 = u1Var.f18533a;
            }
            u1 d = f10.d(obj);
            if (d != null && d.f18533a != i10) {
                org.telegram.messenger.g0.D3(z0Var);
                this.d.setText(hd.N0(2131752650, null));
                this.f18440e.a(Boolean.TRUE);
                return true;
            }
            this.f18441f.a(obj);
            org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18442g;
            org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
            if (t1Var != null) {
                t1Var.dismiss();
            }
            if (t1VarArr[0] == s1.f18508f) {
                s1.f18508f = null;
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
