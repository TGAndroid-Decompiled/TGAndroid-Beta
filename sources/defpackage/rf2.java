package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf2 implements uf2 {
    public final bg2 a;

    public rf2(bg2 bg2Var) {
        this.a = bg2Var;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.a.w0(user);
    }

    @Override
    public final void b(long j) {
        bg2 bg2Var = this.a;
        uc7 messagesController = bg2Var.getMessagesController();
        ArrayList arrayList = bg2Var.F;
        zh6 zh6Var = bg2Var.K;
        TLRPC.User X1 = messagesController.X1(Long.valueOf(j));
        if (X1 != null) {
            hl.d3(new ea2(this, X1, (byte) 16), 200L);
        }
        if (zh6Var.f(j) == null) {
            vf2 A0 = bg2Var.A0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = X1.id;
            tL_channelParticipantAdmin.date = bg2Var.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = yac.h(bg2Var.getAccountInstance().a).n;
            arrayList.add(tL_channelParticipantAdmin);
            zh6Var.k(X1.id, tL_channelParticipantAdmin);
            Collections.sort(arrayList, new ta((byte) 26));
            bg2Var.D0(A0);
        }
    }

    @Override
    public final void c(long j, TLObject tLObject) {
        if (tLObject != null) {
            bg2 bg2Var = this.a;
            zh6 zh6Var = bg2Var.K;
            ArrayList arrayList = bg2Var.F;
            if (zh6Var.f(j) == null) {
                vf2 A0 = bg2Var.A0();
                arrayList.add(tLObject);
                bg2Var.K.k(j, tLObject);
                Collections.sort(arrayList, new ta((byte) 26));
                bg2Var.D0(A0);
            }
        }
    }

    @Override
    public final void d(long j) {
    }
}
