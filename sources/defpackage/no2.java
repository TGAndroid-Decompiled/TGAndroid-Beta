package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d;
public abstract class no2 {
    public static SpannableStringBuilder a(k27 k27Var, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.Message message = k27Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (cf3.n(message.peer_id) == cf3.n(message.from_id)) {
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
                    i6 = 2131751856;
                } else if (z) {
                    i6 = 2131751850;
                } else {
                    i6 = 2131751844;
                }
                return gl.S2(k96.M0(i6, null));
            }
            if (z2) {
                i5 = 2131751858;
            } else if (z) {
                i5 = 2131751852;
            } else {
                i5 = 2131751846;
            }
            return gl.S2(k96.a0(null, null, i5, str));
        } else if (k27Var.N3()) {
            if (z4) {
                if (z2) {
                    i4 = 2131751854;
                } else if (z) {
                    i4 = 2131751848;
                } else {
                    i4 = 2131751842;
                }
                return gl.S2(k96.M0(i4, null));
            }
            if (z2) {
                i3 = 2131751855;
            } else if (z) {
                i3 = 2131751849;
            } else {
                i3 = 2131751843;
            }
            return gl.S2(k96.a0(null, null, i3, str));
        } else if (z4) {
            if (z2) {
                i2 = 2131751857;
            } else if (z) {
                i2 = 2131751851;
            } else {
                i2 = 2131751845;
            }
            return gl.S2(k96.a0(null, null, i2, str2));
        } else {
            if (z2) {
                i = 2131751859;
            } else if (z) {
                i = 2131751853;
            } else {
                i = 2131751847;
            }
            return gl.S2(k96.a0(null, null, i, str2, str));
        }
    }

    public static int b(int i, long j) {
        TLRPC.Chat K0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull L0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            if (V1 == null) {
                return 0;
            }
            j2 = V1.linked_community_id;
            user = V1;
            K0 = null;
        } else {
            K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (K0 == null) {
                return 0;
            }
            j2 = K0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (L0 = na7.q1(i).L0(j2)) != null && (arrayList = L0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (cf3.n(communityPeer2.peer) == j) {
                    if (user != null) {
                        dialog = na7.q1(i).Q0(user.id);
                    }
                    return c(K0, dialog, user, communityPeer2);
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
            if (!hc2.j0(chat)) {
                if (!hc2.t0(chat) && !communityPeer.can_view_history) {
                    if (fod.a(communityPeer.flags, 1) && !communityPeer.visible) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no2.d(int, long, org.telegram.ui.ActionBar.d):void");
    }

    public static void e(hd[] hdVarArr, d dVar, int i, TLRPC.Chat chat) {
        if (hdVarArr[0] != null) {
            return;
        }
        na7 q1 = na7.q1(i);
        e eVar = new e(hdVarArr, dVar, i, chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = q1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new hc((byte) 0), new ae2(q1, eVar, (byte) 28));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, dVar.getClassGuid());
        hd hdVar = new hd(3, null, dVar.getContext());
        hdVarArr[0] = hdVar;
        hdVar.q(500L);
        hdVarArr[0].setOnCancelListener(new fo2(i, sendRequestTyped, hdVarArr, (byte) 0));
    }

    public static void f(u21 u21Var, int i, boolean z) {
        int i2;
        int i3;
        String M0;
        int i4;
        if (i == 2) {
            i2 = 2131624287;
            i3 = 24;
        } else {
            i2 = 2131623990;
            i3 = 36;
        }
        if (i == 0) {
            M0 = k96.M0(2131751931, null);
        } else if (i == 1) {
            if (z) {
                i4 = 2131751930;
            } else {
                i4 = 2131751929;
            }
            M0 = k96.M0(i4, null);
        } else {
            M0 = k96.M0(2131751928, null);
        }
        u21Var.G(i2, i3, M0).j();
    }
}
