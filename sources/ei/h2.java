package ei;

import ci.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f9096a;
    public final k3 f9097b;

    public h2(k3 k3Var, int i10) {
        this.f9096a = i10;
        this.f9097b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9096a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f9097b.f9183x;
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
                AndroidUtilities.runOnUIThread(new y8(16, this.f9097b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
