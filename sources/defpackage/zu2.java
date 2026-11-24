package defpackage;

import android.content.Context;
import org.telegram.ui.ContactsActivity;
public final class zu2 extends ev2 {
    public final ContactsActivity P;

    public zu2(ContactsActivity contactsActivity, Context context, int i, boolean z, vh6 vh6Var, int i2) {
        super(context, i, z, vh6Var, i2);
        this.P = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu2.R():int");
    }

    @Override
    public final void f() {
        boolean z = false;
        X(false);
        ContactsActivity contactsActivity = this.P;
        r59 r59Var = contactsActivity.d;
        if (r59Var != null && r59Var.getAdapter() == this) {
            int b = b();
            boolean z2 = contactsActivity.G;
            r59 r59Var2 = contactsActivity.d;
            if (z2) {
                if (b != 2) {
                    z = true;
                }
                r59Var2.setFastScrollVisible(z);
                return;
            }
            if (b != 0) {
                z = true;
            }
            r59Var2.setFastScrollVisible(z);
        }
    }
}
