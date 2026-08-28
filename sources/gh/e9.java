package gh;

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
import org.telegram.ui.Components.eu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class e9 implements Runnable {
    public final int f8033a;
    public final long f8034b;
    public final int f8035c;
    public final Object d;

    public e9(Object obj, int i9, long j10, int i10) {
        this.f8033a = i10;
        this.d = obj;
        this.f8035c = i9;
        this.f8034b = j10;
    }

    @Override
    public final void run() {
        switch (this.f8033a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    qn R9 = qn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f8035c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new f9(R9, this.f8034b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ih.v6 v6Var = (ih.v6) this.d;
                LongSparseIntArray longSparseIntArray = v6Var.f12240f;
                long j10 = this.f8034b;
                int i9 = longSparseIntArray.get(j10, 0);
                int i10 = this.f8035c;
                int max = Math.max(i9, i10);
                v6Var.f12240f.put(j10, max);
                v6Var.f12244k.i(max, j10);
                TL_stories.PeerStories y10 = v6Var.y(j10);
                if (y10 != null && i10 > y10.max_read_id) {
                    y10.max_read_id = i10;
                    Collections.sort(v6Var.f12241g, v6Var.J);
                    NotificationCenter.getInstance(v6Var.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f8035c, this.f8034b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f8035c, this.f8034b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f8034b, this.f8035c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f8034b, this.f8035c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f8034b, this.f8035c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Ld;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f8034b, this.f8035c);
                    return;
                }
                return;
            default:
                eu0.n((eu0) this.d, this.f8034b, this.f8035c);
                return;
        }
    }

    public e9(Object obj, long j10, int i9, int i10) {
        this.f8033a = i10;
        this.d = obj;
        this.f8034b = j10;
        this.f8035c = i9;
    }
}
