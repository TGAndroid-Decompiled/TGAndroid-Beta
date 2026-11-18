package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class uc implements Runnable {
    public final int f27145a;
    public final gd f27146b;
    public final String f27147c;
    public final g60 d;

    public uc(gd gdVar, String str, g60 g60Var, int i7) {
        this.f27145a = i7;
        this.f27146b = gdVar;
        this.f27147c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27145a) {
            case 0:
                g0.g3(new uc(this.f27146b, this.f27147c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27147c, true).apply();
                this.d.run();
                this.f27146b.Q = false;
                return;
        }
    }
}
