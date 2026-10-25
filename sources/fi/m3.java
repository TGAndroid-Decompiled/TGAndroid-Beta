package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ap;
import org.telegram.ui.d80;
import org.telegram.ui.dg1;
import org.telegram.ui.fn;
import org.telegram.ui.go;
import org.telegram.ui.mo;
import org.telegram.ui.po0;
import org.telegram.ui.rq0;
import org.telegram.ui.um0;
import org.telegram.ui.z60;
public final class m3 implements RequestDelegate {
    public final int f11246a;
    public final boolean f11247b;
    public final Object f11248c;

    public m3(int i10, Object obj, boolean z10) {
        this.f11246a = i10;
        this.f11248c = obj;
        this.f11247b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f11246a;
        boolean z10 = this.f11247b;
        Object obj = this.f11248c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.u7((n3) obj, tLObject, z10, 4));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$155(z10, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.ui.o9 o9Var = (org.telegram.ui.o9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    o9Var.getMessagesController().lambda$processUpdates$379(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        o9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new m3(3, o9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bi.u7((fn) obj, tLObject, z10, 15));
                return;
            case 5:
                mo moVar = (mo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    moVar.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bh.n(25, moVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new go(moVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bi.s9((Object) ((ap) obj), (Object) tL_error, (Object) tLObject, this.f11247b, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new kg((te0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.s9((Object) ((z60) obj), (Object) tL_error, (Object) tLObject, this.f11247b, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.s9((Object) ((um0) obj), (Object) tL_error, (Object) tLObject, this.f11247b, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.s9((Object) ((po0) obj), (Object) tL_error, (Object) tLObject, this.f11247b, 27));
                return;
            case 11:
                rq0 rq0Var = (rq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new d80(rq0Var, tLObject, z10, 5));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.s9((Object) ((dg1) obj), (Object) tL_error, (Object) tLObject, this.f11247b, 28));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f37579g0;
                AndroidUtilities.runOnUIThread(new d80((WallpapersListActivity) obj, tLObject, z10, 14));
                return;
        }
    }
}
