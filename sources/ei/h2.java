package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f8361a;
    public final k3 f8362b;

    public h2(k3 k3Var, int i10) {
        this.f8361a = i10;
        this.f8362b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8361a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f8362b.f8440x;
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
                AndroidUtilities.runOnUIThread(new x8(16, this.f8362b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
