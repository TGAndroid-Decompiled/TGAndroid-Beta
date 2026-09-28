package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f16879a;
    public final Collator f16880b;
    public final Object f16881c;

    public l1(Object obj, Collator collator, int i10) {
        this.f16879a = i10;
        this.f16881c = obj;
        this.f16880b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16879a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16881c).lambda$buildContactsSectionsArrays$43(this.f16880b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16881c, this.f16880b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
