package nh;

import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class b2 implements Utilities.Callback {

    public final int f18566a;

    public final b3 f18567b;

    public b2(b3 b3Var, int i10) {
        this.f18566a = i10;
        this.f18567b = b3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18566a) {
            case 0:
                Boolean bool = (Boolean) obj;
                t2 t2Var = this.f18567b.f18599x;
                if (t2Var != null) {
                    if (!bool.booleanValue()) {
                        t2Var.L = System.currentTimeMillis();
                        t2Var.v("secondary_button_pressed", null);
                    } else {
                        t2Var.L = System.currentTimeMillis();
                        t2Var.v("main_button_pressed", null);
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new k7(10, this.f18567b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
