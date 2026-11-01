package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Comparator {
    public final int f18992a;
    public final Collator f18993b;
    public final Object f18994c;

    public w4(Object obj, Collator collator, int i10) {
        this.f18992a = i10;
        this.f18994c = obj;
        this.f18993b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f18992a) {
            case 0:
                i5 i5Var = (i5) this.f18994c;
                TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User Z12 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f18993b.compare(i20.j(Z1, true), i20.j(Z12, true));
            default:
                a0.h hVar = (a0.h) this.f18994c;
                return this.f18993b.compare(i20.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), i20.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
