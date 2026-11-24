package defpackage;

import org.telegram.ui.ContactsActivity;
public final class jt2 implements uc7 {
    public final byte a;
    public final ContactsActivity b;

    public jt2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override
    public final void a(int i) {
        boolean z;
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                contactsActivity.Y = z;
                if (i != 0) {
                    contactsActivity.b0(false);
                    return;
                }
                return;
            default:
                contactsActivity.i0(i);
                return;
        }
    }
}
