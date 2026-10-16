package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Comparator {
    public final int f17608a;
    public final Collator f17609b;
    public final Object f17610c;

    public n1(Object obj, Collator collator, int i10) {
        this.f17608a = i10;
        this.f17610c = obj;
        this.f17609b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f17608a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f17610c).lambda$buildContactsSectionsArrays$43(this.f17609b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f17610c, this.f17609b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
