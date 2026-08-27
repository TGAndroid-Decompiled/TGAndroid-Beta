package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class j1 implements Comparator {

    public final int f20624a;

    public final Collator f20625b;

    public final Object f20626c;

    public j1(Object obj, Collator collator, int i10) {
        this.f20624a = i10;
        this.f20626c = obj;
        this.f20625b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f20624a) {
            case 0:
                return ((ContactsController) this.f20626c).lambda$buildContactsSectionsArrays$43(this.f20625b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
            default:
                return ContactsController.lambda$processLoadedContacts$30((a0.h) this.f20626c, this.f20625b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
        }
    }
}
