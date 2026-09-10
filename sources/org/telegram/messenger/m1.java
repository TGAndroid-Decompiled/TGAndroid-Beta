package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class m1 implements Comparator {
    public final int f15743a;
    public final Collator f15744b;
    public final Object f15745c;

    public m1(Object obj, Collator collator, int i10) {
        this.f15743a = i10;
        this.f15745c = obj;
        this.f15744b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.f15743a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.f15745c).lambda$buildContactsSectionsArrays$43(this.f15744b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.f15745c, this.f15744b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
