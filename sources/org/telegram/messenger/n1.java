package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Comparator {
    public final int f17911a;
    public final Collator f17912b;
    public final Object f17913c;

    public n1(Object obj, Collator collator, int i10) {
        this.f17911a = i10;
        this.f17913c = obj;
        this.f17912b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f17911a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f17913c).lambda$buildContactsSectionsArrays$43(this.f17912b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f17913c, this.f17912b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
