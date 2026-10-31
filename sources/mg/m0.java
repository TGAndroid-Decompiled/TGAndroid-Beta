package mg;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.w3;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.xu0;
public final class m0 implements q4, xu0, og.g, og.l {
    public final w0 f13187a;

    public m0(w0 w0Var) {
        this.f13187a = w0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        w0 w0Var = this.f13187a;
        w0Var.f13268e2 = i10 * 1000;
        w0Var.k1(false, true);
    }

    @Override
    public void m(int i10) {
        String str;
        int i11;
        String L0;
        String str2;
        String G;
        w0 w0Var = this.f13187a;
        int i12 = w0Var.Z1;
        int i13 = og.e.f14184w;
        if (i12 == 2) {
            w0Var.f13269f2 = i10;
        } else {
            w0Var.f13270g2 = i10;
        }
        w0Var.f13272i2.f14165a.c(w0Var.f1(), true);
        if (w0Var.Z1 == 3) {
            w0Var.k1(true, true);
        } else {
            w0Var.k1(false, false);
        }
        ng.b bVar = w0Var.Y1;
        int f12 = w0Var.f1();
        for (int i14 = 0; i14 < bVar.f13762f.getChildCount(); i14++) {
            View childAt = bVar.f13762f.getChildAt(i14);
            if (childAt instanceof og.z) {
                f6 f6Var = ((og.z) childAt).f14244r;
                if (f12 <= 0) {
                    G = "";
                } else {
                    G = cd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                }
                f6Var.a();
                f6Var.c(G, true, true);
            }
            if (childAt instanceof og.h) {
                og.h hVar = (og.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean V = w3.V(hVar.f14200x);
                if (hVar.f14201y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        L0 = cd.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i11 = 2131751391;
                        } else {
                            i11 = 2131754876;
                        }
                        L0 = cd.L0(i11, null);
                    }
                    hVar.setSubtitle(L0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    hVar.setSubtitle(cd.G(f12, str, new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.e.size() - 12, 12);
    }

    @Override
    public void s() {
    }
}
