package fi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.f50;
import org.telegram.ui.g60;
import org.telegram.ui.go;
import org.telegram.ui.hl0;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.pj0;
import org.telegram.ui.pn;
import org.telegram.ui.vn;
import org.telegram.ui.xm0;
import org.telegram.ui.za1;
public final class d3 implements RequestDelegate {
    public final int f11783a;
    public final boolean f11784b;
    public final Object f11785c;

    public d3(int i7, Object obj, boolean z9) {
        this.f11783a = i7;
        this.f11785c = obj;
        this.f11784b = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11783a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.u7((e3) this.f11785c, tLObject, this.f11784b, 4));
                return;
            case 1:
                ((VoIPService) this.f11785c).lambda$acknowledgeCall$13(this.f11784b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f11785c;
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
                        boolean z9 = this.f11784b;
                        tL_messages_deletePhoneCallHistory.revoke = z9;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new d3(2, i9Var, z9));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.u7((lm) this.f11785c, tLObject, this.f11784b, 15));
                return;
            case 4:
                pn pnVar = (pn) this.f11785c;
                if (tLObject instanceof TLRPC.Updates) {
                    pnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new bi.k1(21, pnVar, this.f11784b));
                    return;
                }
                org.telegram.messenger.g0.h3(new ln(pnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new vn((Object) ((go) this.f11785c), (Object) tL_error, (Object) tLObject, this.f11784b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ng((mc0) this.f11785c, tL_error, tLObject, this.f11784b));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new vn((Object) ((f50) this.f11785c), (Object) tL_error, (Object) tLObject, this.f11784b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new vn((Object) ((pj0) this.f11785c), (Object) tL_error, (Object) tLObject, this.f11784b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new vn((Object) ((hl0) this.f11785c), (Object) tL_error, (Object) tLObject, this.f11784b, 13));
                return;
            case 10:
                xm0 xm0Var = (xm0) this.f11785c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new g60(xm0Var, tLObject, this.f11784b, 5));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.h3(new vn((Object) ((za1) this.f11785c), (Object) tL_error, (Object) tLObject, this.f11784b, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new g60((WallpapersListActivity) this.f11785c, tLObject, this.f11784b, 14));
                return;
        }
    }
}
