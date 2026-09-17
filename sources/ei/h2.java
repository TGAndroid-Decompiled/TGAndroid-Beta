package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f8377a;
    public final k3 f8378b;

    public h2(k3 k3Var, int i10) {
        this.f8377a = i10;
        this.f8378b = k3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8377a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.f8378b.f8456x;
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
                AndroidUtilities.runOnUIThread(new b9(16, this.f8378b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
