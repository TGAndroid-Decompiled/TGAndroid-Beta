package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.py;
public final class n1 implements Runnable {
    public final int f19412a = 0;
    public final boolean f19413b;
    public final boolean f19414c;
    public final boolean d;
    public final Object f19415e;
    public final Object f19416f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        this.f19415e = contactsController;
        this.f19416f = hashMap;
        this.f19413b = z4;
        this.f19414c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                ((ContactsController) this.f19415e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19416f, this.f19413b, this.f19414c, this.d);
                return;
            default:
                py.h0((py) this.f19415e, this.f19413b, this.f19414c, this.d, (Activity) this.f19416f);
                return;
        }
    }

    public n1(py pyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        this.f19415e = pyVar;
        this.f19413b = z4;
        this.f19414c = z10;
        this.d = z11;
        this.f19416f = activity;
    }
}
