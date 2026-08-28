package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f20740a;
    public final Collator f20741b;
    public final Object f20742c;

    public k1(Object obj, Collator collator, int i9) {
        this.f20740a = i9;
        this.f20742c = obj;
        this.f20741b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f20740a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f20742c).lambda$buildContactsSectionsArrays$43(this.f20741b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f20742c, this.f20741b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
