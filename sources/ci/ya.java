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
import org.telegram.ui.wy;
public final class ya implements Runnable {
    public final int f5841a = 0;
    public final long f5842b;
    public final boolean f5843c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f5844f;
    public final TLObject h;

    public ya(oc ocVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = ocVar;
        this.f5843c = z10;
        this.f5844f = storyItem;
        this.f5842b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f5841a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f5844f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                oc ocVar = (oc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f5843c;
                long j3 = this.f5842b;
                if (!z10) {
                    ai.d2.W = new ai.d2(ocVar.f5207b, ocVar.f5211c, storyItem, j3, storyItem.f18356id, z10, inputGroupCall, true, this.d);
                }
                jc jcVar = ocVar.F;
                if (jcVar != null) {
                    jcVar.f(false);
                }
                ocVar.F = null;
                ocVar.J = 0;
                RectF rectF = ocVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                ocVar.G = AndroidUtilities.dp(8.0f);
                ocVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(ocVar.f5207b, storyItem, null);
                NotificationCenter.getInstance(ocVar.f5211c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f18138id));
                return;
            default:
                wy wyVar = (wy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f5842b;
                boolean z11 = this.f5843c;
                if (chat != null) {
                    wyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        wyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        wyVar.getMessagesController().deleteParticipantFromChat(-j10, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    wyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        wyVar.getMessagesController().blockPeer(user.f18268id);
                    }
                }
                wyVar.getMessagesController().checkIfFolderEmpty(wyVar.V2);
                return;
        }
    }

    public ya(wy wyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = wyVar;
        this.f5844f = chat;
        this.f5842b = j3;
        this.f5843c = z10;
        this.h = user;
        this.d = z11;
    }
}
