package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class m1 implements Runnable {
    public final int f18379a = 0;
    public final boolean f18380b;
    public final boolean f18381c;
    public final boolean d;
    public final Object f18382e;
    public final Object f18383f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18382e = contactsController;
        this.f18383f = hashMap;
        this.f18380b = z10;
        this.f18381c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18379a) {
            case 0:
                ((ContactsController) this.f18382e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18383f, this.f18380b, this.f18381c, this.d);
                return;
            default:
                uy.i0((uy) this.f18382e, this.f18380b, this.f18381c, this.d, (Activity) this.f18383f);
                return;
        }
    }

    public m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18382e = uyVar;
        this.f18380b = z10;
        this.f18381c = z11;
        this.d = z12;
        this.f18383f = activity;
    }
}
