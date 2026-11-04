package ci;

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
import b8.mf;
import ci.r4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cf0;
import org.telegram.ui.df0;
import org.telegram.ui.es0;
import org.telegram.ui.jc1;
import org.telegram.ui.ls0;
import org.telegram.ui.nc1;
import org.telegram.ui.nh0;
import org.telegram.ui.oh0;
import org.telegram.ui.ph0;
import org.telegram.ui.pz;
import org.telegram.ui.s51;
import org.telegram.ui.ut;
import org.telegram.ui.yr0;
public final class r4 extends sj0 {
    public final int f5891c;
    public final Object d;

    public r4(Object obj, int i3) {
        this.f5891c = i3;
        this.d = obj;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.f5891c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i3 = d1Var.f55544f;
                if (i3 == 1 || i3 == 2) {
                    return true;
                }
                return false;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                return true;
            case 7:
                int i10 = d1Var.f55544f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 8:
                return true;
            case 9:
                return false;
            default:
                if (d1Var.f55544f == 1) {
                    return true;
                }
                return false;
        }
    }

    public zi E(int i3) {
        hl0 hl0Var = (hl0) this.d;
        int i10 = hl0Var.f34450w;
        if (i3 >= i10 && i3 < hl0Var.f34451x) {
            return (zi) hl0Var.f34445e.get(i3 - i10);
        }
        int i11 = hl0Var.E;
        if (i3 >= i11 && i3 < hl0Var.F) {
            return (zi) hl0Var.f34446f.get(i3 - i11);
        }
        return null;
    }

    public void H(int i3, int i10) {
        int[] iArr = ((l6) this.d).L2;
        if (iArr[0] == i3 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i3;
        iArr[1] = i10;
        f();
    }

    @Override
    public final int b() {
        switch (this.f5891c) {
            case 0:
                return ((l6) this.d).L2.length;
            case 1:
                return ((kg.n0) this.d).f17112f3.size();
            case 2:
                return 1;
            case 3:
                return ((hl0) this.d).f34448r;
            case 4:
                return ((tl0) this.d).f38491r.size();
            case 5:
                if (((ut) this.d).Z1.h()) {
                    return 1;
                }
                return 3;
            case 6:
                return ((df0) this.d).f44677c.size();
            case 7:
                return ((ph0) this.d).h;
            case 8:
                return 12;
            case 9:
                return ((vg.i) this.d).d.size();
            default:
                return ((vg.h1) this.d).Y1;
        }
    }

    @Override
    public long c(int i3) {
        nh0 nh0Var;
        switch (this.f5891c) {
            case 7:
                ph0 ph0Var = (ph0) this.d;
                int i10 = ph0Var.E;
                if (i3 >= i10 && i3 < ph0Var.F) {
                    nh0Var = (nh0) ph0Var.f48579b.get(i3 - i10);
                } else {
                    int i11 = ph0Var.f48583n;
                    if (i3 >= i11 && i3 < ph0Var.f48584r) {
                        nh0Var = (nh0) ph0Var.f48578a.get(i3 - i11);
                    } else {
                        nh0Var = null;
                    }
                }
                if (nh0Var != null) {
                    return nh0Var.f48005c;
                }
                ph0Var.getClass();
                if (i3 == 0) {
                    return 1L;
                }
                if (i3 == ph0Var.f48588y) {
                    return 2L;
                }
                if (i3 == ph0Var.f48585s) {
                    return 3L;
                }
                if (i3 == ph0Var.f48586w) {
                    return 4L;
                }
                if (i3 == ph0Var.f48587x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i3);
        }
    }

    @Override
    public int d(int i3) {
        switch (this.f5891c) {
            case 2:
                return i3;
            case 3:
                hl0 hl0Var = (hl0) this.d;
                if (i3 != hl0Var.f34449s && i3 != hl0Var.f34452y) {
                    zi E = E(i3);
                    if (E == null || !E.J3()) {
                        return 1;
                    }
                    return 2;
                }
                return 0;
            case 4:
            case 6:
            case 8:
            default:
                return super.d(i3);
            case 5:
                return i3;
            case 7:
                ph0 ph0Var = (ph0) this.d;
                if (i3 >= ph0Var.E && i3 < ph0Var.F) {
                    return 0;
                }
                ph0Var.getClass();
                if (i3 != 0 && i3 != ph0Var.f48588y) {
                    if (i3 == ph0Var.f48585s) {
                        return 2;
                    }
                    if (i3 != ph0Var.f48586w && i3 != ph0Var.f48587x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 9:
                return ((vg.g) ((vg.i) this.d).d.get(i3)).f56611a;
            case 10:
                vg.h1 h1Var = (vg.h1) this.d;
                if (i3 != h1Var.Z1) {
                    if (i3 >= h1Var.f56624a2 && i3 < h1Var.f56625b2) {
                        return h1Var.f1();
                    }
                    if (i3 >= h1Var.c2 && i3 < h1Var.f56626d2) {
                        return 1;
                    }
                    if (i3 == h1Var.f56627e2) {
                        return 2;
                    }
                    if (i3 == h1Var.f56628f2) {
                        return 3;
                    }
                    if (i3 == 0) {
                        return 4;
                    }
                    if (i3 == h1Var.f56629g2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int f12;
        boolean z11;
        int f13;
        boolean z12;
        String M0;
        String M02;
        boolean z13;
        cq cqVar;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = this.f5891c;
        float f10 = 0.0f;
        nh0 nh0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((l6) obj).L2;
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) d1Var.f55540a;
                int i11 = iArr[(iArr.length - 1) - i3];
                if (eaVar.f33328a != i11) {
                    eaVar.f33328a = i11;
                    eaVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((kg.m0) d1Var).v.setData((kg.l0) ((kg.n0) obj).f17112f3.get(i3));
                return;
            case 2:
                return;
            case 3:
                hl0 hl0Var = (hl0) obj;
                pz pzVar = hl0Var.K;
                int i12 = d1Var.f55544f;
                View view = d1Var.f55540a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i3 == hl0Var.f34449s) {
                        String M03 = bd.M0(2131751345, null);
                        if (x3Var.getText().equals(M03)) {
                            if (hl0Var.I) {
                                M02 = bd.M0(2131747441, null);
                            } else {
                                M02 = bd.M0(2131746063, null);
                            }
                            boolean z19 = hl0Var.I;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f30950b;
                            w3Var.c(M02, true, z19);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (hl0Var.I) {
                            M0 = bd.M0(2131747441, null);
                        } else {
                            M0 = bd.M0(2131746063, null);
                        }
                        x3Var.b(M03, M0, new gl0(this));
                        return;
                    } else if (i3 == hl0Var.f34452y) {
                        x3Var.b(bd.M0(2131746370, null), bd.M0(2131745505, null), new ga0(this, 8));
                        return;
                    } else {
                        return;
                    }
                }
                zi E = E(i3);
                if (E != null) {
                    if (hl0Var.J.I() && i3 >= hl0Var.f34450w && i3 < hl0Var.f34451x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i12 == 1) {
                        el0 el0Var = (el0) view;
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, el0Var, null);
                        org.telegram.ui.Cells.g7 g7Var = el0Var.f33416a;
                        if (g7Var.getMessage() == null) {
                            f13 = 0;
                        } else {
                            f13 = g7Var.getMessage().f1();
                        }
                        g7Var.c(E, true);
                        int f14 = g7Var.getMessage().f1();
                        pzVar.f48707a = zi.B0(g7Var.getMessage().f26868k);
                        pzVar.f48708b = f14;
                        boolean n4 = hl0Var.J.n(pzVar);
                        if (f13 == E.f1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g7Var.b(n4, z12);
                        if (f13 == E.f1()) {
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
                            f12 = 0;
                        } else {
                            f12 = f7Var.getMessage().f1();
                        }
                        f7Var.f(E, true);
                        int f15 = f7Var.getMessage().f1();
                        pzVar.f48707a = zi.B0(f7Var.getMessage().f26868k);
                        pzVar.f48708b = f15;
                        boolean n10 = hl0Var.J.n(pzVar);
                        if (f12 == E.f1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f7Var.e(n10, z11);
                        if (f12 == E.f1()) {
                            z17 = true;
                        }
                        if (f7Var.f29220e0 != z10) {
                            f7Var.f29220e0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                f7Var.f29222f0 = f10;
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
                View view2 = d1Var.f55540a;
                tl0 tl0Var = (tl0) obj;
                ArrayList arrayList = tl0Var.f38491r;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ql0 ql0Var = (ql0) arrayList.get(i3);
                    sl0 sl0Var = (sl0) view2;
                    dh.n0 n0Var = sl0Var.d;
                    if (n0Var != null && n0Var.equals(ql0Var.f37490a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ql0Var.f37490a.g();
                        tL_reactionCount.count = ql0Var.f37491b;
                        tl0 tl0Var2 = sl0Var.f38063s;
                        rl0 rl0Var = new rl0(sl0Var, tl0Var2.f38485a, sl0Var, tL_reactionCount, tl0Var2.f38487c);
                        sl0Var.f38056a = rl0Var;
                        rl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        rl0 rl0Var2 = sl0Var.f38056a;
                        rl0Var2.f9079p = true;
                        rl0Var2.R = true;
                    } else {
                        sl0Var.f38056a.v = ql0Var.f37491b;
                    }
                    sl0Var.d = ql0Var.f37490a;
                    if (!z13) {
                        rl0 rl0Var3 = sl0Var.f38056a;
                        rl0Var3.f9067e = rl0Var3.f9088z;
                    }
                    sl0Var.f38056a.f9088z = org.telegram.messenger.g0.L(44.33f);
                    sl0Var.f38056a.f9083t = !TextUtils.isEmpty(ql0Var.f37492c);
                    rl0 rl0Var4 = sl0Var.f38056a;
                    boolean z20 = rl0Var4.f9083t;
                    org.telegram.ui.Components.g6 g6Var = rl0Var4.F;
                    if (z20) {
                        g6Var.t(org.telegram.messenger.i6.m(ql0Var.f37492c, g6Var.f33981a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (g6Var != null) {
                        g6Var.t("", !z13, true);
                    }
                    rl0 rl0Var5 = sl0Var.f38056a;
                    Integer.toString(ql0Var.f37491b);
                    rl0Var5.getClass();
                    sl0Var.f38056a.E.c(ql0Var.f37491b, !z13);
                    rl0 rl0Var6 = sl0Var.f38056a;
                    if (rl0Var6.E != null && (rl0Var6.v > 0 || rl0Var6.f9083t)) {
                        float f11 = rl0Var6.f9088z;
                        int ceil = (int) Math.ceil(cqVar.f32806m);
                        if (sl0Var.f38056a.f9083t) {
                            f10 = 4.0f;
                        }
                        rl0Var6.f9088z = (int) (org.telegram.messenger.g0.L(f10) + ceil + sl0Var.f38056a.F.d + f11);
                    }
                    if (z13) {
                        rl0 rl0Var7 = sl0Var.f38056a;
                        rl0Var7.f9067e = rl0Var7.f9088z;
                    }
                    sl0Var.f38056a.A = org.telegram.messenger.g0.L(28.0f);
                    rl0 rl0Var8 = sl0Var.f38056a;
                    rl0Var8.f9078o = sl0Var.f38059e;
                    if (sl0Var.f38062r) {
                        rl0Var8.a();
                    }
                    if (!z13) {
                        sl0Var.requestLayout();
                    }
                    sl0 sl0Var2 = (sl0) view2;
                    if (ql0Var.f37490a.h != tl0Var.h) {
                        z18 = false;
                    }
                    sl0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                df0 df0Var = (df0) obj;
                ((cf0) d1Var.f55540a).a((TLObject) df0Var.f44677c.get(i3), ((Integer) df0Var.f44676b.get(i3)).intValue(), false);
                return;
            case 7:
                ph0 ph0Var = (ph0) obj;
                org.telegram.ui.ActionBar.e6 e6Var = ph0Var.f48582f;
                int i13 = d1Var.f55544f;
                View view3 = d1Var.f55540a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232557);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232558);
                            int i14 = org.telegram.ui.ActionBar.k6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.r6.y(i2Var, drawable, i14, e6Var, mode);
                            org.telegram.ui.ActionBar.r6.y(i2Var, drawable2, org.telegram.ui.ActionBar.k6.f28008k7, e6Var, mode);
                            xp xpVar = new xp(drawable, drawable2);
                            i2Var.f29369a.l(bd.M0(2131743813, null), false);
                            i2Var.f29370b.setImageDrawable(xpVar);
                            i2Var.f29371c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i3 == 0) {
                        n4Var.setText(bd.M0(2131744221, null));
                        return;
                    } else if (i3 == ph0Var.f48588y) {
                        n4Var.setText(bd.M0(2131744299, null));
                        return;
                    } else {
                        return;
                    }
                }
                oh0 oh0Var = (oh0) view3;
                int i15 = ph0Var.E;
                if (i3 >= i15 && i3 < ph0Var.F) {
                    nh0Var = (nh0) ph0Var.f48579b.get(i3 - i15);
                }
                int i16 = ph0Var.f48583n;
                if (i3 >= i16 && i3 < ph0Var.f48584r) {
                    nh0Var = (nh0) ph0Var.f48578a.get(i3 - i16);
                }
                if (nh0Var != null) {
                    if (oh0Var.f48296e == nh0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (nh0Var == ph0Var.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (ph0Var.J.get(nh0Var.f48005c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    oh0Var.f48296e = nh0Var;
                    oh0Var.f48293a.setText(nh0Var.f48007f);
                    if (i3 != ph0Var.F - 1) {
                        z17 = true;
                    }
                    oh0Var.d = z17;
                    oh0Var.f48294b.a(z15, z14);
                    oh0Var.f48295c.a(z16, z14);
                    return;
                }
                return;
            case 8:
                ((jc1) d1Var.f55540a).f46599a = WallpapersListActivity.f43521j0[i3];
                return;
            case 9:
                vg.i iVar = (vg.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((vg.g) arrayList2.get(i3)).f56611a == 1) {
                    vg.h hVar = (vg.h) d1Var.f55540a;
                    hVar.f56619c.setColorFilter(new PorterDuffColorFilter(iVar.f56649e.getPixel(i3, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f56619c.setImageDrawable(iVar.getContext().getDrawable(((vg.g) arrayList2.get(i3)).f56612b));
                    hVar.f56617a.setText(((vg.g) arrayList2.get(i3)).f56613c);
                    hVar.f56618b.setText(((vg.g) arrayList2.get(i3)).d);
                    return;
                }
                return;
            default:
                View view4 = d1Var.f55540a;
                vg.h1 h1Var = (vg.h1) obj;
                int i17 = h1Var.c2;
                if (i3 >= i17 && i3 < h1Var.f56626d2) {
                    yr0 yr0Var = (yr0) view4;
                    ls0 ls0Var = (ls0) h1Var.Q1.get(i3 - i17);
                    if (i3 != h1Var.f56626d2 - 1) {
                        z17 = true;
                    }
                    yr0Var.a(ls0Var, z17);
                    return;
                } else if (i3 >= h1Var.f56624a2 && i3 < h1Var.f56625b2) {
                    h1Var.g1(view4);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
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
        es0 es0Var;
        int i17 = this.f5891c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((l6) obj).getContext());
                view2.f33328a = 0;
                return new u4.d1(view2);
            case 1:
                kg.k0 k0Var = new kg.k0(viewGroup.getContext(), ((kg.n0) obj).f38460o2);
                ?? d1Var = new u4.d1(k0Var);
                d1Var.v = k0Var;
                k0Var.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(30.0f)));
                return d1Var;
            case 2:
                return new u4.d1(((org.telegram.ui.Components.fa) obj).Q1);
            case 3:
                if (i3 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i3 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(2, context, null);
                    frameLayout2.f33416a = g7Var;
                    g7Var.f29270r.setVisibility(8);
                    frameLayout2.addView(g7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.f7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(frameLayout);
            case 4:
                tl0 tl0Var = (tl0) obj;
                return new u4.d1(new sl0(tl0Var, tl0Var.getContext()));
            case 5:
                ut utVar = (ut) obj;
                if (i3 == 0) {
                    linearLayout = utVar.W1;
                } else if (i3 == 2) {
                    View view3 = utVar.X1;
                    u4.p0 p0Var = new u4.p0(-1, -2);
                    int i19 = utVar.f28618u0;
                    ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i19;
                    view3.setLayoutParams(p0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                    y8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.k6.f27824a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.r6.y(y8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7));
                    xpVar.f40447x = true;
                    y8Var.setBackgroundDrawable(xpVar);
                    linearLayout = y8Var;
                }
                return new u4.d1(linearLayout);
            case 6:
                cf0 cf0Var = new cf0(viewGroup.getContext());
                cf0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new u4.d1(cf0Var);
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = ((ph0) obj).f48582f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i3 != 0) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, e6Var);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var2, e6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, e6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, i2Var, e6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f48294b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, e6Var);
                    boolean z10 = bd.f21784a0;
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
                    frameLayout3.addView(radioButton, mf.d(22, 22.0f, i22, f10, 0.0f, i23, 0.0f));
                    wo woVar = new wo(24, context2, e6Var);
                    frameLayout3.f48295c = woVar;
                    int i24 = org.telegram.ui.ActionBar.k6.f27878d6;
                    woVar.b(-1, i24, org.telegram.ui.ActionBar.k6.f28008k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z11 = bd.f21784a0;
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
                    frameLayout3.addView(woVar, mf.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    woVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f48293a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (bd.f21784a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z12 = bd.f21784a0;
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
                    frameLayout3.addView(textView, mf.d(-2, -2.0f, i27, f12, 0.0f, i21, 0.0f));
                    org.telegram.ui.ActionBar.r6.i(i24, frameLayout3, e6Var);
                    n4Var = frameLayout3;
                }
                return k2.p1.p(n4Var, n4Var, -1, -2);
            case 8:
                nc1 nc1Var = (nc1) obj;
                return new u4.d1(new jc1(nc1Var.F, nc1Var.f47967c));
            case 9:
                vg.i iVar = (vg.i) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = iVar.f56567a;
                if (i3 == 0) {
                    view = new vg.f(iVar, iVar.getContext());
                } else if (i3 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f56619c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, mf.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f56617a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, e6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, mf.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f56618b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28273y6, e6Var2);
                    textView3.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView3, mf.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout4;
                }
                return k2.p1.p(view, view, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                vg.h1 h1Var = (vg.h1) obj;
                View h12 = h1Var.h1(context4, i3);
                if (h12 != null) {
                    return k2.p1.p(h12, h12, -1, -2);
                }
                if (i3 != 0) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    es0Var = new es0(this, context4, h1Var.J0);
                                } else {
                                    zg.d0 d0Var = new zg.d0(context4, h1Var.J0);
                                    d0Var.setBackground(true);
                                    String M0 = bd.M0(2131749670, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.k6.Uc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i28, 0, new Runnable(this) {
                                        public final r4 f56610b;

                                        {
                                            this.f56610b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            r4 r4Var = this.f56610b;
                                            switch (i29) {
                                                case 0:
                                                    sf.c.t(((h1) r4Var.d).f56635m2.getParentActivity(), bd.M0(2131744206, null));
                                                    return;
                                                default:
                                                    sf.c.t(((h1) r4Var.d).f56635m2.getParentActivity(), bd.M0(2131746789, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.S2(bd.M0(2131749671, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final r4 f56610b;

                                        {
                                            this.f56610b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            r4 r4Var = this.f56610b;
                                            switch (i29) {
                                                case 0:
                                                    sf.c.t(((h1) r4Var.d).f56635m2.getParentActivity(), bd.M0(2131744206, null));
                                                    return;
                                                default:
                                                    sf.c.t(((h1) r4Var.d).f56635m2.getParentActivity(), bd.M0(2131746789, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    es0Var = d0Var;
                                }
                            } else {
                                es0Var = new q(context4);
                            }
                        } else {
                            es0Var = new vg.g1(context4, 0);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.k6.f27824a7;
                        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context4, org.telegram.ui.ActionBar.k6.w0(i29, h1Var.J0), 0);
                        org.telegram.ui.ActionBar.r6.i(i29, x6Var, h1Var.J0);
                        es0Var = x6Var;
                    }
                } else {
                    s51 s51Var = new s51(25, context4, this);
                    h1Var.f56634l2 = s51Var;
                    s51Var.setOrientation(1);
                    View view4 = h1Var.f56643u2;
                    if (view4 == null) {
                        h1Var.f56633k2 = new ic(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.k6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.w0(i30, h1Var.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, h1Var.J0)));
                        h1Var.f56633k2.setBackgroundBitmap(createBitmap);
                        wg.f fVar = h1Var.f56633k2.f57666b;
                        fVar.f57650z = i30;
                        fVar.A = org.telegram.ui.ActionBar.k6.zk;
                        fVar.b();
                        s51Var.addView(h1Var.f56633k2, mf.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) h1Var.f56643u2.getParent()).removeView(h1Var.f56643u2);
                        }
                        h1Var.e1(s51Var);
                    }
                    if (h1Var.G2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        h1Var.G2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = h1Var.f56636n2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, h1Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        h1Var.H2 = new s70[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            h1Var.H2[i31] = new ai.e2(7, context4, h1Var.J0);
                            s70 s70Var = h1Var.H2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            s70Var.setVisibility(i16);
                            h1Var.H2[i31].setTextSize(1, 16.0f);
                            h1Var.H2[i31].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.H2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.r6.V(h1Var.H2[i31], org.telegram.ui.ActionBar.k6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.r6.H(h1Var.H2[i31], org.telegram.ui.ActionBar.k6.J6, h1Var.J0);
                            h1Var.G2.addView(h1Var.H2[i31], mf.c(-2.0f, -1));
                        }
                    }
                    if (h1Var.G2.getParent() != null) {
                        ((ViewGroup) h1Var.G2.getParent()).removeView(h1Var.G2);
                    }
                    s51Var.addView(h1Var.G2, mf.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.I2 == null) {
                        s70 s70Var2 = new s70(h1Var.getContext(), h1Var.J0);
                        h1Var.I2 = s70Var2;
                        s70Var2.setTextSize(1, 14.0f);
                        h1Var.I2.setGravity(1);
                        org.telegram.ui.ActionBar.r6.V(h1Var.I2, org.telegram.ui.ActionBar.k6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.r6.H(h1Var.I2, org.telegram.ui.ActionBar.k6.J6, h1Var.J0);
                    }
                    if (h1Var.I2.getParent() != null) {
                        ((ViewGroup) h1Var.I2.getParent()).removeView(h1Var.I2);
                    }
                    s51Var.addView(h1Var.I2, mf.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.j1(false);
                    h1Var.f56632j2 = new ii.f(context4, 5);
                    kw0 kw0Var = new kw0(13, context4, this);
                    kw0Var.setClipChildren(false);
                    kw0Var.addView(h1Var.f56632j2);
                    kw0Var.addView(s51Var);
                    ic icVar = h1Var.f56633k2;
                    es0Var = kw0Var;
                    if (icVar != null) {
                        icVar.setStarParticlesView(h1Var.f56632j2);
                        es0Var = kw0Var;
                    }
                }
                es0Var.setLayoutParams(new u4.p0(-1, -2));
                h1Var.d1(i3, es0Var);
                return new u4.d1(es0Var);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        boolean z10;
        switch (this.f5891c) {
            case 4:
                tl0 tl0Var = (tl0) this.d;
                ArrayList arrayList = tl0Var.f38491r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    sl0 sl0Var = (sl0) d1Var.f55540a;
                    if (((ql0) arrayList.get(b10)).f37490a.h == tl0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sl0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void F(u4.d1 d1Var, int i3) {
    }

    private final void G(u4.d1 d1Var, int i3) {
    }
}
