package di;

import bi.af;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Utilities.Callback {
    public final int f6728a;
    public final n3 f6729b;

    public k2(n3 n3Var, int i10) {
        this.f6728a = i10;
        this.f6729b = n3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6728a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e3 e3Var = this.f6729b.f6812x;
                if (e3Var != null) {
                    if (bool.booleanValue()) {
                        e3Var.P = System.currentTimeMillis();
                        e3Var.y("main_button_pressed", null);
                        return;
                    }
                    e3Var.P = System.currentTimeMillis();
                    e3Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new af(10, this.f6729b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
