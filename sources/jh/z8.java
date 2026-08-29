package jh;

import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class z8 implements Runnable {
    public final int f13188a;
    public final long f13189b;
    public final int f13190c;
    public final Object d;

    public z8(Object obj, int i10, long j10, int i11) {
        this.f13188a = i11;
        this.d = obj;
        this.f13190c = i10;
        this.f13189b = j10;
    }

    @Override
    public final void run() {
        switch (this.f13188a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    tn R9 = tn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f13190c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new a9(R9, this.f13189b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lh.s6 s6Var = (lh.s6) this.d;
                LongSparseIntArray longSparseIntArray = s6Var.f16222f;
                long j10 = this.f13189b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f13190c;
                int max = Math.max(i10, i11);
                s6Var.f16222f.put(j10, max);
                s6Var.f16226k.i(max, j10);
                TL_stories.PeerStories y8 = s6Var.y(j10);
                if (y8 != null && i11 > y8.max_read_id) {
                    y8.max_read_id = i11;
                    Collections.sort(s6Var.f16223g, s6Var.J);
                    NotificationCenter.getInstance(s6Var.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f13190c, this.f13189b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f13190c, this.f13189b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f13189b, this.f13190c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f13189b, this.f13190c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f13189b, this.f13190c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.s1) this.d).Ld;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f13189b, this.f13190c);
                    return;
                }
                return;
            default:
                qu0.n((qu0) this.d, this.f13189b, this.f13190c);
                return;
        }
    }

    public z8(Object obj, long j10, int i10, int i11) {
        this.f13188a = i11;
        this.d = obj;
        this.f13189b = j10;
        this.f13190c = i10;
    }
}
