package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Comparator {
    public final int f18433a;
    public final Collator f18434b;
    public final Object f18435c;

    public o1(Object obj, Collator collator, int i10) {
        this.f18433a = i10;
        this.f18435c = obj;
        this.f18434b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18433a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18435c).lambda$buildContactsSectionsArrays$43(this.f18434b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18435c, this.f18434b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
