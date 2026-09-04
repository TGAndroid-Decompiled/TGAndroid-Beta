package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class j1 implements Comparator {
    public final int f18016a;
    public final Collator f18017b;
    public final Object f18018c;

    public j1(Object obj, Collator collator, int i10) {
        this.f18016a = i10;
        this.f18018c = obj;
        this.f18017b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18016a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18018c).lambda$buildContactsSectionsArrays$43(this.f18017b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18018c, this.f18017b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
