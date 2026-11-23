package di;

import org.telegram.messenger.gs;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class e3 implements r10 {
    public final int f8733a;
    public final TL_stars.TL_starGiftUnique f8734b;
    public final long f8735c;
    public final gs d;
    public final Object f8736e;
    public final Object f8737f;

    public e3(gs gsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f8733a = i7;
        this.d = gsVar;
        this.f8736e = obj;
        this.f8734b = tL_starGiftUnique;
        this.f8735c = j3;
        this.f8737f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8733a) {
            case 0:
                f6 f6Var = (f6) this.d;
                bi.k1 k1Var = (bi.k1) this.f8737f;
                String str = (String) obj2;
                ((vf.b) this.f8736e).b();
                if (((Boolean) obj).booleanValue()) {
                    m4 m4Var = f6Var.N2;
                    if (m4Var != null) {
                        if (k1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m4Var.a(this.f8734b, this.f8735c, z10);
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
                lm0.Z((lm0) this.d, (boolean[]) this.f8736e, this.f8734b, this.f8735c, (nl0) this.f8737f, (f5) obj, (vf.b) obj2);
                return;
        }
    }
}
