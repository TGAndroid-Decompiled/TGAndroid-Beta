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
import org.telegram.ui.Components.hw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ba0;
import org.telegram.ui.eo;
public final class b8 implements Runnable {
    public final int f719a;
    public final int f720b;
    public final long f721c;
    public final Object d;

    public b8(Object obj, int i10, long j3, int i11) {
        this.f719a = i11;
        this.d = obj;
        this.f720b = i10;
        this.f721c = j3;
    }

    @Override
    public final void run() {
        switch (this.f719a) {
            case 0:
                m9 m9Var = (m9) this.d;
                LongSparseIntArray longSparseIntArray = m9Var.f1408f;
                long j3 = this.f721c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f720b;
                int max = Math.max(i10, i11);
                m9Var.f1408f.put(j3, max);
                m9Var.f1412k.i(max, j3);
                TL_stories.PeerStories y3 = m9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(m9Var.f1409g, m9Var.J);
                    NotificationCenter.getInstance(m9Var.f1404a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f720b, this.f721c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.f720b, this.f721c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f721c, this.f720b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f721c, this.f720b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f721c, this.f720b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f721c, this.f720b);
                    return;
                }
                return;
            case 7:
                hw0.n((hw0) this.d, this.f721c, this.f720b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    eo W9 = eo.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f720b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ba0(W9, this.f721c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b8(Object obj, long j3, int i10, int i11) {
        this.f719a = i11;
        this.d = obj;
        this.f721c = j3;
        this.f720b = i10;
    }
}
