package gh;

import android.app.Activity;
import dg.r1;
import kh.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ga1;
import org.telegram.ui.s91;
public final class g extends sa {
    public w51 U;
    public final s91 V;

    public g(Activity activity, f6 f6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, false, false, false, 2, f6Var);
        setBackgroundColor(j6.v0(j6.f19852a7, f6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.V = ga1.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z n10 = this.e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.U.N(false);
    }

    public static int P(int i10, long j10, int i11, a1 a1Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new r1(a1Var, 3));
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new r1(this, 2), this.resourcesProvider);
        this.U = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
