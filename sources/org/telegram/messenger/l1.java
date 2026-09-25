package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16877a;
    public final Collator f16878b;
    public final Object f16879c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16877a = i10;
        this.f16879c = obj;
        this.f16878b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16877a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16879c).lambda$buildContactsSectionsArrays$43(this.f16878b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16879c, this.f16878b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
