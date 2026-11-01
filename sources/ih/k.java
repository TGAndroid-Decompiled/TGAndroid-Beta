package ih;

import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
public final class k implements k20 {
    public final int f8559a;
    public final q f8560b;

    public k(q qVar, int i10) {
        this.f8559a = i10;
        this.f8560b = qVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f8559a;
        q qVar = this.f8560b;
        boolean z10 = false;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = qVar.f8574j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o10 = o5.o(messagePeerVote.peer);
                    TLObject d22 = wp.r1(qVar.f8568a).d2(o10);
                    int i12 = messagePeerVote.date;
                    p pVar = new p(qVar, o10, 0);
                    int i13 = m.f8562b;
                    b51 K = b51.K(m.class);
                    K.G = d22;
                    K.B = o10;
                    K.f24656z = i12;
                    K.D = pVar;
                    arrayList.add(K);
                }
                if (!qVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f8563b;
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        return;
                    }
                    int i15 = o.f8564b;
                    arrayList.add(b51.K(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = qVar.f8568a;
                qVar.f8573i = false;
                if (tL_messages_votesList != null) {
                    wp.r1(i16).V3(tL_messages_votesList.users, false);
                    wp.r1(i16).P3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.f8572g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    qVar.h = z10;
                    qVar.f8574j.addAll(tL_messages_votesList.votes);
                    gg.c cVar = qVar.e;
                    if (cVar != null) {
                        cVar.run();
                        return;
                    }
                    return;
                }
                qVar.f8572g = null;
                qVar.h = true;
                return;
        }
    }
}
