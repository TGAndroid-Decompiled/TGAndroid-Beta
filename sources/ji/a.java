package ji;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
public final class a implements n10 {
    public final int f16259a;
    public final e f16260b;

    public a(e eVar, int i3) {
        this.f16259a = i3;
        this.f16260b = eVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i3;
        int i10 = this.f16259a;
        e eVar = this.f16260b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                arrayList.add(r31.l(0, eVar.h));
                r31 c2 = r31.c(1, 2131232176, bd.M0(2131751939, null));
                c2.f37632q = true;
                arrayList.add(c2);
                arrayList.add(r31.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = eVar.f16298n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(r31.t(3, bd.M0(2131751969, null)));
                    ArrayList arrayList3 = eVar.f16298n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = eVar.getMessagesController().N0(chat.f27001id);
                        r31 w10 = r31.w(chat);
                        long j10 = chat.f27001id;
                        w10.d = (int) (j10 ^ (j10 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            if (arrayList4 != null) {
                                i3 = arrayList4.size();
                            } else {
                                i3 = 0;
                            }
                            M0 = bd.G(i3, "Chats", new Object[0]);
                        } else {
                            M0 = bd.M0(2131748787, null);
                        }
                        w10.f37628m = M0;
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
                    fc.a0(eVar).f0(tL_error, false);
                    return;
                }
                j0.d(eVar, eVar.f16294b, 0);
                return;
        }
    }
}
