package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class u82 extends v4b {
    public final byte S = 1;
    public final View T;

    public u82(w8c w8cVar) {
        super(null, false);
        this.T = w8cVar;
    }

    @Override
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                v82 v82Var = (v82) view;
                v82Var.I.getOrCreateStoryViewer().H(v82Var.getContext(), j, new cd1(this, (byte) 22));
                return;
            case 1:
                ((r19) view).b(j);
                return;
            default:
                w8c w8cVar = (w8c) view;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(w8cVar.getContext(), j, q4b.a((r59) w8cVar.getParent()));
                    return;
                }
                return;
        }
    }

    public u82(r19 r19Var, ylb ylbVar) {
        super(ylbVar, false);
        this.T = r19Var;
    }

    public u82(v82 v82Var) {
        super(null, true);
        this.T = v82Var;
    }
}
