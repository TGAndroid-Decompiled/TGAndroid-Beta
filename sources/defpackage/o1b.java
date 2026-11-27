package defpackage;

import org.telegram.tgnet.TLRPC;
public final class o1b implements md2 {
    public final TLRPC.TL_chatChannelParticipant a;
    public final boolean b;
    public final boolean[] c;

    public o1b(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z, boolean[] zArr) {
        this.a = tL_chatChannelParticipant;
        this.b = z;
        this.c = zArr;
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.a;
        if (i == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.b) {
            this.c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
