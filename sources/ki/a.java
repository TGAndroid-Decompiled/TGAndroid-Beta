package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class a implements x10 {
    public final int f18593a;
    public final j f18594b;

    public a(j jVar, int i7) {
        this.f18593a = i7;
        this.f18594b = jVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18593a) {
            case 0:
                org.telegram.messenger.g0.g3(new ji.i(8, this.f18594b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f18594b;
                jVar.f18747b0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                return;
            default:
                j jVar2 = this.f18594b;
                jVar2.f18747b0.duration_months = ((Integer) jVar2.f18749d0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                return;
        }
    }
}
