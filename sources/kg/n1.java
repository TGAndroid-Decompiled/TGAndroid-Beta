package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
public final class n1 implements TextView.OnEditorActionListener {
    public final x0 f18007a;
    public final int f18008b;
    public final u1 f18009c;
    public final TextView d;
    public final bi.o1 f18010e;
    public final z10 f18011f;
    public final org.telegram.ui.ActionBar.t1[] f18012g;
    public final View h;

    public n1(x0 x0Var, int i7, u1 u1Var, TextView textView, bi.o1 o1Var, z10 z10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f18007a = x0Var;
        this.f18008b = i7;
        this.f18009c = u1Var;
        this.d = textView;
        this.f18010e = o1Var;
        this.f18011f = z10Var;
        this.f18012g = t1VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        int i10;
        if (i7 != 6) {
            return false;
        }
        x0 x0Var = this.f18007a;
        String obj = x0Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            v1 f10 = v1.f(this.f18008b);
            u1 u1Var = this.f18009c;
            if (u1Var == null) {
                i10 = -1;
            } else {
                i10 = u1Var.f18113a;
            }
            u1 d = f10.d(obj);
            if (d != null && d.f18113a != i10) {
                org.telegram.messenger.g0.E3(x0Var);
                this.d.setText(hd.M0(2131752662, null));
                this.f18010e.a(Boolean.TRUE);
                return true;
            }
            this.f18011f.a(obj);
            org.telegram.ui.ActionBar.t1[] t1VarArr = this.f18012g;
            org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
            if (t1Var != null) {
                t1Var.dismiss();
            }
            if (t1VarArr[0] == r1.f18081f) {
                r1.f18081f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        org.telegram.messenger.g0.E3(x0Var);
        return true;
    }
}
