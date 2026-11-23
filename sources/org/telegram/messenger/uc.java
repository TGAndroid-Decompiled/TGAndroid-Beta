package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class uc implements Runnable {
    public final int f27247a;
    public final gd f27248b;
    public final String f27249c;
    public final g60 d;

    public uc(gd gdVar, String str, g60 g60Var, int i7) {
        this.f27247a = i7;
        this.f27248b = gdVar;
        this.f27249c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27247a) {
            case 0:
                g0.g3(new uc(this.f27248b, this.f27249c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27249c, true).apply();
                this.d.run();
                this.f27248b.Q = false;
                return;
        }
    }
}
