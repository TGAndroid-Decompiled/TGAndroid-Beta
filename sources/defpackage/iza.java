package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;
public abstract class iza extends gza {
    public final int w;
    public final xza x;

    public iza(xza xzaVar, Context context, int i, int i2, mg0 mg0Var) {
        super(context, i2, mg0Var, null);
        this.x = xzaVar;
        this.w = i;
    }

    @Override
    public final void b(jza jzaVar) {
        int i;
        xza xzaVar = this.x;
        i = ((d) xzaVar).classGuid;
        jzaVar.a(this.w, i, xzaVar.a.stats_dc, new sp1(xzaVar, this.r, (byte) 1));
    }

    @Override
    public final void c() {
        int i;
        if (this.r.c <= 0) {
            performClick();
            ng0 ng0Var = this.b;
            if (ng0Var.u0.H) {
                long selectedDate = ng0Var.getSelectedDate();
                jza jzaVar = this.r;
                if (this.s == 4) {
                    jzaVar.e = new moa(jzaVar.d, selectedDate);
                    g(false);
                } else if (jzaVar.g == null) {
                } else {
                    xza xzaVar = this.x;
                    xzaVar.c0();
                    String str = this.r.g + "_" + selectedDate;
                    nl1 nl1Var = (nl1) xzaVar.V.f(str);
                    if (nl1Var != null) {
                        this.r.e = nl1Var;
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
                    xzaVar.Z = obj;
                    xzaVar.T.getClass();
                    obj.a = RecyclerView.R(this);
                    ng0Var.u0.d(true, false);
                    int i2 = this.w;
                    int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_loadAsyncGraph, new fm8(this, str, (Object) obj, (byte) 20), null, null, 0, xzaVar.a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                    i = ((d) xzaVar).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i);
                }
            }
        }
    }

    @Override
    public final void f() {
        this.x.c0();
    }
}
