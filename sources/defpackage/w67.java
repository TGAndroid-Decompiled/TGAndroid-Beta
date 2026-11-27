package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e;
public final class w67 extends g1b {
    public final x67 w;

    public w67(x67 x67Var, Context context, int i, of0 of0Var, vnb vnbVar) {
        super(context, i, of0Var, vnbVar);
        this.w = x67Var;
    }

    @Override
    public final void c() {
        int i;
        int i2;
        int i3;
        z67 z67Var = this.w.d;
        if (this.r.c <= 0) {
            performClick();
            pf0 pf0Var = this.b;
            if (pf0Var.u0.H) {
                long selectedDate = pf0Var.getSelectedDate();
                i1b i1bVar = this.r;
                if (this.s == 4) {
                    i1bVar.e = new iqa(i1bVar.d, selectedDate);
                    g(false);
                } else if (i1bVar.g == null) {
                } else {
                    f();
                    String str = this.r.g + "_" + selectedDate;
                    ok1 ok1Var = (ok1) z67Var.w.f(str);
                    if (ok1Var != null) {
                        this.r.e = ok1Var;
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
                    z67Var.x = obj;
                    z67Var.f.getClass();
                    obj.a = RecyclerView.S(this);
                    pf0Var.u0.d(true, false);
                    i = ((e) z67Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new m65(this, str, obj, (byte) 15), null, null, 0, z67Var.a.stats_dc, 1, true);
                    i2 = ((e) z67Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                    i3 = ((e) z67Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i3);
                }
            }
        }
    }

    @Override
    public final void f() {
        z67 z67Var = this.w.d;
        v1b v1bVar = z67Var.x;
        if (v1bVar != null) {
            v1bVar.b = true;
        }
        int childCount = z67Var.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = z67Var.f.getChildAt(i);
            if (childAt instanceof g1b) {
                ((g1b) childAt).b.u0.d(false, true);
            }
        }
    }
}
