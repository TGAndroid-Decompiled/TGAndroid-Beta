package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16878a;
    public final Collator f16879b;
    public final Object f16880c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16878a = i10;
        this.f16880c = obj;
        this.f16879b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16878a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16880c).lambda$buildContactsSectionsArrays$43(this.f16879b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16880c, this.f16879b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
