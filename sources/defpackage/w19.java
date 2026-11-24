package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w19 implements i8c {
    public final byte a;
    public final b29 b;

    public w19(b29 b29Var, byte b) {
        this.a = b;
        this.b = b29Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        boolean z = false;
        b29 b29Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                arrayList.clear();
                ArrayList arrayList2 = b29Var.j;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long n = cf3.n(messagePeerVote.peer);
                    TLObject Z1 = na7.q1(b29Var.a).Z1(n);
                    int i2 = messagePeerVote.date;
                    ly lyVar = new ly(b29Var, n, (byte) 5);
                    int i3 = y19.b;
                    c4c K = c4c.K(y19.class);
                    K.H = Z1;
                    K.C = n;
                    K.A = i2;
                    K.E = lyVar;
                    arrayList.add(K);
                }
                if (!b29Var.h) {
                    if (arrayList2.isEmpty()) {
                        int i4 = z19.b;
                        arrayList.add(c4c.K(z19.class));
                        arrayList.add(c4c.K(z19.class));
                        arrayList.add(c4c.K(z19.class));
                        arrayList.add(c4c.K(z19.class));
                        arrayList.add(c4c.K(z19.class));
                        return;
                    }
                    int i5 = a29.b;
                    arrayList.add(c4c.K(a29.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i6 = b29Var.a;
                b29Var.i = false;
                if (tL_messages_votesList != null) {
                    na7.q1(i6).b4(tL_messages_votesList.users, false);
                    na7.q1(i6).V3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    b29Var.g = str;
                    if (str == null) {
                        z = true;
                    }
                    b29Var.h = z;
                    b29Var.j.addAll(tL_messages_votesList.votes);
                    b29Var.e.run();
                    return;
                }
                b29Var.g = null;
                b29Var.h = true;
                return;
        }
    }
}
