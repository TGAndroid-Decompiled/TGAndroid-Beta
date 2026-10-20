package ei;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
public final class ga implements Runnable {
    public final int f9075a = 0;
    public final long f9076b;
    public final boolean f9077c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f9078f;
    public final TLObject h;

    public ga(vb vbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = vbVar;
        this.f9077c = z10;
        this.f9078f = storyItem;
        this.f9076b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f9075a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f9078f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                vb vbVar = (vb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f9077c;
                long j10 = this.f9076b;
                if (!z10) {
                    ci.h1.W = new ci.h1(vbVar.f9950b, vbVar.f9954c, storyItem, j10, storyItem.f20510id, z10, inputGroupCall, true, this.d);
                }
                qb qbVar = vbVar.F;
                if (qbVar != null) {
                    qbVar.f(false);
                }
                vbVar.F = null;
                vbVar.J = 0;
                RectF rectF = vbVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                vbVar.G = AndroidUtilities.dp(8.0f);
                vbVar.p(true);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(vbVar.f9950b, storyItem, null);
                NotificationCenter.getInstance(vbVar.f9954c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20293id));
                return;
            default:
                cy cyVar = (cy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f9076b;
                boolean z11 = this.f9077c;
                if (chat != null) {
                    cyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        cyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        cyVar.getMessagesController().deleteParticipantFromChat(-j11, cyVar.getMessagesController().getUser(Long.valueOf(cyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    cyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        cyVar.getMessagesController().blockPeer(user.f20423id);
                    }
                }
                cyVar.getMessagesController().checkIfFolderEmpty(cyVar.W2);
                return;
        }
    }

    public ga(cy cyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = cyVar;
        this.f9078f = chat;
        this.f9076b = j10;
        this.f9077c = z10;
        this.h = user;
        this.d = z11;
    }
}
