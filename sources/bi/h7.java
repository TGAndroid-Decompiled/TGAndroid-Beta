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
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.co;
public final class h7 implements Runnable {
    public final int f3092a;
    public final int f3093b;
    public final long f3094c;
    public final Object d;

    public h7(Object obj, int i10, long j3, int i11) {
        this.f3092a = i11;
        this.d = obj;
        this.f3093b = i10;
        this.f3094c = j3;
    }

    @Override
    public final void run() {
        switch (this.f3092a) {
            case 0:
                u8 u8Var = (u8) this.d;
                LongSparseIntArray longSparseIntArray = u8Var.f3836f;
                long j3 = this.f3094c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f3093b;
                int max = Math.max(i10, i11);
                u8Var.f3836f.put(j3, max);
                u8Var.f3840k.i(max, j3);
                TL_stories.PeerStories y3 = u8Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(u8Var.f3837g, u8Var.J);
                    NotificationCenter.getInstance(u8Var.f3832a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f3093b, this.f3094c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f3093b, this.f3094c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f3094c, this.f3093b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f3094c, this.f3093b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f3094c, this.f3093b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f3094c, this.f3093b);
                    return;
                }
                return;
            case 7:
                xu0.n((xu0) this.d, this.f3094c, this.f3093b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    co R9 = co.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f3093b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new aa0(R9, this.f3094c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h7(Object obj, long j3, int i10, int i11) {
        this.f3092a = i11;
        this.d = obj;
        this.f3094c = j3;
        this.f3093b = i10;
    }
}
