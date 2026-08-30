package lh;

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
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class a9 implements Runnable {
    public final int f12121a;
    public final long f12122b;
    public final int f12123c;
    public final Object d;

    public a9(Object obj, int i10, long j10, int i11) {
        this.f12121a = i11;
        this.d = obj;
        this.f12123c = i10;
        this.f12122b = j10;
    }

    @Override
    public final void run() {
        switch (this.f12121a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    xn R9 = xn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f12123c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new b9(R9, this.f12122b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                nh.t6 t6Var = (nh.t6) this.d;
                LongSparseIntArray longSparseIntArray = t6Var.f15920f;
                long j10 = this.f12122b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f12123c;
                int max = Math.max(i10, i11);
                t6Var.f15920f.put(j10, max);
                t6Var.f15924k.i(max, j10);
                TL_stories.PeerStories y10 = t6Var.y(j10);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(t6Var.f15921g, t6Var.J);
                    NotificationCenter.getInstance(t6Var.f15917a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f12123c, this.f12122b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f12123c, this.f12122b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f12122b, this.f12123c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f12122b, this.f12123c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f12122b, this.f12123c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Md;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f12122b, this.f12123c);
                    return;
                }
                return;
            default:
                yu0.n((yu0) this.d, this.f12122b, this.f12123c);
                return;
        }
    }

    public a9(Object obj, long j10, int i10, int i11) {
        this.f12121a = i11;
        this.d = obj;
        this.f12122b = j10;
        this.f12123c = i10;
    }
}
