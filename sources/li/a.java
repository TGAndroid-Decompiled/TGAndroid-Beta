package li;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class a implements r10 {
    public final int f19884a;
    public final g f19885b;

    public a(g gVar, int i7) {
        this.f19884a = i7;
        this.f19885b = gVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String N0;
        int i7;
        int i10 = this.f19884a;
        g gVar = this.f19885b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                arrayList.add(o41.l(0, gVar.h));
                o41 c10 = o41.c(1, 2131232178, hd.N0(2131751927, null));
                c10.f38063r = true;
                arrayList.add(c10);
                arrayList.add(o41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = gVar.f19930n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(o41.t(3, hd.N0(2131751957, null)));
                    ArrayList arrayList3 = gVar.f19930n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = gVar.getMessagesController().P0(chat.f28398id);
                        o41 w10 = o41.w(chat);
                        long j3 = chat.f28398id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            if (arrayList4 != null) {
                                i7 = arrayList4.size();
                            } else {
                                i7 = 0;
                            }
                            N0 = hd.G(i7, "Chats", new Object[0]);
                        } else {
                            N0 = hd.N0(2131748586, null);
                        }
                        w10.f38059n = N0;
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
                l0.d(0, gVar.f19926b, gVar);
                return;
        }
    }
}
