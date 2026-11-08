package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class a implements c20 {
    public final int f14492a;
    public final j f14493b;

    public a(j jVar, int i7) {
        this.f14492a = i7;
        this.f14493b = jVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14492a) {
            case 0:
                org.telegram.messenger.g0.h3(new ha.b(1, this.f14493b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f14493b;
                jVar.f14732a0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                return;
            default:
                j jVar2 = this.f14493b;
                jVar2.f14732a0.duration_months = ((Integer) jVar2.f14734c0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                return;
        }
    }
}
