package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cm0;
import org.telegram.ui.el0;
public final class i3 implements n10 {
    public final int f5283a;
    public final TL_stars.TL_starGiftUnique f5284b;
    public final long f5285c;
    public final cs d;
    public final Object f5286e;
    public final Object f5287f;

    public i3(cs csVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i3) {
        this.f5283a = i3;
        this.d = csVar;
        this.f5286e = obj;
        this.f5284b = tL_starGiftUnique;
        this.f5285c = j10;
        this.f5287f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f5283a) {
            case 0:
                l6 l6Var = (l6) this.d;
                ai.i1 i1Var = (ai.i1) this.f5287f;
                String str = (String) obj2;
                ((sf.b) this.f5286e).b();
                if (((Boolean) obj).booleanValue()) {
                    s4 s4Var = l6Var.K2;
                    if (s4Var != null) {
                        if (i1Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s4Var.a(this.f5284b, this.f5285c, z10);
                    }
                    if (i1Var != null) {
                        org.telegram.messenger.g0.h3(new ai.a1(i1Var, 3));
                        l6Var.O0 = true;
                    }
                    l6Var.dismiss();
                    return;
                }
                return;
            default:
                cm0.Z((cm0) this.d, (boolean[]) this.f5286e, this.f5284b, this.f5285c, (el0) this.f5287f, (l5) obj, (sf.b) obj2);
                return;
        }
    }
}
