package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.km0;
import org.telegram.ui.ll0;
public final class w3 implements v10 {
    public final int f4958a;
    public final TL_stars.TL_starGiftUnique f4959b;
    public final long f4960c;
    public final ls d;
    public final Object f4961e;
    public final Object f4962f;

    public w3(ls lsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.f4958a = i7;
        this.d = lsVar;
        this.f4961e = obj;
        this.f4959b = tL_starGiftUnique;
        this.f4960c = j3;
        this.f4962f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        switch (this.f4958a) {
            case 0:
                k7 k7Var = (k7) this.d;
                zh.h0 h0Var = (zh.h0) this.f4962f;
                String str = (String) obj2;
                ((vf.b) this.f4961e).b();
                if (((Boolean) obj).booleanValue()) {
                    l5 l5Var = k7Var.M2;
                    if (l5Var != null) {
                        if (h0Var != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        l5Var.a(this.f4959b, this.f4960c, z9);
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
                km0.Z((km0) this.d, (boolean[]) this.f4961e, this.f4959b, this.f4960c, (ll0) this.f4962f, (h6) obj, (vf.b) obj2);
                return;
        }
    }
}
