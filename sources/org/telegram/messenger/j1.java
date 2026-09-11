package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class j1 implements Comparator {
    public final int f18034a;
    public final Collator f18035b;
    public final Object f18036c;

    public j1(Object obj, Collator collator, int i10) {
        this.f18034a = i10;
        this.f18036c = obj;
        this.f18035b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18034a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18036c).lambda$buildContactsSectionsArrays$43(this.f18035b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18036c, this.f18035b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
