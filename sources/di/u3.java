package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.br0;
import org.telegram.ui.dm0;
import org.telegram.ui.hh1;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.on;
import org.telegram.ui.po;
import org.telegram.ui.xo;
import org.telegram.ui.xo0;
public final class u3 implements RequestDelegate {
    public final int f8230a;
    public final boolean f8231b;
    public final Object f8232c;

    public u3(int i10, Object obj, boolean z10) {
        this.f8230a = i10;
        this.f8232c = obj;
        this.f8231b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f8230a;
        boolean z10 = this.f8231b;
        Object obj = this.f8232c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((w3) obj, tLObject, z10, 1));
                return;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                return;
            case 3:
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    k9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        k9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u3(3, k9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new y0((on) obj, tLObject, z10, 13));
                return;
            case 5:
                xo xoVar = (xo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    xoVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.u(21, xoVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new po(xoVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bi.e4((lp) obj, tL_error, tLObject, this.f8231b, 13));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((ae0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.e4((n70) obj, tL_error, tLObject, this.f8231b, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.e4((bn0) obj, tL_error, tLObject, this.f8231b, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.e4((xo0) obj, tL_error, tLObject, this.f8231b, 26));
                return;
            case 11:
                br0 br0Var = (br0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dm0(br0Var, tLObject, z10, 2));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.e4((hh1) obj, tL_error, tLObject, this.f8231b, 28));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f34248k0;
                AndroidUtilities.runOnUIThread(new dm0((WallpapersListActivity) obj, tLObject, z10, 9));
                return;
        }
    }
}
