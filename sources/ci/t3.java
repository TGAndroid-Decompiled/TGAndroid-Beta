package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.me0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ha0;
import org.telegram.ui.hp;
import org.telegram.ui.kn;
import org.telegram.ui.lo;
import org.telegram.ui.m70;
import org.telegram.ui.so0;
import org.telegram.ui.to;
import org.telegram.ui.wm0;
import org.telegram.ui.wq0;
import org.telegram.ui.zg1;
public final class t3 implements RequestDelegate {
    public final int f5960a;
    public final boolean f5961b;
    public final Object f5962c;

    public t3(int i10, Object obj, boolean z10) {
        this.f5960a = i10;
        this.f5962c = obj;
        this.f5961b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5960a;
        boolean z10 = this.f5961b;
        Object obj = this.f5962c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((v3) obj, tLObject, z10, 1));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    m9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new t3(3, m9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new y0((kn) obj, tLObject, z10, 14));
                return;
            case 5:
                to toVar = (to) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    toVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(21, toVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lo(toVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.s4((hp) obj, tL_error, tLObject, this.f5961b, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((me0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.s4((m70) obj, tL_error, tLObject, this.f5961b, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.s4((wm0) obj, tL_error, tLObject, this.f5961b, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.s4((so0) obj, tL_error, tLObject, this.f5961b, 27));
                return;
            case 11:
                wq0 wq0Var = (wq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ha0(wq0Var, tLObject, z10, 3));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.s4((zg1) obj, tL_error, tLObject, this.f5961b, 29));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f34613i0;
                AndroidUtilities.runOnUIThread(new ha0((WallpapersListActivity) obj, tLObject, z10, 10));
                return;
        }
    }
}
