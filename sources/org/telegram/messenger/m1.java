package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.gy;

public final class m1 implements Runnable {

    public final int f20923a = 0;

    public final boolean f20924b;

    public final boolean f20925c;
    public final boolean d;

    public final Object f20926e;

    public final Object f20927f;

    public m1(ContactsController contactsController, HashMap map, boolean z10, boolean z11, boolean z12) {
        this.f20926e = contactsController;
        this.f20927f = map;
        this.f20924b = z10;
        this.f20925c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f20923a) {
            case 0:
                ((ContactsController) this.f20926e).lambda$syncPhoneBookByAlert$7((HashMap) this.f20927f, this.f20924b, this.f20925c, this.d);
                break;
            default:
                gy.h0((gy) this.f20926e, this.f20924b, this.f20925c, this.d, (Activity) this.f20927f);
                break;
        }
    }

    public m1(gy gyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.f20926e = gyVar;
        this.f20924b = z10;
        this.f20925c = z11;
        this.d = z12;
        this.f20927f = activity;
    }
}
