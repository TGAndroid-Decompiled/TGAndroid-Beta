package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.l4;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.b61;
import org.telegram.ui.is0;
import org.telegram.ui.kf0;
import org.telegram.ui.lf0;
import org.telegram.ui.oc1;
import org.telegram.ui.os0;
import org.telegram.ui.sc1;
import org.telegram.ui.uh0;
import org.telegram.ui.uz;
import org.telegram.ui.vh0;
import org.telegram.ui.vs0;
import org.telegram.ui.wh0;
import org.telegram.ui.zt;
public final class l4 extends dk0 {
    public final int f9245c;
    public final Object d;

    public l4(Object obj, int i7) {
        this.f9245c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f9245c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = f1Var.f59249f;
                if (i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
            case 7:
                return true;
            case 8:
                int i10 = f1Var.f59249f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (f1Var.f59249f == 1) {
                    return true;
                }
                return false;
        }
    }

    public fj E(int i7) {
        sl0 sl0Var = (sl0) this.d;
        int i10 = sl0Var.f39646w;
        if (i7 >= i10 && i7 < sl0Var.f39647x) {
            return (fj) sl0Var.f39641e.get(i7 - i10);
        }
        int i11 = sl0Var.E;
        if (i7 >= i11 && i7 < sl0Var.F) {
            return (fj) sl0Var.f39642f.get(i7 - i11);
        }
        return null;
    }

    public void H(int i7, int i10) {
        int[] iArr = ((f6) this.d).O2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override
    public final int b() {
        switch (this.f9245c) {
            case 0:
                return ((f6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f17723f3.size();
            case 2:
                return 1;
            case 3:
                return ((sl0) this.d).f39644r;
            case 4:
                return ((em0) this.d).f34800r.size();
            case 5:
                return ((f11) this.d).U.size();
            case 6:
                if (((zt) this.d).f54721c2.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((lf0) this.d).f49746c.size();
            case 8:
                return ((wh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.h1) this.d).f58797b2;
        }
    }

    @Override
    public long c(int i7) {
        uh0 uh0Var;
        switch (this.f9245c) {
            case 8:
                wh0 wh0Var = (wh0) this.d;
                int i10 = wh0Var.E;
                if (i7 >= i10 && i7 < wh0Var.F) {
                    uh0Var = (uh0) wh0Var.f53683b.get(i7 - i10);
                } else {
                    int i11 = wh0Var.f53687n;
                    if (i7 >= i11 && i7 < wh0Var.f53688r) {
                        uh0Var = (uh0) wh0Var.f53682a.get(i7 - i11);
                    } else {
                        uh0Var = null;
                    }
                }
                if (uh0Var != null) {
                    return uh0Var.f52663c;
                }
                wh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == wh0Var.f53692y) {
                    return 2L;
                }
                if (i7 == wh0Var.f53689s) {
                    return 3L;
                }
                if (i7 == wh0Var.f53690w) {
                    return 4L;
                }
                if (i7 == wh0Var.f53691x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f9245c) {
            case 2:
                return i7;
            case 3:
                sl0 sl0Var = (sl0) this.d;
                if (i7 != sl0Var.f39645s && i7 != sl0Var.f39648y) {
                    fj E = E(i7);
                    if (E == null || !E.I3()) {
                        return 1;
                    }
                    return 2;
                }
                return 0;
            case 4:
            case 5:
            case 7:
            case 9:
            default:
                return super.d(i7);
            case 6:
                return i7;
            case 8:
                wh0 wh0Var = (wh0) this.d;
                if (i7 >= wh0Var.E && i7 < wh0Var.F) {
                    return 0;
                }
                wh0Var.getClass();
                if (i7 != 0 && i7 != wh0Var.f53692y) {
                    if (i7 == wh0Var.f53689s) {
                        return 2;
                    }
                    if (i7 != wh0Var.f53690w && i7 != wh0Var.f53691x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f58780a;
            case 11:
                ug.h1 h1Var = (ug.h1) this.d;
                if (i7 != h1Var.f58798c2) {
                    if (i7 >= h1Var.d2 && i7 < h1Var.f58799e2) {
                        return h1Var.g1();
                    }
                    if (i7 >= h1Var.f58800f2 && i7 < h1Var.f58801g2) {
                        return 1;
                    }
                    if (i7 == h1Var.f58802h2) {
                        return 2;
                    }
                    if (i7 == h1Var.f58803i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == h1Var.f58804j2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int e12;
        boolean z11;
        int e13;
        boolean z12;
        String N0;
        String N02;
        boolean z13;
        pq pqVar;
        int i10;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f9245c;
        float f10 = 0.0f;
        uh0 uh0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i11) {
            case 0:
                int[] iArr = ((f6) obj).O2;
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) f1Var.f59245a;
                int i12 = iArr[(iArr.length - 1) - i7];
                if (iaVar.f35968a != i12) {
                    iaVar.f35968a = i12;
                    iaVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) f1Var).v.setData((jg.o0) ((jg.q0) obj).f17723f3.get(i7));
                return;
            case 2:
                return;
            case 3:
                sl0 sl0Var = (sl0) obj;
                uz uzVar = sl0Var.K;
                int i13 = f1Var.f59249f;
                View view = f1Var.f59245a;
                if (i13 == 0) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (i7 == sl0Var.f39645s) {
                        String N03 = gd.N0(2131751332, null);
                        if (y3Var.getText().equals(N03)) {
                            if (sl0Var.I) {
                                N02 = gd.N0(2131747239, null);
                            } else {
                                N02 = gd.N0(2131745857, null);
                            }
                            boolean z19 = sl0Var.I;
                            org.telegram.ui.Cells.x3 x3Var = y3Var.f32554b;
                            x3Var.c(N02, true, z19);
                            x3Var.setVisibility(0);
                            return;
                        }
                        if (sl0Var.I) {
                            N0 = gd.N0(2131747239, null);
                        } else {
                            N0 = gd.N0(2131745857, null);
                        }
                        y3Var.b(N03, N0, new rl0(this));
                        return;
                    } else if (i7 == sl0Var.f39648y) {
                        y3Var.b(gd.N0(2131746166, null), gd.N0(2131745299, null), new g70(this, 10));
                        return;
                    } else {
                        return;
                    }
                }
                fj E = E(i7);
                if (E != null) {
                    if (sl0Var.J.i0() && i7 >= sl0Var.f39646w && i7 < sl0Var.f39647x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i13 == 1) {
                        pl0 pl0Var = (pl0) view;
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, pl0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = pl0Var.f38508a;
                        if (h7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = h7Var.getMessage().e1();
                        }
                        h7Var.c(E, true);
                        int e14 = h7Var.getMessage().e1();
                        uzVar.f52761a = fj.B0(h7Var.getMessage().f24073k);
                        uzVar.f52762b = e14;
                        boolean j3 = sl0Var.J.j(uzVar);
                        if (e13 == E.e1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h7Var.b(j3, z12);
                        if (e13 == E.e1()) {
                            z17 = true;
                        }
                        if (h7Var.P != z10) {
                            h7Var.P = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                h7Var.Q = f10;
                            }
                            h7Var.invalidate();
                            return;
                        }
                        return;
                    } else if (i13 == 2) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        if (g7Var.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = g7Var.getMessage().e1();
                        }
                        g7Var.f(E, true);
                        int e15 = g7Var.getMessage().e1();
                        uzVar.f52761a = fj.B0(g7Var.getMessage().f24073k);
                        uzVar.f52762b = e15;
                        boolean j10 = sl0Var.J.j(uzVar);
                        if (e12 == E.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g7Var.e(j10, z11);
                        if (e12 == E.e1()) {
                            z17 = true;
                        }
                        if (g7Var.f30800e0 != z10) {
                            g7Var.f30800e0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                g7Var.f30802f0 = f10;
                            }
                            g7Var.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                View view2 = f1Var.f59245a;
                em0 em0Var = (em0) obj;
                ArrayList arrayList = em0Var.f34800r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    bm0 bm0Var = (bm0) arrayList.get(i7);
                    dm0 dm0Var = (dm0) view2;
                    ch.p0 p0Var = dm0Var.d;
                    if (p0Var != null && p0Var.equals(bm0Var.f33768a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = bm0Var.f33768a.g();
                        tL_reactionCount.count = bm0Var.f33769b;
                        em0 em0Var2 = dm0Var.f34392s;
                        cm0 cm0Var = new cm0(dm0Var, em0Var2.f34794a, dm0Var, tL_reactionCount, em0Var2.f34796c);
                        dm0Var.f34385a = cm0Var;
                        cm0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        cm0 cm0Var2 = dm0Var.f34385a;
                        cm0Var2.f5441p = true;
                        cm0Var2.R = true;
                    } else {
                        dm0Var.f34385a.v = bm0Var.f33769b;
                    }
                    dm0Var.d = bm0Var.f33768a;
                    if (!z13) {
                        cm0 cm0Var3 = dm0Var.f34385a;
                        cm0Var3.f5429e = cm0Var3.f5450z;
                    }
                    dm0Var.f34385a.f5450z = org.telegram.messenger.g0.L(44.33f);
                    dm0Var.f34385a.f5445t = !TextUtils.isEmpty(bm0Var.f33770c);
                    cm0 cm0Var4 = dm0Var.f34385a;
                    boolean z20 = cm0Var4.f5445t;
                    org.telegram.ui.Components.m6 m6Var = cm0Var4.F;
                    if (z20) {
                        m6Var.t(org.telegram.messenger.j6.m(bm0Var.f33770c, m6Var.f37392a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (m6Var != null) {
                        m6Var.t("", !z13, true);
                    }
                    cm0 cm0Var5 = dm0Var.f34385a;
                    Integer.toString(bm0Var.f33769b);
                    cm0Var5.getClass();
                    dm0Var.f34385a.E.c(bm0Var.f33769b, !z13);
                    cm0 cm0Var6 = dm0Var.f34385a;
                    if (cm0Var6.E != null && (cm0Var6.v > 0 || cm0Var6.f5445t)) {
                        float f11 = cm0Var6.f5450z;
                        int ceil = (int) Math.ceil(pqVar.f38551m);
                        if (dm0Var.f34385a.f5445t) {
                            f10 = 4.0f;
                        }
                        cm0Var6.f5450z = (int) (org.telegram.messenger.g0.L(f10) + ceil + dm0Var.f34385a.F.d + f11);
                    }
                    if (z13) {
                        cm0 cm0Var7 = dm0Var.f34385a;
                        cm0Var7.f5429e = cm0Var7.f5450z;
                    }
                    dm0Var.f34385a.A = org.telegram.messenger.g0.L(28.0f);
                    cm0 cm0Var8 = dm0Var.f34385a;
                    cm0Var8.f5440o = dm0Var.f34388e;
                    if (dm0Var.f34391r) {
                        cm0Var8.a();
                    }
                    if (!z13) {
                        dm0Var.requestLayout();
                    }
                    dm0 dm0Var2 = (dm0) view2;
                    if (bm0Var.f33768a.h != em0Var.h) {
                        z18 = false;
                    }
                    dm0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                d11 d11Var = (d11) f1Var.f59245a;
                c11 c11Var = (c11) ((f11) obj).U.get(i7);
                f11 f11Var = d11Var.f34190s;
                org.telegram.ui.Components.p9 p9Var = d11Var.f34183a;
                c11 c11Var2 = d11Var.f34186e;
                if (c11Var2 == null || c11Var2.f33888a != c11Var.f33888a || !Objects.equals(c11Var2.f33889b, c11Var.f33889b)) {
                    z18 = false;
                }
                if (f11Var.f34947a0 >= 1.0f && f11Var.f34961k0 == null) {
                    d11Var.setScaleX(1.0f);
                    d11Var.setScaleY(1.0f);
                    d11Var.setAlpha(1.0f);
                }
                d11Var.f34186e = c11Var;
                if (!z18) {
                    p9Var.setAnimatedEmojiDrawable(null);
                    d11Var.h = null;
                    d11Var.f34188n = 0;
                    if (c11Var.f33888a != 0) {
                        d11Var.f34187f = null;
                        p9Var.setVisibility(0);
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(3, f11Var.f34946a, c11Var.f33888a);
                        d11Var.h = o5Var;
                        p9Var.setAnimatedEmojiDrawable(o5Var);
                    } else {
                        if (c11Var.f33889b.booleanValue()) {
                            i10 = 2131743744;
                        } else {
                            i10 = 2131743743;
                        }
                        d11Var.f34187f = gd.N0(i10, null);
                        p9Var.setVisibility(8);
                    }
                    d11Var.setContentDescription(d11Var.f34187f);
                }
                d11Var.a(z18);
                d11Var.requestLayout();
                d11Var.invalidate();
                return;
            case 6:
                return;
            case 7:
                lf0 lf0Var = (lf0) obj;
                ((kf0) f1Var.f59245a).a((TLObject) lf0Var.f49746c.get(i7), ((Integer) lf0Var.f49745b.get(i7)).intValue(), false);
                return;
            case 8:
                wh0 wh0Var = (wh0) obj;
                org.telegram.ui.ActionBar.i6 i6Var = wh0Var.f53686f;
                int i14 = f1Var.f59249f;
                View view3 = f1Var.f59245a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view3;
                            Drawable drawable = j2Var.getContext().getResources().getDrawable(2131232564);
                            Drawable drawable2 = j2Var.getContext().getResources().getDrawable(2131232565);
                            int i15 = org.telegram.ui.ActionBar.n6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.u6.x(j2Var, drawable, i15, i6Var, mode);
                            org.telegram.ui.ActionBar.u6.x(j2Var, drawable2, org.telegram.ui.ActionBar.n6.f29581k7, i6Var, mode);
                            lq lqVar = new lq(drawable, drawable2);
                            j2Var.f30954a.l(gd.N0(2131743556, null), false);
                            j2Var.f30955b.setImageDrawable(lqVar);
                            j2Var.f30956c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view3;
                    if (i7 == 0) {
                        o4Var.setText(gd.N0(2131743966, null));
                        return;
                    } else if (i7 == wh0Var.f53692y) {
                        o4Var.setText(gd.N0(2131744044, null));
                        return;
                    } else {
                        return;
                    }
                }
                vh0 vh0Var = (vh0) view3;
                int i16 = wh0Var.E;
                if (i7 >= i16 && i7 < wh0Var.F) {
                    uh0Var = (uh0) wh0Var.f53683b.get(i7 - i16);
                }
                int i17 = wh0Var.f53687n;
                if (i7 >= i17 && i7 < wh0Var.f53688r) {
                    uh0Var = (uh0) wh0Var.f53682a.get(i7 - i17);
                }
                if (uh0Var != null) {
                    if (vh0Var.f52973e == uh0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (uh0Var == wh0Var.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (wh0Var.J.get(uh0Var.f52663c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    vh0Var.f52973e = uh0Var;
                    vh0Var.f52970a.setText(uh0Var.f52665f);
                    if (i7 != wh0Var.F - 1) {
                        z17 = true;
                    }
                    vh0Var.d = z17;
                    vh0Var.f52971b.a(z15, z14);
                    vh0Var.f52972c.a(z16, z14);
                    return;
                }
                return;
            case 9:
                ((oc1) f1Var.f59245a).f50662a = WallpapersListActivity.f45503j0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f58780a == 1) {
                    ug.h hVar = (ug.h) f1Var.f59245a;
                    hVar.f58793c.setColorFilter(new PorterDuffColorFilter(iVar.f58821e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f58793c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f58781b));
                    hVar.f58791a.setText(((ug.g) arrayList2.get(i7)).f58782c);
                    hVar.f58792b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = f1Var.f59245a;
                ug.h1 h1Var = (ug.h1) obj;
                int i18 = h1Var.f58800f2;
                if (i7 >= i18 && i7 < h1Var.f58801g2) {
                    is0 is0Var = (is0) view4;
                    vs0 vs0Var = (vs0) h1Var.T1.get(i7 - i18);
                    if (i7 != h1Var.f58801g2 - 1) {
                        z17 = true;
                    }
                    is0Var.a(vs0Var, z17);
                    return;
                } else if (i7 >= h1Var.d2 && i7 < h1Var.f58799e2) {
                    h1Var.h1(view4);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.Cells.o4 o4Var;
        View view;
        int intValue;
        int i16;
        os0 os0Var;
        int i17 = this.f9245c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((f6) obj).getContext());
                view2.f35968a = 0;
                return new v4.f1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f34767o2);
                ?? f1Var = new v4.f1(n0Var);
                f1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(30.0f)));
                return f1Var;
            case 2:
                return new v4.f1(((org.telegram.ui.Components.ja) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    frameLayout2.f38508a = h7Var;
                    h7Var.f30850r.setVisibility(8);
                    frameLayout2.addView(h7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(frameLayout);
            case 4:
                em0 em0Var = (em0) obj;
                return new v4.f1(new dm0(em0Var, em0Var.getContext()));
            case 5:
                d11 d11Var = new d11((f11) obj, viewGroup.getContext());
                d11Var.setLayoutParams(new v4.q0(-2, -1));
                return new v4.f1(d11Var);
            case 6:
                zt ztVar = (zt) obj;
                if (i7 == 0) {
                    linearLayout = ztVar.Z1;
                } else if (i7 == 2) {
                    View view3 = ztVar.f54719a2;
                    v4.q0 q0Var = new v4.q0(-1, -2);
                    int i19 = ztVar.f30261u0;
                    ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i19;
                    view3.setLayoutParams(q0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.n6.f29394a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.u6.x(z8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    lq lqVar = new lq(colorDrawable, org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), 2131231233, org.telegram.ui.ActionBar.n6.f29415b7));
                    lqVar.f37204x = true;
                    z8Var.setBackgroundDrawable(lqVar);
                    linearLayout = z8Var;
                }
                return new v4.f1(linearLayout);
            case 7:
                kf0 kf0Var = new kf0(viewGroup.getContext());
                kf0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.f1(kf0Var);
            case 8:
                org.telegram.ui.ActionBar.i6 i6Var = ((wh0) obj).f53686f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context2, i6Var);
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var2, i6Var);
                            o4Var = o4Var2;
                        } else {
                            o4Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.c0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(70, context2, i6Var);
                        j2Var.d = 61;
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, j2Var, i6Var);
                        o4Var = j2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f52971b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.h7, i6Var);
                    boolean z10 = gd.f24314a0;
                    if (z10) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    int i22 = i10 | 16;
                    int i23 = 20;
                    if (z10) {
                        i11 = 0;
                    } else {
                        i11 = 20;
                    }
                    float f10 = i11;
                    if (!z10) {
                        i23 = 0;
                    }
                    frameLayout3.addView(radioButton, c8.na.d(22, 22.0f, i22, f10, 0.0f, i23, 0.0f));
                    lp lpVar = new lp(24, context2, i6Var);
                    frameLayout3.f52972c = lpVar;
                    int i24 = org.telegram.ui.ActionBar.n6.f29451d6;
                    lpVar.b(-1, i24, org.telegram.ui.ActionBar.n6.f29581k7);
                    lpVar.setDrawUnchecked(false);
                    lpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = gd.f24314a0;
                    if (z11) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i25 = i12 | 16;
                    int i26 = 18;
                    if (z11) {
                        i13 = 0;
                    } else {
                        i13 = 18;
                    }
                    float f11 = i13;
                    if (!z11) {
                        i26 = 0;
                    }
                    frameLayout3.addView(lpVar, c8.na.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    lpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f52970a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    m10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (gd.f24314a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z12 = gd.f24314a0;
                    if (z12) {
                        i18 = 5;
                    }
                    int i27 = i18 | 16;
                    if (z12) {
                        i15 = 23;
                    } else {
                        i15 = 61;
                    }
                    float f12 = i15;
                    if (!z12) {
                        i21 = 23;
                    }
                    frameLayout3.addView(textView, c8.na.d(-2, -2.0f, i27, f12, 0.0f, i21, 0.0f));
                    org.telegram.ui.ActionBar.u6.h(i24, frameLayout3, i6Var);
                    o4Var = frameLayout3;
                }
                return i5.c.q(o4Var, o4Var, -1, -2);
            case 9:
                sc1 sc1Var = (sc1) obj;
                return new v4.f1(new oc1(sc1Var.F, sc1Var.f52054c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = iVar.f58720a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.w3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f58793c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.na.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f58791a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.na.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f58792b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29843y6, i6Var2);
                    textView3.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView3, c8.na.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout4;
                }
                return i5.c.q(view, view, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.h1 h1Var = (ug.h1) obj;
                View i110 = h1Var.i1(context4, i7);
                if (i110 != null) {
                    return i5.c.q(i110, i110, -1, -2);
                }
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    os0Var = new os0(this, context4, h1Var.J0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, h1Var.J0);
                                    d0Var.setBackground(true);
                                    String N0 = gd.N0(2131749489, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.n6.Xc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(N0, i28, 0, new Runnable(this) {
                                        public final l4 f58790b;

                                        {
                                            this.f58790b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58790b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((h1) l4Var.d).f58810p2.getParentActivity(), gd.N0(2131743951, null));
                                                    return;
                                                default:
                                                    vf.c.t(((h1) l4Var.d).f58810p2.getParentActivity(), gd.N0(2131746587, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.R2(gd.N0(2131749490, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final l4 f58790b;

                                        {
                                            this.f58790b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58790b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((h1) l4Var.d).f58810p2.getParentActivity(), gd.N0(2131743951, null));
                                                    return;
                                                default:
                                                    vf.c.t(((h1) l4Var.d).f58810p2.getParentActivity(), gd.N0(2131746587, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    os0Var = d0Var;
                                }
                            } else {
                                os0Var = new ai.l2(context4);
                            }
                        } else {
                            os0Var = new zh.f(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.n6.f29394a7;
                        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.n6.w0(i29, h1Var.J0), 0);
                        org.telegram.ui.ActionBar.u6.h(i29, y6Var, h1Var.J0);
                        os0Var = y6Var;
                    }
                } else {
                    b61 b61Var = new b61(25, context4, this);
                    h1Var.f58809o2 = b61Var;
                    b61Var.setOrientation(1);
                    View view4 = h1Var.f58818x2;
                    if (view4 == null) {
                        h1Var.f58808n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.n6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.w0(i30, h1Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, h1Var.J0)));
                        h1Var.f58808n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = h1Var.f58808n2.f59590b;
                        fVar.f59574z = i30;
                        fVar.A = org.telegram.ui.ActionBar.n6.Ck;
                        fVar.b();
                        b61Var.addView(h1Var.f58808n2, c8.na.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) h1Var.f58818x2.getParent()).removeView(h1Var.f58818x2);
                        }
                        h1Var.f1(b61Var);
                    }
                    if (h1Var.J2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        h1Var.J2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = h1Var.f58811q2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29786v6, h1Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        h1Var.K2 = new j80[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            h1Var.K2[i31] = new bi.w2(7, context4, h1Var.J0);
                            j80 j80Var = h1Var.K2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            j80Var.setVisibility(i16);
                            h1Var.K2[i31].setTextSize(1, 16.0f);
                            h1Var.K2[i31].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.K2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.u6.U(h1Var.K2[i31], org.telegram.ui.ActionBar.n6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.u6.G(h1Var.K2[i31], org.telegram.ui.ActionBar.n6.J6, h1Var.J0);
                            h1Var.J2.addView(h1Var.K2[i31], c8.na.c(-2.0f, -1));
                        }
                    }
                    if (h1Var.J2.getParent() != null) {
                        ((ViewGroup) h1Var.J2.getParent()).removeView(h1Var.J2);
                    }
                    b61Var.addView(h1Var.J2, c8.na.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.L2 == null) {
                        j80 j80Var2 = new j80(h1Var.getContext(), h1Var.J0);
                        h1Var.L2 = j80Var2;
                        j80Var2.setTextSize(1, 14.0f);
                        h1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.u6.U(h1Var.L2, org.telegram.ui.ActionBar.n6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.u6.G(h1Var.L2, org.telegram.ui.ActionBar.n6.J6, h1Var.J0);
                    }
                    if (h1Var.L2.getParent() != null) {
                        ((ViewGroup) h1Var.L2.getParent()).removeView(h1Var.L2);
                    }
                    b61Var.addView(h1Var.L2, c8.na.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.k1(false);
                    h1Var.f58807m2 = new ki.e(context4, 5);
                    w01 w01Var = new w01(12, context4, this);
                    w01Var.setClipChildren(false);
                    w01Var.addView(h1Var.f58807m2);
                    w01Var.addView(b61Var);
                    bc bcVar = h1Var.f58808n2;
                    os0Var = w01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(h1Var.f58807m2);
                        os0Var = w01Var;
                    }
                }
                os0Var.setLayoutParams(new v4.q0(-1, -2));
                h1Var.e1(i7, os0Var);
                return new v4.f1(os0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        boolean z10;
        switch (this.f9245c) {
            case 4:
                em0 em0Var = (em0) this.d;
                ArrayList arrayList = em0Var.f34800r;
                int b10 = f1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    dm0 dm0Var = (dm0) f1Var.f59245a;
                    if (((bm0) arrayList.get(b10)).f33768a.h == em0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dm0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void F(v4.f1 f1Var, int i7) {
    }

    private final void G(v4.f1 f1Var, int i7) {
    }
}
