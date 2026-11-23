package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class a implements y10 {
    public final int f18562a;
    public final j f18563b;

    public a(j jVar, int i7) {
        this.f18562a = i7;
        this.f18563b = jVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18562a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg.i0(6, this.f18563b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f18563b;
                jVar.f18716b0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                return;
            default:
                j jVar2 = this.f18563b;
                jVar2.f18716b0.duration_months = ((Integer) jVar2.f18718d0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                return;
        }
    }
}
