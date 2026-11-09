package ii;

import android.text.SpannableStringBuilder;
import bi.v0;
import c8.zc;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.ml;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.hc;
public abstract class m0 {
    public static SpannableStringBuilder a(ij ijVar, String str, String str2, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.Message message = ijVar.f23262k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (m5.o(message.peer_id) == m5.o(message.from_id)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (z12) {
                if (z10) {
                    i14 = 2131751868;
                } else if (z9) {
                    i14 = 2131751862;
                } else {
                    i14 = 2131751856;
                }
                return org.telegram.messenger.g0.X2(id.M0(i14, null));
            }
            if (z10) {
                i13 = 2131751870;
            } else if (z9) {
                i13 = 2131751864;
            } else {
                i13 = 2131751858;
            }
            return org.telegram.messenger.g0.X2(id.a0(null, null, i13, str));
        } else if (ijVar.N3()) {
            if (z12) {
                if (z10) {
                    i12 = 2131751866;
                } else if (z9) {
                    i12 = 2131751860;
                } else {
                    i12 = 2131751854;
                }
                return org.telegram.messenger.g0.X2(id.M0(i12, null));
            }
            if (z10) {
                i11 = 2131751867;
            } else if (z9) {
                i11 = 2131751861;
            } else {
                i11 = 2131751855;
            }
            return org.telegram.messenger.g0.X2(id.a0(null, null, i11, str));
        } else if (z12) {
            if (z10) {
                i10 = 2131751869;
            } else if (z9) {
                i10 = 2131751863;
            } else {
                i10 = 2131751857;
            }
            return org.telegram.messenger.g0.X2(id.a0(null, null, i10, str2));
        } else {
            if (z10) {
                i7 = 2131751871;
            } else if (z9) {
                i7 = 2131751865;
            } else {
                i7 = 2131751859;
            }
            return org.telegram.messenger.g0.X2(id.a0(null, null, i7, str2, str));
        }
    }

    public static int b(int i7, long j3) {
        TLRPC.Chat M0;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            if (a22 == null) {
                return 0;
            }
            j10 = a22.linked_community_id;
            user = a22;
            M0 = null;
        } else {
            M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                return 0;
            }
            j10 = M0.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (N0 = qp.s1(i7).N0(j10)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j3) {
                    if (user != null) {
                        dialog = qp.s1(i7).S0(user.f27105id);
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
            if (!t3.j0(chat)) {
                if (!t3.t0(chat) && !communityPeer.can_view_history) {
                    if (zc.a(communityPeer.flags, 1) && !communityPeer.visible) {
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

    public static void d(org.telegram.ui.ActionBar.f2 r8, long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.m0.d(org.telegram.ui.ActionBar.f2, long, int):void");
    }

    public static void e(u1[] u1VarArr, f2 f2Var, int i7, TLRPC.Chat chat) {
        if (u1VarArr[0] != null) {
            return;
        }
        qp s12 = qp.s1(i7);
        v0 v0Var = new v0(u1VarArr, f2Var, i7, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new ml(s12, v0Var, 0));
        ConnectionsManager.getInstance(i7).bindRequestToGuid(sendRequestTyped, f2Var.getClassGuid());
        u1 u1Var = new u1(3, f2Var.getContext(), null);
        u1VarArr[0] = u1Var;
        u1Var.r(500L);
        u1VarArr[0].setOnCancelListener(new e0(i7, sendRequestTyped, u1VarArr, 0));
    }

    public static void f(hc hcVar, int i7, boolean z9) {
        int i10;
        int i11;
        String M0;
        int i12;
        if (i7 == 2) {
            i10 = 2131624292;
        } else {
            i10 = 2131623989;
        }
        if (i7 == 2) {
            i11 = 24;
        } else {
            i11 = 36;
        }
        if (i7 == 0) {
            M0 = id.M0(2131751943, null);
        } else if (i7 == 1) {
            if (z9) {
                i12 = 2131751942;
            } else {
                i12 = 2131751941;
            }
            M0 = id.M0(i12, null);
        } else {
            M0 = id.M0(2131751940, null);
        }
        hcVar.G(i10, i11, M0).j();
    }
}
