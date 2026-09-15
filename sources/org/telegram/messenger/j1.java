package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class j1 implements Comparator {
    public final int f16446a;
    public final Collator f16447b;
    public final Object f16448c;

    public j1(Object obj, Collator collator, int i10) {
        this.f16446a = i10;
        this.f16448c = obj;
        this.f16447b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f16446a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f16448c).lambda$buildContactsSectionsArrays$43(this.f16447b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f16448c, this.f16447b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
