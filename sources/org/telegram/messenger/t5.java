package org.telegram.messenger;

import java.util.Collections;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.z90;
public final class t5 implements Runnable {
    public final int f16374a;
    public final int f16375b;
    public final long f16376c;
    public final Object d;

    public t5(Object obj, int i10, long j3, int i11) {
        this.f16374a = i11;
        this.d = obj;
        this.f16375b = i10;
        this.f16376c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16374a) {
            case 0:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f16375b, this.f16376c);
                return;
            case 1:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f16375b, this.f16376c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f16376c, this.f16375b);
                return;
            case 3:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f16376c, this.f16375b);
                return;
            case 4:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f16376c, this.f16375b);
                return;
            case 5:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f16376c, this.f16375b);
                    return;
                }
                return;
            case 6:
                iv0.n((iv0) this.d, this.f16376c, this.f16375b);
                return;
            case 7:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    eo R9 = eo.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f16375b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new z90(R9, this.f16376c, chat, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
            default:
                zh.i5 i5Var = (zh.i5) this.d;
                LongSparseIntArray longSparseIntArray = i5Var.f48502f;
                long j3 = this.f16376c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.f16375b;
                int max = Math.max(i10, i11);
                i5Var.f48502f.put(j3, max);
                i5Var.f48506k.i(max, j3);
                TL_stories.PeerStories y3 = i5Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(i5Var.f48503g, i5Var.J);
                    NotificationCenter.getInstance(i5Var.f48499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
        }
    }

    public t5(Object obj, long j3, int i10, int i11) {
        this.f16374a = i11;
        this.d = obj;
        this.f16376c = j3;
        this.f16375b = i10;
    }
}
