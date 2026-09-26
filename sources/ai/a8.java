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
import org.telegram.ui.Components.kv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v90;
import org.telegram.ui.wn;
public final class a8 implements Runnable {
    public final int f529a;
    public final int f530b;
    public final long f531c;
    public final Object d;

    public a8(Object obj, int i10, long j3, int i11) {
        this.f529a = i11;
        this.d = obj;
        this.f530b = i10;
        this.f531c = j3;
    }

    @Override
    public final void run() {
        switch (this.f529a) {
            case 0:
                l9 l9Var = (l9) this.d;
                LongSparseIntArray longSparseIntArray = l9Var.f1195f;
                long j3 = this.f531c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f530b;
                int max = Math.max(i10, i11);
                l9Var.f1195f.put(j3, max);
                l9Var.f1199k.i(max, j3);
                TL_stories.PeerStories y3 = l9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(l9Var.f1196g, l9Var.J);
                    NotificationCenter.getInstance(l9Var.f1192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f530b, this.f531c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f530b, this.f531c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f531c, this.f530b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f531c, this.f530b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f531c, this.f530b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f531c, this.f530b);
                    return;
                }
                return;
            case 7:
                kv0.n((kv0) this.d, this.f531c, this.f530b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    wn R9 = wn.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f530b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new v90(R9, this.f531c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a8(Object obj, long j3, int i10, int i11) {
        this.f529a = i11;
        this.d = obj;
        this.f531c = j3;
        this.f530b = i10;
    }
}
