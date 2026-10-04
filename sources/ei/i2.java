package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i2 implements Utilities.Callback {
    public final int f9096a;
    public final l3 f9097b;

    public i2(l3 l3Var, int i10) {
        this.f9096a = i10;
        this.f9097b = l3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9096a) {
            case 0:
                Boolean bool = (Boolean) obj;
                c3 c3Var = this.f9097b.f9180x;
                if (c3Var != null) {
                    if (bool.booleanValue()) {
                        c3Var.P = System.currentTimeMillis();
                        c3Var.z("main_button_pressed", null);
                        return;
                    }
                    c3Var.P = System.currentTimeMillis();
                    c3Var.z("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new x8(16, this.f9097b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
