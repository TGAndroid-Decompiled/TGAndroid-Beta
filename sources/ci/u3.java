package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.an0;
import org.telegram.ui.ar0;
import org.telegram.ui.bm0;
import org.telegram.ui.hh1;
import org.telegram.ui.kp;
import org.telegram.ui.n70;
import org.telegram.ui.nn;
import org.telegram.ui.oo;
import org.telegram.ui.wo;
import org.telegram.ui.wo0;
public final class u3 implements RequestDelegate {
    public final int f5604a;
    public final boolean f5605b;
    public final Object f5606c;

    public u3(int i10, Object obj, boolean z10) {
        this.f5604a = i10;
        this.f5606c = obj;
        this.f5605b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5604a;
        boolean z10 = this.f5605b;
        Object obj = this.f5606c;
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
                AndroidUtilities.runOnUIThread(new y0((nn) obj, tLObject, z10, 13));
                return;
            case 5:
                wo woVar = (wo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    woVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(20, woVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new oo(woVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.s4((kp) obj, tL_error, tLObject, this.f5605b, 13));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((ae0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.s4((n70) obj, tL_error, tLObject, this.f5605b, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.s4((an0) obj, tL_error, tLObject, this.f5605b, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.s4((wo0) obj, tL_error, tLObject, this.f5605b, 26));
                return;
            case 11:
                ar0 ar0Var = (ar0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bm0(ar0Var, tLObject, z10, 2));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.s4((hh1) obj, tL_error, tLObject, this.f5605b, 28));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f31615k0;
                AndroidUtilities.runOnUIThread(new bm0((WallpapersListActivity) obj, tLObject, z10, 9));
                return;
        }
    }
}
