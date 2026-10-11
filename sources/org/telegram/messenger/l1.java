package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Comparator {
    public final int f18390a;
    public final Collator f18391b;
    public final Object f18392c;

    public l1(Object obj, Collator collator, int i10) {
        this.f18390a = i10;
        this.f18392c = obj;
        this.f18391b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f18390a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f18392c).lambda$buildContactsSectionsArrays$43(this.f18391b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f18392c, this.f18391b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
