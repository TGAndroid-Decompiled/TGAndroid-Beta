package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class o1 implements Runnable {
    public final int f18736a = 0;
    public final boolean f18737b;
    public final boolean f18738c;
    public final boolean d;
    public final Object f18739e;
    public final Object f18740f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18739e = contactsController;
        this.f18740f = hashMap;
        this.f18737b = z10;
        this.f18738c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18736a) {
            case 0:
                ((ContactsController) this.f18739e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18740f, this.f18737b, this.f18738c, this.d);
                return;
            default:
                uy.h0((uy) this.f18739e, this.f18737b, this.f18738c, this.d, (Activity) this.f18740f);
                return;
        }
    }

    public o1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18739e = uyVar;
        this.f18737b = z10;
        this.f18738c = z11;
        this.d = z12;
        this.f18740f = activity;
    }
}
