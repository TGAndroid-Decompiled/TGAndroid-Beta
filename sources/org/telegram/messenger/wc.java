package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.f60;
public final class wc implements Runnable {
    public final int f26282a;
    public final hd f26283b;
    public final String f26284c;
    public final f60 d;

    public wc(hd hdVar, String str, f60 f60Var, int i7) {
        this.f26282a = i7;
        this.f26283b = hdVar;
        this.f26284c = str;
        this.d = f60Var;
    }

    @Override
    public final void run() {
        switch (this.f26282a) {
            case 0:
                g0.h3(new wc(this.f26283b, this.f26284c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putBoolean("langpack_patched" + this.f26284c, true).apply();
                this.d.run();
                this.f26283b.Q = false;
                return;
        }
    }
}
