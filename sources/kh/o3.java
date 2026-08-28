package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.bo;
import org.telegram.ui.cn;
import org.telegram.ui.co0;
import org.telegram.ui.ho;
import org.telegram.ui.jm0;
import org.telegram.ui.np0;
import org.telegram.ui.t60;
import org.telegram.ui.vo;
import org.telegram.ui.zp0;
public final class o3 implements RequestDelegate {
    public final int f15788a;
    public final boolean f15789b;
    public final Object f15790c;

    public o3(int i9, Object obj, boolean z10) {
        this.f15788a = i9;
        this.f15790c = obj;
        this.f15789b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f15788a;
        boolean z10 = this.f15789b;
        Object obj = this.f15790c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new gh.u5((p3) obj, tLObject, z10, 4));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    i9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new o3(3, i9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gh.u5((cn) obj, tLObject, z10, 11));
                return;
            case 5:
                ho hoVar = (ho) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    hoVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new eh.f(25, hoVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new bo(hoVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bg.d((vo) obj, tL_error, tLObject, this.f15789b, 11));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((hd0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bg.d((t60) obj, tL_error, tLObject, this.f15789b, 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bg.d((jm0) obj, tL_error, tLObject, this.f15789b, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new bg.d((co0) obj, tL_error, tLObject, this.f15789b, 24));
                return;
            case 11:
                zp0 zp0Var = (zp0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new np0(zp0Var, tLObject, z10, 0));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bg.d((ag1) obj, tL_error, tLObject, this.f15789b, 26));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f36296g0;
                AndroidUtilities.runOnUIThread(new np0((WallpapersListActivity) obj, tLObject, z10, 7));
                return;
        }
    }
}
