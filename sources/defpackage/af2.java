package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class af2 implements df2 {
    public final kf2 a;

    public af2(kf2 kf2Var) {
        this.a = kf2Var;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.a.v0(user);
    }

    @Override
    public final void b(long j) {
        kf2 kf2Var = this.a;
        na7 messagesController = kf2Var.getMessagesController();
        ArrayList arrayList = kf2Var.F;
        vf6 vf6Var = kf2Var.K;
        TLRPC.User V1 = messagesController.V1(Long.valueOf(j));
        if (V1 != null) {
            gl.d3(new n92(this, V1, (byte) 17), 200L);
        }
        if (vf6Var.f(j) == null) {
            ef2 z0 = kf2Var.z0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = V1.id;
            tL_channelParticipantAdmin.date = kf2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = y6c.h(kf2Var.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            vf6Var.k(tL_channelParticipantAdmin, V1.id);
            Collections.sort(arrayList, new sa((byte) 26));
            kf2Var.C0(z0);
        }
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        if (tLObject != null) {
            kf2 kf2Var = this.a;
            vf6 vf6Var = kf2Var.K;
            ArrayList arrayList = kf2Var.F;
            if (vf6Var.f(j) == null) {
                ef2 z0 = kf2Var.z0();
                arrayList.add(tLObject);
                kf2Var.K.k(tLObject, j);
                Collections.sort(arrayList, new sa((byte) 26));
                kf2Var.C0(z0);
            }
        }
    }

    @Override
    public final void d(long j) {
    }
}
