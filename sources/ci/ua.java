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
public final class ua implements Runnable {
    public final int f5647a = 0;
    public final long f5648b;
    public final boolean f5649c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f5650f;
    public final TLObject h;

    public ua(kc kcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = kcVar;
        this.f5649c = z10;
        this.f5650f = storyItem;
        this.f5648b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f5647a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f5650f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                kc kcVar = (kc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f5649c;
                long j3 = this.f5648b;
                if (!z10) {
                    ai.d2.W = new ai.d2(kcVar.f4985b, kcVar.f4989c, storyItem, j3, storyItem.f18564id, z10, inputGroupCall, true, this.d);
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
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(kcVar.f4985b, storyItem, null);
                NotificationCenter.getInstance(kcVar.f4989c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f18346id));
                return;
            default:
                ty tyVar = (ty) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f5648b;
                boolean z11 = this.f5649c;
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
                        tyVar.getMessagesController().blockPeer(user.f18476id);
                    }
                }
                tyVar.getMessagesController().checkIfFolderEmpty(tyVar.V2);
                return;
        }
    }

    public ua(ty tyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = tyVar;
        this.f5650f = chat;
        this.f5648b = j3;
        this.f5649c = z10;
        this.h = user;
        this.d = z11;
    }
}
