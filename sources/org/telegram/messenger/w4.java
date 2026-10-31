package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Comparator {
    public final int f19060a;
    public final Collator f19061b;
    public final Object f19062c;

    public w4(Object obj, Collator collator, int i10) {
        this.f19060a = i10;
        this.f19062c = obj;
        this.f19061b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f19060a) {
            case 0:
                i5 i5Var = (i5) this.f19062c;
                TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                TLRPC.User Z12 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                return this.f19061b.compare(h20.j(Z1, true), h20.j(Z12, true));
            default:
                a0.h hVar = (a0.h) this.f19062c;
                return this.f19061b.compare(h20.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj).user_id), true), h20.j((TLRPC.User) hVar.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
