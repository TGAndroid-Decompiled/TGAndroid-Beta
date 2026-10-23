package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bg1;
import org.telegram.ui.dn;
import org.telegram.ui.eo;
import org.telegram.ui.io0;
import org.telegram.ui.ko;
import org.telegram.ui.mm0;
import org.telegram.ui.mq0;
import org.telegram.ui.v90;
import org.telegram.ui.y60;
import org.telegram.ui.yo;
public final class o3 implements RequestDelegate {
    public final int f9562a;
    public final boolean f9563b;
    public final Object f9564c;

    public o3(int i10, Object obj, boolean z10) {
        this.f9562a = i10;
        this.f9564c = obj;
        this.f9563b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9562a;
        boolean z10 = this.f9563b;
        Object obj = this.f9564c;
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
                AndroidUtilities.runOnUIThread(new ai.y7((dn) obj, tLObject, z10, 15));
                return;
            case 5:
                ko koVar = (ko) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    koVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.t(25, koVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((yo) obj), (Object) tL_error, (Object) tLObject, this.f9563b, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((xe0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((y60) obj), (Object) tL_error, (Object) tLObject, this.f9563b, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((mm0) obj), (Object) tL_error, (Object) tLObject, this.f9563b, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((io0) obj), (Object) tL_error, (Object) tLObject, this.f9563b, 27));
                return;
            case 11:
                mq0 mq0Var = (mq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new v90(mq0Var, tLObject, z10, 4));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.x9((Object) ((bg1) obj), (Object) tL_error, (Object) tLObject, this.f9563b, 28));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f35515k0;
                AndroidUtilities.runOnUIThread(new v90((WallpapersListActivity) obj, tLObject, z10, 13));
                return;
        }
    }
}
