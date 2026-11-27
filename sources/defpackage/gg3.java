package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.e;
public final class gg3 implements Runnable {
    public final byte a;
    public final ii3 b;

    public gg3(ii3 ii3Var, byte b) {
        this.a = b;
        this.b = ii3Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        ii3 ii3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = ii3Var.P0;
                if (uj3Var.M && uj3Var.v3().H()) {
                    uj3Var.F0.h();
                    return;
                } else {
                    uj3Var.R4(true, true);
                    return;
                }
            case 1:
                ii3Var.P0.F0.j(0L);
                return;
            case 2:
                Bundle bundle = new Bundle();
                uj3 uj3Var2 = ii3Var.P0;
                i = ((e) uj3Var2).currentAccount;
                bundle.putLong("dialog_id", yac.h(i).e());
                bundle.putInt("type", 1);
                bundle.putInt("start_from", 9);
                uj3Var2.presentFragment(new em6(bundle, null));
                return;
            default:
                Bundle bundle2 = new Bundle();
                uj3 uj3Var3 = ii3Var.P0;
                i2 = ((e) uj3Var3).currentAccount;
                bundle2.putLong("dialog_id", yac.h(i2).e());
                bundle2.putInt("type", 1);
                uj3Var3.presentFragment(new em6(bundle2, null));
                return;
        }
    }
}
