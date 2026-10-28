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
import org.telegram.ui.ey;
public final class ca implements Runnable {
    public final int f10617a = 0;
    public final long f10618b;
    public final boolean f10619c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f10620f;
    public final TLObject h;

    public ca(sb sbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = sbVar;
        this.f10619c = z10;
        this.f10620f = storyItem;
        this.f10618b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f10617a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f10620f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                sb sbVar = (sb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f10619c;
                long j10 = this.f10618b;
                if (!z10) {
                    di.h1.W = new di.h1(sbVar.f11607b, sbVar.f11611c, storyItem, j10, storyItem.f22267id, z10, inputGroupCall, true, this.d);
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
                U.getOrCreateStoryViewer().G(sbVar.f11607b, storyItem, null);
                NotificationCenter.getInstance(sbVar.f11611c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f22045id));
                return;
            default:
                ey eyVar = (ey) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f10618b;
                boolean z11 = this.f10619c;
                if (chat != null) {
                    eyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        eyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        eyVar.getMessagesController().deleteParticipantFromChat(-j11, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    eyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        eyVar.getMessagesController().blockPeer(user.f22177id);
                    }
                }
                eyVar.getMessagesController().checkIfFolderEmpty(eyVar.W2);
                return;
        }
    }

    public ca(ey eyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = eyVar;
        this.f10620f = chat;
        this.f10618b = j10;
        this.f10619c = z10;
        this.h = user;
        this.d = z11;
    }
}
