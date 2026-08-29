package nh;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;
public final class t9 implements Runnable {
    public final int f18683a = 0;
    public final long f18684b;
    public final boolean f18685c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f18686e;
    public final TLObject f18687f;
    public final TLObject h;

    public t9(gb gbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f18686e = gbVar;
        this.f18685c = z10;
        this.f18687f = storyItem;
        this.f18684b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f18683a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f18687f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f18686e;
        switch (i10) {
            case 0:
                gb gbVar = (gb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f18685c;
                long j10 = this.f18684b;
                if (!z10) {
                    lh.d1.S = new lh.d1(gbVar.f17739b, gbVar.f17743c, storyItem, j10, storyItem.f22629id, z10, inputGroupCall, true, this.d);
                }
                bb bbVar = gbVar.B;
                if (bbVar != null) {
                    bbVar.f(false);
                }
                gbVar.B = null;
                gbVar.F = 0;
                RectF rectF = gbVar.D;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                gbVar.C = AndroidUtilities.dp(8.0f);
                gbVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(gbVar.f17739b, storyItem, null);
                NotificationCenter.getInstance(gbVar.f17743c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f22409id));
                return;
            default:
                fy fyVar = (fy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f18684b;
                boolean z11 = this.f18685c;
                if (chat != null) {
                    fyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        fyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        fyVar.getMessagesController().deleteParticipantFromChat(-j11, fyVar.getMessagesController().getUser(Long.valueOf(fyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    fyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        fyVar.getMessagesController().blockPeer(user.f22539id);
                    }
                }
                fyVar.getMessagesController().checkIfFolderEmpty(fyVar.R2);
                return;
        }
    }

    public t9(fy fyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.f18686e = fyVar;
        this.f18687f = chat;
        this.f18684b = j10;
        this.f18685c = z10;
        this.h = user;
        this.d = z11;
    }
}
