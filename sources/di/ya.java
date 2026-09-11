package di;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.uy;
public final class ya implements Runnable {
    public final int f8486a = 0;
    public final long f8487b;
    public final boolean f8488c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f8489e;
    public final TLObject f8490f;
    public final TLObject h;

    public ya(pc pcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f8489e = pcVar;
        this.f8488c = z10;
        this.f8490f = storyItem;
        this.f8487b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f8486a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f8490f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f8489e;
        switch (i10) {
            case 0:
                pc pcVar = (pc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f8488c;
                long j3 = this.f8487b;
                if (!z10) {
                    bi.t1.W = new bi.t1(pcVar.f7844b, pcVar.f7848c, storyItem, j3, storyItem.f20107id, z10, inputGroupCall, true, this.d);
                }
                kc kcVar = pcVar.F;
                if (kcVar != null) {
                    kcVar.f(false);
                }
                pcVar.F = null;
                pcVar.J = 0;
                RectF rectF = pcVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                pcVar.G = AndroidUtilities.dp(8.0f);
                pcVar.q(true);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(pcVar.f7844b, storyItem, null);
                NotificationCenter.getInstance(pcVar.f7848c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f19886id));
                return;
            default:
                uy uyVar = (uy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f8487b;
                boolean z11 = this.f8488c;
                if (chat != null) {
                    uyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        uyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        uyVar.getMessagesController().deleteParticipantFromChat(-j10, uyVar.getMessagesController().getUser(Long.valueOf(uyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    uyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        uyVar.getMessagesController().blockPeer(user.f20016id);
                    }
                }
                uyVar.getMessagesController().checkIfFolderEmpty(uyVar.V2);
                return;
        }
    }

    public ya(uy uyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f8489e = uyVar;
        this.f8490f = chat;
        this.f8487b = j3;
        this.f8488c = z10;
        this.h = user;
        this.d = z11;
    }
}
