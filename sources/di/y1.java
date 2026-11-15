package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements z10 {
    public final int f9750a;
    public final z10 f9751b;

    public y1(z10 z10Var, int i7) {
        this.f9750a = i7;
        this.f9751b = z10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9750a) {
            case 0:
                this.f9751b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                z10 z10Var = this.f9751b;
                if (z10Var != null) {
                    z10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
