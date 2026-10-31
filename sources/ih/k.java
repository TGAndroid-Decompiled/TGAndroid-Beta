package ih;

import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
public final class k implements j20 {
    public final int f8558a;
    public final q f8559b;

    public k(q qVar, int i10) {
        this.f8558a = i10;
        this.f8559b = qVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f8558a;
        q qVar = this.f8559b;
        boolean z10 = false;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = qVar.f8573j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o10 = o5.o(messagePeerVote.peer);
                    TLObject d22 = vp.r1(qVar.f8567a).d2(o10);
                    int i12 = messagePeerVote.date;
                    p pVar = new p(qVar, o10, 0);
                    int i13 = m.f8561b;
                    a51 K = a51.K(m.class);
                    K.G = d22;
                    K.B = o10;
                    K.f24305z = i12;
                    K.D = pVar;
                    arrayList.add(K);
                }
                if (!qVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f8562b;
                        arrayList.add(a51.K(n.class));
                        arrayList.add(a51.K(n.class));
                        arrayList.add(a51.K(n.class));
                        arrayList.add(a51.K(n.class));
                        arrayList.add(a51.K(n.class));
                        return;
                    }
                    int i15 = o.f8563b;
                    arrayList.add(a51.K(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = qVar.f8567a;
                qVar.f8572i = false;
                if (tL_messages_votesList != null) {
                    vp.r1(i16).V3(tL_messages_votesList.users, false);
                    vp.r1(i16).P3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.f8571g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    qVar.h = z10;
                    qVar.f8573j.addAll(tL_messages_votesList.votes);
                    gg.c cVar = qVar.e;
                    if (cVar != null) {
                        cVar.run();
                        return;
                    }
                    return;
                }
                qVar.f8571g = null;
                qVar.h = true;
                return;
        }
    }
}
