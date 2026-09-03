package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.qy;
public final class n1 implements Runnable {
    public final int f17863a = 0;
    public final boolean f17864b;
    public final boolean f17865c;
    public final boolean d;
    public final Object e;
    public final Object f17866f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        this.e = contactsController;
        this.f17866f = hashMap;
        this.f17864b = z4;
        this.f17865c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17866f, this.f17864b, this.f17865c, this.d);
                return;
            default:
                qy.h0((qy) this.e, this.f17864b, this.f17865c, this.d, (Activity) this.f17866f);
                return;
        }
    }

    public n1(qy qyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        this.e = qyVar;
        this.f17864b = z4;
        this.f17865c = z10;
        this.d = z11;
        this.f17866f = activity;
    }
}
