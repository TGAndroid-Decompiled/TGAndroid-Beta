package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class z91 extends fx0 {
    public final y91 l1;
    public final ui5[] m1;
    public final ca1 n1;

    public z91(Activity activity, ui5[] ui5VarArr, int i, ca1 ca1Var) {
        super(activity, false);
        this.m1 = ui5VarArr;
        this.n1 = ca1Var;
        ui5VarArr[0].setFragmentStack(new ArrayList());
        y91 y91Var = new y91(this, i);
        this.l1 = y91Var;
        y91Var.y = true;
        ((ActionBarLayout) ui5VarArr[0]).b(-1, y91Var);
        ((ActionBarLayout) ui5VarArr[0]).e0();
        ViewGroup view = ui5VarArr[0].getView();
        int i2 = this.u0;
        view.setPadding(i2, 0, i2, 0);
        y91Var.N = ca1Var;
        if (ca1Var.Z0() != null) {
            y91Var.c.setText(ca1Var.Z0());
        }
        this.b = ui5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new n1(this, (byte) 10));
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
        ui5[] ui5VarArr = this.m1;
        ui5 ui5Var = ui5VarArr[0];
        if (ui5Var != null && ui5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) ui5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
