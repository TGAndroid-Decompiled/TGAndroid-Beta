package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class zg0 extends my0 {
    public final bh0 l1;
    public final tk5[] m1;
    public final d n1;
    public final my0[] o1;

    public zg0(Activity activity, ylb ylbVar, bh0 bh0Var, tk5[] tk5VarArr, d dVar, my0[] my0VarArr) {
        super(1, ylbVar, (Context) activity, true);
        boolean z;
        this.l1 = bh0Var;
        this.m1 = tk5VarArr;
        this.n1 = dVar;
        this.o1 = my0VarArr;
        if (bh0Var != null && bh0Var.e) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        this.n = !z;
        tk5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) tk5VarArr[0]).b(-1, dVar);
        ((ActionBarLayout) tk5VarArr[0]).e0();
        ViewGroup view = tk5VarArr[0].getView();
        int i = this.u0;
        view.setPadding(i, 0, i, 0);
        this.b = tk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new dg(dVar, bh0Var, (byte) 3));
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        tk5[] tk5VarArr;
        tk5 tk5Var;
        bh0 bh0Var = this.l1;
        if (bh0Var == null || !bh0Var.a || (tk5Var = (tk5VarArr = this.m1)[0]) == null || tk5Var.getFragmentStack().size() > 1 || (tk5VarArr[0].getFragmentStack().size() == 1 && !((d) tk5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        bh0 bh0Var;
        Runnable runnable;
        if (!this.J && (bh0Var = this.l1) != null && (runnable = bh0Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        tk5[] tk5VarArr = this.m1;
        arrayList.remove(tk5VarArr[0]);
        tk5VarArr[0] = null;
    }

    @Override
    public final void m0() {
        tk5 tk5Var = this.m1[0];
        if (tk5Var != null) {
            for (d dVar : tk5Var.getFragmentStack()) {
                if (dVar.getFragmentView() != null) {
                    dVar.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onBackPressed() {
        tk5[] tk5VarArr = this.m1;
        tk5 tk5Var = tk5VarArr[0];
        if (tk5Var != null && tk5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) tk5VarArr[0]).G();
            return;
        }
        tk5 tk5Var2 = tk5VarArr[0];
        if (tk5Var2 != null && !tk5Var2.getFragmentStack().isEmpty() && ((d) tk5VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tk5 tk5Var = this.m1[0];
        my0[] my0VarArr = this.o1;
        tk5Var.setWindow(my0VarArr[0].getWindow());
        bh0 bh0Var = this.l1;
        if (bh0Var != null && bh0Var.e) {
            gm.i3(my0VarArr[0], true);
        } else {
            L(cmb.h5);
        }
        d dVar = this.n1;
        gm.l3(this, dVar.isLightStatusBar());
        dVar.onBottomSheetCreated();
    }

    @Override
    public final void w() {
        Runnable runnable;
        this.n1.onTransitionAnimationEnd(true, false);
        bh0 bh0Var = this.l1;
        if (bh0Var != null && (runnable = bh0Var.c) != null) {
            runnable.run();
        }
    }
}
