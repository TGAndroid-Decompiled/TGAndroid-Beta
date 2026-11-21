package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;
public final class e3 implements q10 {
    public final int f8730a;
    public final TL_stars.TL_starGiftUnique f8731b;
    public final long f8732c;
    public final fs d;
    public final Object f8733e;
    public final Object f8734f;

    public e3(fs fsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f8730a = i7;
        this.d = fsVar;
        this.f8733e = obj;
        this.f8731b = tL_starGiftUnique;
        this.f8732c = j3;
        this.f8734f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f8730a) {
            case 0:
                f6 f6Var = (f6) this.d;
                bi.k1 k1Var = (bi.k1) this.f8734f;
                String str = (String) obj2;
                ((vf.b) this.f8733e).b();
                if (((Boolean) obj).booleanValue()) {
                    m4 m4Var = f6Var.N2;
                    if (m4Var != null) {
                        if (k1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m4Var.a(this.f8731b, this.f8732c, z10);
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
                lm0.Z((lm0) this.d, (boolean[]) this.f8733e, this.f8731b, this.f8732c, (nl0) this.f8734f, (f5) obj, (vf.b) obj2);
                return;
        }
    }
}
