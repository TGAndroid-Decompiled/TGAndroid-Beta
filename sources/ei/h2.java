package ei;

import ci.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f8359a;
    public final k3 f8360b;

    public h2(k3 k3Var, int i10) {
        this.f8359a = i10;
        this.f8360b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8359a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f8360b.f8438x;
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
                AndroidUtilities.runOnUIThread(new y8(16, this.f8360b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
