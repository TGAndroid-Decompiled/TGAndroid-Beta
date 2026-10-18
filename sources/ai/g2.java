package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dx;
import org.telegram.ui.ey;
import org.telegram.ui.jf;
import org.telegram.ui.yt;
public final class g2 implements Utilities.Callback {
    public final int f1331a;
    public final long f1332b;
    public final Object f1333c;
    public final Object d;

    public g2(Object obj, Object obj2, long j10, int i10) {
        this.f1331a = i10;
        this.f1333c = obj;
        this.d = obj2;
        this.f1332b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f1331a) {
            case 0:
                k7 k7Var = (k7) this.f1333c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.f1332b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new w2(k7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    return;
                }
                k7Var.f1671k0.setLoading(false);
                k7Var.P2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f1333c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((yt) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f1332b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33115a != null && (i10 = dataSettingsActivity.f33121s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                ey eyVar = ((dx) this.f1333c).f36334b;
                Boolean bool = eyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    eyVar.getMessagesController().addUserToChat(this.f1332b, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new jf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.Z((ProfileActivity) this.f1333c, (Context) this.d, this.f1332b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
