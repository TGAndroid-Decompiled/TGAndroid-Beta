package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg2 implements pg2 {
    public final wg2 a;

    public lg2(wg2 wg2Var) {
        this.a = wg2Var;
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        wg2 wg2Var = this.a;
        vh6 vh6Var = wg2Var.K;
        ArrayList arrayList = wg2Var.F;
        if (vh6Var.f(j) == null) {
            qg2 A0 = wg2Var.A0();
            arrayList.add(tLObject);
            wg2Var.K.k(tLObject, j);
            Collections.sort(arrayList, new cg2(wg2Var, wg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            wg2Var.D0(A0);
        }
    }

    @Override
    public final void d(long j) {
        wg2 wg2Var = this.a;
        vh6 vh6Var = wg2Var.K;
        ArrayList arrayList = wg2Var.F;
        if (vh6Var.f(j) == null) {
            qg2 A0 = wg2Var.A0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j;
            }
            tL_channelParticipantBanned.date = wg2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = z8c.h(wg2Var.getAccountInstance().a).n;
            wg2Var.r.kicked_count++;
            arrayList.add(tL_channelParticipantBanned);
            wg2Var.K.k(tL_channelParticipantBanned, j);
            Collections.sort(arrayList, new cg2(wg2Var, wg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            wg2Var.D0(A0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j) {
    }
}
