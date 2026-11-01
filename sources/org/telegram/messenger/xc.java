package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.ui.e70;
public final class xc implements Runnable {
    public final int f19423a;
    public final dd f19424b;
    public final String f19425c;
    public final e70 d;

    public xc(dd ddVar, String str, e70 e70Var, int i10) {
        this.f19423a = i10;
        this.f19424b = ddVar;
        this.f19425c = str;
        this.d = e70Var;
    }

    @Override
    public final void run() {
        switch (this.f19423a) {
            case 0:
                i0.g3(new xc(this.f19424b, this.f19425c, this.d, 1));
                return;
            default:
                SharedPreferences.Editor edit = wp.d1().edit();
                edit.putBoolean("langpack_patched" + this.f19425c, true).apply();
                this.d.run();
                this.f19424b.Q = false;
                return;
        }
    }
}
