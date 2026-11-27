package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mf2 implements md2 {
    public final TLObject a;
    public final bg2 b;

    public mf2(bg2 bg2Var, TLObject tLObject) {
        this.b = bg2Var;
        this.a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.b.w0(user);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            this.b.E0(channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
