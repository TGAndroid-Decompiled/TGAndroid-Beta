package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f19112a;
    public final Collator f19113b;
    public final Object f19114c;

    public k1(Object obj, Collator collator, int i10) {
        this.f19112a = i10;
        this.f19114c = obj;
        this.f19113b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19112a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19114c).lambda$buildContactsSectionsArrays$43(this.f19113b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19114c, this.f19113b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
