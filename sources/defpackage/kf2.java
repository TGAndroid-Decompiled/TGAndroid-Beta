package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf2 implements md2 {
    public final int a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean[] e;
    public final bg2 f;

    public kf2(bg2 bg2Var, int i, long j, int i2, boolean z, boolean[] zArr) {
        this.f = bg2Var;
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = z;
        this.e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        this.f.w0(user);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        bg2 bg2Var = this.f;
        ArrayList arrayList = bg2Var.F;
        long j = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i3);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (r47.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j) {
                        if (i == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = bg2Var.getUserConfig().e();
                        if (j > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j;
                        }
                        tL_channelParticipant.date = this.c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i3, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = bg2Var.r.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        bg2Var.r.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    bg2Var.t0();
                }
                i3++;
            }
            if (i == 1 && !this.d) {
                this.e[0] = true;
            }
        } else if (i2 == 1 && i == 0) {
            bg2Var.z0(j);
        }
    }
}
