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
import org.telegram.ui.qy;
public final class va implements Runnable {
    public final int f5694a = 0;
    public final long f5695b;
    public final boolean f5696c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f5697f;
    public final TLObject h;

    public va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = lcVar;
        this.f5696c = z10;
        this.f5697f = storyItem;
        this.f5695b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f5694a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f5697f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f5696c;
                long j3 = this.f5695b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.f5036b, lcVar.f5040c, storyItem, j3, storyItem.f18587id, z10, inputGroupCall, true, this.d);
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
                lcVar.q(true);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(lcVar.f5036b, storyItem, null);
                NotificationCenter.getInstance(lcVar.f5040c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f18369id));
                return;
            default:
                qy qyVar = (qy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f5695b;
                boolean z11 = this.f5696c;
                if (chat != null) {
                    qyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        qyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        qyVar.getMessagesController().deleteParticipantFromChat(-j10, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    qyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        qyVar.getMessagesController().blockPeer(user.f18499id);
                    }
                }
                qyVar.getMessagesController().checkIfFolderEmpty(qyVar.V2);
                return;
        }
    }

    public va(qy qyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = qyVar;
        this.f5697f = chat;
        this.f5695b = j3;
        this.f5696c = z10;
        this.h = user;
        this.d = z11;
    }
}
