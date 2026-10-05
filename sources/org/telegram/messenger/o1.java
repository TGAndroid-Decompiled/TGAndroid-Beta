package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class o1 implements Runnable {
    public final int f18741a = 0;
    public final boolean f18742b;
    public final boolean f18743c;
    public final boolean d;
    public final Object f18744e;
    public final Object f18745f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18744e = contactsController;
        this.f18745f = hashMap;
        this.f18742b = z10;
        this.f18743c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18741a) {
            case 0:
                ((ContactsController) this.f18744e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18745f, this.f18742b, this.f18743c, this.d);
                return;
            default:
                uy.h0((uy) this.f18744e, this.f18742b, this.f18743c, this.d, (Activity) this.f18745f);
                return;
        }
    }

    public o1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18744e = uyVar;
        this.f18742b = z10;
        this.f18743c = z11;
        this.d = z12;
        this.f18745f = activity;
    }
}
