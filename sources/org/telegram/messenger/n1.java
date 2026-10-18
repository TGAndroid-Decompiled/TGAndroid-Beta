package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Comparator {
    public final int f19022a;
    public final Collator f19023b;
    public final Object f19024c;

    public n1(Object obj, Collator collator, int i10) {
        this.f19022a = i10;
        this.f19024c = obj;
        this.f19023b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19022a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19024c).lambda$buildContactsSectionsArrays$43(this.f19023b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19024c, this.f19023b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
