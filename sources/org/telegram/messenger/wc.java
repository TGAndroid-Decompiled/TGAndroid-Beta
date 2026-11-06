package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.f60;
public final class wc implements Runnable {
    public final int f26274a;
    public final hd f26275b;
    public final String f26276c;
    public final f60 d;

    public wc(hd hdVar, String str, f60 f60Var, int i7) {
        this.f26274a = i7;
        this.f26275b = hdVar;
        this.f26276c = str;
        this.d = f60Var;
    }

    @Override
    public final void run() {
        switch (this.f26274a) {
            case 0:
                g0.h3(new wc(this.f26275b, this.f26276c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26276c, true).apply();
                this.d.run();
                this.f26275b.Q = false;
                return;
        }
    }
}
