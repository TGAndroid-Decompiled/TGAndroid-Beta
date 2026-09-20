package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class n1 implements Runnable {
    public final int f17036a = 0;
    public final boolean f17037b;
    public final boolean f17038c;
    public final boolean d;
    public final Object e;
    public final Object f17039f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17039f = hashMap;
        this.f17037b = z10;
        this.f17038c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17036a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17039f, this.f17037b, this.f17038c, this.d);
                return;
            default:
                uy.i0((uy) this.e, this.f17037b, this.f17038c, this.d, (Activity) this.f17039f);
                return;
        }
    }

    public n1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.f17037b = z10;
        this.f17038c = z11;
        this.d = z12;
        this.f17039f = activity;
    }
}
