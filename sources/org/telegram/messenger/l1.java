package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f18418a;
    public final Collator f18419b;
    public final Object f18420c;

    public l1(Object obj, Collator collator, int i10) {
        this.f18418a = i10;
        this.f18420c = obj;
        this.f18419b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18418a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18420c).lambda$buildContactsSectionsArrays$43(this.f18419b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18420c, this.f18419b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
