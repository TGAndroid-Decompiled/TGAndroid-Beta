package defpackage;

import android.content.Context;
import org.telegram.ui.ContactsActivity;
public final class ot2 extends tt2 {
    public final ContactsActivity P;

    public ot2(ContactsActivity contactsActivity, Context context, int i, boolean z, vf6 vf6Var, int i2) {
        super(context, i, z, vf6Var, i2);
        this.P = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot2.R():int");
    }

    @Override
    public final void f() {
        boolean z = false;
        X(false);
        ContactsActivity contactsActivity = this.P;
        o39 o39Var = contactsActivity.d;
        if (o39Var != null && o39Var.getAdapter() == this) {
            int b = b();
            boolean z2 = contactsActivity.G;
            o39 o39Var2 = contactsActivity.d;
            if (z2) {
                if (b != 2) {
                    z = true;
                }
                o39Var2.setFastScrollVisible(z);
                return;
            }
            if (b != 0) {
                z = true;
            }
            o39Var2.setFastScrollVisible(z);
        }
    }
}
