package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb1 extends my0 {
    public final gb1 l1;
    public final tk5[] m1;
    public final kb1 n1;

    public hb1(Activity activity, tk5[] tk5VarArr, int i, kb1 kb1Var) {
        super(activity, false);
        this.m1 = tk5VarArr;
        this.n1 = kb1Var;
        tk5VarArr[0].setFragmentStack(new ArrayList());
        gb1 gb1Var = new gb1(this, i);
        this.l1 = gb1Var;
        gb1Var.y = true;
        ((ActionBarLayout) tk5VarArr[0]).b(-1, gb1Var);
        ((ActionBarLayout) tk5VarArr[0]).e0();
        ViewGroup view = tk5VarArr[0].getView();
        int i2 = this.u0;
        view.setPadding(i2, 0, i2, 0);
        gb1Var.N = kb1Var;
        if (kb1Var.B0() != null) {
            gb1Var.c.setText(kb1Var.B0());
        }
        this.b = tk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new n1(this, (byte) 10));
    }

    @Override
    public final boolean C() {
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
        tk5[] tk5VarArr = this.m1;
        tk5 tk5Var = tk5VarArr[0];
        if (tk5Var != null && tk5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) tk5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
