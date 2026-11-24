package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d;
public abstract class yp2 {
    public static SpannableStringBuilder a(k47 k47Var, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.Message message = k47Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (pg3.n(message.peer_id) == pg3.n(message.from_id)) {
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
                    i6 = 2131751805;
                } else if (z) {
                    i6 = 2131751799;
                } else {
                    i6 = 2131751793;
                }
                return gm.S2(jb6.M0(i6, null));
            }
            if (z2) {
                i5 = 2131751807;
            } else if (z) {
                i5 = 2131751801;
            } else {
                i5 = 2131751795;
            }
            return gm.S2(jb6.a0(null, null, i5, str));
        } else if (k47Var.N3()) {
            if (z4) {
                if (z2) {
                    i4 = 2131751803;
                } else if (z) {
                    i4 = 2131751797;
                } else {
                    i4 = 2131751791;
                }
                return gm.S2(jb6.M0(i4, null));
            }
            if (z2) {
                i3 = 2131751804;
            } else if (z) {
                i3 = 2131751798;
            } else {
                i3 = 2131751792;
            }
            return gm.S2(jb6.a0(null, null, i3, str));
        } else if (z4) {
            if (z2) {
                i2 = 2131751806;
            } else if (z) {
                i2 = 2131751800;
            } else {
                i2 = 2131751794;
            }
            return gm.S2(jb6.a0(null, null, i2, str2));
        } else {
            if (z2) {
                i = 2131751808;
            } else if (z) {
                i = 2131751802;
            } else {
                i = 2131751796;
            }
            return gm.S2(jb6.a0(null, null, i, str2, str));
        }
    }

    public static int b(int i, long j) {
        TLRPC.Chat L0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull M0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            if (W1 == null) {
                return 0;
            }
            j2 = W1.linked_community_id;
            user = W1;
            L0 = null;
        } else {
            L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (L0 == null) {
                return 0;
            }
            j2 = L0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (M0 = oc7.r1(i).M0(j2)) != null && (arrayList = M0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (pg3.n(communityPeer2.peer) == j) {
                    if (user != null) {
                        dialog = oc7.r1(i).R0(user.id);
                    }
                    return c(L0, dialog, user, communityPeer2);
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
            if (!sd2.j0(chat)) {
                if (!sd2.t0(chat) && !communityPeer.can_view_history) {
                    if (iqd.a(communityPeer.flags, 1) && !communityPeer.visible) {
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

    public static void d(int r8, long r9, org.telegram.ui.ActionBar.d r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp2.d(int, long, org.telegram.ui.ActionBar.d):void");
    }

    public static void e(he[] heVarArr, d dVar, int i, TLRPC.Chat chat) {
        if (heVarArr[0] != null) {
            return;
        }
        oc7 r1 = oc7.r1(i);
        e eVar = new e(heVarArr, dVar, i, chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = r1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new kc((byte) 0), new s87(r1, eVar, (byte) 0));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, dVar.getClassGuid());
        he heVar = new he(3, null, dVar.getContext());
        heVarArr[0] = heVar;
        heVar.q(500L);
        heVarArr[0].setOnCancelListener(new qp2(i, sendRequestTyped, heVarArr, (byte) 0));
    }

    public static void f(c41 c41Var, int i, boolean z) {
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
            M0 = jb6.M0(2131751880, null);
        } else if (i == 1) {
            if (z) {
                i4 = 2131751879;
            } else {
                i4 = 2131751878;
            }
            M0 = jb6.M0(i4, null);
        } else {
            M0 = jb6.M0(2131751877, null);
        }
        c41Var.G(i2, i3, M0).j();
    }
}
