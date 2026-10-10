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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z90;
import org.telegram.ui.zn;
public final class b8 implements Runnable {
    public final int f721a;
    public final int f722b;
    public final long f723c;
    public final Object d;

    public b8(Object obj, int i10, long j3, int i11) {
        this.f721a = i11;
        this.d = obj;
        this.f722b = i10;
        this.f723c = j3;
    }

    @Override
    public final void run() {
        switch (this.f721a) {
            case 0:
                m9 m9Var = (m9) this.d;
                LongSparseIntArray longSparseIntArray = m9Var.f1410f;
                long j3 = this.f723c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f722b;
                int max = Math.max(i10, i11);
                m9Var.f1410f.put(j3, max);
                m9Var.f1414k.i(max, j3);
                TL_stories.PeerStories y3 = m9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(m9Var.f1411g, m9Var.J);
                    NotificationCenter.getInstance(m9Var.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f722b, this.f723c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f722b, this.f723c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f723c, this.f722b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f723c, this.f722b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f723c, this.f722b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f723c, this.f722b);
                    return;
                }
                return;
            case 7:
                cw0.n((cw0) this.d, this.f723c, this.f722b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    zn W9 = zn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f722b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new z90(W9, this.f723c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b8(Object obj, long j3, int i10, int i11) {
        this.f721a = i11;
        this.d = obj;
        this.f723c = j3;
        this.f722b = i10;
    }
}
