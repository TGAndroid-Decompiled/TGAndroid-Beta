package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.o2;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
public final class p1 implements TextView.OnEditorActionListener {
    public final a1 f18411a;
    public final int f18412b;
    public final v1 f18413c;
    public final TextView d;
    public final o2 f18414e;
    public final y10 f18415f;
    public final org.telegram.ui.ActionBar.t1[] f18416g;
    public final View h;

    public p1(a1 a1Var, int i7, v1 v1Var, TextView textView, o2 o2Var, y10 y10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f18411a = a1Var;
        this.f18412b = i7;
        this.f18413c = v1Var;
        this.d = textView;
        this.f18414e = o2Var;
        this.f18415f = y10Var;
        this.f18416g = t1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        a1 a1Var = this.f18411a;
        String obj = a1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            w1 f10 = w1.f(this.f18412b);
            v1 v1Var = this.f18413c;
            if (v1Var == null) {
                i10 = -1;
            } else {
                i10 = v1Var.f18505a;
            }
            v1 d = f10.d(obj);
            if (d != null && d.f18505a != i10) {
                org.telegram.messenger.g0.D3(a1Var);
                this.d.setText(hd.N0(2131752650, null));
                this.f18414e.a(Boolean.TRUE);
                return true;
            }
            this.f18415f.a(obj);
            org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18416g;
            org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
            if (t1Var != null) {
                t1Var.dismiss();
            }
            if (t1VarArr[0] == t1.f18484f) {
                t1.f18484f = null;
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
