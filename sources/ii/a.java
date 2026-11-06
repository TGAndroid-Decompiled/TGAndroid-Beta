package ii;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.w31;
public final class a implements v10 {
    public final int f15484a;
    public final f f15485b;

    public a(f fVar, int i7) {
        this.f15484a = i7;
        this.f15485b = fVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7;
        int i10 = this.f15484a;
        f fVar = this.f15485b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k41 k41Var = (k41) obj2;
                arrayList.add(w31.l(0, fVar.h));
                w31 c10 = w31.c(1, 2131232176, hd.M0(2131751939, null));
                c10.f39835q = true;
                arrayList.add(c10);
                arrayList.add(w31.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = fVar.f15527n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(w31.t(3, hd.M0(2131751969, null)));
                    ArrayList arrayList3 = fVar.f15527n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = fVar.getMessagesController().N0(chat.f26952id);
                        w31 w10 = w31.w(chat);
                        long j3 = chat.f26952id;
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
                            M0 = hd.M0(2131748778, null);
                        }
                        w10.f39831m = M0;
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
                    hc.a0(fVar).f0(tL_error, false);
                    return;
                }
                m0.d(fVar, fVar.f15523b, 0);
                return;
        }
    }
}
