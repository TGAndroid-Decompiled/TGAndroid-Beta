package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Comparator {
    public final int f20913a;
    public final Collator f20914b;
    public final Object f20915c;

    public p1(Object obj, Collator collator, int i10) {
        this.f20913a = i10;
        this.f20915c = obj;
        this.f20914b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f20913a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f20915c).lambda$buildContactsSectionsArrays$43(this.f20914b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f20915c, this.f20914b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
