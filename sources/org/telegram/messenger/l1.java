package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f18385a;
    public final Collator f18386b;
    public final Object f18387c;

    public l1(Object obj, Collator collator, int i10) {
        this.f18385a = i10;
        this.f18387c = obj;
        this.f18386b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18385a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18387c).lambda$buildContactsSectionsArrays$43(this.f18386b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18387c, this.f18386b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
