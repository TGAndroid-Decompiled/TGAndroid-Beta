package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze2 implements df2 {
    public final kf2 a;

    public ze2(kf2 kf2Var) {
        this.a = kf2Var;
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        kf2 kf2Var = this.a;
        vf6 vf6Var = kf2Var.K;
        ArrayList arrayList = kf2Var.F;
        if (vf6Var.f(j) == null) {
            ef2 z0 = kf2Var.z0();
            arrayList.add(tLObject);
            kf2Var.K.k(tLObject, j);
            Collections.sort(arrayList, new qe2(kf2Var, kf2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            kf2Var.C0(z0);
        }
    }

    @Override
    public final void d(long j) {
        kf2 kf2Var = this.a;
        vf6 vf6Var = kf2Var.K;
        ArrayList arrayList = kf2Var.F;
        if (vf6Var.f(j) == null) {
            ef2 z0 = kf2Var.z0();
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
            tL_channelParticipantBanned.date = kf2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = y6c.h(kf2Var.getAccountInstance().a).n;
            kf2Var.r.kicked_count++;
            arrayList.add(tL_channelParticipantBanned);
            kf2Var.K.k(tL_channelParticipantBanned, j);
            Collections.sort(arrayList, new qe2(kf2Var, kf2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            kf2Var.C0(z0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j) {
    }
}
