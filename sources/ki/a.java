package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class a implements y10 {
    public final int f18596a;
    public final j f18597b;

    public a(j jVar, int i7) {
        this.f18596a = i7;
        this.f18597b = jVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18596a) {
            case 0:
                org.telegram.messenger.g0.g3(new ji.i(8, this.f18597b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f18597b;
                jVar.f18750b0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                return;
            default:
                j jVar2 = this.f18597b;
                jVar2.f18750b0.duration_months = ((Integer) jVar2.f18752d0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                return;
        }
    }
}
