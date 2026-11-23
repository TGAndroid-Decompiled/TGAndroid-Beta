package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements y10 {
    public final int f8582a;
    public final y10 f8583b;

    public c2(y10 y10Var, int i7) {
        this.f8582a = i7;
        this.f8583b = y10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f8582a) {
            case 0:
                this.f8583b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                y10 y10Var = this.f8583b;
                if (y10Var != null) {
                    y10Var.a(bool);
                    return;
                }
                return;
        }
    }
}
