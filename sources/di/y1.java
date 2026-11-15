package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements z10 {
    public final int f9761a;
    public final z10 f9762b;

    public y1(z10 z10Var, int i7) {
        this.f9761a = i7;
        this.f9762b = z10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9761a) {
            case 0:
                this.f9762b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                z10 z10Var = this.f9762b;
                if (z10Var != null) {
                    z10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
