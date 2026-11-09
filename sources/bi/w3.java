package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.jm0;
import org.telegram.ui.kl0;
public final class w3 implements v10 {
    public final int f4954a;
    public final TL_stars.TL_starGiftUnique f4955b;
    public final long f4956c;
    public final ls d;
    public final Object f4957e;
    public final Object f4958f;

    public w3(ls lsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f4954a = i7;
        this.d = lsVar;
        this.f4957e = obj;
        this.f4955b = tL_starGiftUnique;
        this.f4956c = j3;
        this.f4958f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        switch (this.f4954a) {
            case 0:
                k7 k7Var = (k7) this.d;
                zh.h0 h0Var = (zh.h0) this.f4958f;
                String str = (String) obj2;
                ((vf.b) this.f4957e).b();
                if (((Boolean) obj).booleanValue()) {
                    l5 l5Var = k7Var.J2;
                    if (l5Var != null) {
                        if (h0Var != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        l5Var.a(this.f4955b, this.f4956c, z9);
                    }
                    if (h0Var != null) {
                        org.telegram.messenger.g0.h3(new z3(h0Var, 0));
                        k7Var.N0 = true;
                    }
                    k7Var.dismiss();
                    return;
                }
                return;
            default:
                jm0.Z((jm0) this.d, (boolean[]) this.f4957e, this.f4955b, this.f4956c, (kl0) this.f4958f, (h6) obj, (vf.b) obj2);
                return;
        }
    }
}
