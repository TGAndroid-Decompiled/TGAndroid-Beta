package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.g60;
public final class vc implements Runnable {
    public final int f27342a;
    public final hd f27343b;
    public final String f27344c;
    public final g60 d;

    public vc(hd hdVar, String str, g60 g60Var, int i7) {
        this.f27342a = i7;
        this.f27343b = hdVar;
        this.f27344c = str;
        this.d = g60Var;
    }

    @Override
    public final void run() {
        switch (this.f27342a) {
            case 0:
                g0.g3(new vc(this.f27343b, this.f27344c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = np.g1().edit();
                edit.putBoolean("langpack_patched" + this.f27344c, true).apply();
                this.d.run();
                this.f27343b.Q = false;
                return;
        }
    }
}
