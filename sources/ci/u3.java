package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.je0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.cr0;
import org.telegram.ui.gh1;
import org.telegram.ui.ip;
import org.telegram.ui.ja0;
import org.telegram.ui.ln;
import org.telegram.ui.mo;
import org.telegram.ui.n70;
import org.telegram.ui.uo;
import org.telegram.ui.xo0;
public final class u3 implements RequestDelegate {
    public final int f5607a;
    public final boolean f5608b;
    public final Object f5609c;

    public u3(int i10, Object obj, boolean z10) {
        this.f5607a = i10;
        this.f5609c = obj;
        this.f5608b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5607a;
        boolean z10 = this.f5608b;
        Object obj = this.f5609c;
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
                org.telegram.ui.l9 l9Var = (org.telegram.ui.l9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    l9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        l9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u3(3, l9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new y0((ln) obj, tLObject, z10, 14));
                return;
            case 5:
                uo uoVar = (uo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    uoVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(20, uoVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new mo(uoVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.s4((ip) obj, tL_error, tLObject, this.f5608b, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((je0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.s4((n70) obj, tL_error, tLObject, this.f5608b, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.s4((bn0) obj, tL_error, tLObject, this.f5608b, 24));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.s4((xo0) obj, tL_error, tLObject, this.f5608b, 27));
                return;
            case 11:
                cr0 cr0Var = (cr0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ja0(cr0Var, tLObject, z10, 3));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.s4((gh1) obj, tL_error, tLObject, this.f5608b, 29));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f31862i0;
                AndroidUtilities.runOnUIThread(new ja0((WallpapersListActivity) obj, tLObject, z10, 10));
                return;
        }
    }
}
