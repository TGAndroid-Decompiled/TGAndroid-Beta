package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.fn;
import org.telegram.ui.fo;
import org.telegram.ui.hm0;
import org.telegram.ui.ko;
import org.telegram.ui.mp0;
import org.telegram.ui.v60;
import org.telegram.ui.yo;
import org.telegram.ui.zp0;
public final class l3 implements RequestDelegate {
    public final int f18039a;
    public final boolean f18040b;
    public final Object f18041c;

    public l3(int i10, Object obj, boolean z10) {
        this.f18039a = i10;
        this.f18041c = obj;
        this.f18040b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18039a;
        boolean z10 = this.f18040b;
        Object obj = this.f18041c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new jh.r5((m3) obj, tLObject, z10, 4));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    h9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new l3(3, h9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new jh.r5((fn) obj, tLObject, z10, 11));
                return;
            case 5:
                ko koVar = (ko) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    koVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new hh.f(24, koVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new fo(koVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ag.w0((yo) obj, tL_error, tLObject, this.f18040b, 11));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((vd0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ag.w0((v60) obj, tL_error, tLObject, this.f18040b, 20));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ag.w0((hm0) obj, tL_error, tLObject, this.f18040b, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ag.w0((bo0) obj, tL_error, tLObject, this.f18040b, 24));
                return;
            case 11:
                zp0 zp0Var = (zp0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new mp0(zp0Var, tLObject, z10, 0));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ag.w0((cg1) obj, tL_error, tLObject, this.f18040b, 26));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f36361g0;
                AndroidUtilities.runOnUIThread(new mp0((WallpapersListActivity) obj, tLObject, z10, 7));
                return;
        }
    }
}
