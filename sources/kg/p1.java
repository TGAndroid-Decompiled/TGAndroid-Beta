package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.o2;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
public final class p1 implements TextView.OnEditorActionListener {
    public final z0 f18506a;
    public final int f18507b;
    public final v1 f18508c;
    public final TextView d;
    public final o2 f18509e;
    public final w10 f18510f;
    public final org.telegram.ui.ActionBar.t1[] f18511g;
    public final View h;

    public p1(z0 z0Var, int i7, v1 v1Var, TextView textView, o2 o2Var, w10 w10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f18506a = z0Var;
        this.f18507b = i7;
        this.f18508c = v1Var;
        this.d = textView;
        this.f18509e = o2Var;
        this.f18510f = w10Var;
        this.f18511g = t1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        z0 z0Var = this.f18506a;
        String obj = z0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18507b);
            v1 v1Var = this.f18508c;
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18601a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18601a != i10) {
                org.telegram.messenger.g0.D3(z0Var);
                this.d.setText(gd.N0(2131752650, null));
                this.f18509e.a(Boolean.TRUE);
                return true;
            }
            this.f18510f.a(obj);
            org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18511g;
            org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
            if (t1Var != null) {
                t1Var.dismiss();
            }
            if (t1VarArr[0] == t1.f18579f) {
                t1.f18579f = null;
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
