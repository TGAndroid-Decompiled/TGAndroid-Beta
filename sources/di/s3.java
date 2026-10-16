package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.en0;
import org.telegram.ui.fr0;
import org.telegram.ui.gm0;
import org.telegram.ui.np;
import org.telegram.ui.oh1;
import org.telegram.ui.qn;
import org.telegram.ui.ro;
import org.telegram.ui.s70;
import org.telegram.ui.zo;
public final class s3 implements RequestDelegate {
    public final int f7752a;
    public final boolean f7753b;
    public final Object f7754c;

    public s3(int i10, Object obj, boolean z10) {
        this.f7752a = i10;
        this.f7754c = obj;
        this.f7753b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f7752a;
        boolean z10 = this.f7753b;
        Object obj = this.f7754c;
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
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    n9Var.getMessagesController().lambda$processUpdates$377(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(3, n9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new x0((qn) obj, tLObject, z10, 13));
                return;
            case 5:
                zo zoVar = (zo) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    zoVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.t(22, zoVar, z10));
                    return;
                }
                AndroidUtilities.runOnUIThread(new ro(zoVar, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bi.h4((np) obj, tL_error, tLObject, this.f7753b, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ze0((af0) obj, tL_error, tLObject, z10));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.h4((s70) obj, tL_error, tLObject, this.f7753b, 21));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.h4((en0) obj, tL_error, tLObject, this.f7753b, 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.h4((ap0) obj, tL_error, tLObject, this.f7753b, 25));
                return;
            case 11:
                fr0 fr0Var = (fr0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gm0(fr0Var, tLObject, z10, 2));
                    return;
                }
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.h4((oh1) obj, tL_error, tLObject, this.f7753b, 27));
                return;
            default:
                int[][] iArr = WallpapersListActivity.f33674k0;
                AndroidUtilities.runOnUIThread(new gm0((WallpapersListActivity) obj, tLObject, z10, 11));
                return;
        }
    }
}
