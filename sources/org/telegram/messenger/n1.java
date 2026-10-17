package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Comparator {
    public final int f19018a;
    public final Collator f19019b;
    public final Object f19020c;

    public n1(Object obj, Collator collator, int i10) {
        this.f19018a = i10;
        this.f19020c = obj;
        this.f19019b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f19018a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f19020c).lambda$buildContactsSectionsArrays$43(this.f19019b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f19020c, this.f19019b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
