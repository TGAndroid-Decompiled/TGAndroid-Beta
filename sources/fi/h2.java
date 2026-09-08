package fi;

import di.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f9733a;
    public final k3 f9734b;

    public h2(k3 k3Var, int i10) {
        this.f9733a = i10;
        this.f9734b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9733a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f9734b.f9817x;
                if (b3Var != null) {
                    if (bool.booleanValue()) {
                        b3Var.P = System.currentTimeMillis();
                        b3Var.z("main_button_pressed", null);
                        return;
                    }
                    b3Var.P = System.currentTimeMillis();
                    b3Var.z("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new b7(24, this.f9734b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
