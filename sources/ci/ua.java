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
    public final int f6078a = 0;
    public final long f6079b;
    public final boolean f6080c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f6081e;
    public final TLObject f6082f;
    public final TLObject h;

    public ua(kc kcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f6081e = kcVar;
        this.f6080c = z10;
        this.f6082f = storyItem;
        this.f6079b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f6078a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f6082f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f6081e;
        switch (i10) {
            case 0:
                kc kcVar = (kc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f6080c;
                long j3 = this.f6079b;
                if (!z10) {
                    ai.d2.W = new ai.d2(kcVar.f5376b, kcVar.f5380c, storyItem, j3, storyItem.f20275id, z10, inputGroupCall, true, this.d);
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
                U.getOrCreateStoryViewer().F(kcVar.f5376b, storyItem, null);
                NotificationCenter.getInstance(kcVar.f5380c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20055id));
                return;
            default:
                uy uyVar = (uy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f6079b;
                boolean z11 = this.f6080c;
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
                        uyVar.getMessagesController().blockPeer(user.f20185id);
                    }
                }
                uyVar.getMessagesController().checkIfFolderEmpty(uyVar.V2);
                return;
        }
    }

    public ua(uy uyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f6081e = uyVar;
        this.f6082f = chat;
        this.f6079b = j3;
        this.f6080c = z10;
        this.h = user;
        this.d = z11;
    }
}
