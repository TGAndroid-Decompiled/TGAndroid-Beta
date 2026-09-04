package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class m1 implements Runnable {
    public final int f18317a = 0;
    public final boolean f18318b;
    public final boolean f18319c;
    public final boolean d;
    public final Object f18320e;
    public final Object f18321f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f18320e = contactsController;
        this.f18321f = hashMap;
        this.f18318b = z10;
        this.f18319c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f18317a) {
            case 0:
                ((ContactsController) this.f18320e).lambda$syncPhoneBookByAlert$7((HashMap) this.f18321f, this.f18318b, this.f18319c, this.d);
                return;
            default:
                uy.i0((uy) this.f18320e, this.f18318b, this.f18319c, this.d, (Activity) this.f18321f);
                return;
        }
    }

    public m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f18320e = uyVar;
        this.f18318b = z10;
        this.f18319c = z11;
        this.d = z12;
        this.f18321f = activity;
    }
}
