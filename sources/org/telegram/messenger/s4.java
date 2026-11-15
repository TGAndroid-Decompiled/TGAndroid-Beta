package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Comparator {
    public final int f26406a;
    public final Collator f26407b;
    public final Object f26408c;

    public s4(Object obj, Collator collator, int i7) {
        this.f26406a = i7;
        this.f26408c = obj;
        this.f26407b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f26406a) {
            case 0:
                g5 g5Var = (g5) this.f26408c;
                TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f26407b.compare(q10.j(a22, true), q10.j(a23, true));
            default:
                a0.h hVar = (a0.h) this.f26408c;
                return this.f26407b.compare(q10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), q10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
