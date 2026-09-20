package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f16759a;
    public final Collator f16760b;
    public final Object f16761c;

    public k1(Object obj, Collator collator, int i10) {
        this.f16759a = i10;
        this.f16761c = obj;
        this.f16760b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16759a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16761c).lambda$buildContactsSectionsArrays$43(this.f16760b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16761c, this.f16760b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
