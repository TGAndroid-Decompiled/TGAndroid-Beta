package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lf2 implements md2 {
    public final TLObject a;
    public final long b;
    public final boolean c;
    public final bg2 d;

    public lf2(bg2 bg2Var, TLObject tLObject, long j, boolean z) {
        this.d = bg2Var;
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
        bg2 bg2Var = this.d;
        uf2 uf2Var = bg2Var.m1;
        if (uf2Var != null) {
            long j = this.b;
            if (i == 1) {
                uf2Var.b(j);
            } else {
                uf2Var.c(j, tLObject);
            }
        }
        if (this.c) {
            bg2Var.removeSelfFromStack();
        }
    }
}
