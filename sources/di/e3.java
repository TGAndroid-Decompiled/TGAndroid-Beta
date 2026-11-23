package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.jm0;
import org.telegram.ui.ll0;
public final class e3 implements p10 {
    public final int f8694a;
    public final TL_stars.TL_starGiftUnique f8695b;
    public final long f8696c;
    public final fs d;
    public final Object f8697e;
    public final Object f8698f;

    public e3(fs fsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f8694a = i7;
        this.d = fsVar;
        this.f8697e = obj;
        this.f8695b = tL_starGiftUnique;
        this.f8696c = j3;
        this.f8698f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8694a) {
            case 0:
                f6 f6Var = (f6) this.d;
                bi.k1 k1Var = (bi.k1) this.f8698f;
                String str = (String) obj2;
                ((vf.b) this.f8697e).b();
                if (((Boolean) obj).booleanValue()) {
                    m4 m4Var = f6Var.N2;
                    if (m4Var != null) {
                        if (k1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m4Var.a(this.f8695b, this.f8696c, z10);
                    }
                    if (k1Var != null) {
                        org.telegram.messenger.g0.g3(new bi.c1(k1Var, 3));
                        f6Var.O0 = true;
                    }
                    f6Var.dismiss();
                    return;
                }
                return;
            default:
                jm0.Z((jm0) this.d, (boolean[]) this.f8697e, this.f8695b, this.f8696c, (ll0) this.f8698f, (f5) obj, (vf.b) obj2);
                return;
        }
    }
}
