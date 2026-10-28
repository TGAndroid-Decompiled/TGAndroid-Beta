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
import org.telegram.ui.ax;
import org.telegram.ui.ef;
import org.telegram.ui.ey;
import org.telegram.ui.yt;
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
                AndroidUtilities.cancelRunOnUIThread((yt) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f4419b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.V = z10;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f35512a != null && (i10 = dataSettingsActivity.f35518s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.e2) this.d).r(150L);
                ey eyVar = ((ax) this.f4420c).f37838b;
                Boolean bool = eyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    eyVar.getMessagesController().addUserToChat(this.f4419b, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new ef(6, runnable));
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
