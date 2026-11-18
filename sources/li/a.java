package li;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z41;
public final class a implements q10 {
    public final int f19887a;
    public final g f19888b;

    public a(g gVar, int i7) {
        this.f19887a = i7;
        this.f19888b = gVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7;
        int i10 = this.f19887a;
        g gVar = this.f19888b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                arrayList.add(l41.l(0, gVar.h));
                l41 c10 = l41.c(1, 2131232178, gd.M0(2131751928, null));
                c10.f37023r = true;
                arrayList.add(c10);
                arrayList.add(l41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = gVar.f19933n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(l41.t(3, gd.M0(2131751958, null)));
                    ArrayList arrayList3 = gVar.f19933n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = gVar.getMessagesController().P0(chat.f28403id);
                        l41 w10 = l41.w(chat);
                        long j3 = chat.f28403id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            if (arrayList4 != null) {
                                i7 = arrayList4.size();
                            } else {
                                i7 = 0;
                            }
                            M0 = gd.G(i7, "Chats", new Object[0]);
                        } else {
                            M0 = gd.M0(2131748587, null);
                        }
                        w10.f37019n = M0;
                        arrayList.add(w10);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    gVar.getClass();
                    lc.b0(gVar).g0(tL_error, false);
                    return;
                }
                l0.d(0, gVar.f19929b, gVar);
                return;
        }
    }
}
