package fi;

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
public final class ca implements Runnable {
    public final int f10618a = 0;
    public final long f10619b;
    public final boolean f10620c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f10621f;
    public final TLObject h;

    public ca(sb sbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = sbVar;
        this.f10620c = z10;
        this.f10621f = storyItem;
        this.f10619b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f10618a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f10621f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                sb sbVar = (sb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f10620c;
                long j10 = this.f10619b;
                if (!z10) {
                    di.h1.W = new di.h1(sbVar.f11608b, sbVar.f11612c, storyItem, j10, storyItem.f22266id, z10, inputGroupCall, true, this.d);
                }
                nb nbVar = sbVar.F;
                if (nbVar != null) {
                    nbVar.f(false);
                }
                sbVar.F = null;
                sbVar.J = 0;
                RectF rectF = sbVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                sbVar.G = AndroidUtilities.dp(8.0f);
                sbVar.p(true);
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(sbVar.f11608b, storyItem, null);
                NotificationCenter.getInstance(sbVar.f11612c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f22044id));
                return;
            default:
                cy cyVar = (cy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f10619b;
                boolean z11 = this.f10620c;
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
                        cyVar.getMessagesController().blockPeer(user.f22176id);
                    }
                }
                cyVar.getMessagesController().checkIfFolderEmpty(cyVar.W2);
                return;
        }
    }

    public ca(cy cyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = cyVar;
        this.f10621f = chat;
        this.f10619b = j10;
        this.f10620c = z10;
        this.h = user;
        this.d = z11;
    }
}
