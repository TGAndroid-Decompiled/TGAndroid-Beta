package hi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.yf;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.e50;
import org.telegram.ui.f60;
import org.telegram.ui.ho;
import org.telegram.ui.jl0;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.qn;
import org.telegram.ui.sj0;
import org.telegram.ui.wn;
import org.telegram.ui.xa1;
import org.telegram.ui.ym0;
public final class b3 implements RequestDelegate {
    public final int f13921a;
    public final boolean f13922b;
    public final Object f13923c;

    public b3(int i7, Object obj, boolean z10) {
        this.f13921a = i7;
        this.f13923c = obj;
        this.f13922b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13921a) {
            case 0:
                org.telegram.messenger.g0.h3(new di.m6((c3) this.f13923c, tLObject, this.f13922b, 4));
                return;
            case 1:
                ((VoIPService) this.f13923c).lambda$acknowledgeCall$13(this.f13922b, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f13923c;
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
                        boolean z10 = this.f13922b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, i9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.h3(new di.m6((lm) this.f13923c, tLObject, this.f13922b, 15));
                return;
            case 4:
                qn qnVar = (qn) this.f13923c;
                if (tLObject instanceof TLRPC.Updates) {
                    qnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new ai.q(22, qnVar, this.f13922b));
                    return;
                }
                org.telegram.messenger.g0.h3(new ln(qnVar, 3));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new wn((Object) ((ho) this.f13923c), (Object) tL_error, (Object) tLObject, this.f13922b, 0));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new yf((nc0) this.f13923c, tL_error, tLObject, this.f13922b));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new wn((Object) ((e50) this.f13923c), (Object) tL_error, (Object) tLObject, this.f13922b, 9));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new wn((Object) ((sj0) this.f13923c), (Object) tL_error, (Object) tLObject, this.f13922b, 10));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new wn((Object) ((jl0) this.f13923c), (Object) tL_error, (Object) tLObject, this.f13922b, 13));
                return;
            case 10:
                ym0 ym0Var = (ym0) this.f13923c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new f60(ym0Var, tLObject, this.f13922b, 5));
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.g0.h3(new wn((Object) ((xa1) this.f13923c), (Object) tL_error, (Object) tLObject, this.f13922b, 14));
                return;
            default:
                org.telegram.messenger.g0.h3(new f60((WallpapersListActivity) this.f13923c, tLObject, this.f13922b, 14));
                return;
        }
    }
}
