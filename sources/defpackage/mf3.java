package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
public final class mf3 implements Runnable {
    public final byte a;
    public final oh3 b;

    public mf3(oh3 oh3Var, byte b) {
        this.a = b;
        this.b = oh3Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        oh3 oh3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = oh3Var.P0;
                if (cj3Var.M && cj3Var.t3().H()) {
                    cj3Var.F0.h();
                    return;
                } else {
                    cj3Var.N4(true, true);
                    return;
                }
            case 1:
                oh3Var.P0.F0.j(0L);
                return;
            case 2:
                Bundle bundle = new Bundle();
                cj3 cj3Var2 = oh3Var.P0;
                i = ((d) cj3Var2).currentAccount;
                bundle.putLong("dialog_id", y6c.h(i).e());
                bundle.putInt("type", 1);
                bundle.putInt("start_from", 9);
                cj3Var2.presentFragment(new zj6(bundle, null));
                return;
            default:
                Bundle bundle2 = new Bundle();
                cj3 cj3Var3 = oh3Var.P0;
                i2 = ((d) cj3Var3).currentAccount;
                bundle2.putLong("dialog_id", y6c.h(i2).e());
                bundle2.putInt("type", 1);
                cj3Var3.presentFragment(new zj6(bundle2, null));
                return;
        }
    }
}
