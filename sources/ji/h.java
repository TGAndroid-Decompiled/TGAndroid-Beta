package ji;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
public final class h implements n10 {
    public final int f16310a;
    public final n f16311b;

    public h(n nVar, int i3) {
        this.f16310a = i3;
        this.f16311b = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i3;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f16310a;
        int i11 = 0;
        n nVar = this.f16311b;
        switch (i10) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                nVar.getClass();
                if (tL_error != null) {
                    fc.a0(nVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                arrayList2.add(r31.l(140, nVar.f16349s));
                if (t3.y(1, nVar.J)) {
                    TLRPC.Chat chat = nVar.J;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i3 = 2131751852;
                    } else {
                        i3 = 2131751851;
                    }
                    r31 c2 = r31.c(141, 2131232496, bd.M0(i3, null));
                    c2.f37632q = true;
                    arrayList2.add(c2);
                    arrayList2.add(r31.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(r31.t(0, bd.M0(2131751874, null)));
                    arrayList2.add(r31.j(7, nVar.f16348r));
                    arrayList2.add(r31.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, nVar.J)) {
                    arrayList2.add(r31.t(3, bd.M0(2131751872, null)));
                    r31 y9 = r31.y(150, bd.M0(2131751843, null), bd.M0(2131751842, null));
                    y9.L(nVar.f16347n);
                    arrayList2.add(y9);
                    r31 y10 = r31.y(151, bd.M0(2131751841, null), bd.M0(2131751840, null));
                    y10.L(!nVar.f16347n);
                    arrayList2.add(y10);
                    arrayList2.add(r31.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(nVar.J)) {
                    String M0 = bd.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = nVar.K;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(r31.d(142, 2131232049, M0, str));
                    String M02 = bd.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = nVar.K;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(r31.d(143, 2131231029, M02, str2));
                    String M03 = bd.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = nVar.K;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(r31.d(144, 2131232415, M03, str3));
                }
                arrayList2.add(r31.E(5, org.telegram.messenger.g0.L(14.0f)));
                r31 c10 = r31.c(146, 2131232176, bd.M0(2131751918, null));
                c10.f37632q = true;
                arrayList2.add(c10);
                TLRPC.ChatFull chatFull4 = nVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(r31.w(nVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
