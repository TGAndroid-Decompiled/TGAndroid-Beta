package hg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xt;
public final class l2 implements jl0, wt {
    public final int f7560a;
    public final int f7561b;
    public final KeyEvent.Callback f7562c;
    public final Object d;

    public l2(v2 v2Var, int i10, g6 g6Var, int i11) {
        this.f7562c = v2Var;
        this.f7560a = i10;
        this.d = g6Var;
        this.f7561b = i11;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int i11 = this.f7561b;
        v2.Q((v2) this.f7562c, this.f7560a, (g6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        xt.k((xt) this.f7562c, this.f7560a, this.f7561b, (Runnable) this.d, str);
    }

    public l2(xt xtVar, int i10, int i11, Runnable runnable) {
        this.f7562c = xtVar;
        this.f7560a = i10;
        this.f7561b = i11;
        this.d = runnable;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
