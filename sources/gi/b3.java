package gi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a50;
import org.telegram.ui.a60;
import org.telegram.ui.bo;
import org.telegram.ui.dl0;
import org.telegram.ui.hm;
import org.telegram.ui.hn;
import org.telegram.ui.ln;
import org.telegram.ui.mj0;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.sm0;
public final class b3 implements RequestDelegate {
    public final int f12442a;
    public final boolean f12443b;
    public final Object f12444c;

    public b3(int i3, Object obj, boolean z10) {
        this.f12442a = i3;
        this.f12444c = obj;
        this.f12443b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12442a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci.v6((c3) this.f12444c, tLObject, this.f12443b, 4));
                return;
            case 1:
                ((VoIPService) this.f12444c).lambda$acknowledgeCall$13(this.f12443b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) this.f12444c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    h9Var.getMessagesController().O3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.f12443b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, h9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ci.v6((hm) this.f12444c, tLObject, this.f12443b, 15));
                return;
            case 4:
                ln lnVar = (ln) this.f12444c;
                if (tLObject instanceof TLRPC.Updates) {
                    lnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new ci.e1(21, lnVar, this.f12443b));
                    return;
                }
                org.telegram.messenger.g0.h3(new hn(lnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new rn((Object) ((bo) this.f12444c), (Object) tL_error, (Object) tLObject, this.f12443b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.e7((hc0) this.f12444c, tL_error, tLObject, this.f12443b));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new rn((Object) ((a50) this.f12444c), (Object) tL_error, (Object) tLObject, this.f12443b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new rn((Object) ((mj0) this.f12444c), (Object) tL_error, (Object) tLObject, this.f12443b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new rn((Object) ((dl0) this.f12444c), (Object) tL_error, (Object) tLObject, this.f12443b, 13));
                return;
            case 10:
                sm0 sm0Var = (sm0) this.f12444c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new a60(sm0Var, tLObject, this.f12443b, 5));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.h3(new rn((Object) ((ra1) this.f12444c), (Object) tL_error, (Object) tLObject, this.f12443b, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new a60((WallpapersListActivity) this.f12444c, tLObject, this.f12443b, 14));
                return;
        }
    }
}
