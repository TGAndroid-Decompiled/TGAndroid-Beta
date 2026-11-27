package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class tn2 implements icc {
    public final byte a;
    public final xn2 b;

    public tn2(xn2 xn2Var, byte b) {
        this.a = b;
        this.b = xn2Var;
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
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    d31.b0(xn2Var).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                arrayList2.add(b8c.l(140, xn2Var.s));
                if (xc2.y(1, xn2Var.J)) {
                    TLRPC.Chat chat = xn2Var.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i = 2131751817;
                    } else {
                        i = 2131751816;
                    }
                    b8c c = b8c.c(141, 2131232512, ob6.M0(i, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(b8c.E(2, hl.L(14.0f)));
                    arrayList2.add(b8c.t(0, ob6.M0(2131751839, null)));
                    arrayList2.add(b8c.j(7, xn2Var.r));
                    arrayList2.add(b8c.E(1, hl.L(14.0f)));
                }
                if (xc2.w(2, xn2Var.J)) {
                    arrayList2.add(b8c.t(3, ob6.M0(2131751837, null)));
                    b8c y = b8c.y(150, ob6.M0(2131751808, null), ob6.M0(2131751807, null));
                    y.L(xn2Var.n);
                    arrayList2.add(y);
                    b8c y2 = b8c.y(151, ob6.M0(2131751806, null), ob6.M0(2131751805, null));
                    y2.L(!xn2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(b8c.E(4, hl.L(14.0f)));
                }
                if (xc2.N(xn2Var.J)) {
                    String M0 = ob6.M0(2131751930, null);
                    TLRPC.ChatFull chatFull = xn2Var.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(b8c.d(142, 2131232054, M0, str));
                    String M02 = ob6.M0(2131751860, null);
                    TLRPC.ChatFull chatFull2 = xn2Var.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(b8c.d(143, 2131231031, M02, str2));
                    String M03 = ob6.M0(2131751846, null);
                    TLRPC.ChatFull chatFull3 = xn2Var.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(b8c.d(144, 2131232420, M03, str3));
                }
                arrayList2.add(b8c.E(5, hl.L(14.0f)));
                b8c c2 = b8c.c(146, 2131232181, ob6.M0(2131751883, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = xn2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i2 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                        i2++;
                        arrayList2.add(b8c.w(xn2Var.getMessagesController().b2(wf3.n(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
