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
public final class yf0 extends fx0 {
    public final ag0 l1;
    public final ui5[] m1;
    public final d n1;
    public final fx0[] o1;

    public yf0(Activity activity, wjb wjbVar, ag0 ag0Var, ui5[] ui5VarArr, d dVar, fx0[] fx0VarArr) {
        super(1, wjbVar, (Context) activity, true);
        boolean z;
        this.l1 = ag0Var;
        this.m1 = ui5VarArr;
        this.n1 = dVar;
        this.o1 = fx0VarArr;
        if (ag0Var != null && ag0Var.e) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        this.n = !z;
        ui5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) ui5VarArr[0]).b(-1, dVar);
        ((ActionBarLayout) ui5VarArr[0]).e0();
        ViewGroup view = ui5VarArr[0].getView();
        int i = this.u0;
        view.setPadding(i, 0, i, 0);
        this.b = ui5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new cf(dVar, ag0Var, (byte) 3));
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean G(MotionEvent motionEvent) {
        ui5[] ui5VarArr;
        ui5 ui5Var;
        ag0 ag0Var = this.l1;
        if (ag0Var == null || !ag0Var.a || (ui5Var = (ui5VarArr = this.m1)[0]) == null || ui5Var.getFragmentStack().size() > 1 || (ui5VarArr[0].getFragmentStack().size() == 1 && !((d) ui5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        ag0 ag0Var;
        Runnable runnable;
        if (!this.J && (ag0Var = this.l1) != null && (runnable = ag0Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        ui5[] ui5VarArr = this.m1;
        arrayList.remove(ui5VarArr[0]);
        ui5VarArr[0] = null;
    }

    @Override
    public final void m0() {
        ui5 ui5Var = this.m1[0];
        if (ui5Var != null) {
            for (d dVar : ui5Var.getFragmentStack()) {
                if (dVar.getFragmentView() != null) {
                    dVar.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override
    public final void onBackPressed() {
        ui5[] ui5VarArr = this.m1;
        ui5 ui5Var = ui5VarArr[0];
        if (ui5Var != null && ui5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) ui5VarArr[0]).G();
            return;
        }
        ui5 ui5Var2 = ui5VarArr[0];
        if (ui5Var2 != null && !ui5Var2.getFragmentStack().isEmpty() && ((d) ui5VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ui5 ui5Var = this.m1[0];
        fx0[] fx0VarArr = this.o1;
        ui5Var.setWindow(fx0VarArr[0].getWindow());
        ag0 ag0Var = this.l1;
        if (ag0Var != null && ag0Var.e) {
            gl.j3(fx0VarArr[0], true);
        } else {
            M(bkb.h5);
        }
        d dVar = this.n1;
        gl.m3(this, dVar.isLightStatusBar());
        dVar.onBottomSheetCreated();
    }

    @Override
    public final void x() {
        Runnable runnable;
        this.n1.onTransitionAnimationEnd(true, false);
        ag0 ag0Var = this.l1;
        if (ag0Var != null && (runnable = ag0Var.c) != null) {
            runnable.run();
        }
    }
}
