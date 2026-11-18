package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class uc implements Runnable {
    public final int f27143a;
    public final gd f27144b;
    public final String f27145c;
    public final g60 d;

    public uc(gd gdVar, String str, g60 g60Var, int i7) {
        this.f27143a = i7;
        this.f27144b = gdVar;
        this.f27145c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27143a) {
            case 0:
                g0.g3(new uc(this.f27144b, this.f27145c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27145c, true).apply();
                this.d.run();
                this.f27144b.Q = false;
                return;
        }
    }
}
