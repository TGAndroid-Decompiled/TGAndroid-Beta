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
import org.telegram.ui.Components.lv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x90;
import org.telegram.ui.xn;
public final class a8 implements Runnable {
    public final int f532a;
    public final int f533b;
    public final long f534c;
    public final Object d;

    public a8(Object obj, int i10, long j3, int i11) {
        this.f532a = i11;
        this.d = obj;
        this.f533b = i10;
        this.f534c = j3;
    }

    @Override
    public final void run() {
        switch (this.f532a) {
            case 0:
                l9 l9Var = (l9) this.d;
                LongSparseIntArray longSparseIntArray = l9Var.f1197f;
                long j3 = this.f534c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f533b;
                int max = Math.max(i10, i11);
                l9Var.f1197f.put(j3, max);
                l9Var.f1201k.i(max, j3);
                TL_stories.PeerStories y3 = l9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(l9Var.f1198g, l9Var.J);
                    NotificationCenter.getInstance(l9Var.f1194a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f533b, this.f534c);
                return;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f533b, this.f534c);
                return;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f534c, this.f533b);
                return;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f534c, this.f533b);
                return;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f534c, this.f533b);
                return;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f534c, this.f533b);
                    return;
                }
                return;
            case 7:
                lv0.n((lv0) this.d, this.f534c, this.f533b);
                return;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    xn R9 = xn.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f533b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new x90(R9, this.f534c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a8(Object obj, long j3, int i10, int i11) {
        this.f532a = i11;
        this.d = obj;
        this.f534c = j3;
        this.f533b = i10;
    }
}
