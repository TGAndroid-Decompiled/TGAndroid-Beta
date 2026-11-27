package defpackage;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;
public final class eu2 implements Runnable {
    public final byte a;
    public final ContactsActivity b;

    public eu2(ContactsActivity contactsActivity, byte b) {
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
                contactsActivity.f0 = null;
                return;
            default:
                t84 t84Var = contactsActivity.a;
                if (contactsActivity.r) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                t84Var.c(f);
                iu2 iu2Var = contactsActivity.b;
                float f2 = t84Var.f;
                ArrayList arrayList = iu2Var.O;
                iu2Var.M = f2;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((t26) arrayList.get(i2)).setLetterProgress(f2);
                }
                iu2 iu2Var2 = contactsActivity.b;
                if (contactsActivity.r) {
                    i = 1;
                } else {
                    i = 2;
                }
                iu2Var2.Y(i, false);
                contactsActivity.d.x0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(k43.h).withEndAction(new eu2(contactsActivity, (byte) 0));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    t84Var.e = (byte) 80;
                    t84Var.a(1.0f);
                    return;
                }
                return;
        }
    }
}
