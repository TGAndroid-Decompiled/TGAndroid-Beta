package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.e60;
public final class vc implements Runnable {
    public final int f26956a;
    public final hd f26957b;
    public final String f26958c;
    public final e60 d;

    public vc(hd hdVar, String str, e60 e60Var, int i7) {
        this.f26956a = i7;
        this.f26957b = hdVar;
        this.f26958c = str;
        this.d = e60Var;
    }

    @Override
    public final void run() {
        switch (this.f26956a) {
            case 0:
                g0.h3(new vc(this.f26957b, this.f26958c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = np.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26958c, true).apply();
                this.d.run();
                this.f26957b.Q = false;
                return;
        }
    }
}
