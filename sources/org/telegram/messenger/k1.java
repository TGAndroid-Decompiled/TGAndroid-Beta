package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f17619a;
    public final Collator f17620b;
    public final Object f17621c;

    public k1(Object obj, Collator collator, int i10) {
        this.f17619a = i10;
        this.f17621c = obj;
        this.f17620b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f17619a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f17621c).lambda$buildContactsSectionsArrays$43(this.f17620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f17621c, this.f17620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
