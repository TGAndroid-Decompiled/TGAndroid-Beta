package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.fy;
public final class m1 implements Runnable {
    public final int f20901a = 0;
    public final boolean f20902b;
    public final boolean f20903c;
    public final boolean d;
    public final Object f20904e;
    public final Object f20905f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.f20904e = contactsController;
        this.f20905f = hashMap;
        this.f20902b = z10;
        this.f20903c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f20901a) {
            case 0:
                ((ContactsController) this.f20904e).lambda$syncPhoneBookByAlert$7((HashMap) this.f20905f, this.f20902b, this.f20903c, this.d);
                return;
            default:
                fy.h0((fy) this.f20904e, this.f20902b, this.f20903c, this.d, (Activity) this.f20905f);
                return;
        }
    }

    public m1(fy fyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f20904e = fyVar;
        this.f20902b = z10;
        this.f20903c = z11;
        this.d = z12;
        this.f20905f = activity;
    }
}
