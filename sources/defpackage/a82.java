package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class a82 extends q6b {
    public final byte S = 0;
    public final View T;

    public a82(vac vacVar) {
        super(null, false);
        this.T = vacVar;
    }

    @Override
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                b82 b82Var = (b82) view;
                b82Var.I.getOrCreateStoryViewer().H(b82Var.getContext(), j, new rd1(this, (byte) 21));
                return;
            case 1:
                ((e39) view).b(j);
                return;
            default:
                vac vacVar = (vac) view;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(vacVar.getContext(), j, l6b.a((d79) vacVar.getParent()));
                    return;
                }
                return;
        }
    }

    public a82(e39 e39Var, vnb vnbVar) {
        super(vnbVar, false);
        this.T = e39Var;
    }

    public a82(b82 b82Var) {
        super(null, true);
        this.T = b82Var;
    }
}
