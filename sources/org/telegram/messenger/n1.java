package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class n1 implements Runnable {
    public final int f16809a = 0;
    public final boolean f16810b;
    public final boolean f16811c;
    public final boolean d;
    public final Object e;
    public final Object f16812f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16812f = hashMap;
        this.f16810b = z10;
        this.f16811c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16809a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16812f, this.f16810b, this.f16811c, this.d);
                return;
            default:
                uy.i0((uy) this.e, this.f16810b, this.f16811c, this.d, (Activity) this.f16812f);
                return;
        }
    }

    public n1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.f16810b = z10;
        this.f16811c = z11;
        this.d = z12;
        this.f16812f = activity;
    }
}
