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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class ga implements Runnable {
    public final int f4688a;
    public final long f4689b;
    public final int f4690c;
    public final Object d;

    public ga(Object obj, int i10, long j10, int i11) {
        this.f4688a = i11;
        this.d = obj;
        this.f4690c = i10;
        this.f4689b = j10;
    }

    @Override
    public final void run() {
        switch (this.f4688a) {
            case 0:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    wn ea2 = wn.ea(l4.longValue());
                    U.presentFragment(ea2);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f4690c).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ia(ea2, this.f4689b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                di.h7 h7Var = (di.h7) this.d;
                LongSparseIntArray longSparseIntArray = h7Var.f8632f;
                long j10 = this.f4689b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f4690c;
                int max = Math.max(i10, i11);
                h7Var.f8632f.put(j10, max);
                h7Var.f8636k.i(max, j10);
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(h7Var.f8633g, h7Var.J);
                    NotificationCenter.getInstance(h7Var.f8629a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f4690c, this.f4689b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$25(this.f4690c, this.f4689b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f4689b, this.f4690c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$426(this.f4689b, this.f4690c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f4689b, this.f4690c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.s1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f4689b, this.f4690c);
                    return;
                }
                return;
            default:
                bw0.m((bw0) this.d, this.f4689b, this.f4690c);
                return;
        }
    }

    public ga(Object obj, long j10, int i10, int i11) {
        this.f4688a = i11;
        this.d = obj;
        this.f4689b = j10;
        this.f4690c = i10;
    }
}
