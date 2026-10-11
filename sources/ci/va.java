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
import org.telegram.ui.sy;
public final class va implements Runnable {
    public final int f6163a = 0;
    public final long f6164b;
    public final boolean f6165c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f6166e;
    public final TLObject f6167f;
    public final TLObject h;

    public va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f6166e = lcVar;
        this.f6165c = z10;
        this.f6167f = storyItem;
        this.f6164b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f6163a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f6167f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f6166e;
        switch (i10) {
            case 0:
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f6165c;
                long j3 = this.f6164b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.f5460b, lcVar.f5464c, storyItem, j3, storyItem.f20305id, z10, inputGroupCall, true, this.d);
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
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(lcVar.f5460b, storyItem, null);
                NotificationCenter.getInstance(lcVar.f5464c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20085id));
                return;
            default:
                sy syVar = (sy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f6164b;
                boolean z11 = this.f6165c;
                if (chat != null) {
                    syVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        syVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        syVar.getMessagesController().deleteParticipantFromChat(-j10, syVar.getMessagesController().getUser(Long.valueOf(syVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    syVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        syVar.getMessagesController().blockPeer(user.f20215id);
                    }
                }
                syVar.getMessagesController().checkIfFolderEmpty(syVar.V2);
                return;
        }
    }

    public va(sy syVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f6166e = syVar;
        this.f6167f = chat;
        this.f6164b = j3;
        this.f6165c = z10;
        this.h = user;
        this.d = z11;
    }
}
