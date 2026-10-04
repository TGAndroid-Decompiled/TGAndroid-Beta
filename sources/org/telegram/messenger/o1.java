package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class o1 implements Runnable {
    public final int f18739a = 0;
    public final boolean f18740b;
    public final boolean f18741c;
    public final boolean d;
    public final Object f18742e;
    public final Object f18743f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18742e = contactsController;
        this.f18743f = hashMap;
        this.f18740b = z10;
        this.f18741c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18739a) {
            case 0:
                ((ContactsController) this.f18742e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18743f, this.f18740b, this.f18741c, this.d);
                return;
            default:
                uy.h0((uy) this.f18742e, this.f18740b, this.f18741c, this.d, (Activity) this.f18743f);
                return;
        }
    }

    public o1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18742e = uyVar;
        this.f18740b = z10;
        this.f18741c = z11;
        this.d = z12;
        this.f18743f = activity;
    }
}
