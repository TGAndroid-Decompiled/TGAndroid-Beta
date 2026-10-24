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
import org.telegram.ui.gf;
import org.telegram.ui.zt;
public final class f2 implements Utilities.Callback {
    public final int f1251a;
    public final long f1252b;
    public final Object f1253c;
    public final Object d;

    public f2(Object obj, Object obj2, long j10, int i10) {
        this.f1251a = i10;
        this.f1253c = obj;
        this.d = obj2;
        this.f1252b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f1251a) {
            case 0:
                l7 l7Var = (l7) this.f1253c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.f1252b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new x2(l7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    return;
                }
                l7Var.f1730k0.setLoading(false);
                l7Var.V2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f1253c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((zt) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f1252b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33424a != null && (i10 = dataSettingsActivity.f33430s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).r(150L);
                ey eyVar = ((dx) this.f1253c).f36734b;
                Boolean bool = eyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    eyVar.getMessagesController().addUserToChat(this.f1252b, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new gf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.Z((ProfileActivity) this.f1253c, (Context) this.d, this.f1252b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
