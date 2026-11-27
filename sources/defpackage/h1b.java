package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e;
public abstract class h1b extends g1b {
    public final int w;
    public final w1b x;

    public h1b(w1b w1bVar, Context context, int i, int i2, of0 of0Var) {
        super(context, i2, of0Var, null);
        this.x = w1bVar;
        this.w = i;
    }

    @Override
    public final void b(i1b i1bVar) {
        int i;
        w1b w1bVar = this.x;
        i = ((e) w1bVar).classGuid;
        i1bVar.a(this.w, i, w1bVar.a.stats_dc, new vo1(w1bVar, this.r, (byte) 1));
    }

    @Override
    public final void c() {
        int i;
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
                    w1b w1bVar = this.x;
                    w1bVar.b0();
                    String str = this.r.g + "_" + selectedDate;
                    ok1 ok1Var = (ok1) w1bVar.V.f(str);
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
                    w1bVar.Z = obj;
                    w1bVar.T.getClass();
                    obj.a = RecyclerView.S(this);
                    pf0Var.u0.d(true, false);
                    int i2 = this.w;
                    int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_loadAsyncGraph, new qn8(this, str, (Object) obj, (byte) 20), null, null, 0, w1bVar.a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                    i = ((e) w1bVar).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i);
                }
            }
        }
    }

    @Override
    public final void f() {
        this.x.b0();
    }
}
