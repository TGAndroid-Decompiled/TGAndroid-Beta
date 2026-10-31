package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.e70;
public final class wc implements Runnable {
    public final int f19080a;
    public final cd f19081b;
    public final String f19082c;
    public final e70 d;

    public wc(cd cdVar, String str, e70 e70Var, int i10) {
        this.f19080a = i10;
        this.f19081b = cdVar;
        this.f19082c = str;
        this.d = e70Var;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                i0.g3(new wc(this.f19081b, this.f19082c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putBoolean("langpack_patched" + this.f19082c, true).apply();
                this.d.run();
                this.f19081b.Q = false;
                return;
        }
    }
}
