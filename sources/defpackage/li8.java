package defpackage;

import android.app.Activity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class li8 extends ny0 {
    public l9c S1;
    public final i1b T1;
    public boolean U1;
    public int V1;

    public li8(Activity activity, vnb vnbVar, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, vnbVar);
        s0(aob.v0(aob.a7, vnbVar));
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        this.T1 = w1b.f0(tL_statsPollStats.votes_graph, ob6.M0(2131746846, null), 2, false);
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, hl.n);
        this.n1.setClipToPadding(false);
        this.n1.setSections(true);
        s6 u = this.o1.u();
        u.a(-1, 2131231272);
        u.setTranslationX(-hl.L(5.0f));
        this.S1.O(false);
    }

    public static int Z0(int i, long j, int i2, y0 y0Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = uc7.s1(i).j1(j);
        tL_statsGetPollStats.msg_id = i2;
        return ConnectionsManager.getInstance(i).sendRequestTyped(tL_statsGetPollStats, new ic((byte) 0), new yt4(y0Var, (byte) 29));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new yt4(this, (byte) 28), this.J0);
        this.S1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131746847, null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int v0 = aob.v0(aob.a7, this.J0);
            if (this.U1 && v0 == this.V1) {
                return;
            }
            this.U1 = true;
            this.V1 = v0;
            s0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
