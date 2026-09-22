package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f16774a;
    public final Collator f16775b;
    public final Object f16776c;

    public k1(Object obj, Collator collator, int i10) {
        this.f16774a = i10;
        this.f16776c = obj;
        this.f16775b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16774a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16776c).lambda$buildContactsSectionsArrays$43(this.f16775b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16776c, this.f16775b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
