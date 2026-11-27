package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf2 implements uf2 {
    public final bg2 a;

    public qf2(bg2 bg2Var) {
        this.a = bg2Var;
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        bg2 bg2Var = this.a;
        zh6 zh6Var = bg2Var.K;
        ArrayList arrayList = bg2Var.F;
        if (zh6Var.f(j) == null) {
            vf2 A0 = bg2Var.A0();
            arrayList.add(tLObject);
            bg2Var.K.k(j, tLObject);
            Collections.sort(arrayList, new hf2(bg2Var, bg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            bg2Var.D0(A0);
        }
    }

    @Override
    public final void d(long j) {
        bg2 bg2Var = this.a;
        zh6 zh6Var = bg2Var.K;
        ArrayList arrayList = bg2Var.F;
        if (zh6Var.f(j) == null) {
            vf2 A0 = bg2Var.A0();
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
            tL_channelParticipantBanned.date = bg2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = yac.h(bg2Var.getAccountInstance().a).n;
            bg2Var.r.kicked_count++;
            arrayList.add(tL_channelParticipantBanned);
            bg2Var.K.k(j, tL_channelParticipantBanned);
            Collections.sort(arrayList, new hf2(bg2Var, bg2Var.getConnectionsManager().getCurrentTime(), (byte) 0));
            bg2Var.D0(A0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j) {
    }
}
