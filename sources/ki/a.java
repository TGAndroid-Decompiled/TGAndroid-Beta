package ki;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class a implements w10 {
    public final int f18658a;
    public final j f18659b;

    public a(j jVar, int i7) {
        this.f18658a = i7;
        this.f18659b = jVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18658a) {
            case 0:
                org.telegram.messenger.g0.g3(new ji.f(10, this.f18659b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f18659b;
                jVar.f18815b0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                return;
            default:
                j jVar2 = this.f18659b;
                jVar2.f18815b0.duration_months = ((Integer) jVar2.f18817d0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                return;
        }
    }
}
