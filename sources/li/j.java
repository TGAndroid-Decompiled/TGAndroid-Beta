package li;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z41;
public final class j implements q10 {
    public final int f19948a;
    public final p f19949b;

    public j(p pVar, int i7) {
        this.f19948a = i7;
        this.f19949b = pVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i7;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f19948a;
        int i11 = 0;
        p pVar = this.f19949b;
        switch (i10) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                pVar.getClass();
                if (tL_error != null) {
                    lc.b0(pVar).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                arrayList2.add(l41.l(140, pVar.f19987s));
                if (v3.y(1, pVar.J)) {
                    TLRPC.Chat chat = pVar.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i7 = 2131751841;
                    } else {
                        i7 = 2131751840;
                    }
                    l41 c10 = l41.c(141, 2131232498, gd.M0(i7, null));
                    c10.f37023r = true;
                    arrayList2.add(c10);
                    arrayList2.add(l41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(l41.t(0, gd.M0(2131751863, null)));
                    arrayList2.add(l41.j(7, pVar.f19986r));
                    arrayList2.add(l41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, pVar.J)) {
                    arrayList2.add(l41.t(3, gd.M0(2131751861, null)));
                    l41 y10 = l41.y(150, gd.M0(2131751832, null), gd.M0(2131751831, null));
                    y10.L(pVar.f19985n);
                    arrayList2.add(y10);
                    l41 y11 = l41.y(151, gd.M0(2131751830, null), gd.M0(2131751829, null));
                    y11.L(!pVar.f19985n);
                    arrayList2.add(y11);
                    arrayList2.add(l41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(pVar.J)) {
                    String M0 = gd.M0(2131751954, null);
                    TLRPC.ChatFull chatFull = pVar.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(l41.d(142, 2131232051, M0, str));
                    String M02 = gd.M0(2131751884, null);
                    TLRPC.ChatFull chatFull2 = pVar.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(l41.d(143, 2131231029, M02, str2));
                    String M03 = gd.M0(2131751870, null);
                    TLRPC.ChatFull chatFull3 = pVar.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(l41.d(144, 2131232417, M03, str3));
                }
                arrayList2.add(l41.E(5, org.telegram.messenger.g0.L(14.0f)));
                l41 c11 = l41.c(146, 2131232178, gd.M0(2131751907, null));
                c11.f37023r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(l41.w(pVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
