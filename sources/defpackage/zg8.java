package defpackage;

import android.app.Activity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class zg8 extends mz0 {
    public l7c S1;
    public final jza T1;
    public boolean U1;
    public int V1;

    public zg8(Activity activity, ylb ylbVar, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, ylbVar);
        s0(cmb.v0(cmb.Z6, ylbVar));
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        this.T1 = xza.g0(tL_statsPollStats.votes_graph, jb6.M0(2131746852, null), 2, false);
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, gm.n);
        this.n1.setClipToPadding(false);
        this.n1.setSections(true);
        r6 t = this.o1.t();
        t.a(-1, 2131231273);
        t.setTranslationX(-gm.L(5.0f));
        this.S1.O(false);
    }

    public static int Y0(int i, long j, int i2, x0 x0Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = oc7.r1(i).i1(j);
        tL_statsGetPollStats.msg_id = i2;
        return ConnectionsManager.getInstance(i).sendRequestTyped(tL_statsGetPollStats, new kc((byte) 0), new vt4(x0Var, (byte) 29));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new vt4(this, (byte) 28), this.J0);
        this.S1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131746853, null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (this.U1 && v0 == this.V1) {
                return;
            }
            this.U1 = true;
            this.V1 = v0;
            s0(v0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
