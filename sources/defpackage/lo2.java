package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class lo2 implements jac {
    public final byte a;
    public final po2 b;

    public lo2(po2 po2Var, byte b) {
        this.a = b;
        this.b = po2Var;
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
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    c41.b0(po2Var).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                arrayList2.add(c6c.l(140, po2Var.s));
                if (sd2.y(1, po2Var.J)) {
                    TLRPC.Chat chat = po2Var.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i = 2131751789;
                    } else {
                        i = 2131751788;
                    }
                    c6c c = c6c.c(141, 2131232513, jb6.M0(i, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(c6c.E(2, gm.L(14.0f)));
                    arrayList2.add(c6c.t(0, jb6.M0(2131751811, null)));
                    arrayList2.add(c6c.j(7, po2Var.r));
                    arrayList2.add(c6c.E(1, gm.L(14.0f)));
                }
                if (sd2.w(2, po2Var.J)) {
                    arrayList2.add(c6c.t(3, jb6.M0(2131751809, null)));
                    c6c y = c6c.y(150, jb6.M0(2131751780, null), jb6.M0(2131751779, null));
                    y.L(po2Var.n);
                    arrayList2.add(y);
                    c6c y2 = c6c.y(151, jb6.M0(2131751778, null), jb6.M0(2131751777, null));
                    y2.L(!po2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(c6c.E(4, gm.L(14.0f)));
                }
                if (sd2.N(po2Var.J)) {
                    String M0 = jb6.M0(2131751902, null);
                    TLRPC.ChatFull chatFull = po2Var.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(c6c.d(142, 2131232055, M0, str));
                    String M02 = jb6.M0(2131751832, null);
                    TLRPC.ChatFull chatFull2 = po2Var.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(c6c.d(143, 2131231032, M02, str2));
                    String M03 = jb6.M0(2131751818, null);
                    TLRPC.ChatFull chatFull3 = po2Var.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(c6c.d(144, 2131232421, M03, str3));
                }
                arrayList2.add(c6c.E(5, gm.L(14.0f)));
                c6c c2 = c6c.c(146, 2131232182, jb6.M0(2131751855, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = po2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i2 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                        i2++;
                        arrayList2.add(c6c.w(po2Var.getMessagesController().a2(pg3.n(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
