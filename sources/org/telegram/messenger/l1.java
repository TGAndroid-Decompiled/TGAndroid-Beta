package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f18426a;
    public final Collator f18427b;
    public final Object f18428c;

    public l1(Object obj, Collator collator, int i10) {
        this.f18426a = i10;
        this.f18428c = obj;
        this.f18427b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18426a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18428c).lambda$buildContactsSectionsArrays$43(this.f18427b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18428c, this.f18427b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
