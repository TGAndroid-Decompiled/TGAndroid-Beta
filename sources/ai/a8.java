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
import org.telegram.ui.Components.pv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
import org.telegram.ui.z90;
public final class a8 implements Runnable {
    public final int f578a;
    public final int f579b;
    public final long f580c;
    public final Object d;

    public a8(Object obj, int i10, long j3, int i11) {
        this.f578a = i11;
        this.d = obj;
        this.f579b = i10;
        this.f580c = j3;
    }

    @Override
    public final void run() {
        switch (this.f578a) {
            case 0:
                l9 l9Var = (l9) this.d;
                LongSparseIntArray longSparseIntArray = l9Var.f1294f;
                long j3 = this.f580c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f579b;
                int max = Math.max(i10, i11);
                l9Var.f1294f.put(j3, max);
                l9Var.f1298k.i(max, j3);
                TL_stories.PeerStories y3 = l9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(l9Var.f1295g, l9Var.J);
                    NotificationCenter.getInstance(l9Var.f1290a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f579b, this.f580c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f579b, this.f580c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f580c, this.f579b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f580c, this.f579b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f580c, this.f579b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f580c, this.f579b);
                    return;
                }
                return;
            case 7:
                pv0.n((pv0) this.d, this.f580c, this.f579b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yn Q9 = yn.Q9(l4.longValue());
                    U.presentFragment(Q9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f579b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new z90(Q9, this.f580c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a8(Object obj, long j3, int i10, int i11) {
        this.f578a = i11;
        this.d = obj;
        this.f580c = j3;
        this.f579b = i10;
    }
}
