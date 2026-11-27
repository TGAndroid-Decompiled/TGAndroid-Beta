package defpackage;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class wu2 implements Comparator {
    public final byte a;
    public final Collator b;
    public final Object c;

    public wu2(Object obj, Collator collator, byte b) {
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
                lv2 lv2Var = (lv2) obj3;
                return collator.compare(lbc.k(lv2Var.getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) obj).user_id)), true), lbc.k(lv2Var.getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)), true));
            default:
                zh6 zh6Var = (zh6) obj3;
                return collator.compare(lbc.k((TLRPC.User) zh6Var.f(((TLRPC.TL_contact) obj).user_id), true), lbc.k((TLRPC.User) zh6Var.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
