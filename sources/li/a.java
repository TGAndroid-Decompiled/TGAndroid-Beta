package li;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
public final class a implements p10 {
    public final int f19984a;
    public final f f19985b;

    public a(f fVar, int i7) {
        this.f19984a = i7;
        this.f19985b = fVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String N0;
        int i7;
        int i10 = this.f19984a;
        f fVar = this.f19985b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                arrayList.add(n41.l(0, fVar.h));
                n41 c10 = n41.c(1, 2131232181, gd.N0(2131751927, null));
                c10.f37660r = true;
                arrayList.add(c10);
                arrayList.add(n41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = fVar.f20027n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(n41.t(3, gd.N0(2131751957, null)));
                    ArrayList arrayList3 = fVar.f20027n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = fVar.getMessagesController().P0(chat.f28492id);
                        n41 w10 = n41.w(chat);
                        long j3 = chat.f28492id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            if (arrayList4 != null) {
                                i7 = arrayList4.size();
                            } else {
                                i7 = 0;
                            }
                            N0 = gd.G(i7, "Chats", new Object[0]);
                        } else {
                            N0 = gd.N0(2131748586, null);
                        }
                        w10.f37656n = N0;
                        arrayList.add(w10);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    fVar.getClass();
                    kc.b0(fVar).g0(tL_error, false);
                    return;
                }
                k0.d(0, fVar.f20023b, fVar);
                return;
        }
    }
}
