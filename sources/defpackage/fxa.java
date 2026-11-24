package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;
public abstract class fxa extends dxa {
    public final int w;
    public final uxa x;

    public fxa(uxa uxaVar, Context context, int i, int i2, mf0 mf0Var) {
        super(context, i2, mf0Var, null);
        this.x = uxaVar;
        this.w = i;
    }

    @Override
    public final void b(gxa gxaVar) {
        int i;
        uxa uxaVar = this.x;
        i = ((d) uxaVar).classGuid;
        gxaVar.a(this.w, i, uxaVar.a.stats_dc, new fo1(uxaVar, this.r, (byte) 1));
    }

    @Override
    public final void c() {
        int i;
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
                    uxa uxaVar = this.x;
                    uxaVar.b0();
                    String str = this.r.g + "_" + selectedDate;
                    fk1 fk1Var = (fk1) uxaVar.V.f(str);
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
                    uxaVar.Z = obj;
                    uxaVar.T.getClass();
                    obj.a = RecyclerView.R(this);
                    nf0Var.u0.d(true, false);
                    int i2 = this.w;
                    int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_loadAsyncGraph, new ck8(this, str, (Object) obj, (byte) 20), null, null, 0, uxaVar.a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                    i = ((d) uxaVar).classGuid;
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
