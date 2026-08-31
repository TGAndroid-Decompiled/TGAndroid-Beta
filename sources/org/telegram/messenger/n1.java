package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.ui.py;
public final class n1 implements Runnable {
    public final int f19410a = 0;
    public final boolean f19411b;
    public final boolean f19412c;
    public final boolean d;
    public final Object f19413e;
    public final Object f19414f;

    public n1(ContactsController contactsController, HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        this.f19413e = contactsController;
        this.f19414f = hashMap;
        this.f19411b = z4;
        this.f19412c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f19410a) {
            case 0:
                ((ContactsController) this.f19413e).lambda$syncPhoneBookByAlert$7((HashMap) this.f19414f, this.f19411b, this.f19412c, this.d);
                return;
            default:
                py.h0((py) this.f19413e, this.f19411b, this.f19412c, this.d, (Activity) this.f19414f);
                return;
        }
    }

    public n1(py pyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        this.f19413e = pyVar;
        this.f19411b = z4;
        this.f19412c = z10;
        this.d = z11;
        this.f19414f = activity;
    }
}
