package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b2 implements Utilities.Callback {
    public final int f11096a;
    public final d3 f11097b;

    public b2(d3 d3Var, int i10) {
        this.f11096a = i10;
        this.f11097b = d3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11096a) {
            case 0:
                Boolean bool = (Boolean) obj;
                v2 v2Var = this.f11097b.f11165x;
                if (v2Var != null) {
                    if (bool.booleanValue()) {
                        v2Var.P = System.currentTimeMillis();
                        v2Var.y("main_button_pressed", null);
                        return;
                    }
                    v2Var.P = System.currentTimeMillis();
                    v2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new p6(15, this.f11097b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
