package li;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p41;
public final class a implements s10 {
    public final int f19523a;
    public final e f19524b;

    public a(e eVar, int i7) {
        this.f19523a = i7;
        this.f19524b = eVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7;
        int i10 = this.f19523a;
        e eVar = this.f19524b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                arrayList.add(b41.l(0, eVar.h));
                b41 c10 = b41.c(1, 2131232177, hd.M0(2131751939, null));
                c10.f33186q = true;
                arrayList.add(c10);
                arrayList.add(b41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = eVar.f19558n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b41.t(3, hd.M0(2131751969, null)));
                    ArrayList arrayList3 = eVar.f19558n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = eVar.getMessagesController().N0(chat.f28051id);
                        b41 w10 = b41.w(chat);
                        long j3 = chat.f28051id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            if (arrayList4 != null) {
                                i7 = arrayList4.size();
                            } else {
                                i7 = 0;
                            }
                            M0 = hd.G(i7, "Chats", new Object[0]);
                        } else {
                            M0 = hd.M0(2131748779, null);
                        }
                        w10.f33182m = M0;
                        arrayList.add(w10);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    eVar.getClass();
                    cc.a0(eVar).f0(tL_error, false);
                    return;
                }
                l0.d(eVar, eVar.f19554b, 0);
                return;
        }
    }
}
