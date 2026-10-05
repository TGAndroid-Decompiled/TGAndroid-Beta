package ci;

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
public final class ua implements Runnable {
    public final int f6079a = 0;
    public final long f6080b;
    public final boolean f6081c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f6082e;
    public final TLObject f6083f;
    public final TLObject h;

    public ua(kc kcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f6082e = kcVar;
        this.f6081c = z10;
        this.f6083f = storyItem;
        this.f6080b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f6079a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f6083f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f6082e;
        switch (i10) {
            case 0:
                kc kcVar = (kc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f6081c;
                long j3 = this.f6080b;
                if (!z10) {
                    ai.d2.W = new ai.d2(kcVar.f5377b, kcVar.f5381c, storyItem, j3, storyItem.f20284id, z10, inputGroupCall, true, this.d);
                }
                fc fcVar = kcVar.F;
                if (fcVar != null) {
                    fcVar.f(false);
                }
                kcVar.F = null;
                kcVar.J = 0;
                RectF rectF = kcVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                kcVar.G = AndroidUtilities.dp(8.0f);
                kcVar.q(true);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(kcVar.f5377b, storyItem, null);
                NotificationCenter.getInstance(kcVar.f5381c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20064id));
                return;
            default:
                uy uyVar = (uy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f6080b;
                boolean z11 = this.f6081c;
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
                        uyVar.getMessagesController().blockPeer(user.f20194id);
                    }
                }
                uyVar.getMessagesController().checkIfFolderEmpty(uyVar.V2);
                return;
        }
    }

    public ua(uy uyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f6082e = uyVar;
        this.f6083f = chat;
        this.f6080b = j3;
        this.f6081c = z10;
        this.h = user;
        this.d = z11;
    }
}
