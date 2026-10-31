package org.telegram.messenger.voip;

import bi.n4;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bk0;
import org.telegram.ui.cp;
import org.telegram.ui.e60;
import org.telegram.ui.fn;
import org.telegram.ui.ho;
import org.telegram.ui.j9;
import org.telegram.ui.kp;
import org.telegram.ui.lo0;
import org.telegram.ui.oo;
import org.telegram.ui.sm0;
import org.telegram.ui.tc1;
import org.telegram.ui.yk0;
import vh.j2;
public final class u0 implements RequestDelegate {
    public final int f18709a;
    public final boolean f18710b;
    public final Object f18711c;

    public u0(int i10, Object obj, boolean z10) {
        this.f18709a = i10;
        this.f18711c = obj;
        this.f18710b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18709a) {
            case 0:
                ((VoIPService) this.f18711c).lambda$acknowledgeCall$13(this.f18710b, tLObject, tL_error);
                return;
            case 1:
                j9 j9Var = (j9) this.f18711c;
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
                        boolean z10 = this.f18710b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u0(1, j9Var, z10));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.g3(new ag.j0((fn) this.f18711c, tLObject, this.f18710b, 12));
                return;
            case 3:
                oo ooVar = (oo) this.f18711c;
                if (tLObject instanceof TLRPC.Updates) {
                    ooVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new k2.v(11, ooVar, this.f18710b));
                    return;
                }
                org.telegram.messenger.i0.g3(new ho(ooVar, 3));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new n4((cp) this.f18711c, tL_error, tLObject, this.f18710b, 28));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new jg((hd0) this.f18711c, tL_error, tLObject, this.f18710b));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new kp((e60) this.f18711c, tL_error, tLObject, this.f18710b, 7));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new kp((yk0) this.f18711c, tL_error, tLObject, this.f18710b, 8));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new kp((sm0) this.f18711c, tL_error, tLObject, this.f18710b, 11));
                return;
            case 9:
                lo0 lo0Var = (lo0) this.f18711c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new bk0(lo0Var, tLObject, this.f18710b, 2));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.g3(new kp((tc1) this.f18711c, tL_error, tLObject, this.f18710b, 12));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new bk0((WallpapersListActivity) this.f18711c, tLObject, this.f18710b, 11));
                return;
            default:
                org.telegram.messenger.i0.g3(new bk0((j2) this.f18711c, tLObject, this.f18710b, 18));
                return;
        }
    }
}
