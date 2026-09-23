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
import org.telegram.ui.ry;
public final class va implements Runnable {
    public final int f5682a = 0;
    public final long f5683b;
    public final boolean f5684c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f5685f;
    public final TLObject h;

    public va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = lcVar;
        this.f5684c = z10;
        this.f5685f = storyItem;
        this.f5683b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f5682a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f5685f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f5684c;
                long j3 = this.f5683b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.f5029b, lcVar.f5033c, storyItem, j3, storyItem.f18318id, z10, inputGroupCall, true, this.d);
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
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(lcVar.f5029b, storyItem, null);
                NotificationCenter.getInstance(lcVar.f5033c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f18100id));
                return;
            default:
                ry ryVar = (ry) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f5683b;
                boolean z11 = this.f5684c;
                if (chat != null) {
                    ryVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        ryVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        ryVar.getMessagesController().deleteParticipantFromChat(-j10, ryVar.getMessagesController().getUser(Long.valueOf(ryVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    ryVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        ryVar.getMessagesController().blockPeer(user.f18230id);
                    }
                }
                ryVar.getMessagesController().checkIfFolderEmpty(ryVar.V2);
                return;
        }
    }

    public va(ry ryVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = ryVar;
        this.f5685f = chat;
        this.f5683b = j3;
        this.f5684c = z10;
        this.h = user;
        this.d = z11;
    }
}
