package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.qy;
public final class o1 implements Runnable {
    public final int f17164a = 0;
    public final boolean f17165b;
    public final boolean f17166c;
    public final boolean d;
    public final Object e;
    public final Object f17167f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17167f = hashMap;
        this.f17165b = z10;
        this.f17166c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17164a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17167f, this.f17165b, this.f17166c, this.d);
                return;
            default:
                qy.h0((qy) this.e, this.f17165b, this.f17166c, this.d, (Activity) this.f17167f);
                return;
        }
    }

    public o1(qy qyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = qyVar;
        this.f17165b = z10;
        this.f17166c = z11;
        this.d = z12;
        this.f17167f = activity;
    }
}
