package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
public final class zg3 implements Runnable {
    public final byte a;
    public final aj3 b;

    public zg3(aj3 aj3Var, byte b) {
        this.a = b;
        this.b = aj3Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        aj3 aj3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = aj3Var.P0;
                if (nk3Var.M && nk3Var.v3().H()) {
                    nk3Var.F0.h();
                    return;
                } else {
                    nk3Var.R4(true, true);
                    return;
                }
            case 1:
                aj3Var.P0.F0.j(0L);
                return;
            case 2:
                Bundle bundle = new Bundle();
                nk3 nk3Var2 = aj3Var.P0;
                i = ((d) nk3Var2).currentAccount;
                bundle.putLong("dialog_id", z8c.h(i).e());
                bundle.putInt("type", 1);
                bundle.putInt("start_from", 9);
                nk3Var2.presentFragment(new cm6(bundle, null));
                return;
            default:
                Bundle bundle2 = new Bundle();
                nk3 nk3Var3 = aj3Var.P0;
                i2 = ((d) nk3Var3).currentAccount;
                bundle2.putLong("dialog_id", z8c.h(i2).e());
                bundle2.putInt("type", 1);
                nk3Var3.presentFragment(new cm6(bundle2, null));
                return;
        }
    }
}
