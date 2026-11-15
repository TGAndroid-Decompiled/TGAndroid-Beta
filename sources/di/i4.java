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
import di.i4;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fs0;
import org.telegram.ui.if0;
import org.telegram.ui.jf0;
import org.telegram.ui.ls0;
import org.telegram.ui.nc1;
import org.telegram.ui.rc1;
import org.telegram.ui.sh0;
import org.telegram.ui.ss0;
import org.telegram.ui.sz;
import org.telegram.ui.th0;
import org.telegram.ui.uh0;
import org.telegram.ui.yt;
import org.telegram.ui.z51;
public final class i4 extends tj0 {
    public final int f8797c;
    public final Object d;

    public i4(Object obj, int i7) {
        this.f8797c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f8797c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = e1Var.f58539f;
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
                int i10 = e1Var.f58539f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (e1Var.f58539f == 1) {
                    return true;
                }
                return false;
        }
    }

    public gj E(int i7) {
        il0 il0Var = (il0) this.d;
        int i10 = il0Var.f35659w;
        if (i7 >= i10 && i7 < il0Var.f35660x) {
            return (gj) il0Var.f35654e.get(i7 - i10);
        }
        int i11 = il0Var.E;
        if (i7 >= i11 && i7 < il0Var.F) {
            return (gj) il0Var.f35655f.get(i7 - i11);
        }
        return null;
    }

    public void H(int i7, int i10) {
        int[] iArr = ((c6) this.d).O2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override
    public final int b() {
        switch (this.f8797c) {
            case 0:
                return ((c6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f17244f3.size();
            case 2:
                return 1;
            case 3:
                return ((il0) this.d).f35657r;
            case 4:
                return ((ul0) this.d).f40102r.size();
            case 5:
                return ((v01) this.d).S.size();
            case 6:
                if (((yt) this.d).f53626c2.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((jf0) this.d).f48322c.size();
            case 8:
                return ((uh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.g1) this.d).f58088b2;
        }
    }

    @Override
    public long c(int i7) {
        sh0 sh0Var;
        switch (this.f8797c) {
            case 8:
                uh0 uh0Var = (uh0) this.d;
                int i10 = uh0Var.E;
                if (i7 >= i10 && i7 < uh0Var.F) {
                    sh0Var = (sh0) uh0Var.f51948b.get(i7 - i10);
                } else {
                    int i11 = uh0Var.f51952n;
                    if (i7 >= i11 && i7 < uh0Var.f51953r) {
                        sh0Var = (sh0) uh0Var.f51947a.get(i7 - i11);
                    } else {
                        sh0Var = null;
                    }
                }
                if (sh0Var != null) {
                    return sh0Var.f51223c;
                }
                uh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == uh0Var.f51957y) {
                    return 2L;
                }
                if (i7 == uh0Var.f51954s) {
                    return 3L;
                }
                if (i7 == uh0Var.f51955w) {
                    return 4L;
                }
                if (i7 == uh0Var.f51956x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f8797c) {
            case 2:
                return i7;
            case 3:
                il0 il0Var = (il0) this.d;
                if (i7 != il0Var.f35658s && i7 != il0Var.f35661y) {
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
                uh0 uh0Var = (uh0) this.d;
                if (i7 >= uh0Var.E && i7 < uh0Var.F) {
                    return 0;
                }
                uh0Var.getClass();
                if (i7 != 0 && i7 != uh0Var.f51957y) {
                    if (i7 == uh0Var.f51954s) {
                        return 2;
                    }
                    if (i7 != uh0Var.f51955w && i7 != uh0Var.f51956x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f58081a;
            case 11:
                ug.g1 g1Var = (ug.g1) this.d;
                if (i7 != g1Var.f58089c2) {
                    if (i7 >= g1Var.d2 && i7 < g1Var.f58090e2) {
                        return g1Var.f1();
                    }
                    if (i7 >= g1Var.f58091f2 && i7 < g1Var.f58092g2) {
                        return 1;
                    }
                    if (i7 == g1Var.f58093h2) {
                        return 2;
                    }
                    if (i7 == g1Var.f58094i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == g1Var.f58095j2) {
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
        String M0;
        String M02;
        boolean z13;
        jq jqVar;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = this.f8797c;
        float f10 = 0.0f;
        sh0 sh0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((c6) obj).O2;
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) e1Var.f58535a;
                int i11 = iArr[(iArr.length - 1) - i7];
                if (baVar.f33232a != i11) {
                    baVar.f33232a = i11;
                    baVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) e1Var).v.setData((jg.o0) ((jg.q0) obj).f17244f3.get(i7));
                return;
            case 2:
                return;
            case 3:
                il0 il0Var = (il0) obj;
                sz szVar = il0Var.K;
                int i12 = e1Var.f58539f;
                View view = e1Var.f58535a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == il0Var.f35658s) {
                        String M03 = hd.M0(2131751344, null);
                        if (x3Var.getText().equals(M03)) {
                            if (il0Var.I) {
                                M02 = hd.M0(2131747433, null);
                            } else {
                                M02 = hd.M0(2131746053, null);
                            }
                            boolean z19 = il0Var.I;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f32026b;
                            w3Var.c(M02, true, z19);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (il0Var.I) {
                            M0 = hd.M0(2131747433, null);
                        } else {
                            M0 = hd.M0(2131746053, null);
                        }
                        x3Var.b(M03, M0, new hl0(this));
                        return;
                    } else if (i7 == il0Var.f35661y) {
                        x3Var.b(hd.M0(2131746362, null), hd.M0(2131745495, null), new y60(this, 8));
                        return;
                    } else {
                        return;
                    }
                }
                gj E = E(i7);
                if (E != null) {
                    if (il0Var.J.g0() && i7 >= il0Var.f35659w && i7 < il0Var.f35660x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i12 == 1) {
                        fl0 fl0Var = (fl0) view;
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, fl0Var, null);
                        org.telegram.ui.Cells.g7 g7Var = fl0Var.f34623a;
                        if (g7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = g7Var.getMessage().e1();
                        }
                        g7Var.c(E, true);
                        int e14 = g7Var.getMessage().e1();
                        szVar.f51305a = gj.B0(g7Var.getMessage().f23817k);
                        szVar.f51306b = e14;
                        boolean l10 = il0Var.J.l(szVar);
                        if (e13 == E.e1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g7Var.b(l10, z12);
                        if (e13 == E.e1()) {
                            z17 = true;
                        }
                        if (g7Var.P != z10) {
                            g7Var.P = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                g7Var.Q = f10;
                            }
                            g7Var.invalidate();
                            return;
                        }
                        return;
                    } else if (i12 == 2) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        if (f7Var.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = f7Var.getMessage().e1();
                        }
                        f7Var.f(E, true);
                        int e15 = f7Var.getMessage().e1();
                        szVar.f51305a = gj.B0(f7Var.getMessage().f23817k);
                        szVar.f51306b = e15;
                        boolean l11 = il0Var.J.l(szVar);
                        if (e12 == E.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f7Var.e(l11, z11);
                        if (e12 == E.e1()) {
                            z17 = true;
                        }
                        if (f7Var.f30279e0 != z10) {
                            f7Var.f30279e0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                f7Var.f30281f0 = f10;
                            }
                            f7Var.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                View view2 = e1Var.f58535a;
                ul0 ul0Var = (ul0) obj;
                ArrayList arrayList = ul0Var.f40102r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    rl0 rl0Var = (rl0) arrayList.get(i7);
                    tl0 tl0Var = (tl0) view2;
                    ch.p0 p0Var = tl0Var.d;
                    if (p0Var != null && p0Var.equals(rl0Var.f38998a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = rl0Var.f38998a.g();
                        tL_reactionCount.count = rl0Var.f38999b;
                        ul0 ul0Var2 = tl0Var.f39722s;
                        sl0 sl0Var = new sl0(tl0Var, ul0Var2.f40096a, tl0Var, tL_reactionCount, ul0Var2.f40098c);
                        tl0Var.f39715a = sl0Var;
                        sl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        sl0 sl0Var2 = tl0Var.f39715a;
                        sl0Var2.f5158p = true;
                        sl0Var2.R = true;
                    } else {
                        tl0Var.f39715a.v = rl0Var.f38999b;
                    }
                    tl0Var.d = rl0Var.f38998a;
                    if (!z13) {
                        sl0 sl0Var3 = tl0Var.f39715a;
                        sl0Var3.f5146e = sl0Var3.f5167z;
                    }
                    tl0Var.f39715a.f5167z = org.telegram.messenger.g0.L(44.33f);
                    tl0Var.f39715a.f5162t = !TextUtils.isEmpty(rl0Var.f39000c);
                    sl0 sl0Var4 = tl0Var.f39715a;
                    boolean z20 = sl0Var4.f5162t;
                    org.telegram.ui.Components.g6 g6Var = sl0Var4.F;
                    if (z20) {
                        g6Var.t(org.telegram.messenger.j6.m(rl0Var.f39000c, g6Var.f34827a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (g6Var != null) {
                        g6Var.t("", !z13, true);
                    }
                    sl0 sl0Var5 = tl0Var.f39715a;
                    Integer.toString(rl0Var.f38999b);
                    sl0Var5.getClass();
                    tl0Var.f39715a.E.c(rl0Var.f38999b, !z13);
                    sl0 sl0Var6 = tl0Var.f39715a;
                    if (sl0Var6.E != null && (sl0Var6.v > 0 || sl0Var6.f5162t)) {
                        float f11 = sl0Var6.f5167z;
                        int ceil = (int) Math.ceil(jqVar.f36149m);
                        if (tl0Var.f39715a.f5162t) {
                            f10 = 4.0f;
                        }
                        sl0Var6.f5167z = (int) (org.telegram.messenger.g0.L(f10) + ceil + tl0Var.f39715a.F.d + f11);
                    }
                    if (z13) {
                        sl0 sl0Var7 = tl0Var.f39715a;
                        sl0Var7.f5146e = sl0Var7.f5167z;
                    }
                    tl0Var.f39715a.A = org.telegram.messenger.g0.L(28.0f);
                    sl0 sl0Var8 = tl0Var.f39715a;
                    sl0Var8.f5157o = tl0Var.f39718e;
                    if (tl0Var.f39721r) {
                        sl0Var8.a();
                    }
                    if (!z13) {
                        tl0Var.requestLayout();
                    }
                    tl0 tl0Var2 = (tl0) view2;
                    if (rl0Var.f38998a.h != ul0Var.h) {
                        z18 = false;
                    }
                    tl0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                ((t01) e1Var.f58535a).getClass();
                ((r01) ((v01) obj).S.get(i7)).getClass();
                throw null;
            case 6:
                return;
            case 7:
                jf0 jf0Var = (jf0) obj;
                ((if0) e1Var.f58535a).a((TLObject) jf0Var.f48322c.get(i7), ((Integer) jf0Var.f48321b.get(i7)).intValue(), false);
                return;
            case 8:
                uh0 uh0Var = (uh0) obj;
                org.telegram.ui.ActionBar.e6 e6Var = uh0Var.f51951f;
                int i13 = e1Var.f58539f;
                View view3 = e1Var.f58535a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232560);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232561);
                            int i14 = org.telegram.ui.ActionBar.j6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.q6.x(i2Var, drawable, i14, e6Var, mode);
                            org.telegram.ui.ActionBar.q6.x(i2Var, drawable2, org.telegram.ui.ActionBar.j6.f28979k7, e6Var, mode);
                            fq fqVar = new fq(drawable, drawable2);
                            i2Var.f30428a.l(hd.M0(2131743803, null), false);
                            i2Var.f30429b.setImageDrawable(fqVar);
                            i2Var.f30430c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(hd.M0(2131744211, null));
                        return;
                    } else if (i7 == uh0Var.f51957y) {
                        n4Var.setText(hd.M0(2131744289, null));
                        return;
                    } else {
                        return;
                    }
                }
                th0 th0Var = (th0) view3;
                int i15 = uh0Var.E;
                if (i7 >= i15 && i7 < uh0Var.F) {
                    sh0Var = (sh0) uh0Var.f51948b.get(i7 - i15);
                }
                int i16 = uh0Var.f51952n;
                if (i7 >= i16 && i7 < uh0Var.f51953r) {
                    sh0Var = (sh0) uh0Var.f51947a.get(i7 - i16);
                }
                if (sh0Var != null) {
                    if (th0Var.f51590e == sh0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (sh0Var == uh0Var.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (uh0Var.J.get(sh0Var.f51223c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    th0Var.f51590e = sh0Var;
                    th0Var.f51587a.setText(sh0Var.f51225f);
                    if (i7 != uh0Var.F - 1) {
                        z17 = true;
                    }
                    th0Var.d = z17;
                    th0Var.f51588b.a(z15, z14);
                    th0Var.f51589c.a(z16, z14);
                    return;
                }
                return;
            case 9:
                ((nc1) e1Var.f58535a).f49547a = WallpapersListActivity.f44868j0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f58081a == 1) {
                    ug.h hVar = (ug.h) e1Var.f58535a;
                    hVar.f58114c.setColorFilter(new PorterDuffColorFilter(iVar.f58117e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f58114c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f58082b));
                    hVar.f58112a.setText(((ug.g) arrayList2.get(i7)).f58083c);
                    hVar.f58113b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = e1Var.f58535a;
                ug.g1 g1Var = (ug.g1) obj;
                int i17 = g1Var.f58091f2;
                if (i7 >= i17 && i7 < g1Var.f58092g2) {
                    fs0 fs0Var = (fs0) view4;
                    ss0 ss0Var = (ss0) g1Var.T1.get(i7 - i17);
                    if (i7 != g1Var.f58092g2 - 1) {
                        z17 = true;
                    }
                    fs0Var.a(ss0Var, z17);
                    return;
                } else if (i7 >= g1Var.d2 && i7 < g1Var.f58090e2) {
                    g1Var.g1(view4);
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
        org.telegram.ui.Cells.n4 n4Var;
        View view;
        int intValue;
        int i16;
        ls0 ls0Var;
        int i17 = this.f8797c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((c6) obj).getContext());
                view2.f33232a = 0;
                return new v4.e1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f40069o2);
                ?? e1Var = new v4.e1(n0Var);
                e1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(30.0f)));
                return e1Var;
            case 2:
                return new v4.e1(((org.telegram.ui.Components.ca) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(2, context, null);
                    frameLayout2.f34623a = g7Var;
                    g7Var.f30329r.setVisibility(8);
                    frameLayout2.addView(g7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.f7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(frameLayout);
            case 4:
                ul0 ul0Var = (ul0) obj;
                return new v4.e1(new tl0(ul0Var, ul0Var.getContext()));
            case 5:
                t01 t01Var = new t01((v01) obj, viewGroup.getContext());
                t01Var.setLayoutParams(new v4.p0(-2, -1));
                return new v4.e1(t01Var);
            case 6:
                yt ytVar = (yt) obj;
                if (i7 == 0) {
                    linearLayout = ytVar.Z1;
                } else if (i7 == 2) {
                    View view3 = ytVar.f53624a2;
                    v4.p0 p0Var = new v4.p0(-1, -2);
                    int i19 = ytVar.f29717u0;
                    ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i19;
                    view3.setLayoutParams(p0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                    y8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.j6.f28792a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.q6.x(y8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    fq fqVar = new fq(colorDrawable, org.telegram.ui.ActionBar.j6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.j6.f28813b7));
                    fqVar.f34678x = true;
                    y8Var.setBackgroundDrawable(fqVar);
                    linearLayout = y8Var;
                }
                return new v4.e1(linearLayout);
            case 7:
                if0 if0Var = new if0(viewGroup.getContext());
                if0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.e1(if0Var);
            case 8:
                org.telegram.ui.ActionBar.e6 e6Var = ((uh0) obj).f51951f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, e6Var);
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var2, e6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.y0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, e6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, i2Var, e6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f51588b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.h7, e6Var);
                    boolean z10 = hd.f24101a0;
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
                    frameLayout3.addView(radioButton, c8.ja.d(22, 22.0f, i22, f10, 0.0f, i23, 0.0f));
                    fp fpVar = new fp(24, context2, e6Var);
                    frameLayout3.f51589c = fpVar;
                    int i24 = org.telegram.ui.ActionBar.j6.f28849d6;
                    fpVar.b(-1, i24, org.telegram.ui.ActionBar.j6.f28979k7);
                    fpVar.setDrawUnchecked(false);
                    fpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = hd.f24101a0;
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
                    frameLayout3.addView(fpVar, c8.ja.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    fpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f51587a = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
                    i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (hd.f24101a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z12 = hd.f24101a0;
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
                    frameLayout3.addView(textView, c8.ja.d(-2, -2.0f, i27, f12, 0.0f, i21, 0.0f));
                    org.telegram.ui.ActionBar.q6.h(i24, frameLayout3, e6Var);
                    n4Var = frameLayout3;
                }
                return i5.c.q(n4Var, n4Var, -1, -2);
            case 9:
                rc1 rc1Var = (rc1) obj;
                return new v4.e1(new nc1(rc1Var.F, rc1Var.f50919c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = iVar.f58029a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f58114c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.ja.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f58112a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, e6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.ja.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f58113b = textView3;
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29241y6, e6Var2);
                    textView3.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView3, c8.ja.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout4;
                }
                return i5.c.q(view, view, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.g1 g1Var = (ug.g1) obj;
                View h12 = g1Var.h1(context4, i7);
                if (h12 != null) {
                    return i5.c.q(h12, h12, -1, -2);
                }
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    ls0Var = new ls0(this, context4, g1Var.J0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, g1Var.J0);
                                    d0Var.setBackground(true);
                                    String M0 = hd.M0(2131749662, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.j6.Xc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i28, 0, new Runnable(this) {
                                        public final i4 f58080b;

                                        {
                                            this.f58080b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            i4 i4Var = this.f58080b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((g1) i4Var.d).f58101p2.getParentActivity(), hd.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((g1) i4Var.d).f58101p2.getParentActivity(), hd.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.S2(hd.M0(2131749663, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final i4 f58080b;

                                        {
                                            this.f58080b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            i4 i4Var = this.f58080b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((g1) i4Var.d).f58101p2.getParentActivity(), hd.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((g1) i4Var.d).f58101p2.getParentActivity(), hd.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    ls0Var = d0Var;
                                }
                            } else {
                                ls0Var = new ai.q2(context4);
                            }
                        } else {
                            ls0Var = new zh.f(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.j6.f28792a7;
                        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context4, org.telegram.ui.ActionBar.j6.w0(i29, g1Var.J0), 0);
                        org.telegram.ui.ActionBar.q6.h(i29, x6Var, g1Var.J0);
                        ls0Var = x6Var;
                    }
                } else {
                    z51 z51Var = new z51(26, context4, this);
                    g1Var.f58100o2 = z51Var;
                    z51Var.setOrientation(1);
                    View view4 = g1Var.f58109x2;
                    if (view4 == null) {
                        g1Var.f58099n2 = new yb(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.j6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.w0(i30, g1Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, g1Var.J0)));
                        g1Var.f58099n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = g1Var.f58099n2.f58893b;
                        fVar.f58877z = i30;
                        fVar.A = org.telegram.ui.ActionBar.j6.Ck;
                        fVar.b();
                        z51Var.addView(g1Var.f58099n2, c8.ja.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) g1Var.f58109x2.getParent()).removeView(g1Var.f58109x2);
                        }
                        g1Var.e1(z51Var);
                    }
                    if (g1Var.J2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        g1Var.J2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = g1Var.f58102q2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, g1Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        g1Var.K2 = new z70[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            g1Var.K2[i31] = new bi.w1(7, context4, g1Var.J0);
                            z70 z70Var = g1Var.K2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            z70Var.setVisibility(i16);
                            g1Var.K2[i31].setTextSize(1, 16.0f);
                            g1Var.K2[i31].setTypeface(org.telegram.messenger.g0.o());
                            g1Var.K2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.q6.U(g1Var.K2[i31], org.telegram.ui.ActionBar.j6.G6, g1Var.J0);
                            org.telegram.ui.ActionBar.q6.G(g1Var.K2[i31], org.telegram.ui.ActionBar.j6.J6, g1Var.J0);
                            g1Var.J2.addView(g1Var.K2[i31], c8.ja.c(-2.0f, -1));
                        }
                    }
                    if (g1Var.J2.getParent() != null) {
                        ((ViewGroup) g1Var.J2.getParent()).removeView(g1Var.J2);
                    }
                    z51Var.addView(g1Var.J2, c8.ja.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (g1Var.L2 == null) {
                        z70 z70Var2 = new z70(g1Var.getContext(), g1Var.J0);
                        g1Var.L2 = z70Var2;
                        z70Var2.setTextSize(1, 14.0f);
                        g1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.q6.U(g1Var.L2, org.telegram.ui.ActionBar.j6.G6, g1Var.J0);
                        org.telegram.ui.ActionBar.q6.G(g1Var.L2, org.telegram.ui.ActionBar.j6.J6, g1Var.J0);
                    }
                    if (g1Var.L2.getParent() != null) {
                        ((ViewGroup) g1Var.L2.getParent()).removeView(g1Var.L2);
                    }
                    z51Var.addView(g1Var.L2, c8.ja.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    g1Var.j1(false);
                    g1Var.f58098m2 = new ki.f(context4, 5);
                    m01 m01Var = new m01(13, context4, this);
                    m01Var.setClipChildren(false);
                    m01Var.addView(g1Var.f58098m2);
                    m01Var.addView(z51Var);
                    yb ybVar = g1Var.f58099n2;
                    ls0Var = m01Var;
                    if (ybVar != null) {
                        ybVar.setStarParticlesView(g1Var.f58098m2);
                        ls0Var = m01Var;
                    }
                }
                ls0Var.setLayoutParams(new v4.p0(-1, -2));
                g1Var.d1(i7, ls0Var);
                return new v4.e1(ls0Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        boolean z10;
        switch (this.f8797c) {
            case 4:
                ul0 ul0Var = (ul0) this.d;
                ArrayList arrayList = ul0Var.f40102r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    tl0 tl0Var = (tl0) e1Var.f58535a;
                    if (((rl0) arrayList.get(b10)).f38998a.h == ul0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tl0Var.a(z10, false);
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
