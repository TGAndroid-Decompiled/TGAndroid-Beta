package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class j1 implements Comparator {
    public final int f20619a;
    public final Collator f20620b;
    public final Object f20621c;

    public j1(Object obj, Collator collator, int i10) {
        this.f20619a = i10;
        this.f20621c = obj;
        this.f20620b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f20619a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f20621c).lambda$buildContactsSectionsArrays$43(this.f20620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.h) this.f20621c, this.f20620b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
