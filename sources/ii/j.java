package ii;

import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.y31;
public final class j implements v10 {
    public final int f15549a;
    public final p f15550b;

    public j(p pVar, int i7) {
        this.f15549a = i7;
        this.f15550b = pVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i7;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.f15549a;
        int i11 = 0;
        p pVar = this.f15550b;
        switch (i10) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                pVar.getClass();
                if (tL_error != null) {
                    hc.a0(pVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                arrayList2.add(y31.l(140, pVar.f15590s));
                if (t3.y(1, pVar.I)) {
                    TLRPC.Chat chat = pVar.I;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i7 = 2131751852;
                    } else {
                        i7 = 2131751851;
                    }
                    y31 c10 = y31.c(141, 2131232496, id.M0(i7, null));
                    c10.f40573q = true;
                    arrayList2.add(c10);
                    arrayList2.add(y31.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(y31.t(0, id.M0(2131751874, null)));
                    arrayList2.add(y31.j(7, pVar.f15589r));
                    arrayList2.add(y31.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, pVar.I)) {
                    arrayList2.add(y31.t(3, id.M0(2131751872, null)));
                    y31 y10 = y31.y(150, id.M0(2131751843, null), id.M0(2131751842, null));
                    y10.L(pVar.f15588n);
                    arrayList2.add(y10);
                    y31 y11 = y31.y(151, id.M0(2131751841, null), id.M0(2131751840, null));
                    y11.L(!pVar.f15588n);
                    arrayList2.add(y11);
                    arrayList2.add(y31.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(pVar.I)) {
                    String M0 = id.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = pVar.J;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(y31.d(142, 2131232049, M0, str));
                    String M02 = id.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = pVar.J;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(y31.d(143, 2131231029, M02, str2));
                    String M03 = id.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = pVar.J;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(y31.d(144, 2131232415, M03, str3));
                }
                arrayList2.add(y31.E(5, org.telegram.messenger.g0.L(14.0f)));
                y31 c11 = y31.c(146, 2131232176, id.M0(2131751918, null));
                c11.f40573q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(y31.w(pVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
