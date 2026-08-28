package mh;

import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b2 implements Utilities.Callback {
    public final int f17715a;
    public final c3 f17716b;

    public b2(c3 c3Var, int i9) {
        this.f17715a = i9;
        this.f17716b = c3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17715a) {
            case 0:
                Boolean bool = (Boolean) obj;
                u2 u2Var = this.f17716b.f17778x;
                if (u2Var != null) {
                    if (bool.booleanValue()) {
                        u2Var.L = System.currentTimeMillis();
                        u2Var.v("main_button_pressed", null);
                        return;
                    }
                    u2Var.L = System.currentTimeMillis();
                    u2Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new o8(4, this.f17716b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
