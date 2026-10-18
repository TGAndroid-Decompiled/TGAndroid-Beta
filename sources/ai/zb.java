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
import org.telegram.ui.Components.sv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class zb implements Runnable {
    public final int f2556a;
    public final long f2557b;
    public final int f2558c;
    public final Object d;

    public zb(Object obj, int i10, long j10, int i11) {
        this.f2556a = i11;
        this.d = obj;
        this.f2558c = i10;
        this.f2557b = j10;
    }

    @Override
    public final void run() {
        switch (this.f2556a) {
            case 0:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    sn W9 = sn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f2558c).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ac(W9, this.f2557b, chat, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ci.h7 h7Var = (ci.h7) this.d;
                LongSparseIntArray longSparseIntArray = h7Var.f5400f;
                long j10 = this.f2557b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f2558c;
                int max = Math.max(i10, i11);
                h7Var.f5400f.put(j10, max);
                h7Var.f5404k.i(max, j10);
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(h7Var.f5401g, h7Var.J);
                    NotificationCenter.getInstance(h7Var.f5397a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f2558c, this.f2557b);
                return;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.f2558c, this.f2557b);
                return;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f2557b, this.f2558c);
                return;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.f2557b, this.f2558c);
                return;
            case 6:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.f2557b, this.f2558c);
                return;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f2557b, this.f2558c);
                    return;
                }
                return;
            default:
                sv0.n((sv0) this.d, this.f2557b, this.f2558c);
                return;
        }
    }

    public zb(Object obj, long j10, int i10, int i11) {
        this.f2556a = i11;
        this.d = obj;
        this.f2557b = j10;
        this.f2558c = i10;
    }
}
