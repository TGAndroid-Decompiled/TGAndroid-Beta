package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class k1 implements Comparator {
    public final int f16715a;
    public final Collator f16716b;
    public final Object f16717c;

    public k1(Object obj, Collator collator, int i10) {
        this.f16715a = i10;
        this.f16717c = obj;
        this.f16716b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16715a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16717c).lambda$buildContactsSectionsArrays$43(this.f16716b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16717c, this.f16716b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
