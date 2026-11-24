package defpackage;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;
public final class vu2 implements Runnable {
    public final byte a;
    public final ContactsActivity b;

    public vu2(ContactsActivity contactsActivity, byte b) {
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
                h94 h94Var = contactsActivity.a;
                if (contactsActivity.r) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                h94Var.c(f);
                zu2 zu2Var = contactsActivity.b;
                float f2 = h94Var.f;
                ArrayList arrayList = zu2Var.O;
                zu2Var.M = f2;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((p26) arrayList.get(i2)).setLetterProgress(f2);
                }
                zu2 zu2Var2 = contactsActivity.b;
                if (contactsActivity.r) {
                    i = 1;
                } else {
                    i = 2;
                }
                zu2Var2.Y(i, false);
                contactsActivity.d.w0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(d53.h).withEndAction(new vu2(contactsActivity, (byte) 1));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    h94Var.e = (byte) 80;
                    h94Var.a(1.0f);
                    return;
                }
                return;
            default:
                contactsActivity.f0 = null;
                return;
        }
    }
}
