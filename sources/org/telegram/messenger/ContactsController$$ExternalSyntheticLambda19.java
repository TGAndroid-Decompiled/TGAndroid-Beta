package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class ContactsController$$ExternalSyntheticLambda19 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;
    public final Collator f$1;

    public ContactsController$$ExternalSyntheticLambda19(Object obj, Collator collator, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj;
        TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((ContactsController) this.f$0).lambda$buildContactsSectionsArrays$43(this.f$1, tL_contact, tL_contact2);
            default:
                return ContactsController.lambda$processLoadedContacts$30((LongSparseArray) this.f$0, this.f$1, tL_contact, tL_contact2);
        }
    }
}
