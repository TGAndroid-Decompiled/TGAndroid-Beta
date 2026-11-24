package defpackage;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;
public final class kt2 implements Runnable {
    public final byte a;
    public final ContactsActivity b;

    public kt2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override
    public final void run() {
        float f;
        int i;
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                y74 y74Var = contactsActivity.a;
                if (contactsActivity.r) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                y74Var.c(f);
                ot2 ot2Var = contactsActivity.b;
                float f2 = y74Var.f;
                ArrayList arrayList = ot2Var.O;
                ot2Var.M = f2;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((p06) arrayList.get(i2)).setLetterProgress(f2);
                }
                ot2 ot2Var2 = contactsActivity.b;
                if (contactsActivity.r) {
                    i = 1;
                } else {
                    i = 2;
                }
                ot2Var2.Y(i, false);
                contactsActivity.d.w0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(s33.h).withEndAction(new kt2(contactsActivity, (byte) 1));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    y74Var.e = (byte) 80;
                    y74Var.a(1.0f);
                    return;
                }
                return;
            default:
                contactsActivity.f0 = null;
                return;
        }
    }
}
