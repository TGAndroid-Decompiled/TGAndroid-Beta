package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Comparator {
    public final int f25574a;
    public final Collator f25575b;
    public final Object f25576c;

    public t4(Object obj, Collator collator, int i7) {
        this.f25574a = i7;
        this.f25576c = obj;
        this.f25575b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f25574a) {
            case 0:
                g5 g5Var = (g5) this.f25576c;
                TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f25575b.compare(t10.j(a22, true), t10.j(a23, true));
            default:
                a0.h hVar = (a0.h) this.f25576c;
                return this.f25575b.compare(t10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), t10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
