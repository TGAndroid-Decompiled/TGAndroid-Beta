package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class uc implements Runnable {
    public final int f27171a;
    public final gd f27172b;
    public final String f27173c;
    public final g60 d;

    public uc(gd gdVar, String str, g60 g60Var, int i7) {
        this.f27171a = i7;
        this.f27172b = gdVar;
        this.f27173c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27171a) {
            case 0:
                g0.g3(new uc(this.f27172b, this.f27173c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27173c, true).apply();
                this.d.run();
                this.f27172b.Q = false;
                return;
        }
    }
}
