package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16619a;
    public final Collator f16620b;
    public final Object f16621c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16619a = i10;
        this.f16621c = obj;
        this.f16620b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16619a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16621c).lambda$buildContactsSectionsArrays$43(this.f16620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16621c, this.f16620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
