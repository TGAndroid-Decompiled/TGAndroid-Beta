package defpackage;

import android.content.Context;
import org.telegram.ui.ContactsActivity;
public final class iu2 extends nu2 {
    public final ContactsActivity P;

    public iu2(ContactsActivity contactsActivity, Context context, int i, boolean z, zh6 zh6Var, int i2) {
        super(context, i, z, zh6Var, i2);
        this.P = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu2.R():int");
    }

    @Override
    public final void f() {
        boolean z = false;
        X(false);
        ContactsActivity contactsActivity = this.P;
        d79 d79Var = contactsActivity.d;
        if (d79Var != null && d79Var.getAdapter() == this) {
            int b = b();
            boolean z2 = contactsActivity.G;
            d79 d79Var2 = contactsActivity.d;
            if (z2) {
                if (b != 2) {
                    z = true;
                }
                d79Var2.setFastScrollVisible(z);
                return;
            }
            if (b != 0) {
                z = true;
            }
            d79Var2.setFastScrollVisible(z);
        }
    }
}
