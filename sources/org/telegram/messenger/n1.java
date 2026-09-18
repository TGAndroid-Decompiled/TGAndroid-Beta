package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class n1 implements Runnable {
    public final int f16995a = 0;
    public final boolean f16996b;
    public final boolean f16997c;
    public final boolean d;
    public final Object e;
    public final Object f16998f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16998f = hashMap;
        this.f16996b = z10;
        this.f16997c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16995a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16998f, this.f16996b, this.f16997c, this.d);
                return;
            default:
                uy.i0((uy) this.e, this.f16996b, this.f16997c, this.d, (Activity) this.f16998f);
                return;
        }
    }

    public n1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.f16996b = z10;
        this.f16997c = z11;
        this.d = z12;
        this.f16998f = activity;
    }
}
