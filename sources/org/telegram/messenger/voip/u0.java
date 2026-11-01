package org.telegram.messenger.voip;

import bi.n4;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cp;
import org.telegram.ui.d60;
import org.telegram.ui.fn;
import org.telegram.ui.ho;
import org.telegram.ui.j9;
import org.telegram.ui.jo0;
import org.telegram.ui.kp;
import org.telegram.ui.oo;
import org.telegram.ui.qm0;
import org.telegram.ui.rc1;
import org.telegram.ui.wk0;
import org.telegram.ui.zj0;
import vh.j2;
public final class u0 implements RequestDelegate {
    public final int f18869a;
    public final boolean f18870b;
    public final Object f18871c;

    public u0(int i10, Object obj, boolean z10) {
        this.f18869a = i10;
        this.f18871c = obj;
        this.f18870b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18869a) {
            case 0:
                ((VoIPService) this.f18871c).lambda$acknowledgeCall$13(this.f18870b, tLObject, tL_error);
                return;
            case 1:
                j9 j9Var = (j9) this.f18871c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().L3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.f18870b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u0(1, j9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.g3(new ag.j0((fn) this.f18871c, tLObject, this.f18870b, 12));
                return;
            case 3:
                oo ooVar = (oo) this.f18871c;
                if (tLObject instanceof TLRPC.Updates) {
                    ooVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new k2.v(11, ooVar, this.f18870b));
                    return;
                }
                org.telegram.messenger.i0.g3(new ho(ooVar, 3));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new n4((cp) this.f18871c, tL_error, tLObject, this.f18870b, 28));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new jg((hd0) this.f18871c, tL_error, tLObject, this.f18870b));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new kp((d60) this.f18871c, tL_error, tLObject, this.f18870b, 7));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new kp((wk0) this.f18871c, tL_error, tLObject, this.f18870b, 8));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new kp((qm0) this.f18871c, tL_error, tLObject, this.f18870b, 11));
                return;
            case 9:
                jo0 jo0Var = (jo0) this.f18871c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new zj0(jo0Var, tLObject, this.f18870b, 2));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.g3(new kp((rc1) this.f18871c, tL_error, tLObject, this.f18870b, 12));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new zj0((WallpapersListActivity) this.f18871c, tLObject, this.f18870b, 11));
                return;
            default:
                org.telegram.messenger.i0.g3(new zj0((j2) this.f18871c, tLObject, this.f18870b, 18));
                return;
        }
    }
}
