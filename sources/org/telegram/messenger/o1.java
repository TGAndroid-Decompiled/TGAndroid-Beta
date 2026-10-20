package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Comparator {
    public final int f19101a;
    public final Collator f19102b;
    public final Object f19103c;

    public o1(Object obj, Collator collator, int i10) {
        this.f19101a = i10;
        this.f19103c = obj;
        this.f19102b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19101a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19103c).lambda$buildContactsSectionsArrays$43(this.f19102b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19103c, this.f19102b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
