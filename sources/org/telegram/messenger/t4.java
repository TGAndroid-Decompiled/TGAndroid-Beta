package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Comparator {
    public final int f25479a;
    public final Collator f25480b;
    public final Object f25481c;

    public t4(Object obj, Collator collator, int i3) {
        this.f25479a = i3;
        this.f25481c = obj;
        this.f25480b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f25479a) {
            case 0:
                g5 g5Var = (g5) this.f25481c;
                TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f25480b.compare(l10.j(a22, true), l10.j(a23, true));
            default:
                a0.h hVar = (a0.h) this.f25481c;
                return this.f25480b.compare(l10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), l10.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
