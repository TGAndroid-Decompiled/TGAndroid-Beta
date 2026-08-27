package lh;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;

public final class fa implements Runnable {

    public final int f16011a = 0;

    public final long f16012b;

    public final boolean f16013c;
    public final boolean d;

    public final NotificationCenter.NotificationCenterDelegate f16014e;

    public final TLObject f16015f;
    public final TLObject h;

    public fa(sb sbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.f16014e = sbVar;
        this.f16013c = z10;
        this.f16015f = storyItem;
        this.f16012b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f16011a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f16015f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f16014e;
        switch (i10) {
            case 0:
                sb sbVar = (sb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f16013c;
                long j10 = this.f16012b;
                if (!z10) {
                    jh.d1.S = new jh.d1(sbVar.f16745b, sbVar.f16749c, storyItem, j10, storyItem.f22617id, z10, inputGroupCall, true, this.d);
                }
                nb nbVar = sbVar.B;
                if (nbVar != null) {
                    nbVar.f(false);
                }
                sbVar.B = null;
                sbVar.F = 0;
                RectF rectF = sbVar.D;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                sbVar.C = AndroidUtilities.dp(8.0f);
                sbVar.q(true);
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                n2VarU.getOrCreateStoryViewer().G(sbVar.f16745b, storyItem, null);
                NotificationCenter.getInstance(sbVar.f16749c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f22397id));
                break;
            default:
                gy gyVar = (gy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.f16012b;
                boolean z11 = this.f16013c;
                if (chat != null) {
                    gyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        gyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        gyVar.getMessagesController().deleteParticipantFromChat(-j11, gyVar.getMessagesController().getUser(Long.valueOf(gyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    gyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        gyVar.getMessagesController().blockPeer(user.f22527id);
                    }
                }
                gyVar.getMessagesController().checkIfFolderEmpty(gyVar.R2);
                break;
        }
    }

    public fa(gy gyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.f16014e = gyVar;
        this.f16015f = chat;
        this.f16012b = j10;
        this.f16013c = z10;
        this.h = user;
        this.d = z11;
    }
}
