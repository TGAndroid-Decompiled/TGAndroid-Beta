package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.md0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aq0;
import org.telegram.ui.co;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.jo;
import org.telegram.ui.km0;
import org.telegram.ui.op0;
import org.telegram.ui.w60;
import org.telegram.ui.xo;
import org.telegram.ui.zf1;

public final class n3 implements RequestDelegate {

    public final int f16424a;

    public final boolean f16425b;

    public final Object f16426c;

    public n3(int i10, Object obj, boolean z10) {
        this.f16424a = i10;
        this.f16426c = obj;
        this.f16425b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16424a;
        int i11 = 3;
        int i12 = 0;
        boolean z10 = this.f16425b;
        Object obj = this.f16426c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new hh.t5((o3) obj, tLObject, z10, 4));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                break;
            case 3:
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new n3(i11, j9Var, z10));
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new hh.t5((dn) obj, tLObject, z10, 11));
                break;
            case 5:
                jo joVar = (jo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new co(joVar, i11));
                } else {
                    joVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fh.f(25, joVar, z10));
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.c((xo) obj, tL_error, tLObject, this.f16425b, 10));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((md0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new cg.c((w60) obj, tL_error, tLObject, this.f16425b, 19));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new cg.c((km0) obj, tL_error, tLObject, this.f16425b, 20));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new cg.c((do0) obj, tL_error, tLObject, this.f16425b, 23));
                break;
            case 11:
                aq0 aq0Var = (aq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new op0(aq0Var, tLObject, z10, i12));
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new cg.c((zf1) obj, tL_error, tLObject, this.f16425b, 25));
                break;
            default:
                int[][] iArr = WallpapersListActivity.f36299g0;
                AndroidUtilities.runOnUIThread(new op0((WallpapersListActivity) obj, tLObject, z10, 7));
                break;
        }
    }
}
