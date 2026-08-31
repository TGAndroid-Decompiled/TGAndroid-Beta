package mh;

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
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class a9 implements Runnable {
    public final int f13710a;
    public final long f13711b;
    public final int f13712c;
    public final Object d;

    public a9(Object obj, int i10, long j10, int i11) {
        this.f13710a = i11;
        this.d = obj;
        this.f13712c = i10;
        this.f13711b = j10;
    }

    @Override
    public final void run() {
        switch (this.f13710a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    xn R9 = xn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f13712c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new b9(R9, this.f13711b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oh.t6 t6Var = (oh.t6) this.d;
                LongSparseIntArray longSparseIntArray = t6Var.f17774f;
                long j10 = this.f13711b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f13712c;
                int max = Math.max(i10, i11);
                t6Var.f17774f.put(j10, max);
                t6Var.f17778k.i(max, j10);
                TL_stories.PeerStories y10 = t6Var.y(j10);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(t6Var.f17775g, t6Var.J);
                    NotificationCenter.getInstance(t6Var.f17770a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f13712c, this.f13711b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f13712c, this.f13711b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f13711b, this.f13712c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f13711b, this.f13712c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f13711b, this.f13712c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Md;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f13711b, this.f13712c);
                    return;
                }
                return;
            default:
                zu0.n((zu0) this.d, this.f13711b, this.f13712c);
                return;
        }
    }

    public a9(Object obj, long j10, int i10, int i11) {
        this.f13710a = i11;
        this.d = obj;
        this.f13711b = j10;
        this.f13712c = i10;
    }
}
