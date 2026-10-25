package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Utilities.Callback {
    public final int f13048a;
    public final m3 f13049b;

    public j2(m3 m3Var, int i10) {
        this.f13048a = i10;
        this.f13049b = m3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13048a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e3 e3Var = this.f13049b.f13133y;
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
                AndroidUtilities.runOnUIThread(new e2.q0(28, this.f13049b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
