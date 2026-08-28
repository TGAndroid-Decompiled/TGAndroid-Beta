package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.dy;
public final class n1 implements Runnable {
    public final int f21010a = 0;
    public final boolean f21011b;
    public final boolean f21012c;
    public final boolean d;
    public final Object f21013e;
    public final Object f21014f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f21013e = contactsController;
        this.f21014f = hashMap;
        this.f21011b = z10;
        this.f21012c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f21010a) {
            case 0:
                ((ContactsController) this.f21013e).lambda$syncPhoneBookByAlert$7((HashMap) this.f21014f, this.f21011b, this.f21012c, this.d);
                return;
            default:
                dy.g0((dy) this.f21013e, this.f21011b, this.f21012c, this.d, (Activity) this.f21014f);
                return;
        }
    }

    public n1(dy dyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f21013e = dyVar;
        this.f21011b = z10;
        this.f21012c = z11;
        this.d = z12;
        this.f21014f = activity;
    }
}
