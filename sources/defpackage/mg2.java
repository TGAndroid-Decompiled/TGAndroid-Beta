package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mg2 implements pg2 {
    public final wg2 a;

    public mg2(wg2 wg2Var) {
        this.a = wg2Var;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.a.w0(user);
    }

    @Override
    public final void b(long j) {
        wg2 wg2Var = this.a;
        oc7 messagesController = wg2Var.getMessagesController();
        ArrayList arrayList = wg2Var.F;
        vh6 vh6Var = wg2Var.K;
        TLRPC.User W1 = messagesController.W1(Long.valueOf(j));
        if (W1 != null) {
            gm.d3(new ra2(this, W1, (byte) 18), 200L);
        }
        if (vh6Var.f(j) == null) {
            qg2 A0 = wg2Var.A0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = W1.id;
            tL_channelParticipantAdmin.date = wg2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = z8c.h(wg2Var.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            vh6Var.k(tL_channelParticipantAdmin, W1.id);
            Collections.sort(arrayList, new sa((byte) 26));
            wg2Var.D0(A0);
        }
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        if (tLObject != null) {
            wg2 wg2Var = this.a;
            vh6 vh6Var = wg2Var.K;
            ArrayList arrayList = wg2Var.F;
            if (vh6Var.f(j) == null) {
                qg2 A0 = wg2Var.A0();
                arrayList.add(tLObject);
                wg2Var.K.k(tLObject, j);
                Collections.sort(arrayList, new sa((byte) 26));
                wg2Var.D0(A0);
            }
        }
    }

    @Override
    public final void d(long j) {
    }
}
