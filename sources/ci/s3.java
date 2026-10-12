package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.dm0;
import org.telegram.ui.dr0;
import org.telegram.ui.kh1;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.pn;
import org.telegram.ui.qo;
import org.telegram.ui.xo;
import org.telegram.ui.xo0;
public final class s3 implements RequestDelegate {
    public final int f5936a;
    public final boolean f5937b;
    public final Object f5938c;

    public s3(int i10, Object obj, boolean z10) {
        this.f5936a = i10;
        this.f5938c = obj;
        this.f5937b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5936a;
        boolean z10 = this.f5937b;
        Object obj = this.f5938c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((u3) obj, tLObject, z10, 1));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$155(z10, tLObject, tL_error);
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
                    m9Var.getMessagesController().lambda$processUpdates$377(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(3, m9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new x0((pn) obj, tLObject, z10, 13));
                return;
            case 5:
                xo xoVar = (xo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    xoVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(22, xoVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new qo(xoVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.t4((lp) obj, tL_error, tLObject, this.f5937b, 13));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((ff0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.t4((n70) obj, tL_error, tLObject, this.f5937b, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.t4((bn0) obj, tL_error, tLObject, this.f5937b, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.t4((xo0) obj, tL_error, tLObject, this.f5937b, 26));
                return;
            case 11:
                dr0 dr0Var = (dr0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dm0(dr0Var, tLObject, z10, 2));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.t4((kh1) obj, tL_error, tLObject, this.f5937b, 28));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f35610k0;
                AndroidUtilities.runOnUIThread(new dm0((WallpapersListActivity) obj, tLObject, z10, 11));
                return;
        }
    }
}
