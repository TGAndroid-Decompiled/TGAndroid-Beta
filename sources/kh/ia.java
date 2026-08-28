package kh;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
public final class ia implements Runnable {
    public final int f15434a = 0;
    public final long f15435b;
    public final boolean f15436c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f15437e;
    public final TLObject f15438f;
    public final TLObject h;

    public ia(wb wbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f15437e = wbVar;
        this.f15436c = z10;
        this.f15438f = storyItem;
        this.f15435b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i9 = this.f15434a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f15438f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15437e;
        switch (i9) {
            case 0:
                wb wbVar = (wb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f15436c;
                long j10 = this.f15435b;
                if (!z10) {
                    ih.f1.S = new ih.f1(wbVar.f16249b, wbVar.f16253c, storyItem, j10, storyItem.f22617id, z10, inputGroupCall, true, this.d);
                }
                rb rbVar = wbVar.B;
                if (rbVar != null) {
                    rbVar.f(false);
                }
                wbVar.B = null;
                wbVar.F = 0;
                RectF rectF = wbVar.D;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                wbVar.C = AndroidUtilities.dp(8.0f);
                wbVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(wbVar.f16249b, storyItem, null);
                NotificationCenter.getInstance(wbVar.f16253c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f22397id));
                return;
            default:
                dy dyVar = (dy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f15435b;
                boolean z11 = this.f15436c;
                if (chat != null) {
                    dyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        dyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        dyVar.getMessagesController().deleteParticipantFromChat(-j11, dyVar.getMessagesController().getUser(Long.valueOf(dyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    dyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        dyVar.getMessagesController().blockPeer(user.f22527id);
                    }
                }
                dyVar.getMessagesController().checkIfFolderEmpty(dyVar.R2);
                return;
        }
    }

    public ia(dy dyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.f15437e = dyVar;
        this.f15438f = chat;
        this.f15435b = j10;
        this.f15436c = z10;
        this.h = user;
        this.d = z11;
    }
}
