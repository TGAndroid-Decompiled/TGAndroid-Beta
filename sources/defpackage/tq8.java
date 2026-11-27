package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class tq8 implements md2 {
    public final int a;
    public final TLRPC.ChatParticipant b;
    public final boolean c;
    public final boolean[] d;
    public final ProfileActivity e;

    public tq8(ProfileActivity profileActivity, int i, TLRPC.ChatParticipant chatParticipant, boolean z, boolean[] zArr) {
        this.e = profileActivity;
        this.a = i;
        this.b = chatParticipant;
        this.c = z;
        this.d = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i;
        ProfileActivity profileActivity = this.e;
        UndoView undoView = profileActivity.M;
        long j = -profileActivity.f1;
        if (profileActivity.F2.megagroup) {
            i = 10;
        } else {
            i = 9;
        }
        undoView.m(j, user, i);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z;
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        int i2 = 0;
        TLRPC.ChatParticipant chatParticipant = this.b;
        ProfileActivity profileActivity = this.e;
        int i3 = this.a;
        if (i3 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i == 1) {
                    tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.flags |= 4;
                } else {
                    tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                }
                tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                if (i == 1) {
                    tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                } else {
                    tL_chatParticipant = new TLRPC.TL_chatParticipant();
                }
                tL_chatParticipant.user_id = chatParticipant.user_id;
                tL_chatParticipant.date = chatParticipant.date;
                tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.v2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.v2.participants.participants.set(indexOf, tL_chatParticipant);
                }
            }
            if (i == 1 && !this.c) {
                this.d[0] = true;
            }
        } else if (i3 == 1 && i == 0 && profileActivity.F2.megagroup && (chatFull = profileActivity.v2) != null && chatFull.participants != null) {
            int i4 = 0;
            while (true) {
                if (i4 < profileActivity.v2.participants.participants.size()) {
                    if (r47.B1(((TLRPC.TL_chatChannelParticipant) profileActivity.v2.participants.participants.get(i4)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.v2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i4);
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.v2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i2 >= profileActivity.v2.participants.participants.size()) {
                        break;
                    } else if (profileActivity.v2.participants.participants.get(i2).user_id == chatParticipant.user_id) {
                        profileActivity.v2.participants.participants.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z) {
                profileActivity.c4(true);
                profileActivity.f4();
                profileActivity.d.f();
            }
        }
    }
}
