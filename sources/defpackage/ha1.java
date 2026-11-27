package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ha1 extends nx0 {
    public final ga1 l1;
    public final wk5[] m1;
    public final ka1 n1;

    public ha1(Activity activity, wk5[] wk5VarArr, int i, ka1 ka1Var) {
        super(activity, false);
        this.m1 = wk5VarArr;
        this.n1 = ka1Var;
        wk5VarArr[0].setFragmentStack(new ArrayList());
        ga1 ga1Var = new ga1(this, i);
        this.l1 = ga1Var;
        ga1Var.y = true;
        ((ActionBarLayout) wk5VarArr[0]).b(-1, ga1Var);
        ((ActionBarLayout) wk5VarArr[0]).e0();
        ViewGroup view = wk5VarArr[0].getView();
        int i2 = this.u0;
        view.setPadding(i2, 0, i2, 0);
        ga1Var.N = ka1Var;
        if (ka1Var.I() != null) {
            ga1Var.c.setText(ka1Var.I());
        }
        this.b = wk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new o1(this, (byte) 10));
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.m1[0] = null;
        this.n1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        wk5[] wk5VarArr = this.m1;
        wk5 wk5Var = wk5VarArr[0];
        if (wk5Var != null && wk5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) wk5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
