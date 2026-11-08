package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.hm0;
import org.telegram.ui.il0;
public final class w3 implements v10 {
    public final int f4956a;
    public final TL_stars.TL_starGiftUnique f4957b;
    public final long f4958c;
    public final ls d;
    public final Object f4959e;
    public final Object f4960f;

    public w3(ls lsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f4956a = i7;
        this.d = lsVar;
        this.f4959e = obj;
        this.f4957b = tL_starGiftUnique;
        this.f4958c = j3;
        this.f4960f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        switch (this.f4956a) {
            case 0:
                k7 k7Var = (k7) this.d;
                zh.h0 h0Var = (zh.h0) this.f4960f;
                String str = (String) obj2;
                ((vf.b) this.f4959e).b();
                if (((Boolean) obj).booleanValue()) {
                    l5 l5Var = k7Var.J2;
                    if (l5Var != null) {
                        if (h0Var != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        l5Var.a(this.f4957b, this.f4958c, z9);
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
                hm0.Z((hm0) this.d, (boolean[]) this.f4959e, this.f4957b, this.f4958c, (il0) this.f4960f, (h6) obj, (vf.b) obj2);
                return;
        }
    }
}
