package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.e60;
public final class vc implements Runnable {
    public final int f26957a;
    public final hd f26958b;
    public final String f26959c;
    public final e60 d;

    public vc(hd hdVar, String str, e60 e60Var, int i7) {
        this.f26957a = i7;
        this.f26958b = hdVar;
        this.f26959c = str;
        this.d = e60Var;
    }

    @Override
    public final void run() {
        switch (this.f26957a) {
            case 0:
                g0.h3(new vc(this.f26958b, this.f26959c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = np.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26959c, true).apply();
                this.d.run();
                this.f26958b.Q = false;
                return;
        }
    }
}
