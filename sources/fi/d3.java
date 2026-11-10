package fi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.an0;
import org.telegram.ui.cb1;
import org.telegram.ui.i50;
import org.telegram.ui.io;
import org.telegram.ui.j60;
import org.telegram.ui.kl0;
import org.telegram.ui.nm;
import org.telegram.ui.nn;
import org.telegram.ui.rn;
import org.telegram.ui.sj0;
import org.telegram.ui.xn;
public final class d3 implements RequestDelegate {
    public final int f11787a;
    public final boolean f11788b;
    public final Object f11789c;

    public d3(int i7, Object obj, boolean z9) {
        this.f11787a = i7;
        this.f11789c = obj;
        this.f11788b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11787a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.u7((e3) this.f11789c, tLObject, this.f11788b, 4));
                return;
            case 1:
                ((VoIPService) this.f11789c).lambda$acknowledgeCall$13(this.f11788b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f11789c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    i9Var.getMessagesController().O3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z9 = this.f11788b;
                        tL_messages_deletePhoneCallHistory.revoke = z9;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new d3(2, i9Var, z9));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.u7((nm) this.f11789c, tLObject, this.f11788b, 15));
                return;
            case 4:
                rn rnVar = (rn) this.f11789c;
                if (tLObject instanceof TLRPC.Updates) {
                    rnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new bi.k1(21, rnVar, this.f11788b));
                    return;
                }
                org.telegram.messenger.g0.h3(new nn(rnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new xn((Object) ((io) this.f11789c), (Object) tL_error, (Object) tLObject, this.f11788b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new mg((mc0) this.f11789c, tL_error, tLObject, this.f11788b));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new xn((Object) ((i50) this.f11789c), (Object) tL_error, (Object) tLObject, this.f11788b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new xn((Object) ((sj0) this.f11789c), (Object) tL_error, (Object) tLObject, this.f11788b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new xn((Object) ((kl0) this.f11789c), (Object) tL_error, (Object) tLObject, this.f11788b, 13));
                return;
            case 10:
                an0 an0Var = (an0) this.f11789c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new j60(an0Var, tLObject, this.f11788b, 5));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.h3(new xn((Object) ((cb1) this.f11789c), (Object) tL_error, (Object) tLObject, this.f11788b, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new j60((WallpapersListActivity) this.f11789c, tLObject, this.f11788b, 14));
                return;
        }
    }
}
