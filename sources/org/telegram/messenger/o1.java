package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.ry;
public final class o1 implements Runnable {
    public final int f16906a = 0;
    public final boolean f16907b;
    public final boolean f16908c;
    public final boolean d;
    public final Object e;
    public final Object f16909f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16909f = hashMap;
        this.f16907b = z10;
        this.f16908c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16906a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16909f, this.f16907b, this.f16908c, this.d);
                return;
            default:
                ry.h0((ry) this.e, this.f16907b, this.f16908c, this.d, (Activity) this.f16909f);
                return;
        }
    }

    public o1(ry ryVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = ryVar;
        this.f16907b = z10;
        this.f16908c = z11;
        this.d = z12;
        this.f16909f = activity;
    }
}
