package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Comparator {
    public final int f20909a;
    public final Collator f20910b;
    public final Object f20911c;

    public p1(Object obj, Collator collator, int i10) {
        this.f20909a = i10;
        this.f20911c = obj;
        this.f20910b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f20909a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f20911c).lambda$buildContactsSectionsArrays$43(this.f20910b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f20911c, this.f20910b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
