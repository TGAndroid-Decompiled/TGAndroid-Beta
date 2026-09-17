package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class m1 implements Runnable {
    public final int f18352a = 0;
    public final boolean f18353b;
    public final boolean f18354c;
    public final boolean d;
    public final Object f18355e;
    public final Object f18356f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18355e = contactsController;
        this.f18356f = hashMap;
        this.f18353b = z10;
        this.f18354c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18352a) {
            case 0:
                ((ContactsController) this.f18355e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18356f, this.f18353b, this.f18354c, this.d);
                return;
            default:
                uy.i0((uy) this.f18355e, this.f18353b, this.f18354c, this.d, (Activity) this.f18356f);
                return;
        }
    }

    public m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18355e = uyVar;
        this.f18353b = z10;
        this.f18354c = z11;
        this.d = z12;
        this.f18356f = activity;
    }
}
