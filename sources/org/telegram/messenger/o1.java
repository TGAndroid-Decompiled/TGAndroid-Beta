package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.ty;
public final class o1 implements Runnable {
    public final int f17151a = 0;
    public final boolean f17152b;
    public final boolean f17153c;
    public final boolean d;
    public final Object e;
    public final Object f17154f;

    public o1(ContactsController contactsController, HashMap hashMap, boolean z10, boolean z11, boolean z12) {
        this.e = contactsController;
        this.f17154f = hashMap;
        this.f17152b = z10;
        this.f17153c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f17151a) {
            case 0:
                ((ContactsController) this.e).lambda$syncPhoneBookByAlert$7((HashMap) this.f17154f, this.f17152b, this.f17153c, this.d);
                return;
            default:
                ty.h0((ty) this.e, this.f17152b, this.f17153c, this.d, (Activity) this.f17154f);
                return;
        }
    }

    public o1(ty tyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.e = tyVar;
        this.f17152b = z10;
        this.f17153c = z11;
        this.d = z12;
        this.f17154f = activity;
    }
}
