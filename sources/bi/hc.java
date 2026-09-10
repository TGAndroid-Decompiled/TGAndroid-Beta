package bi;

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
public final class hc implements Runnable {
    public final int f2806a = 0;
    public final long f2807b;
    public final boolean f2808c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f2809f;
    public final TLObject h;

    public hc(ce ceVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = ceVar;
        this.f2808c = z10;
        this.f2809f = storyItem;
        this.f2807b = j3;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f2806a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f2809f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                ce ceVar = (ce) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f2808c;
                long j3 = this.f2807b;
                if (!z10) {
                    zh.t0.W = new zh.t0(ceVar.f2433b, ceVar.f2437c, storyItem, j3, storyItem.f17435id, z10, inputGroupCall, true, this.d);
                }
                xd xdVar = ceVar.F;
                if (xdVar != null) {
                    xdVar.f(false);
                }
                ceVar.F = null;
                ceVar.J = 0;
                RectF rectF = ceVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                ceVar.G = AndroidUtilities.dp(8.0f);
                ceVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(ceVar.f2433b, storyItem, null);
                NotificationCenter.getInstance(ceVar.f2437c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f17212id));
                return;
            default:
                wy wyVar = (wy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f2807b;
                boolean z11 = this.f2808c;
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
                        wyVar.getMessagesController().blockPeer(user.f17342id);
                    }
                }
                wyVar.getMessagesController().checkIfFolderEmpty(wyVar.V2);
                return;
        }
    }

    public hc(wy wyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = wyVar;
        this.f2809f = chat;
        this.f2807b = j3;
        this.f2808c = z10;
        this.h = user;
        this.d = z11;
    }
}
