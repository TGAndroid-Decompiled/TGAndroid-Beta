package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.wy;
public final class m1 implements Runnable {
    public final int f16723a = 0;
    public final boolean f16724b;
    public final boolean f16725c;
    public final boolean d;
    public final Object e;
    public final Object f16726f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16726f = hashMap;
        this.f16724b = z10;
        this.f16725c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16723a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16726f, this.f16724b, this.f16725c, this.d);
                return;
            default:
                wy.i0((wy) this.e, this.f16724b, this.f16725c, this.d, (Activity) this.f16726f);
                return;
        }
    }

    public m1(wy wyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = wyVar;
        this.f16724b = z10;
        this.f16725c = z11;
        this.d = z12;
        this.f16726f = activity;
    }
}
