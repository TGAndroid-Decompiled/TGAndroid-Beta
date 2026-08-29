package eh;

import android.app.Activity;
import bg.t1;
import ih.b1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.a0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.f91;
import org.telegram.ui.t91;
public final class g extends xa {
    public k51 T;
    public final f91 U;

    public g(Activity activity, c6 c6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, false, false, false, 2, c6Var);
        setBackgroundColor(g6.v0(g6.f23009a7, c6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.U = t91.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        a0 n10 = this.f34660e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.T.N(false);
    }

    public static int P(int i10, long j10, int i11, b1 b1Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new t1(b1Var, 3));
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new t1(this, 2), this.resourcesProvider);
        this.T = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
