package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class o1 implements Runnable {
    public final int f18740a = 0;
    public final boolean f18741b;
    public final boolean f18742c;
    public final boolean d;
    public final Object f18743e;
    public final Object f18744f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18743e = contactsController;
        this.f18744f = hashMap;
        this.f18741b = z10;
        this.f18742c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                ((ContactsController) this.f18743e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18744f, this.f18741b, this.f18742c, this.d);
                return;
            default:
                uy.h0((uy) this.f18743e, this.f18741b, this.f18742c, this.d, (Activity) this.f18744f);
                return;
        }
    }

    public o1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18743e = uyVar;
        this.f18741b = z10;
        this.f18742c = z11;
        this.d = z12;
        this.f18744f = activity;
    }
}
