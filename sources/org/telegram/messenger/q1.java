package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.wy;
public final class q1 implements Runnable {
    public final int f16094a = 0;
    public final boolean f16095b;
    public final boolean f16096c;
    public final boolean d;
    public final Object e;
    public final Object f16097f;

    public q1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16097f = hashMap;
        this.f16095b = z10;
        this.f16096c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16097f, this.f16095b, this.f16096c, this.d);
                return;
            default:
                wy.i0((wy) this.e, this.f16095b, this.f16096c, this.d, (Activity) this.f16097f);
                return;
        }
    }

    public q1(wy wyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = wyVar;
        this.f16095b = z10;
        this.f16096c = z11;
        this.d = z12;
        this.f16097f = activity;
    }
}
