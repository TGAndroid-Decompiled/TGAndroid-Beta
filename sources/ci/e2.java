package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
public final class e2 implements u10 {
    public final int f5001a;
    public final u10 f5002b;

    public e2(u10 u10Var, int i3) {
        this.f5001a = i3;
        this.f5002b = u10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f5001a) {
            case 0:
                this.f5002b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                u10 u10Var = this.f5002b;
                if (u10Var != null) {
                    u10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
