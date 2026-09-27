package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16871a;
    public final Collator f16872b;
    public final Object f16873c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16871a = i10;
        this.f16873c = obj;
        this.f16872b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16871a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16873c).lambda$buildContactsSectionsArrays$43(this.f16872b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16873c, this.f16872b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
