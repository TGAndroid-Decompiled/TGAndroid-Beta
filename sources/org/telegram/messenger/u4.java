package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class u4 implements Comparator {
    public final int f27122a;
    public final Collator f27123b;
    public final Object f27124c;

    public u4(Object obj, Collator collator, int i7) {
        this.f27122a = i7;
        this.f27124c = obj;
        this.f27123b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f27122a) {
            case 0:
                i5 i5Var = (i5) this.f27124c;
                TLRPC.User c22 = i5Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User c23 = i5Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f27123b.compare(p10.k(c22, true), p10.k(c23, true));
            default:
                a0.h hVar = (a0.h) this.f27124c;
                return this.f27123b.compare(p10.k((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), p10.k((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
