package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class m1 implements Runnable {
    public final int f18344a = 0;
    public final boolean f18345b;
    public final boolean f18346c;
    public final boolean d;
    public final Object f18347e;
    public final Object f18348f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18347e = contactsController;
        this.f18348f = hashMap;
        this.f18345b = z10;
        this.f18346c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18344a) {
            case 0:
                ((ContactsController) this.f18347e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18348f, this.f18345b, this.f18346c, this.d);
                return;
            default:
                uy.i0((uy) this.f18347e, this.f18345b, this.f18346c, this.d, (Activity) this.f18348f);
                return;
        }
    }

    public m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18347e = uyVar;
        this.f18345b = z10;
        this.f18346c = z11;
        this.d = z12;
        this.f18348f = activity;
    }
}
