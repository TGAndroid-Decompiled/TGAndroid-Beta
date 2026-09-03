package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f17598a;
    public final Collator f17599b;
    public final Object f17600c;

    public k1(Object obj, Collator collator, int i10) {
        this.f17598a = i10;
        this.f17600c = obj;
        this.f17599b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f17598a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f17600c).lambda$buildContactsSectionsArrays$43(this.f17599b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f17600c, this.f17599b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
