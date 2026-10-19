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
import org.telegram.ui.Components.tv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class zb implements Runnable {
    public final int f2554a;
    public final long f2555b;
    public final int f2556c;
    public final Object d;

    public zb(Object obj, int i10, long j10, int i11) {
        this.f2554a = i11;
        this.d = obj;
        this.f2556c = i10;
        this.f2555b = j10;
    }

    @Override
    public final void run() {
        switch (this.f2554a) {
            case 0:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    qn W9 = qn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f2556c).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ac(W9, this.f2555b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ci.i7 i7Var = (ci.i7) this.d;
                LongSparseIntArray longSparseIntArray = i7Var.f5496f;
                long j10 = this.f2555b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f2556c;
                int max = Math.max(i10, i11);
                i7Var.f5496f.put(j10, max);
                i7Var.f5500k.i(max, j10);
                TL_stories.PeerStories y3 = i7Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(i7Var.f5497g, i7Var.J);
                    NotificationCenter.getInstance(i7Var.f5493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f2556c, this.f2555b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.f2556c, this.f2555b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f2555b, this.f2556c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f2555b, this.f2556c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f2555b, this.f2556c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f2555b, this.f2556c);
                    return;
                }
                return;
            default:
                tv0.n((tv0) this.d, this.f2555b, this.f2556c);
                return;
        }
    }

    public zb(Object obj, long j10, int i10, int i11) {
        this.f2554a = i11;
        this.d = obj;
        this.f2555b = j10;
        this.f2556c = i10;
    }
}
