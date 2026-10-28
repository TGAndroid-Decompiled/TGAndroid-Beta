package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f12845a;
    public final k f12846b;

    public a(k kVar, int i10) {
        this.f12845a = i10;
        this.f12846b = kVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12845a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2.q0(26, this.f12846b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f12846b;
                kVar.f13052a0.commission_permille = ((Integer) obj).intValue();
                kVar.H0();
                return;
            default:
                k kVar2 = this.f12846b;
                kVar2.f13052a0.duration_months = ((Integer) kVar2.f13054c0.get(((Integer) obj).intValue())).intValue();
                kVar2.H0();
                return;
        }
    }
}
