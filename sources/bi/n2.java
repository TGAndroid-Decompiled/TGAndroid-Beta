package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
public final class n2 implements c20 {
    public final int f4394a;
    public final c20 f4395b;

    public n2(c20 c20Var, int i7) {
        this.f4394a = i7;
        this.f4395b = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4394a) {
            case 0:
                this.f4395b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                c20 c20Var = this.f4395b;
                if (c20Var != null) {
                    c20Var.a(bool);
                    return;
                }
                return;
        }
    }
}
