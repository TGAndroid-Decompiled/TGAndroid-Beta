package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class n1 implements Runnable {
    public final int f17051a = 0;
    public final boolean f17052b;
    public final boolean f17053c;
    public final boolean d;
    public final Object e;
    public final Object f17054f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17054f = hashMap;
        this.f17052b = z10;
        this.f17053c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17051a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17054f, this.f17052b, this.f17053c, this.d);
                return;
            default:
                uy.i0((uy) this.e, this.f17052b, this.f17053c, this.d, (Activity) this.f17054f);
                return;
        }
    }

    public n1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.f17052b = z10;
        this.f17053c = z11;
        this.d = z12;
        this.f17054f = activity;
    }
}
