package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ContactsActivity;
public final class ju2 extends v79 {
    public boolean a;
    public boolean b;
    public final ContactsActivity c;

    public ju2(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            ContactsActivity contactsActivity = this.c;
            if (contactsActivity.E && contactsActivity.y) {
                hl.t1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.b = true;
            return;
        }
        this.b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s != null && !contactsActivity.E) {
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 0 && this.a && (z || this.b)) {
                contactsActivity.w = !z;
                contactsActivity.e0();
            }
            this.a = true;
        }
    }
}
