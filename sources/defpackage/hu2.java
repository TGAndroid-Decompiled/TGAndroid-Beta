package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;
public final class hu2 extends lv9 {
    public final ContactsActivity L;

    public hu2(ContactsActivity contactsActivity, Context context, zh6 zh6Var, boolean z, boolean z2, boolean z3) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.I = new ArrayList();
        this.c = context;
        this.h = zh6Var;
        this.r = z;
        this.s = z2;
        this.y = 0L;
        this.w = z3;
        this.x = true;
        sv9 sv9Var = new sv9(true);
        this.f = sv9Var;
        sv9Var.a = new jv9(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f.e() && b() == 0) {
            this.L.c.e(false, true);
        }
    }
}
