package ch;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.c91;
import org.telegram.ui.df;
import org.telegram.ui.q91;

public final class i extends qa {
    public b51 T;
    public final c91 U;

    public i(Activity activity, c6 c6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, false, false, false, 2, c6Var);
        setBackgroundColor(g6.v0(g6.f22999a7, c6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.U = q91.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z zVarN = this.f31853e.n();
        zVarN.a(-1, R.drawable.ic_close_white);
        zVarN.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.T.N(false);
    }

    public static int P(int i10, long j10, int i11, df dfVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new org.telegram.messenger.a(), new c(dfVar, 2));
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new c(this, 1), this.resourcesProvider);
        this.T = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
