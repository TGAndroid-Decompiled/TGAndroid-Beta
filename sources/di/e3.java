package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class e3 implements q10 {
    public final int f8699a;
    public final TL_stars.TL_starGiftUnique f8700b;
    public final long f8701c;
    public final fs d;
    public final Object f8702e;
    public final Object f8703f;

    public e3(fs fsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f8699a = i7;
        this.d = fsVar;
        this.f8702e = obj;
        this.f8700b = tL_starGiftUnique;
        this.f8701c = j3;
        this.f8703f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8699a) {
            case 0:
                f6 f6Var = (f6) this.d;
                bi.g1 g1Var = (bi.g1) this.f8703f;
                String str = (String) obj2;
                ((vf.b) this.f8702e).b();
                if (((Boolean) obj).booleanValue()) {
                    m4 m4Var = f6Var.N2;
                    if (m4Var != null) {
                        if (g1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m4Var.a(this.f8700b, this.f8701c, z10);
                    }
                    if (g1Var != null) {
                        org.telegram.messenger.g0.g3(new bi.y0(g1Var, 3));
                        f6Var.O0 = true;
                    }
                    f6Var.dismiss();
                    return;
                }
                return;
            default:
                lm0.Z((lm0) this.d, (boolean[]) this.f8702e, this.f8700b, this.f8701c, (nl0) this.f8703f, (f5) obj, (vf.b) obj2);
                return;
        }
    }
}
