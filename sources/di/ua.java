package di;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yy;
public final class ua implements Runnable {
    public final int f7907a = 0;
    public final long f7908b;
    public final boolean f7909c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f7910f;
    public final TLObject h;

    public ua(kc kcVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = kcVar;
        this.f7909c = z10;
        this.f7910f = storyItem;
        this.f7908b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f7907a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f7910f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                kc kcVar = (kc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f7909c;
                long j10 = this.f7908b;
                if (!z10) {
                    bi.t1.W = new bi.t1(kcVar.f7240b, kcVar.f7244c, storyItem, j10, storyItem.f19151id, z10, inputGroupCall, true, this.d);
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
                kcVar.p(true);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(kcVar.f7240b, storyItem, null);
                NotificationCenter.getInstance(kcVar.f7244c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f18933id));
                return;
            default:
                yy yyVar = (yy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f7908b;
                boolean z11 = this.f7909c;
                if (chat != null) {
                    yyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        yyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        yyVar.getMessagesController().deleteParticipantFromChat(-j11, yyVar.getMessagesController().getUser(Long.valueOf(yyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    yyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        yyVar.getMessagesController().blockPeer(user.f19063id);
                    }
                }
                yyVar.getMessagesController().checkIfFolderEmpty(yyVar.W2);
                return;
        }
    }

    public ua(yy yyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = yyVar;
        this.f7910f = chat;
        this.f7908b = j10;
        this.f7909c = z10;
        this.h = user;
        this.d = z11;
    }
}
