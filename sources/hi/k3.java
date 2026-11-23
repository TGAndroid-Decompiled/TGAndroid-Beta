package hi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a80;
import org.telegram.ui.an0;
import org.telegram.ui.g50;
import org.telegram.ui.io;
import org.telegram.ui.kl0;
import org.telegram.ui.mm;
import org.telegram.ui.mn;
import org.telegram.ui.rn;
import org.telegram.ui.tj0;
import org.telegram.ui.xn;
import org.telegram.ui.za1;
public final class k3 implements RequestDelegate {
    public final int f14769a;
    public final boolean f14770b;
    public final Object f14771c;

    public k3(int i7, Object obj, boolean z10) {
        this.f14769a = i7;
        this.f14771c = obj;
        this.f14770b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14769a) {
            case 0:
                org.telegram.messenger.g0.g3(new di.p6((l3) this.f14771c, tLObject, this.f14770b, 4));
                return;
            case 1:
                ((VoIPService) this.f14771c).lambda$acknowledgeCall$13(this.f14770b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.f14771c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().V3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.f14770b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new k3(2, j9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.p6((mm) this.f14771c, tLObject, this.f14770b, 15));
                return;
            case 4:
                rn rnVar = (rn) this.f14771c;
                if (tLObject instanceof TLRPC.Updates) {
                    rnVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new ch.k(21, rnVar, this.f14770b));
                    return;
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new xn((Object) ((io) this.f14771c), (Object) tL_error, (Object) tLObject, this.f14770b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((wc0) this.f14771c, tL_error, tLObject, this.f14770b));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new xn((Object) ((g50) this.f14771c), (Object) tL_error, (Object) tLObject, this.f14770b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new xn((Object) ((tj0) this.f14771c), (Object) tL_error, (Object) tLObject, this.f14770b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new xn((Object) ((kl0) this.f14771c), (Object) tL_error, (Object) tLObject, this.f14770b, 13));
                return;
            case 10:
                an0 an0Var = (an0) this.f14771c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new a80(an0Var, tLObject, this.f14770b, 4));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.g3(new xn((Object) ((za1) this.f14771c), (Object) tL_error, (Object) tLObject, this.f14770b, 14));
                return;
            default:
                org.telegram.messenger.g0.g3(new a80((WallpapersListActivity) this.f14771c, tLObject, this.f14770b, 13));
                return;
        }
    }
}
