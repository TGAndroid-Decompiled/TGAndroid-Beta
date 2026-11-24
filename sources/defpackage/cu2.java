package defpackage;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class cu2 implements Comparator {
    public final byte a;
    public final Collator b;
    public final Object c;

    public cu2(Object obj, Collator collator, byte b) {
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
                qu2 qu2Var = (qu2) obj3;
                return collator.compare(l7c.k(qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) obj).user_id)), true), l7c.k(qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)), true));
            default:
                vf6 vf6Var = (vf6) obj3;
                return collator.compare(l7c.k((TLRPC.User) vf6Var.f(((TLRPC.TL_contact) obj).user_id), true), l7c.k((TLRPC.User) vf6Var.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
