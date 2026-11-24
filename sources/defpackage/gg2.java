package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gg2 implements he2 {
    public final TLObject a;
    public final long b;
    public final boolean c;
    public final wg2 d;

    public gg2(wg2 wg2Var, TLObject tLObject, long j, boolean z) {
        this.d = wg2Var;
        this.a = tLObject;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.d.w0(user);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        wg2 wg2Var = this.d;
        pg2 pg2Var = wg2Var.m1;
        if (pg2Var != null) {
            long j = this.b;
            if (i == 1) {
                pg2Var.b(j);
            } else {
                pg2Var.c(j, tLObject);
            }
        }
        if (this.c) {
            wg2Var.removeSelfFromStack();
        }
    }
}
