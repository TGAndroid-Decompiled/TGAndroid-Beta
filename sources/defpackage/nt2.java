package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;
public final class nt2 extends sr9 {
    public final ContactsActivity L;

    public nt2(ContactsActivity contactsActivity, Context context, vf6 vf6Var, boolean z, boolean z2, boolean z3) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.I = new ArrayList();
        this.c = context;
        this.h = vf6Var;
        this.r = z;
        this.s = z2;
        this.y = 0L;
        this.w = z3;
        this.x = true;
        zr9 zr9Var = new zr9(true);
        this.f = zr9Var;
        zr9Var.a = new qr9(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f.e() && b() == 0) {
            this.L.c.e(false, true);
        }
    }
}
