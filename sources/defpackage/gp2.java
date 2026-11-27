package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e;
public abstract class gp2 {
    public static SpannableStringBuilder a(r47 r47Var, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.Message message = r47Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (wf3.n(message.peer_id) == wf3.n(message.from_id)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3) {
            if (z4) {
                if (z2) {
                    i6 = 2131751833;
                } else if (z) {
                    i6 = 2131751827;
                } else {
                    i6 = 2131751821;
                }
                return hl.S2(ob6.M0(i6, null));
            }
            if (z2) {
                i5 = 2131751835;
            } else if (z) {
                i5 = 2131751829;
            } else {
                i5 = 2131751823;
            }
            return hl.S2(ob6.a0(null, null, i5, str));
        } else if (r47Var.N3()) {
            if (z4) {
                if (z2) {
                    i4 = 2131751831;
                } else if (z) {
                    i4 = 2131751825;
                } else {
                    i4 = 2131751819;
                }
                return hl.S2(ob6.M0(i4, null));
            }
            if (z2) {
                i3 = 2131751832;
            } else if (z) {
                i3 = 2131751826;
            } else {
                i3 = 2131751820;
            }
            return hl.S2(ob6.a0(null, null, i3, str));
        } else if (z4) {
            if (z2) {
                i2 = 2131751834;
            } else if (z) {
                i2 = 2131751828;
            } else {
                i2 = 2131751822;
            }
            return hl.S2(ob6.a0(null, null, i2, str2));
        } else {
            if (z2) {
                i = 2131751836;
            } else if (z) {
                i = 2131751830;
            } else {
                i = 2131751824;
            }
            return hl.S2(ob6.a0(null, null, i, str2, str));
        }
    }

    public static int b(int i, long j) {
        TLRPC.Chat M0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            if (X1 == null) {
                return 0;
            }
            j2 = X1.linked_community_id;
            user = X1;
            M0 = null;
        } else {
            M0 = uc7.s1(i).M0(Long.valueOf(-j));
            if (M0 == null) {
                return 0;
            }
            j2 = M0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (N0 = uc7.s1(i).N0(j2)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (wf3.n(communityPeer2.peer) == j) {
                    if (user != null) {
                        dialog = uc7.s1(i).S0(user.id);
                    }
                    return c(M0, dialog, user, communityPeer2);
                }
            }
        }
        return 0;
    }

    public static int c(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        if (user != null) {
            if (dialog == null) {
                return 2;
            }
        } else if (chat != null) {
            if (!xc2.j0(chat)) {
                if (!xc2.t0(chat) && !communityPeer.can_view_history) {
                    if (vsd.a(communityPeer.flags, 1) && !communityPeer.visible) {
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
        } else {
            return 0;
        }
        return 1;
    }

    public static void d(int r8, long r9, org.telegram.ui.ActionBar.e r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp2.d(int, long, org.telegram.ui.ActionBar.e):void");
    }

    public static void e(id[] idVarArr, e eVar, int i, TLRPC.Chat chat) {
        if (idVarArr[0] != null) {
            return;
        }
        uc7 s1 = uc7.s1(i);
        f fVar = new f(idVarArr, eVar, i, chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new ic((byte) 0), new qe2(s1, fVar, (byte) 28));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, eVar.getClassGuid());
        id idVar = new id(3, null, eVar.getContext());
        idVarArr[0] = idVar;
        idVar.q(500L);
        idVarArr[0].setOnCancelListener(new yo2(i, sendRequestTyped, idVarArr, (byte) 0));
    }

    public static void f(d31 d31Var, int i, boolean z) {
        int i2;
        int i3;
        String M0;
        int i4;
        if (i == 2) {
            i2 = 2131624288;
            i3 = 24;
        } else {
            i2 = 2131623990;
            i3 = 36;
        }
        if (i == 0) {
            M0 = ob6.M0(2131751908, null);
        } else if (i == 1) {
            if (z) {
                i4 = 2131751907;
            } else {
                i4 = 2131751906;
            }
            M0 = ob6.M0(i4, null);
        } else {
            M0 = ob6.M0(2131751905, null);
        }
        d31Var.G(i2, i3, M0).j();
    }
}
