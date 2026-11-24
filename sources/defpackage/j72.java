package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class j72 extends u2b {
    public final byte S = 0;
    public final View T;

    public j72(v6c v6cVar) {
        super(null, false);
        this.T = v6cVar;
    }

    @Override
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                k72 k72Var = (k72) view;
                k72Var.I.getOrCreateStoryViewer().H(k72Var.getContext(), j, new rh1(this, (byte) 19));
                return;
            case 1:
                ((qz8) view).b(j);
                return;
            default:
                v6c v6cVar = (v6c) view;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(v6cVar.getContext(), j, p2b.a((o39) v6cVar.getParent()));
                    return;
                }
                return;
        }
    }

    public j72(qz8 qz8Var, wjb wjbVar) {
        super(wjbVar, false);
        this.T = qz8Var;
    }

    public j72(k72 k72Var) {
        super(null, true);
        this.T = k72Var;
    }
}
