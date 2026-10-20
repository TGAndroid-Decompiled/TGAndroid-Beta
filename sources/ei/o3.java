package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bo;
import org.telegram.ui.cn;
import org.telegram.ui.eo0;
import org.telegram.ui.im0;
import org.telegram.ui.io;
import org.telegram.ui.jq0;
import org.telegram.ui.u60;
import org.telegram.ui.vf1;
import org.telegram.ui.wo;
import org.telegram.ui.x70;
public final class o3 implements RequestDelegate {
    public final int f9548a;
    public final boolean f9549b;
    public final Object f9550c;

    public o3(int i10, Object obj, boolean z10) {
        this.f9548a = i10;
        this.f9550c = obj;
        this.f9549b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9548a;
        boolean z10 = this.f9549b;
        Object obj = this.f9550c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.y7((p3) obj, tLObject, z10, 4));
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
                        m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new o3(3, m9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ai.y7((cn) obj, tLObject, z10, 16));
                return;
            case 5:
                io ioVar = (io) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    ioVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.t(25, ioVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new bo(ioVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((wo) obj), (Object) tL_error, (Object) tLObject, this.f9549b, 13));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((ue0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((u60) obj), (Object) tL_error, (Object) tLObject, this.f9549b, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((im0) obj), (Object) tL_error, (Object) tLObject, this.f9549b, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((eo0) obj), (Object) tL_error, (Object) tLObject, this.f9549b, 26));
                return;
            case 11:
                jq0 jq0Var = (jq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new x70(jq0Var, tLObject, z10, 5));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((vf1) obj), (Object) tL_error, (Object) tLObject, this.f9549b, 27));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f35206k0;
                AndroidUtilities.runOnUIThread(new x70((WallpapersListActivity) obj, tLObject, z10, 14));
                return;
        }
    }
}
