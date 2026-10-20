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
import org.telegram.ui.bx;
import org.telegram.ui.cy;
import org.telegram.ui.gf;
import org.telegram.ui.wt;
public final class f2 implements Utilities.Callback {
    public final int f1248a;
    public final long f1249b;
    public final Object f1250c;
    public final Object d;

    public f2(Object obj, Object obj2, long j10, int i10) {
        this.f1248a = i10;
        this.f1250c = obj;
        this.d = obj2;
        this.f1249b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f1248a) {
            case 0:
                l7 l7Var = (l7) this.f1250c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.f1249b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new x2(l7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    return;
                }
                l7Var.f1738k0.setLoading(false);
                l7Var.W2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f1250c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((wt) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f1249b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33120a != null && (i10 = dataSettingsActivity.f33126s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).r(150L);
                cy cyVar = ((bx) this.f1250c).f35751b;
                Boolean bool = cyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cyVar.getMessagesController().addUserToChat(this.f1249b, cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H)), 0, null, cyVar, false, runnable, new gf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.Z((ProfileActivity) this.f1250c, (Context) this.d, this.f1249b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
