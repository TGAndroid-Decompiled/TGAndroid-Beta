package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.z50;
public final class qc implements Runnable {
    public final int f24874a;
    public final bd f24875b;
    public final String f24876c;
    public final z50 d;

    public qc(bd bdVar, String str, z50 z50Var, int i3) {
        this.f24874a = i3;
        this.f24875b = bdVar;
        this.f24876c = str;
        this.d = z50Var;
    }

    @Override
    public final void run() {
        switch (this.f24874a) {
            case 0:
                g0.h3(new qc(this.f24875b, this.f24876c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putBoolean("langpack_patched" + this.f24876c, true).apply();
                this.d.run();
                this.f24875b.Q = false;
                return;
        }
    }
}
