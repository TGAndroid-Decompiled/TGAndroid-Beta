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
import org.telegram.ui.vy;
public final class va implements Runnable {
    public final int f6162a = 0;
    public final long f6163b;
    public final boolean f6164c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f6165e;
    public final TLObject f6166f;
    public final TLObject h;

    public va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f6165e = lcVar;
        this.f6164c = z10;
        this.f6166f = storyItem;
        this.f6163b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f6162a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f6166f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f6165e;
        switch (i10) {
            case 0:
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f6164c;
                long j3 = this.f6163b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.f5459b, lcVar.f5463c, storyItem, j3, storyItem.f20042id, z10, inputGroupCall, true, this.d);
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
                U.getOrCreateStoryViewer().F(lcVar.f5459b, storyItem, null);
                NotificationCenter.getInstance(lcVar.f5463c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f19820id));
                return;
            default:
                vy vyVar = (vy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f6163b;
                boolean z11 = this.f6164c;
                if (chat != null) {
                    vyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        vyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        vyVar.getMessagesController().deleteParticipantFromChat(-j10, vyVar.getMessagesController().getUser(Long.valueOf(vyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    vyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        vyVar.getMessagesController().blockPeer(user.f19950id);
                    }
                }
                vyVar.getMessagesController().checkIfFolderEmpty(vyVar.V2);
                return;
        }
    }

    public va(vy vyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.f6165e = vyVar;
        this.f6166f = chat;
        this.f6163b = j3;
        this.f6164c = z10;
        this.h = user;
        this.d = z11;
    }
}
