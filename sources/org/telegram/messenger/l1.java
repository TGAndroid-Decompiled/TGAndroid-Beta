package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16862a;
    public final Collator f16863b;
    public final Object f16864c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16862a = i10;
        this.f16864c = obj;
        this.f16863b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16862a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16864c).lambda$buildContactsSectionsArrays$43(this.f16863b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16864c, this.f16863b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
