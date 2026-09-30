package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.qy;
public final class o1 implements Runnable {
    public final int f17180a = 0;
    public final boolean f17181b;
    public final boolean f17182c;
    public final boolean d;
    public final Object e;
    public final Object f17183f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17183f = hashMap;
        this.f17181b = z10;
        this.f17182c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17180a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17183f, this.f17181b, this.f17182c, this.d);
                return;
            default:
                qy.h0((qy) this.e, this.f17181b, this.f17182c, this.d, (Activity) this.f17183f);
                return;
        }
    }

    public o1(qy qyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = qyVar;
        this.f17181b = z10;
        this.f17182c = z11;
        this.d = z12;
        this.f17183f = activity;
    }
}
