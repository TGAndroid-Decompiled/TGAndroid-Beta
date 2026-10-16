package bi;

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
import org.telegram.ui.ea0;
import org.telegram.ui.fo;
public final class m7 implements Runnable {
    public final int f3322a;
    public final int f3323b;
    public final long f3324c;
    public final Object d;

    public m7(Object obj, int i10, long j10, int i11) {
        this.f3322a = i11;
        this.d = obj;
        this.f3323b = i10;
        this.f3324c = j10;
    }

    @Override
    public final void run() {
        switch (this.f3322a) {
            case 0:
                x8 x8Var = (x8) this.d;
                LongSparseIntArray longSparseIntArray = x8Var.f3969f;
                long j10 = this.f3324c;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f3323b;
                int max = Math.max(i10, i11);
                x8Var.f3969f.put(j10, max);
                x8Var.f3973k.i(max, j10);
                TL_stories.PeerStories y3 = x8Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(x8Var.f3970g, x8Var.J);
                    NotificationCenter.getInstance(x8Var.f3966a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f3323b, this.f3324c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.f3323b, this.f3324c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f3324c, this.f3323b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f3324c, this.f3323b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f3324c, this.f3323b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f3324c, this.f3323b);
                    return;
                }
                return;
            case 7:
                xv0.n((xv0) this.d, this.f3324c, this.f3323b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    fo W9 = fo.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f3323b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ea0(W9, this.f3324c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public m7(Object obj, long j10, int i10, int i11) {
        this.f3322a = i11;
        this.d = obj;
        this.f3324c = j10;
        this.f3323b = i10;
    }
}
