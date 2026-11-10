package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.i60;
public final class xc implements Runnable {
    public final int f26467a;
    public final id f26468b;
    public final String f26469c;
    public final i60 d;

    public xc(id idVar, String str, i60 i60Var, int i7) {
        this.f26467a = i7;
        this.f26468b = idVar;
        this.f26469c = str;
        this.d = i60Var;
    }

    @Override
    public final void run() {
        switch (this.f26467a) {
            case 0:
                g0.h3(new xc(this.f26468b, this.f26469c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26469c, true).apply();
                this.d.run();
                this.f26468b.Q = false;
                return;
        }
    }
}
