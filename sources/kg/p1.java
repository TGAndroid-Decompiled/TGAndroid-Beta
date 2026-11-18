package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.i2;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
public final class p1 implements TextView.OnEditorActionListener {
    public final a1 f18412a;
    public final int f18413b;
    public final v1 f18414c;
    public final TextView d;
    public final i2 f18415e;
    public final x10 f18416f;
    public final org.telegram.ui.ActionBar.u1[] f18417g;
    public final View h;

    public p1(a1 a1Var, int i7, v1 v1Var, TextView textView, i2 i2Var, x10 x10Var, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f18412a = a1Var;
        this.f18413b = i7;
        this.f18414c = v1Var;
        this.d = textView;
        this.f18415e = i2Var;
        this.f18416f = x10Var;
        this.f18417g = u1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        a1 a1Var = this.f18412a;
        String obj = a1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18413b);
            v1 v1Var = this.f18414c;
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18506a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18506a != i10) {
                org.telegram.messenger.g0.D3(a1Var);
                this.d.setText(gd.M0(2131752651, null));
                this.f18415e.a(Boolean.TRUE);
                return true;
            }
            this.f18416f.a(obj);
            org.telegram.ui.ActionBar.u1[] u1VarArr = this.f18417g;
            org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
            if (u1Var != null) {
                u1Var.dismiss();
            }
            if (u1VarArr[0] == t1.f18485f) {
                t1.f18485f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.g0.D3(a1Var);
        return true;
    }
}
