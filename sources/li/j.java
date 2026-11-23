package li;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.messenger.r10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class j implements r10 {
    public final int f19942a;
    public final p f19943b;

    public j(p pVar, int i7) {
        this.f19942a = i7;
        this.f19943b = pVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i7;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f19942a;
        int i11 = 0;
        p pVar = this.f19943b;
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
                c51 c51Var = (c51) obj2;
                arrayList2.add(o41.l(140, pVar.f19981s));
                if (v3.y(1, pVar.J)) {
                    TLRPC.Chat chat = pVar.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i7 = 2131751840;
                    } else {
                        i7 = 2131751839;
                    }
                    o41 c10 = o41.c(141, 2131232498, hd.N0(i7, null));
                    c10.f38063r = true;
                    arrayList2.add(c10);
                    arrayList2.add(o41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(o41.t(0, hd.N0(2131751862, null)));
                    arrayList2.add(o41.j(7, pVar.f19980r));
                    arrayList2.add(o41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, pVar.J)) {
                    arrayList2.add(o41.t(3, hd.N0(2131751860, null)));
                    o41 y10 = o41.y(150, hd.N0(2131751831, null), hd.N0(2131751830, null));
                    y10.L(pVar.f19979n);
                    arrayList2.add(y10);
                    o41 y11 = o41.y(151, hd.N0(2131751829, null), hd.N0(2131751828, null));
                    y11.L(!pVar.f19979n);
                    arrayList2.add(y11);
                    arrayList2.add(o41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(pVar.J)) {
                    String N0 = hd.N0(2131751953, null);
                    TLRPC.ChatFull chatFull = pVar.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(o41.d(142, 2131232051, N0, str));
                    String N02 = hd.N0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = pVar.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(o41.d(143, 2131231029, N02, str2));
                    String N03 = hd.N0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = pVar.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(o41.d(144, 2131232417, N03, str3));
                }
                arrayList2.add(o41.E(5, org.telegram.messenger.g0.L(14.0f)));
                o41 c11 = o41.c(146, 2131232178, hd.N0(2131751906, null));
                c11.f38063r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(o41.w(pVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
