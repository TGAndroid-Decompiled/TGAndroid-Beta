package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ff;
import org.telegram.ui.wt;
import org.telegram.ui.yw;
public final class c2 implements Utilities.Callback {
    public final int f4418a;
    public final long f4419b;
    public final Object f4420c;
    public final Object d;

    public c2(Object obj, Object obj2, long j10, int i10) {
        this.f4418a = i10;
        this.f4420c = obj;
        this.d = obj2;
        this.f4419b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f4418a) {
            case 0:
                h7 h7Var = (h7) this.f4420c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.f4419b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new t2(h7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    return;
                }
                h7Var.f4747k0.setLoading(false);
                h7Var.V2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f4420c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((wt) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f4419b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.V = z10;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f35485a != null && (i10 = dataSettingsActivity.f35491s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.e2) this.d).r(150L);
                cy cyVar = ((yw) this.f4420c).f46118b;
                Boolean bool = cyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cyVar.getMessagesController().addUserToChat(this.f4419b, cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H)), 0, null, cyVar, false, runnable, new ff(6, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.Z((ProfileActivity) this.f4420c, (Context) this.d, this.f4419b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
