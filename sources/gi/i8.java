package gi;

import android.view.View;
import b8.cd;
import org.telegram.messenger.bd;
import org.telegram.messenger.lc;
import org.telegram.messenger.o10;
import org.telegram.messenger.t10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.r31;
public final class i8 implements o10, w10, hh.d, t10, it0, jt0 {
    public final int f12974a;

    public i8(int i3) {
        this.f12974a = i3;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void c(Object obj, float f10) {
        switch (this.f12974a) {
            case 26:
                ii.a3 a3Var = (ii.a3) obj;
                a3Var.f14797c = f10;
                a3Var.f14802f.invalidate();
                a3Var.Y.setAlpha(f10);
                a3Var.J();
                a3Var.H();
                return;
            default:
                ((ii.w3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            if (num.intValue() == 0) {
                return bd.M0(2131748813, null);
            }
            return bd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public float get(Object obj) {
        switch (this.f12974a) {
            case 25:
                return ((ii.a3) obj).f14797c;
            case 26:
            default:
                return ((ii.c4) obj).getSwipeOffsetY();
            case 27:
                return ((ii.w3) obj).f15307c;
        }
    }

    @Override
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        switch (this.f12974a) {
            case 6:
                if (lc.e(262144)) {
                    f10 = 0.82f;
                } else {
                    f10 = 0.76f;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
                if (z10) {
                    return org.telegram.ui.ActionBar.k6.r1(0.9f, -15658735);
                }
                return cd.n(f10, w02, -14145496);
            case 7:
                if (!lc.e(256)) {
                    return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                }
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                if (z10) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f11, x02);
            case 8:
                if (lc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return cd.n(f12, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Nl, e6Var));
            case 9:
                if (lc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f13, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var));
            case 10:
                if (lc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return cd.n(f14, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, e6Var));
            case 11:
                if (lc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.8f;
                }
                return cd.n(f15, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
            case 12:
                return 855638016;
            case 13:
                return 1073741824;
            case 14:
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var);
                if (z10) {
                    f16 = 0.82f;
                } else {
                    f16 = 0.78f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f16, w03);
            case 15:
                return org.telegram.ui.ActionBar.k6.r1(0.075f, -16777216);
            case 16:
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var);
                if (z10) {
                    f17 = 0.85f;
                } else {
                    f17 = 0.825f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f17, w04);
            case 17:
                return org.telegram.ui.ActionBar.k6.r1(0.88f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
            case 18:
                if (lc.e(262144)) {
                    f18 = 0.85f;
                } else {
                    f18 = 0.76f;
                }
                return cd.n(f18, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ml, e6Var));
            case 19:
                if (lc.e(262144)) {
                    f19 = 0.85f;
                } else {
                    f19 = 0.76f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f19, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
            case 20:
                return org.telegram.ui.ActionBar.k6.r1(0.78f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
            case 21:
                return org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
            case 22:
                lc.e(262144);
                return 0;
            default:
                if (lc.e(262144)) {
                    f20 = 0.85f;
                } else {
                    f20 = 0.76f;
                }
                return org.telegram.ui.ActionBar.k6.r1(f20, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
        }
    }
}
