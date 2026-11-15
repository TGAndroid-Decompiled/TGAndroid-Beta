package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class a implements z10 {
    public final int f18170a;
    public final k f18171b;

    public a(k kVar, int i7) {
        this.f18170a = i7;
        this.f18171b = kVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18170a) {
            case 0:
                org.telegram.messenger.g0.h3(new kg.t1(3, this.f18171b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f18171b;
                kVar.f18378b0.commission_permille = ((Integer) obj).intValue();
                kVar.L0();
                return;
            default:
                k kVar2 = this.f18171b;
                kVar2.f18378b0.duration_months = ((Integer) kVar2.f18380d0.get(((Integer) obj).intValue())).intValue();
                kVar2.L0();
                return;
        }
    }
}
