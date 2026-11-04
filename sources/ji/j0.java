package ji;

import android.text.SpannableStringBuilder;
import ci.o0;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cl;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.fc;
public abstract class j0 {
    public static SpannableStringBuilder a(zi ziVar, String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.Message message = ziVar.f26868k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (m5.o(message.peer_id) == m5.o(message.from_id)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            if (z13) {
                if (z11) {
                    i14 = 2131751868;
                } else if (z10) {
                    i14 = 2131751862;
                } else {
                    i14 = 2131751856;
                }
                return org.telegram.messenger.g0.X2(bd.M0(i14, null));
            }
            if (z11) {
                i13 = 2131751870;
            } else if (z10) {
                i13 = 2131751864;
            } else {
                i13 = 2131751858;
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, i13, str));
        } else if (ziVar.O3()) {
            if (z13) {
                if (z11) {
                    i12 = 2131751866;
                } else if (z10) {
                    i12 = 2131751860;
                } else {
                    i12 = 2131751854;
                }
                return org.telegram.messenger.g0.X2(bd.M0(i12, null));
            }
            if (z11) {
                i11 = 2131751867;
            } else if (z10) {
                i11 = 2131751861;
            } else {
                i11 = 2131751855;
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, i11, str));
        } else if (z13) {
            if (z11) {
                i10 = 2131751869;
            } else if (z10) {
                i10 = 2131751863;
            } else {
                i10 = 2131751857;
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, i10, str2));
        } else {
            if (z11) {
                i3 = 2131751871;
            } else if (z10) {
                i3 = 2131751865;
            } else {
                i3 = 2131751859;
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, i3, str2, str));
        }
    }

    public static int b(int i3, long j10) {
        TLRPC.Chat M0;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            if (a22 == null) {
                return 0;
            }
            j11 = a22.linked_community_id;
            user = a22;
            M0 = null;
        } else {
            M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 == null) {
                return 0;
            }
            j11 = M0.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (N0 = hp.s1(i3).N0(j11)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j10) {
                    if (user != null) {
                        dialog = hp.s1(i3).S0(user.f27150id);
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
                    if (x7.u.a(communityPeer.flags, 1) && !communityPeer.visible) {
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

    public static void d(org.telegram.ui.ActionBar.d2 r8, long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j0.d(org.telegram.ui.ActionBar.d2, long, int):void");
    }

    public static void e(s1[] s1VarArr, d2 d2Var, int i3, TLRPC.Chat chat) {
        if (s1VarArr[0] != null) {
            return;
        }
        hp s12 = hp.s1(i3);
        o0 o0Var = new o0(s1VarArr, d2Var, i3, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new c3.b(1), new cl(s12, o0Var, 0));
        ConnectionsManager.getInstance(i3).bindRequestToGuid(sendRequestTyped, d2Var.getClassGuid());
        s1 s1Var = new s1(3, d2Var.getContext(), null);
        s1VarArr[0] = s1Var;
        s1Var.r(500L);
        s1VarArr[0].setOnCancelListener(new c0(i3, sendRequestTyped, s1VarArr, 0));
    }

    public static void f(fc fcVar, int i3, boolean z10) {
        int i10;
        int i11;
        String M0;
        int i12;
        if (i3 == 2) {
            i10 = 2131624292;
        } else {
            i10 = 2131623989;
        }
        if (i3 == 2) {
            i11 = 24;
        } else {
            i11 = 36;
        }
        if (i3 == 0) {
            M0 = bd.M0(2131751943, null);
        } else if (i3 == 1) {
            if (z10) {
                i12 = 2131751942;
            } else {
                i12 = 2131751941;
            }
            M0 = bd.M0(i12, null);
        } else {
            M0 = bd.M0(2131751940, null);
        }
        fcVar.G(i10, i11, M0).j();
    }
}
