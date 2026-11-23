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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.x01;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.au;
import org.telegram.ui.d61;
import org.telegram.ui.ks0;
import org.telegram.ui.lf0;
import org.telegram.ui.mf0;
import org.telegram.ui.qc1;
import org.telegram.ui.qs0;
import org.telegram.ui.uc1;
import org.telegram.ui.vz;
import org.telegram.ui.wh0;
import org.telegram.ui.xh0;
import org.telegram.ui.xs0;
import org.telegram.ui.yh0;
public final class l4 extends dk0 {
    public final int f9249c;
    public final Object d;

    public l4(Object obj, int i7) {
        this.f9249c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f9249c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = e1Var.f59115f;
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
                int i10 = e1Var.f59115f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (e1Var.f59115f == 1) {
                    return true;
                }
                return false;
        }
    }

    public gj E(int i7) {
        sl0 sl0Var = (sl0) this.d;
        int i10 = sl0Var.f39579w;
        if (i7 >= i10 && i7 < sl0Var.f39580x) {
            return (gj) sl0Var.f39574e.get(i7 - i10);
        }
        int i11 = sl0Var.E;
        if (i7 >= i11 && i7 < sl0Var.F) {
            return (gj) sl0Var.f39575f.get(i7 - i11);
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
        switch (this.f9249c) {
            case 0:
                return ((f6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f17621f3.size();
            case 2:
                return 1;
            case 3:
                return ((sl0) this.d).f39577r;
            case 4:
                return ((em0) this.d).f34894r.size();
            case 5:
                return ((g11) this.d).U.size();
            case 6:
                if (((au) this.d).f45652c2.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((mf0) this.d).f49842c.size();
            case 8:
                return ((yh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.h1) this.d).f58682b2;
        }
    }

    @Override
    public long c(int i7) {
        wh0 wh0Var;
        switch (this.f9249c) {
            case 8:
                yh0 yh0Var = (yh0) this.d;
                int i10 = yh0Var.E;
                if (i7 >= i10 && i7 < yh0Var.F) {
                    wh0Var = (wh0) yh0Var.f54182b.get(i7 - i10);
                } else {
                    int i11 = yh0Var.f54186n;
                    if (i7 >= i11 && i7 < yh0Var.f54187r) {
                        wh0Var = (wh0) yh0Var.f54181a.get(i7 - i11);
                    } else {
                        wh0Var = null;
                    }
                }
                if (wh0Var != null) {
                    return wh0Var.f53404c;
                }
                yh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == yh0Var.f54191y) {
                    return 2L;
                }
                if (i7 == yh0Var.f54188s) {
                    return 3L;
                }
                if (i7 == yh0Var.f54189w) {
                    return 4L;
                }
                if (i7 == yh0Var.f54190x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f9249c) {
            case 2:
                return i7;
            case 3:
                sl0 sl0Var = (sl0) this.d;
                if (i7 != sl0Var.f39578s && i7 != sl0Var.f39581y) {
                    gj E = E(i7);
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
                yh0 yh0Var = (yh0) this.d;
                if (i7 >= yh0Var.E && i7 < yh0Var.F) {
                    return 0;
                }
                yh0Var.getClass();
                if (i7 != 0 && i7 != yh0Var.f54191y) {
                    if (i7 == yh0Var.f54188s) {
                        return 2;
                    }
                    if (i7 != yh0Var.f54189w && i7 != yh0Var.f54190x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f58665a;
            case 11:
                ug.h1 h1Var = (ug.h1) this.d;
                if (i7 != h1Var.f58683c2) {
                    if (i7 >= h1Var.d2 && i7 < h1Var.f58684e2) {
                        return h1Var.g1();
                    }
                    if (i7 >= h1Var.f58685f2 && i7 < h1Var.f58686g2) {
                        return 1;
                    }
                    if (i7 == h1Var.f58687h2) {
                        return 2;
                    }
                    if (i7 == h1Var.f58688i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == h1Var.f58689j2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int e12;
        boolean z11;
        int e13;
        boolean z12;
        String N0;
        String N02;
        boolean z13;
        sq sqVar;
        int i10;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f9249c;
        float f10 = 0.0f;
        wh0 wh0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i11) {
            case 0:
                int[] iArr = ((f6) obj).O2;
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) e1Var.f59111a;
                int i12 = iArr[(iArr.length - 1) - i7];
                if (jaVar.f36410a != i12) {
                    jaVar.f36410a = i12;
                    jaVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) e1Var).v.setData((jg.o0) ((jg.q0) obj).f17621f3.get(i7));
                return;
            case 2:
                return;
            case 3:
                sl0 sl0Var = (sl0) obj;
                vz vzVar = sl0Var.K;
                int i13 = e1Var.f59115f;
                View view = e1Var.f59111a;
                if (i13 == 0) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (i7 == sl0Var.f39578s) {
                        String N03 = hd.N0(2131751332, null);
                        if (y3Var.getText().equals(N03)) {
                            if (sl0Var.I) {
                                N02 = hd.N0(2131747239, null);
                            } else {
                                N02 = hd.N0(2131745857, null);
                            }
                            boolean z19 = sl0Var.I;
                            org.telegram.ui.Cells.x3 x3Var = y3Var.f32453b;
                            x3Var.c(N02, true, z19);
                            x3Var.setVisibility(0);
                            return;
                        }
                        if (sl0Var.I) {
                            N0 = hd.N0(2131747239, null);
                        } else {
                            N0 = hd.N0(2131745857, null);
                        }
                        y3Var.b(N03, N0, new rl0(this));
                        return;
                    } else if (i7 == sl0Var.f39581y) {
                        y3Var.b(hd.N0(2131746166, null), hd.N0(2131745299, null), new j70(this, 10));
                        return;
                    } else {
                        return;
                    }
                }
                gj E = E(i7);
                if (E != null) {
                    if (sl0Var.J.V1() && i7 >= sl0Var.f39579w && i7 < sl0Var.f39580x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i13 == 1) {
                        pl0 pl0Var = (pl0) view;
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, pl0Var, null);
                        org.telegram.ui.Cells.i7 i7Var = pl0Var.f38570a;
                        if (i7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = i7Var.getMessage().e1();
                        }
                        i7Var.c(E, true);
                        int e14 = i7Var.getMessage().e1();
                        vzVar.f52889a = gj.B0(i7Var.getMessage().f24177k);
                        vzVar.f52890b = e14;
                        boolean r02 = sl0Var.J.r0(vzVar);
                        if (e13 == E.e1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i7Var.b(r02, z12);
                        if (e13 == E.e1()) {
                            z17 = true;
                        }
                        if (i7Var.P != z10) {
                            i7Var.P = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                i7Var.Q = f10;
                            }
                            i7Var.invalidate();
                            return;
                        }
                        return;
                    } else if (i13 == 2) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        if (h7Var.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = h7Var.getMessage().e1();
                        }
                        h7Var.f(E, true);
                        int e15 = h7Var.getMessage().e1();
                        vzVar.f52889a = gj.B0(h7Var.getMessage().f24177k);
                        vzVar.f52890b = e15;
                        boolean r03 = sl0Var.J.r0(vzVar);
                        if (e12 == E.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h7Var.e(r03, z11);
                        if (e12 == E.e1()) {
                            z17 = true;
                        }
                        if (h7Var.f30740e0 != z10) {
                            h7Var.f30740e0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                h7Var.f30742f0 = f10;
                            }
                            h7Var.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                View view2 = e1Var.f59111a;
                em0 em0Var = (em0) obj;
                ArrayList arrayList = em0Var.f34894r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    bm0 bm0Var = (bm0) arrayList.get(i7);
                    dm0 dm0Var = (dm0) view2;
                    ch.p0 p0Var = dm0Var.d;
                    if (p0Var != null && p0Var.equals(bm0Var.f33834a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = bm0Var.f33834a.g();
                        tL_reactionCount.count = bm0Var.f33835b;
                        em0 em0Var2 = dm0Var.f34495s;
                        cm0 cm0Var = new cm0(dm0Var, em0Var2.f34888a, dm0Var, tL_reactionCount, em0Var2.f34890c);
                        dm0Var.f34488a = cm0Var;
                        cm0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        cm0 cm0Var2 = dm0Var.f34488a;
                        cm0Var2.f5441p = true;
                        cm0Var2.R = true;
                    } else {
                        dm0Var.f34488a.v = bm0Var.f33835b;
                    }
                    dm0Var.d = bm0Var.f33834a;
                    if (!z13) {
                        cm0 cm0Var3 = dm0Var.f34488a;
                        cm0Var3.f5429e = cm0Var3.f5450z;
                    }
                    dm0Var.f34488a.f5450z = org.telegram.messenger.g0.L(44.33f);
                    dm0Var.f34488a.f5445t = !TextUtils.isEmpty(bm0Var.f33836c);
                    cm0 cm0Var4 = dm0Var.f34488a;
                    boolean z20 = cm0Var4.f5445t;
                    org.telegram.ui.Components.n6 n6Var = cm0Var4.F;
                    if (z20) {
                        n6Var.t(org.telegram.messenger.j6.m(bm0Var.f33836c, n6Var.f37749a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (n6Var != null) {
                        n6Var.t("", !z13, true);
                    }
                    cm0 cm0Var5 = dm0Var.f34488a;
                    Integer.toString(bm0Var.f33835b);
                    cm0Var5.getClass();
                    dm0Var.f34488a.E.c(bm0Var.f33835b, !z13);
                    cm0 cm0Var6 = dm0Var.f34488a;
                    if (cm0Var6.E != null && (cm0Var6.v > 0 || cm0Var6.f5445t)) {
                        float f11 = cm0Var6.f5450z;
                        int ceil = (int) Math.ceil(sqVar.f39617m);
                        if (dm0Var.f34488a.f5445t) {
                            f10 = 4.0f;
                        }
                        cm0Var6.f5450z = (int) (org.telegram.messenger.g0.L(f10) + ceil + dm0Var.f34488a.F.d + f11);
                    }
                    if (z13) {
                        cm0 cm0Var7 = dm0Var.f34488a;
                        cm0Var7.f5429e = cm0Var7.f5450z;
                    }
                    dm0Var.f34488a.A = org.telegram.messenger.g0.L(28.0f);
                    cm0 cm0Var8 = dm0Var.f34488a;
                    cm0Var8.f5440o = dm0Var.f34491e;
                    if (dm0Var.f34494r) {
                        cm0Var8.a();
                    }
                    if (!z13) {
                        dm0Var.requestLayout();
                    }
                    dm0 dm0Var2 = (dm0) view2;
                    if (bm0Var.f33834a.h != em0Var.h) {
                        z18 = false;
                    }
                    dm0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                e11 e11Var = (e11) e1Var.f59111a;
                d11 d11Var = (d11) ((g11) obj).U.get(i7);
                g11 g11Var = e11Var.f34644s;
                org.telegram.ui.Components.q9 q9Var = e11Var.f34637a;
                d11 d11Var2 = e11Var.f34640e;
                if (d11Var2 == null || d11Var2.f34307a != d11Var.f34307a || !Objects.equals(d11Var2.f34308b, d11Var.f34308b)) {
                    z18 = false;
                }
                if (g11Var.f35328a0 >= 1.0f && g11Var.f35342k0 == null) {
                    e11Var.setScaleX(1.0f);
                    e11Var.setScaleY(1.0f);
                    e11Var.setAlpha(1.0f);
                }
                e11Var.f34640e = d11Var;
                if (!z18) {
                    q9Var.setAnimatedEmojiDrawable(null);
                    e11Var.h = null;
                    e11Var.f34642n = 0;
                    if (d11Var.f34307a != 0) {
                        e11Var.f34641f = null;
                        q9Var.setVisibility(0);
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(3, g11Var.f35327a, d11Var.f34307a);
                        e11Var.h = p5Var;
                        q9Var.setAnimatedEmojiDrawable(p5Var);
                    } else {
                        if (d11Var.f34308b.booleanValue()) {
                            i10 = 2131743748;
                        } else {
                            i10 = 2131743747;
                        }
                        e11Var.f34641f = hd.N0(i10, null);
                        q9Var.setVisibility(8);
                    }
                    e11Var.setContentDescription(e11Var.f34641f);
                }
                e11Var.a(z18);
                e11Var.requestLayout();
                e11Var.invalidate();
                return;
            case 6:
                return;
            case 7:
                mf0 mf0Var = (mf0) obj;
                ((lf0) e1Var.f59111a).a((TLObject) mf0Var.f49842c.get(i7), ((Integer) mf0Var.f49841b.get(i7)).intValue(), false);
                return;
            case 8:
                yh0 yh0Var = (yh0) obj;
                org.telegram.ui.ActionBar.h6 h6Var = yh0Var.f54185f;
                int i14 = e1Var.f59115f;
                View view3 = e1Var.f59111a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view3;
                            Drawable drawable = j2Var.getContext().getResources().getDrawable(2131232561);
                            Drawable drawable2 = j2Var.getContext().getResources().getDrawable(2131232562);
                            int i15 = org.telegram.ui.ActionBar.m6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.t6.x(j2Var, drawable, i15, h6Var, mode);
                            org.telegram.ui.ActionBar.t6.x(j2Var, drawable2, org.telegram.ui.ActionBar.m6.f29477k7, h6Var, mode);
                            oq oqVar = new oq(drawable, drawable2);
                            j2Var.f30865a.l(hd.N0(2131743560, null), false);
                            j2Var.f30866b.setImageDrawable(oqVar);
                            j2Var.f30867c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view3;
                    if (i7 == 0) {
                        o4Var.setText(hd.N0(2131743970, null));
                        return;
                    } else if (i7 == yh0Var.f54191y) {
                        o4Var.setText(hd.N0(2131744048, null));
                        return;
                    } else {
                        return;
                    }
                }
                xh0 xh0Var = (xh0) view3;
                int i16 = yh0Var.E;
                if (i7 >= i16 && i7 < yh0Var.F) {
                    wh0Var = (wh0) yh0Var.f54182b.get(i7 - i16);
                }
                int i17 = yh0Var.f54186n;
                if (i7 >= i17 && i7 < yh0Var.f54187r) {
                    wh0Var = (wh0) yh0Var.f54181a.get(i7 - i17);
                }
                if (wh0Var != null) {
                    if (xh0Var.f53810e == wh0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (wh0Var == yh0Var.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (yh0Var.J.get(wh0Var.f53404c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    xh0Var.f53810e = wh0Var;
                    xh0Var.f53807a.setText(wh0Var.f53406f);
                    if (i7 != yh0Var.F - 1) {
                        z17 = true;
                    }
                    xh0Var.d = z17;
                    xh0Var.f53808b.a(z15, z14);
                    xh0Var.f53809c.a(z16, z14);
                    return;
                }
                return;
            case 9:
                ((qc1) e1Var.f59111a).f51187a = WallpapersListActivity.f45385j0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f58665a == 1) {
                    ug.h hVar = (ug.h) e1Var.f59111a;
                    hVar.f58678c.setColorFilter(new PorterDuffColorFilter(iVar.f58706e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f58678c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f58666b));
                    hVar.f58676a.setText(((ug.g) arrayList2.get(i7)).f58667c);
                    hVar.f58677b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = e1Var.f59111a;
                ug.h1 h1Var = (ug.h1) obj;
                int i18 = h1Var.f58685f2;
                if (i7 >= i18 && i7 < h1Var.f58686g2) {
                    ks0 ks0Var = (ks0) view4;
                    xs0 xs0Var = (xs0) h1Var.T1.get(i7 - i18);
                    if (i7 != h1Var.f58686g2 - 1) {
                        z17 = true;
                    }
                    ks0Var.a(xs0Var, z17);
                    return;
                } else if (i7 >= h1Var.d2 && i7 < h1Var.f58684e2) {
                    h1Var.h1(view4);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
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
        qs0 qs0Var;
        int i17 = this.f9249c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((f6) obj).getContext());
                view2.f36410a = 0;
                return new v4.e1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f34859o2);
                ?? e1Var = new v4.e1(n0Var);
                e1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(30.0f)));
                return e1Var;
            case 2:
                return new v4.e1(((org.telegram.ui.Components.ka) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(2, context, null);
                    frameLayout2.f38570a = i7Var;
                    i7Var.f30828r.setVisibility(8);
                    frameLayout2.addView(i7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.h7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(frameLayout);
            case 4:
                em0 em0Var = (em0) obj;
                return new v4.e1(new dm0(em0Var, em0Var.getContext()));
            case 5:
                e11 e11Var = new e11((g11) obj, viewGroup.getContext());
                e11Var.setLayoutParams(new v4.p0(-2, -1));
                return new v4.e1(e11Var);
            case 6:
                au auVar = (au) obj;
                if (i7 == 0) {
                    linearLayout = auVar.Z1;
                } else if (i7 == 2) {
                    View view3 = auVar.f45650a2;
                    v4.p0 p0Var = new v4.p0(-1, -2);
                    int i19 = auVar.f30177u0;
                    ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i19;
                    view3.setLayoutParams(p0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                    a9Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.m6.f29290a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.t6.x(a9Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    oq oqVar = new oq(colorDrawable, org.telegram.ui.ActionBar.m6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.m6.f29311b7));
                    oqVar.f38309x = true;
                    a9Var.setBackgroundDrawable(oqVar);
                    linearLayout = a9Var;
                }
                return new v4.e1(linearLayout);
            case 7:
                lf0 lf0Var = new lf0(viewGroup.getContext());
                lf0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.e1(lf0Var);
            case 8:
                org.telegram.ui.ActionBar.h6 h6Var = ((yh0) obj).f54185f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context2, h6Var);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, o4Var2, h6Var);
                            o4Var = o4Var2;
                        } else {
                            o4Var = new org.telegram.ui.Cells.z6(context2, (org.telegram.ui.Cells.c0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(70, context2, h6Var);
                        j2Var.d = 61;
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, j2Var, h6Var);
                        o4Var = j2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f53808b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.f29403g7, org.telegram.ui.ActionBar.m6.h7, h6Var);
                    boolean z10 = hd.f24408a0;
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
                    op opVar = new op(24, context2, h6Var);
                    frameLayout3.f53809c = opVar;
                    int i24 = org.telegram.ui.ActionBar.m6.f29347d6;
                    opVar.b(-1, i24, org.telegram.ui.ActionBar.m6.f29477k7);
                    opVar.setDrawUnchecked(false);
                    opVar.setDrawBackgroundAsArc(3);
                    boolean z11 = hd.f24408a0;
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
                    frameLayout3.addView(opVar, c8.na.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    opVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f53807a = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    o10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (hd.f24408a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z12 = hd.f24408a0;
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
                    org.telegram.ui.ActionBar.t6.h(i24, frameLayout3, h6Var);
                    o4Var = frameLayout3;
                }
                return i5.c.q(o4Var, o4Var, -1, -2);
            case 9:
                uc1 uc1Var = (uc1) obj;
                return new v4.e1(new qc1(uc1Var.F, uc1Var.f52526c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = iVar.f58605a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.w3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f58678c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.na.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f58676a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.na.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f58677b = textView3;
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29739y6, h6Var2);
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
                                    qs0Var = new qs0(this, context4, h1Var.J0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, h1Var.J0);
                                    d0Var.setBackground(true);
                                    String N0 = hd.N0(2131749489, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.m6.Xc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(N0, i28, 0, new Runnable(this) {
                                        public final l4 f58675b;

                                        {
                                            this.f58675b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58675b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((h1) l4Var.d).f58695p2.getParentActivity(), hd.N0(2131743955, null));
                                                    return;
                                                default:
                                                    vf.c.t(((h1) l4Var.d).f58695p2.getParentActivity(), hd.N0(2131746587, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.R2(hd.N0(2131749490, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final l4 f58675b;

                                        {
                                            this.f58675b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58675b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((h1) l4Var.d).f58695p2.getParentActivity(), hd.N0(2131743955, null));
                                                    return;
                                                default:
                                                    vf.c.t(((h1) l4Var.d).f58695p2.getParentActivity(), hd.N0(2131746587, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    qs0Var = d0Var;
                                }
                            } else {
                                qs0Var = new ai.k2(context4);
                            }
                        } else {
                            qs0Var = new zh.f(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.m6.f29290a7;
                        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context4, org.telegram.ui.ActionBar.m6.w0(i29, h1Var.J0), 0);
                        org.telegram.ui.ActionBar.t6.h(i29, z6Var, h1Var.J0);
                        qs0Var = z6Var;
                    }
                } else {
                    d61 d61Var = new d61(25, context4, this);
                    h1Var.f58694o2 = d61Var;
                    d61Var.setOrientation(1);
                    View view4 = h1Var.f58703x2;
                    if (view4 == null) {
                        h1Var.f58693n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.m6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.w0(i30, h1Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, h1Var.J0)));
                        h1Var.f58693n2.setBackgroundBitmap(createBitmap);
                        vg.g gVar = h1Var.f58693n2.f59470b;
                        gVar.f59454z = i30;
                        gVar.A = org.telegram.ui.ActionBar.m6.Ck;
                        gVar.b();
                        d61Var.addView(h1Var.f58693n2, c8.na.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) h1Var.f58703x2.getParent()).removeView(h1Var.f58703x2);
                        }
                        h1Var.f1(d61Var);
                    }
                    if (h1Var.J2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        h1Var.J2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = h1Var.f58696q2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, h1Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        h1Var.K2 = new m80[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            h1Var.K2[i31] = new bi.w2(7, context4, h1Var.J0);
                            m80 m80Var = h1Var.K2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            m80Var.setVisibility(i16);
                            h1Var.K2[i31].setTextSize(1, 16.0f);
                            h1Var.K2[i31].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.K2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.t6.U(h1Var.K2[i31], org.telegram.ui.ActionBar.m6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.t6.G(h1Var.K2[i31], org.telegram.ui.ActionBar.m6.J6, h1Var.J0);
                            h1Var.J2.addView(h1Var.K2[i31], c8.na.c(-2.0f, -1));
                        }
                    }
                    if (h1Var.J2.getParent() != null) {
                        ((ViewGroup) h1Var.J2.getParent()).removeView(h1Var.J2);
                    }
                    d61Var.addView(h1Var.J2, c8.na.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.L2 == null) {
                        m80 m80Var2 = new m80(h1Var.getContext(), h1Var.J0);
                        h1Var.L2 = m80Var2;
                        m80Var2.setTextSize(1, 14.0f);
                        h1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.t6.U(h1Var.L2, org.telegram.ui.ActionBar.m6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.t6.G(h1Var.L2, org.telegram.ui.ActionBar.m6.J6, h1Var.J0);
                    }
                    if (h1Var.L2.getParent() != null) {
                        ((ViewGroup) h1Var.L2.getParent()).removeView(h1Var.L2);
                    }
                    d61Var.addView(h1Var.L2, c8.na.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.k1(false);
                    h1Var.f58692m2 = new ki.e(context4, 5);
                    x01 x01Var = new x01(12, context4, this);
                    x01Var.setClipChildren(false);
                    x01Var.addView(h1Var.f58692m2);
                    x01Var.addView(d61Var);
                    bc bcVar = h1Var.f58693n2;
                    qs0Var = x01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(h1Var.f58692m2);
                        qs0Var = x01Var;
                    }
                }
                qs0Var.setLayoutParams(new v4.p0(-1, -2));
                h1Var.e1(i7, qs0Var);
                return new v4.e1(qs0Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        boolean z10;
        switch (this.f9249c) {
            case 4:
                em0 em0Var = (em0) this.d;
                ArrayList arrayList = em0Var.f34894r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    dm0 dm0Var = (dm0) e1Var.f59111a;
                    if (((bm0) arrayList.get(b10)).f33834a.h == em0Var.h) {
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

    private final void F(v4.e1 e1Var, int i7) {
    }

    private final void G(v4.e1 e1Var, int i7) {
    }
}
