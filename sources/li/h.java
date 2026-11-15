package li;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.s10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p41;
public final class h implements s10 {
    public final int f19575a;
    public final n f19576b;

    public h(n nVar, int i7) {
        this.f19575a = i7;
        this.f19576b = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i7;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f19575a;
        int i11 = 0;
        n nVar = this.f19576b;
        switch (i10) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                nVar.getClass();
                if (tL_error != null) {
                    cc.a0(nVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                arrayList2.add(b41.l(140, nVar.f19616s));
                if (t3.y(1, nVar.J)) {
                    TLRPC.Chat chat = nVar.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i7 = 2131751852;
                    } else {
                        i7 = 2131751851;
                    }
                    b41 c10 = b41.c(141, 2131232497, hd.M0(i7, null));
                    c10.f33186q = true;
                    arrayList2.add(c10);
                    arrayList2.add(b41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(b41.t(0, hd.M0(2131751874, null)));
                    arrayList2.add(b41.j(7, nVar.f19615r));
                    arrayList2.add(b41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, nVar.J)) {
                    arrayList2.add(b41.t(3, hd.M0(2131751872, null)));
                    b41 y10 = b41.y(150, hd.M0(2131751843, null), hd.M0(2131751842, null));
                    y10.L(nVar.f19614n);
                    arrayList2.add(y10);
                    b41 y11 = b41.y(151, hd.M0(2131751841, null), hd.M0(2131751840, null));
                    y11.L(!nVar.f19614n);
                    arrayList2.add(y11);
                    arrayList2.add(b41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(nVar.J)) {
                    String M0 = hd.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = nVar.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(b41.d(142, 2131232050, M0, str));
                    String M02 = hd.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = nVar.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(b41.d(143, 2131231029, M02, str2));
                    String M03 = hd.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = nVar.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(b41.d(144, 2131232416, M03, str3));
                }
                arrayList2.add(b41.E(5, org.telegram.messenger.g0.L(14.0f)));
                b41 c11 = b41.c(146, 2131232177, hd.M0(2131751918, null));
                c11.f33186q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = nVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(b41.w(nVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
