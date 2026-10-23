package ai;

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
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ac implements Runnable {
    public final int f985a;
    public final long f986b;
    public final int f987c;
    public final Object d;

    public ac(Object obj, int i10, long j10, int i11) {
        this.f985a = i11;
        this.d = obj;
        this.f987c = i10;
        this.f986b = j10;
    }

    @Override
    public final void run() {
        switch (this.f985a) {
            case 0:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    sn W9 = sn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f987c).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new bc(W9, this.f986b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ci.h7 h7Var = (ci.h7) this.d;
                LongSparseIntArray longSparseIntArray = h7Var.f5402f;
                long j10 = this.f986b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f987c;
                int max = Math.max(i10, i11);
                h7Var.f5402f.put(j10, max);
                h7Var.f5406k.i(max, j10);
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(h7Var.f5403g, h7Var.J);
                    NotificationCenter.getInstance(h7Var.f5399a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f987c, this.f986b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$25(this.f987c, this.f986b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f986b, this.f987c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f986b, this.f987c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f986b, this.f987c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f986b, this.f987c);
                    return;
                }
                return;
            default:
                xv0.n((xv0) this.d, this.f986b, this.f987c);
                return;
        }
    }

    public ac(Object obj, long j10, int i10, int i11) {
        this.f985a = i11;
        this.d = obj;
        this.f986b = j10;
        this.f987c = i10;
    }
}
