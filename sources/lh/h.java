package lh;

import ag.e0;
import android.app.Activity;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.g61;
import org.telegram.ui.u61;
public final class h extends ha {
    public p51 P1;
    public final g61 Q1;
    public boolean R1;
    public int S1;

    public h(Activity activity, p6 p6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, p6Var);
        v0(t6.w0(t6.f20872a7, p6Var));
        this.f21620x = true;
        this.f21606n = false;
        this.C1 = false;
        this.B1 = i0.L(12.0f);
        this.Q1 = u61.h0(tL_statsPollStats.votes_graph, cd.L0(2131747134, null), 2, false);
        tk0 tk0Var = this.f26666k1;
        int i10 = this.f21615t0;
        tk0Var.setPadding(i10, 0, i10, i0.f16021n);
        this.f26666k1.setClipToPadding(false);
        this.f26666k1.setSections(true);
        y p5 = this.l1.p();
        p5.a(-1, 2131231270);
        p5.setTranslationX(-i0.L(5.0f));
        this.P1.O(false);
    }

    public static int d1(int i10, long j10, int i11, e0 e0Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = vp.r1(i10).i1(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new a3.b(1), new ag.a(e0Var, 18));
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, true, new ag.a(this, 17), this.I0);
        this.P1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131747135, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = t6.w0(t6.f20872a7, this.I0);
            if (this.R1 && w02 == this.S1) {
                return;
            }
            this.R1 = true;
            this.S1 = w02;
            v0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
