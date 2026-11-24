package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a49 implements jac {
    public final byte a;
    public final f49 b;

    public a49(f49 f49Var, byte b) {
        this.a = b;
        this.b = f49Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        boolean z = false;
        f49 f49Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                arrayList.clear();
                ArrayList arrayList2 = f49Var.j;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long n = pg3.n(messagePeerVote.peer);
                    TLObject a2 = oc7.r1(f49Var.a).a2(n);
                    int i2 = messagePeerVote.date;
                    lz lzVar = new lz(f49Var, n, (byte) 5);
                    int i3 = c49.b;
                    c6c K = c6c.K(c49.class);
                    K.H = a2;
                    K.C = n;
                    K.A = i2;
                    K.E = lzVar;
                    arrayList.add(K);
                }
                if (!f49Var.h) {
                    if (arrayList2.isEmpty()) {
                        int i4 = d49.b;
                        arrayList.add(c6c.K(d49.class));
                        arrayList.add(c6c.K(d49.class));
                        arrayList.add(c6c.K(d49.class));
                        arrayList.add(c6c.K(d49.class));
                        arrayList.add(c6c.K(d49.class));
                        return;
                    }
                    int i5 = e49.b;
                    arrayList.add(c6c.K(e49.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i6 = f49Var.a;
                f49Var.i = false;
                if (tL_messages_votesList != null) {
                    oc7.r1(i6).d4(tL_messages_votesList.users, false);
                    oc7.r1(i6).X3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    f49Var.g = str;
                    if (str == null) {
                        z = true;
                    }
                    f49Var.h = z;
                    f49Var.j.addAll(tL_messages_votesList.votes);
                    f49Var.e.run();
                    return;
                }
                f49Var.g = null;
                f49Var.h = true;
                return;
        }
    }
}
