package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.oy;
public final class n1 implements Runnable {
    public final int f17888a = 0;
    public final boolean f17889b;
    public final boolean f17890c;
    public final boolean d;
    public final Object e;
    public final Object f17891f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        this.e = contactsController;
        this.f17891f = hashMap;
        this.f17889b = z4;
        this.f17890c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17891f, this.f17889b, this.f17890c, this.d);
                return;
            default:
                oy.h0((oy) this.e, this.f17889b, this.f17890c, this.d, (Activity) this.f17891f);
                return;
        }
    }

    public n1(oy oyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        this.e = oyVar;
        this.f17889b = z4;
        this.f17890c = z10;
        this.d = z11;
        this.f17891f = activity;
    }
}
