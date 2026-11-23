package li;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
public final class i implements p10 {
    public final int f20039a;
    public final o f20040b;

    public i(o oVar, int i7) {
        this.f20039a = i7;
        this.f20040b = oVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i7;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f20039a;
        int i11 = 0;
        o oVar = this.f20040b;
        switch (i10) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                oVar.getClass();
                if (tL_error != null) {
                    kc.b0(oVar).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                arrayList2.add(n41.l(140, oVar.f20078s));
                if (v3.y(1, oVar.J)) {
                    TLRPC.Chat chat = oVar.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i7 = 2131751840;
                    } else {
                        i7 = 2131751839;
                    }
                    n41 c10 = n41.c(141, 2131232501, gd.N0(i7, null));
                    c10.f37660r = true;
                    arrayList2.add(c10);
                    arrayList2.add(n41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(n41.t(0, gd.N0(2131751862, null)));
                    arrayList2.add(n41.j(7, oVar.f20077r));
                    arrayList2.add(n41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, oVar.J)) {
                    arrayList2.add(n41.t(3, gd.N0(2131751860, null)));
                    n41 y10 = n41.y(150, gd.N0(2131751831, null), gd.N0(2131751830, null));
                    y10.L(oVar.f20076n);
                    arrayList2.add(y10);
                    n41 y11 = n41.y(151, gd.N0(2131751829, null), gd.N0(2131751828, null));
                    y11.L(!oVar.f20076n);
                    arrayList2.add(y11);
                    arrayList2.add(n41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(oVar.J)) {
                    String N0 = gd.N0(2131751953, null);
                    TLRPC.ChatFull chatFull = oVar.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(n41.d(142, 2131232054, N0, str));
                    String N02 = gd.N0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = oVar.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(n41.d(143, 2131231031, N02, str2));
                    String N03 = gd.N0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = oVar.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(n41.d(144, 2131232420, N03, str3));
                }
                arrayList2.add(n41.E(5, org.telegram.messenger.g0.L(14.0f)));
                n41 c11 = n41.c(146, 2131232181, gd.N0(2131751906, null));
                c11.f37660r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(n41.w(oVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
