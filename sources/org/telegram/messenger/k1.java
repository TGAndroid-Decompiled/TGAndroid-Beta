package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f19110a;
    public final Collator f19111b;
    public final Object f19112c;

    public k1(Object obj, Collator collator, int i10) {
        this.f19110a = i10;
        this.f19112c = obj;
        this.f19111b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19110a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19112c).lambda$buildContactsSectionsArrays$43(this.f19111b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19112c, this.f19111b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
