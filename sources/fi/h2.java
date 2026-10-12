package fi;

import di.x6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f9307a;
    public final k3 f9308b;

    public h2(k3 k3Var, int i10) {
        this.f9307a = i10;
        this.f9308b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9307a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f9308b.f9381x;
                if (b3Var != null) {
                    if (bool.booleanValue()) {
                        b3Var.P = System.currentTimeMillis();
                        b3Var.y("main_button_pressed", null);
                        return;
                    }
                    b3Var.P = System.currentTimeMillis();
                    b3Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new x6(26, this.f9308b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
