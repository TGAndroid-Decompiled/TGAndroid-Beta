package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Comparator {
    public final int f19090a;
    public final Collator f19091b;
    public final Object f19092c;

    public o1(Object obj, Collator collator, int i10) {
        this.f19090a = i10;
        this.f19092c = obj;
        this.f19091b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19090a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19092c).lambda$buildContactsSectionsArrays$43(this.f19091b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19092c, this.f19091b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
