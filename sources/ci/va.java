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
import org.telegram.ui.ty;
public final class va implements Runnable {
    public final int f6164a = 0;
    public final long f6165b;
    public final boolean f6166c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f6167e;
    public final TLObject f6168f;
    public final TLObject h;

    public va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f6167e = lcVar;
        this.f6166c = z10;
        this.f6168f = storyItem;
        this.f6165b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f6164a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f6168f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f6167e;
        switch (i10) {
            case 0:
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f6166c;
                long j3 = this.f6165b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.f5461b, lcVar.f5465c, storyItem, j3, storyItem.f20279id, z10, inputGroupCall, true, this.d);
                }
                gc gcVar = lcVar.F;
                if (gcVar != null) {
                    gcVar.f(false);
                }
                lcVar.F = null;
                lcVar.J = 0;
                RectF rectF = lcVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                lcVar.G = AndroidUtilities.dp(8.0f);
                lcVar.p(true);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(lcVar.f5461b, storyItem, null);
                NotificationCenter.getInstance(lcVar.f5465c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20059id));
                return;
            default:
                ty tyVar = (ty) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f6165b;
                boolean z11 = this.f6166c;
                if (chat != null) {
                    tyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        tyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        tyVar.getMessagesController().deleteParticipantFromChat(-j10, tyVar.getMessagesController().getUser(Long.valueOf(tyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    tyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        tyVar.getMessagesController().blockPeer(user.f20189id);
                    }
                }
                tyVar.getMessagesController().checkIfFolderEmpty(tyVar.V2);
                return;
        }
    }

    public va(ty tyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f6167e = tyVar;
        this.f6168f = chat;
        this.f6165b = j3;
        this.f6166c = z10;
        this.h = user;
        this.d = z11;
    }
}
