package hi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a80;
import org.telegram.ui.bb1;
import org.telegram.ui.cn0;
import org.telegram.ui.h50;
import org.telegram.ui.jo;
import org.telegram.ui.ml0;
import org.telegram.ui.mm;
import org.telegram.ui.mn;
import org.telegram.ui.rn;
import org.telegram.ui.vj0;
import org.telegram.ui.yn;
public final class c3 implements RequestDelegate {
    public final int f14308a;
    public final boolean f14309b;
    public final Object f14310c;

    public c3(int i7, Object obj, boolean z10) {
        this.f14308a = i7;
        this.f14310c = obj;
        this.f14309b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14308a) {
            case 0:
                org.telegram.messenger.g0.g3(new di.p6((d3) this.f14310c, tLObject, this.f14309b, 4));
                return;
            case 1:
                ((VoIPService) this.f14310c).lambda$acknowledgeCall$13(this.f14309b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f14310c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    i9Var.getMessagesController().V3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.f14309b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new c3(2, i9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.p6((mm) this.f14310c, tLObject, this.f14309b, 15));
                return;
            case 4:
                rn rnVar = (rn) this.f14310c;
                if (tLObject instanceof TLRPC.Updates) {
                    rnVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new ch.k(21, rnVar, this.f14309b));
                    return;
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new yn((Object) ((jo) this.f14310c), (Object) tL_error, (Object) tLObject, this.f14309b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((xc0) this.f14310c, tL_error, tLObject, this.f14309b));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new yn((Object) ((h50) this.f14310c), (Object) tL_error, (Object) tLObject, this.f14309b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new yn((Object) ((vj0) this.f14310c), (Object) tL_error, (Object) tLObject, this.f14309b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new yn((Object) ((ml0) this.f14310c), (Object) tL_error, (Object) tLObject, this.f14309b, 13));
                return;
            case 10:
                cn0 cn0Var = (cn0) this.f14310c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new a80(cn0Var, tLObject, this.f14309b, 4));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.g3(new yn((Object) ((bb1) this.f14310c), (Object) tL_error, (Object) tLObject, this.f14309b, 14));
                return;
            default:
                org.telegram.messenger.g0.g3(new a80((WallpapersListActivity) this.f14310c, tLObject, this.f14309b, 13));
                return;
        }
    }
}
