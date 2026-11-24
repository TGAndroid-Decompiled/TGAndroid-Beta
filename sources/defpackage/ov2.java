package defpackage;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ov2 implements Comparator {
    public final byte a;
    public final Collator b;
    public final Object c;

    public ov2(Object obj, Collator collator, byte b) {
        this.a = b;
        this.c = obj;
        this.b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Collator collator = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                bw2 bw2Var = (bw2) obj3;
                return collator.compare(m9c.k(bw2Var.getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) obj).user_id)), true), m9c.k(bw2Var.getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)), true));
            default:
                vh6 vh6Var = (vh6) obj3;
                return collator.compare(m9c.k((TLRPC.User) vh6Var.f(((TLRPC.TL_contact) obj).user_id), true), m9c.k((TLRPC.User) vh6Var.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
