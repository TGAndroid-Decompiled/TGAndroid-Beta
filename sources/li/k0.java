package li;

import android.text.SpannableStringBuilder;
import c8.ed;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.fl;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.kc;
public abstract class k0 {
    public static SpannableStringBuilder a(fj fjVar, String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.Message message = fjVar.f24073k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (n5.o(message.peer_id) == n5.o(message.from_id)) {
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
                    i14 = 2131751856;
                } else if (z10) {
                    i14 = 2131751850;
                } else {
                    i14 = 2131751844;
                }
                return org.telegram.messenger.g0.W2(gd.N0(i14, null));
            }
            if (z11) {
                i13 = 2131751858;
            } else if (z10) {
                i13 = 2131751852;
            } else {
                i13 = 2131751846;
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, i13, str));
        } else if (fjVar.N3()) {
            if (z13) {
                if (z11) {
                    i12 = 2131751854;
                } else if (z10) {
                    i12 = 2131751848;
                } else {
                    i12 = 2131751842;
                }
                return org.telegram.messenger.g0.W2(gd.N0(i12, null));
            }
            if (z11) {
                i11 = 2131751855;
            } else if (z10) {
                i11 = 2131751849;
            } else {
                i11 = 2131751843;
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, i11, str));
        } else if (z13) {
            if (z11) {
                i10 = 2131751857;
            } else if (z10) {
                i10 = 2131751851;
            } else {
                i10 = 2131751845;
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, i10, str2));
        } else {
            if (z11) {
                i7 = 2131751859;
            } else if (z10) {
                i7 = 2131751853;
            } else {
                i7 = 2131751847;
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, i7, str2, str));
        }
    }

    public static int b(int i7, long j3) {
        TLRPC.Chat O0;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull P0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            if (c22 == null) {
                return 0;
            }
            j10 = c22.linked_community_id;
            user = c22;
            O0 = null;
        } else {
            O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 == null) {
                return 0;
            }
            j10 = O0.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (P0 = mp.u1(i7).P0(j10)) != null && (arrayList = P0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (n5.o(communityPeer2.peer) == j3) {
                    if (user != null) {
                        dialog = mp.u1(i7).U0(user.f28641id);
                    }
                    return c(O0, dialog, user, communityPeer2);
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
            if (!v3.j0(chat)) {
                if (!v3.t0(chat) && !communityPeer.can_view_history) {
                    if (ed.a(communityPeer.flags, 1) && !communityPeer.visible) {
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

    public static void d(int r8, long r9, org.telegram.ui.ActionBar.g2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.k0.d(int, long, org.telegram.ui.ActionBar.g2):void");
    }

    public static void e(t1[] t1VarArr, g2 g2Var, int i7, TLRPC.Chat chat) {
        if (t1VarArr[0] != null) {
            return;
        }
        mp u12 = mp.u1(i7);
        di.j0 j0Var = new di.j0(t1VarArr, g2Var, i7, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new fl(u12, j0Var, 0));
        ConnectionsManager.getInstance(i7).bindRequestToGuid(sendRequestTyped, g2Var.getClassGuid());
        t1 t1Var = new t1(3, g2Var.getContext(), null);
        t1VarArr[0] = t1Var;
        t1Var.r(500L);
        t1VarArr[0].setOnCancelListener(new d0(i7, sendRequestTyped, t1VarArr, 0));
    }

    public static void f(kc kcVar, int i7, boolean z10) {
        int i10;
        int i11;
        String N0;
        int i12;
        if (i7 == 2) {
            i10 = 2131624293;
        } else {
            i10 = 2131623990;
        }
        if (i7 == 2) {
            i11 = 24;
        } else {
            i11 = 36;
        }
        if (i7 == 0) {
            N0 = gd.N0(2131751931, null);
        } else if (i7 == 1) {
            if (z10) {
                i12 = 2131751930;
            } else {
                i12 = 2131751929;
            }
            N0 = gd.N0(i12, null);
        } else {
            N0 = gd.N0(2131751928, null);
        }
        kcVar.G(i10, i11, N0).j();
    }
}
