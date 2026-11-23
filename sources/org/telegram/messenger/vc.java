package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class vc implements Runnable {
    public final int f27306a;
    public final hd f27307b;
    public final String f27308c;
    public final g60 d;

    public vc(hd hdVar, String str, g60 g60Var, int i7) {
        this.f27306a = i7;
        this.f27307b = hdVar;
        this.f27308c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27306a) {
            case 0:
                g0.g3(new vc(this.f27307b, this.f27308c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = np.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27308c, true).apply();
                this.d.run();
                this.f27307b.Q = false;
                return;
        }
    }
}
