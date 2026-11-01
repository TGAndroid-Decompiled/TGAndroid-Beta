package bi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ih0;
public final class p1 implements View.OnClickListener {
    public final int f3275a;
    public final k2 f3276b;

    public p1(k2 k2Var, int i10) {
        this.f3275a = i10;
        this.f3276b = k2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z5 U2;
        c6 q6;
        String str;
        int i10 = this.f3275a;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final k2 k2Var = this.f3276b;
        switch (i10) {
            case 0:
                k2Var.w0();
                return;
            case 1:
                if (!k2Var.P.I2()) {
                    k2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                o2 o2Var = k2Var.P.Q3;
                if (o2Var != null) {
                    o2Var.k();
                    return;
                }
                return;
            case 3:
                o2 o2Var2 = k2Var.P.Q3;
                if (o2Var2 != null) {
                    o2Var2.i();
                    return;
                }
                return;
            case 4:
                k2.Z(k2Var);
                return;
            case 5:
                k2 k2Var2 = this.f3276b;
                if (k2Var2.B0) {
                    k2Var2.p0(true);
                    n1 S2 = k2Var2.P.S2();
                    if (S2 != null) {
                        S2.N();
                        org.telegram.messenger.i0.J3(S2);
                        return;
                    }
                    return;
                }
                if (k2Var2.A0 == null) {
                    vy vyVar = new vy(k2Var2, true, false, false, k2Var2.getParentActivity(), true, null, k2Var2.O, true, k2Var2.getResourceProvider(), false, false);
                    k2Var2.A0 = vyVar;
                    vyVar.setVisibility(8);
                    vy vyVar2 = k2Var2.A0;
                    vyVar2.f32011x2 = false;
                    vyVar2.setDelegate(new a2(k2Var2));
                    int indexOfChild = k2Var2.O.indexOfChild(k2Var2.f3135a0);
                    if (indexOfChild < 0) {
                        indexOfChild = k2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.b6.e(-1, k2Var2.o0(), 87);
                    e.bottomMargin = k2Var2.T0;
                    k2Var2.O.addView(k2Var2.A0, indexOfChild, e);
                }
                int o02 = k2Var2.o0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.b6.e(-1, o02, 87);
                } else {
                    layoutParams.height = o02;
                }
                layoutParams.bottomMargin = k2Var2.T0;
                k2Var2.A0.setLayoutParams(layoutParams);
                k2Var2.A0.setVisibility(0);
                k2Var2.B0 = true;
                k2Var2.D0 = o02 + k2Var2.T0;
                n1 S22 = k2Var2.P.S2();
                if (S22 != null) {
                    org.telegram.messenger.i0.v1(S22);
                }
                k2Var2.m0();
                k2Var2.f3137b0.j(dg.d, true);
                return;
            case 6:
                z60 z60Var = k2Var.f3165x0;
                if (z60Var != null) {
                    z60Var.u();
                    k2Var.f3165x0 = null;
                }
                final z60 H = z60.H(k2Var, view);
                H.Q = true;
                a T2 = k2Var.P.T2();
                if (T2 != null && T2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, 2131231069, null, dd.L0(2131753999, null), new t1(k2Var, T2, 5));
                if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, 2131231565, null, dd.L0(2131754005, null), new t1(k2Var, T2, 6));
                if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231577, null, dd.L0(2131754002, null), new t1(k2Var, T2, 7));
                if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231598, null, dd.L0(2131754004, null), new t1(k2Var, T2, 8));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String L0 = dd.L0(2131753987, null);
                d4 d4Var = k2Var.P;
                Objects.requireNonNull(d4Var);
                H.j(z14, 2131231553, null, L0, new b(d4Var, 1));
                boolean p22 = k2Var.P.p2();
                boolean s22 = k2Var.P.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(2131231566, dd.L0(2131754013, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        k2Var.P.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        k2Var.P.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(2131231567, dd.L0(2131753998, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        k2Var.P.u3(false);
                                        H.u();
                                        return;
                                    default:
                                        k2Var.P.u3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                k2Var.f3165x0 = H;
                return;
            case 7:
                z60 z60Var2 = k2Var.f3165x0;
                if (z60Var2 != null) {
                    z60Var2.u();
                    k2Var.f3165x0 = null;
                }
                d4 d4Var2 = k2Var.P;
                z5 z5Var = d4Var2.f2941p4;
                if (z5Var == null && (U2 = d4Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = k2Var.P.findFocus();
                    if ((findFocus instanceof n1) && (q6 = U2.q((n1) findFocus)) != null) {
                        pagetablecell = q6.f2906b;
                    }
                    if (pagetablecell != null) {
                        k2Var.P.j2(U2);
                        if (U2.H.add(pagetablecell)) {
                            U2.f3483w.invalidate();
                            U2.v();
                        }
                        z5Var = U2;
                    }
                }
                if (z5Var != null && z5Var.getModel() != null && !z5Var.H.isEmpty()) {
                    k2Var.P.I4(z5Var);
                    return;
                } else {
                    k2Var.P.U1(q6.u(2, 2));
                    return;
                }
            case 8:
                z60 z60Var3 = k2Var.f3165x0;
                if (z60Var3 != null) {
                    z60Var3.u();
                    k2Var.f3165x0 = null;
                }
                a T22 = k2Var.P.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.f2818b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = k2Var.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                t.X(parentActivity, str, new ag.e0(5, k2Var, pageblockmath), k2Var.getResourceProvider());
                return;
            case 9:
                k2Var.P.f2931i4 = null;
                k2Var.t0(90, 0);
                return;
            case 10:
                k2Var.w0();
                ih0 ih0Var = k2Var.O0;
                if (ih0Var != null) {
                    ih0Var.g(true);
                    k2Var.O0 = null;
                    return;
                }
                return;
            case 11:
                k2Var.P.T4();
                k2Var.D0();
                return;
            case 12:
                k2Var.P.c4(view);
                return;
            case 13:
                k2Var.P.d4();
                return;
            case 14:
                k2Var.P.a4();
                return;
            case 15:
                k2Var.P.e4();
                return;
            default:
                k2Var.s0();
                return;
        }
    }
}
