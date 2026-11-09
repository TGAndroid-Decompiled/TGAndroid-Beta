package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.h60;
public final class xc implements Runnable {
    public final int f26463a;
    public final id f26464b;
    public final String f26465c;
    public final h60 d;

    public xc(id idVar, String str, h60 h60Var, int i7) {
        this.f26463a = i7;
        this.f26464b = idVar;
        this.f26465c = str;
        this.d = h60Var;
    }

    @Override
    public final void run() {
        switch (this.f26463a) {
            case 0:
                g0.h3(new xc(this.f26464b, this.f26465c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26465c, true).apply();
                this.d.run();
                this.f26464b.Q = false;
                return;
        }
    }
}
