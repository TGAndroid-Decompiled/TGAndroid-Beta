package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.uy;
public final class m1 implements Runnable {
    public final int f16714a = 0;
    public final boolean f16715b;
    public final boolean f16716c;
    public final boolean d;
    public final Object e;
    public final Object f16717f;

    public m1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f16717f = hashMap;
        this.f16715b = z10;
        this.f16716c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f16714a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f16717f, this.f16715b, this.f16716c, this.d);
                return;
            default:
                uy.i0((uy) this.e, this.f16715b, this.f16716c, this.d, (Activity) this.f16717f);
                return;
        }
    }

    public m1(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = uyVar;
        this.f16715b = z10;
        this.f16716c = z11;
        this.d = z12;
        this.f16717f = activity;
    }
}
