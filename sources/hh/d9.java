package hh;

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
import org.telegram.ui.Components.hu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class d9 implements Runnable {

    public final int f9139a;

    public final long f9140b;

    public final int f9141c;
    public final Object d;

    public d9(Object obj, int i10, long j10, int i11) {
        this.f9139a = i11;
        this.d = obj;
        this.f9141c = i10;
        this.f9140b = j10;
    }

    @Override
    public final void run() {
        switch (this.f9139a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    rn rnVarR9 = rn.R9(l10.longValue());
                    n2VarU.presentFragment(rnVarR9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f9141c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new e9(rnVarR9, this.f9140b, chat, 0), 250L);
                    }
                    break;
                }
                break;
            case 1:
                jh.s6 s6Var = (jh.s6) this.d;
                LongSparseIntArray longSparseIntArray = s6Var.f13959f;
                long j10 = this.f9140b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.f9141c;
                int iMax = Math.max(i10, i11);
                s6Var.f13959f.put(j10, iMax);
                s6Var.f13963k.i(iMax, j10);
                TL_stories.PeerStories peerStoriesY = s6Var.y(j10);
                if (peerStoriesY != null && i11 > peerStoriesY.max_read_id) {
                    peerStoriesY.max_read_id = i11;
                    Collections.sort(s6Var.f13960g, s6Var.J);
                    NotificationCenter.getInstance(s6Var.f13955a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                break;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.f9141c, this.f9140b);
                break;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.f9141c, this.f9140b);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.f9140b, this.f9141c);
                break;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.f9140b, this.f9141c);
                break;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.f9140b, this.f9141c);
                break;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.s1) this.d).Ld;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.f9140b, this.f9141c);
                }
                break;
            default:
                hu0.n((hu0) this.d, this.f9140b, this.f9141c);
                break;
        }
    }

    public d9(Object obj, long j10, int i10, int i11) {
        this.f9139a = i11;
        this.d = obj;
        this.f9140b = j10;
        this.f9141c = i10;
    }
}
