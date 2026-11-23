package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements w10 {
    public final int f8581a;
    public final w10 f8582b;

    public c2(w10 w10Var, int i7) {
        this.f8581a = i7;
        this.f8582b = w10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f8581a) {
            case 0:
                this.f8582b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                w10 w10Var = this.f8582b;
                if (w10Var != null) {
                    w10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
