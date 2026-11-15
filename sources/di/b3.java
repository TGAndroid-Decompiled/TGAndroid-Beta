package di;

import org.telegram.messenger.is;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.jm0;
import org.telegram.ui.ll0;
public final class b3 implements s10 {
    public final int f8246a;
    public final TL_stars.TL_starGiftUnique f8247b;
    public final long f8248c;
    public final is d;
    public final Object f8249e;
    public final Object f8250f;

    public b3(is isVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f8246a = i7;
        this.d = isVar;
        this.f8249e = obj;
        this.f8247b = tL_starGiftUnique;
        this.f8248c = j3;
        this.f8250f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8246a) {
            case 0:
                c6 c6Var = (c6) this.d;
                bi.f1 f1Var = (bi.f1) this.f8250f;
                String str = (String) obj2;
                ((vf.b) this.f8249e).b();
                if (((Boolean) obj).booleanValue()) {
                    j4 j4Var = c6Var.N2;
                    if (j4Var != null) {
                        if (f1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j4Var.c(this.f8247b, this.f8248c, z10);
                    }
                    if (f1Var != null) {
                        org.telegram.messenger.g0.h3(new bi.y0(f1Var, 3));
                        c6Var.O0 = true;
                    }
                    c6Var.dismiss();
                    return;
                }
                return;
            default:
                jm0.Z((jm0) this.d, (boolean[]) this.f8249e, this.f8247b, this.f8248c, (ll0) this.f8250f, (c5) obj, (vf.b) obj2);
                return;
        }
    }
}
