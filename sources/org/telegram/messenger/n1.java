package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Comparator {
    public final int f19019a;
    public final Collator f19020b;
    public final Object f19021c;

    public n1(Object obj, Collator collator, int i10) {
        this.f19019a = i10;
        this.f19021c = obj;
        this.f19020b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19019a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19021c).lambda$buildContactsSectionsArrays$43(this.f19020b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19021c, this.f19020b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
