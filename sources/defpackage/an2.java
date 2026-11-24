package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class an2 implements i8c {
    public final byte a;
    public final en2 b;

    public an2(en2 en2Var, byte b) {
        this.a = b;
        this.b = en2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i;
        TLRPC.ChatPhoto chatPhoto;
        byte b = this.a;
        int i2 = 0;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    u21.b0(en2Var).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                arrayList2.add(c4c.l(140, en2Var.s));
                if (hc2.y(1, en2Var.J)) {
                    TLRPC.Chat chat = en2Var.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i = 2131751840;
                    } else {
                        i = 2131751839;
                    }
                    c4c c = c4c.c(141, 2131232501, k96.M0(i, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(c4c.E(2, gl.L(14.0f)));
                    arrayList2.add(c4c.t(0, k96.M0(2131751862, null)));
                    arrayList2.add(c4c.j(7, en2Var.r));
                    arrayList2.add(c4c.E(1, gl.L(14.0f)));
                }
                if (hc2.w(2, en2Var.J)) {
                    arrayList2.add(c4c.t(3, k96.M0(2131751860, null)));
                    c4c y = c4c.y(150, k96.M0(2131751831, null), k96.M0(2131751830, null));
                    y.L(en2Var.n);
                    arrayList2.add(y);
                    c4c y2 = c4c.y(151, k96.M0(2131751829, null), k96.M0(2131751828, null));
                    y2.L(!en2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(c4c.E(4, gl.L(14.0f)));
                }
                if (hc2.N(en2Var.J)) {
                    String M0 = k96.M0(2131751953, null);
                    TLRPC.ChatFull chatFull = en2Var.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(c4c.d(142, 2131232054, M0, str));
                    String M02 = k96.M0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = en2Var.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(c4c.d(143, 2131231031, M02, str2));
                    String M03 = k96.M0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = en2Var.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(c4c.d(144, 2131232420, M03, str3));
                }
                arrayList2.add(c4c.E(5, gl.L(14.0f)));
                c4c c2 = c4c.c(146, 2131232181, k96.M0(2131751906, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = en2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i2 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                        i2++;
                        arrayList2.add(c4c.w(en2Var.getMessagesController().Z1(cf3.n(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
