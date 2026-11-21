package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements x10 {
    public final int f8616a;
    public final x10 f8617b;

    public c2(x10 x10Var, int i7) {
        this.f8616a = i7;
        this.f8617b = x10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f8616a) {
            case 0:
                this.f8617b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                x10 x10Var = this.f8617b;
                if (x10Var != null) {
                    x10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
