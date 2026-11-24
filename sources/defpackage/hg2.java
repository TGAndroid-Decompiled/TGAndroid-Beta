package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hg2 implements he2 {
    public final TLObject a;
    public final wg2 b;

    public hg2(wg2 wg2Var, TLObject tLObject) {
        this.b = wg2Var;
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
