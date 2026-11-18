package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class a implements x10 {
    public final int f18566a;
    public final k f18567b;

    public a(k kVar, int i7) {
        this.f18566a = i7;
        this.f18567b = kVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18566a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg.h0(6, this.f18567b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f18567b;
                kVar.f18740b0.commission_permille = ((Integer) obj).intValue();
                kVar.L0();
                return;
            default:
                k kVar2 = this.f18567b;
                kVar2.f18740b0.duration_months = ((Integer) kVar2.f18742d0.get(((Integer) obj).intValue())).intValue();
                kVar2.L0();
                return;
        }
    }
}
