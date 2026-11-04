package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class a implements u10 {
    public final int f14768a;
    public final k f14769b;

    public a(k kVar, int i3) {
        this.f14768a = i3;
        this.f14769b = kVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14768a) {
            case 0:
                org.telegram.messenger.g0.h3(new e(0, this.f14769b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f14769b;
                kVar.f15034b0.commission_permille = ((Integer) obj).intValue();
                kVar.L0();
                return;
            default:
                k kVar2 = this.f14769b;
                kVar2.f15034b0.duration_months = ((Integer) kVar2.f15036d0.get(((Integer) obj).intValue())).intValue();
                kVar2.L0();
                return;
        }
    }
}
