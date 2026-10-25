package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f12846a;
    public final k f12847b;

    public a(k kVar, int i10) {
        this.f12846a = i10;
        this.f12847b = kVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12846a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2.q0(26, this.f12847b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f12847b;
                kVar.f13053a0.commission_permille = ((Integer) obj).intValue();
                kVar.H0();
                return;
            default:
                k kVar2 = this.f12847b;
                kVar2.f13053a0.duration_months = ((Integer) kVar2.f13055c0.get(((Integer) obj).intValue())).intValue();
                kVar2.H0();
                return;
        }
    }
}
