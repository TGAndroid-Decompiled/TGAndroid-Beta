package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;
public final class p47 extends dxa {
    public final q47 w;

    public p47(q47 q47Var, Context context, int i, mf0 mf0Var, wjb wjbVar) {
        super(context, i, mf0Var, wjbVar);
        this.w = q47Var;
    }

    @Override
    public final void c() {
        int i;
        int i2;
        int i3;
        s47 s47Var = this.w.d;
        if (this.r.c <= 0) {
            performClick();
            nf0 nf0Var = this.b;
            if (nf0Var.u0.H) {
                long selectedDate = nf0Var.getSelectedDate();
                gxa gxaVar = this.r;
                if (this.s == 4) {
                    gxaVar.e = new lma(gxaVar.d, selectedDate);
                    g(false);
                } else if (gxaVar.g == null) {
                } else {
                    f();
                    String str = this.r.g + "_" + selectedDate;
                    fk1 fk1Var = (fk1) s47Var.w.f(str);
                    if (fk1Var != null) {
                        this.r.e = fk1Var;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.r.g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    s47Var.x = obj;
                    s47Var.f.getClass();
                    obj.a = RecyclerView.R(this);
                    nf0Var.u0.d(true, false);
                    i = ((d) s47Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new k45(this, str, obj, (byte) 15), null, null, 0, s47Var.a.stats_dc, 1, true);
                    i2 = ((d) s47Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                    i3 = ((d) s47Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i3);
                }
            }
        }
    }

    @Override
    public final void f() {
        s47 s47Var = this.w.d;
        txa txaVar = s47Var.x;
        if (txaVar != null) {
            txaVar.b = true;
        }
        int childCount = s47Var.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s47Var.f.getChildAt(i);
            if (childAt instanceof dxa) {
                ((dxa) childAt).b.u0.d(false, true);
            }
        }
    }
}
