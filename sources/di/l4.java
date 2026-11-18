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
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.au;
import org.telegram.ui.d61;
import org.telegram.ui.js0;
import org.telegram.ui.lf0;
import org.telegram.ui.mf0;
import org.telegram.ui.ps0;
import org.telegram.ui.qc1;
import org.telegram.ui.uc1;
import org.telegram.ui.vh0;
import org.telegram.ui.vz;
import org.telegram.ui.wh0;
import org.telegram.ui.ws0;
import org.telegram.ui.xh0;
public final class l4 extends bk0 {
    public final int f9253c;
    public final Object d;

    public l4(Object obj, int i7) {
        this.f9253c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f9253c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = f1Var.f59126f;
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
                int i10 = f1Var.f59126f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (f1Var.f59126f == 1) {
                    return true;
                }
                return false;
        }
    }

    public fj E(int i7) {
        ql0 ql0Var = (ql0) this.d;
        int i10 = ql0Var.f38835w;
        if (i7 >= i10 && i7 < ql0Var.f38836x) {
            return (fj) ql0Var.f38830e.get(i7 - i10);
        }
        int i11 = ql0Var.E;
        if (i7 >= i11 && i7 < ql0Var.F) {
            return (fj) ql0Var.f38831f.get(i7 - i11);
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
        switch (this.f9253c) {
            case 0:
                return ((f6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f17630f3.size();
            case 2:
                return 1;
            case 3:
                return ((ql0) this.d).f38833r;
            case 4:
                return ((cm0) this.d).f34109r.size();
            case 5:
                return ((f11) this.d).U.size();
            case 6:
                if (((au) this.d).f45675c2.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((mf0) this.d).f49850c.size();
            case 8:
                return ((xh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.i1) this.d).f58678b2;
        }
    }

    @Override
    public long c(int i7) {
        vh0 vh0Var;
        switch (this.f9253c) {
            case 8:
                xh0 xh0Var = (xh0) this.d;
                int i10 = xh0Var.E;
                if (i7 >= i10 && i7 < xh0Var.F) {
                    vh0Var = (vh0) xh0Var.f53858b.get(i7 - i10);
                } else {
                    int i11 = xh0Var.f53862n;
                    if (i7 >= i11 && i7 < xh0Var.f53863r) {
                        vh0Var = (vh0) xh0Var.f53857a.get(i7 - i11);
                    } else {
                        vh0Var = null;
                    }
                }
                if (vh0Var != null) {
                    return vh0Var.f52796c;
                }
                xh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == xh0Var.f53867y) {
                    return 2L;
                }
                if (i7 == xh0Var.f53864s) {
                    return 3L;
                }
                if (i7 == xh0Var.f53865w) {
                    return 4L;
                }
                if (i7 == xh0Var.f53866x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f9253c) {
            case 2:
                return i7;
            case 3:
                ql0 ql0Var = (ql0) this.d;
                if (i7 != ql0Var.f38834s && i7 != ql0Var.f38837y) {
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
                xh0 xh0Var = (xh0) this.d;
                if (i7 >= xh0Var.E && i7 < xh0Var.F) {
                    return 0;
                }
                xh0Var.getClass();
                if (i7 != 0 && i7 != xh0Var.f53867y) {
                    if (i7 == xh0Var.f53864s) {
                        return 2;
                    }
                    if (i7 != xh0Var.f53865w && i7 != xh0Var.f53866x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f58654a;
            case 11:
                ug.i1 i1Var = (ug.i1) this.d;
                if (i7 != i1Var.f58679c2) {
                    if (i7 >= i1Var.d2 && i7 < i1Var.f58680e2) {
                        return i1Var.g1();
                    }
                    if (i7 >= i1Var.f58681f2 && i7 < i1Var.f58682g2) {
                        return 1;
                    }
                    if (i7 == i1Var.f58683h2) {
                        return 2;
                    }
                    if (i7 == i1Var.f58684i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == i1Var.f58685j2) {
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
        String M0;
        String M02;
        boolean z13;
        qq qqVar;
        int i10;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f9253c;
        float f10 = 0.0f;
        vh0 vh0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i11) {
            case 0:
                int[] iArr = ((f6) obj).O2;
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f1Var.f59122a;
                int i12 = iArr[(iArr.length - 1) - i7];
                if (jaVar.f36392a != i12) {
                    jaVar.f36392a = i12;
                    jaVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) f1Var).v.setData((jg.o0) ((jg.q0) obj).f17630f3.get(i7));
                return;
            case 2:
                return;
            case 3:
                ql0 ql0Var = (ql0) obj;
                vz vzVar = ql0Var.K;
                int i13 = f1Var.f59126f;
                View view = f1Var.f59122a;
                if (i13 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == ql0Var.f38834s) {
                        String M03 = gd.M0(2131751333, null);
                        if (x3Var.getText().equals(M03)) {
                            if (ql0Var.I) {
                                M02 = gd.M0(2131747240, null);
                            } else {
                                M02 = gd.M0(2131745858, null);
                            }
                            boolean z19 = ql0Var.I;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f32409b;
                            w3Var.c(M02, true, z19);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (ql0Var.I) {
                            M0 = gd.M0(2131747240, null);
                        } else {
                            M0 = gd.M0(2131745858, null);
                        }
                        x3Var.b(M03, M0, new pl0(this));
                        return;
                    } else if (i7 == ql0Var.f38837y) {
                        x3Var.b(gd.M0(2131746167, null), gd.M0(2131745300, null), new h70(this, 9));
                        return;
                    } else {
                        return;
                    }
                }
                fj E = E(i7);
                if (E != null) {
                    if (ql0Var.J.V1() && i7 >= ql0Var.f38835w && i7 < ql0Var.f38836x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i13 == 1) {
                        nl0 nl0Var = (nl0) view;
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, nl0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = nl0Var.f37805a;
                        if (h7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = h7Var.getMessage().e1();
                        }
                        h7Var.c(E, true);
                        int e14 = h7Var.getMessage().e1();
                        vzVar.f52886a = fj.B0(h7Var.getMessage().f23968k);
                        vzVar.f52887b = e14;
                        boolean r02 = ql0Var.J.r0(vzVar);
                        if (e13 == E.e1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h7Var.b(r02, z12);
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
                        vzVar.f52886a = fj.B0(g7Var.getMessage().f23968k);
                        vzVar.f52887b = e15;
                        boolean r03 = ql0Var.J.r0(vzVar);
                        if (e12 == E.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g7Var.e(r03, z11);
                        if (e12 == E.e1()) {
                            z17 = true;
                        }
                        if (g7Var.f30694e0 != z10) {
                            g7Var.f30694e0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f10 = 1.0f;
                                }
                                g7Var.f30696f0 = f10;
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
                View view2 = f1Var.f59122a;
                cm0 cm0Var = (cm0) obj;
                ArrayList arrayList = cm0Var.f34109r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    zl0 zl0Var = (zl0) arrayList.get(i7);
                    bm0 bm0Var = (bm0) view2;
                    ch.p0 p0Var = bm0Var.d;
                    if (p0Var != null && p0Var.equals(zl0Var.f42900a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = zl0Var.f42900a.g();
                        tL_reactionCount.count = zl0Var.f42901b;
                        cm0 cm0Var2 = bm0Var.f33723s;
                        am0 am0Var = new am0(bm0Var, cm0Var2.f34103a, bm0Var, tL_reactionCount, cm0Var2.f34105c);
                        bm0Var.f33716a = am0Var;
                        am0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        am0 am0Var2 = bm0Var.f33716a;
                        am0Var2.f5449p = true;
                        am0Var2.R = true;
                    } else {
                        bm0Var.f33716a.v = zl0Var.f42901b;
                    }
                    bm0Var.d = zl0Var.f42900a;
                    if (!z13) {
                        am0 am0Var3 = bm0Var.f33716a;
                        am0Var3.f5437e = am0Var3.f5458z;
                    }
                    bm0Var.f33716a.f5458z = org.telegram.messenger.g0.L(44.33f);
                    bm0Var.f33716a.f5453t = !TextUtils.isEmpty(zl0Var.f42902c);
                    am0 am0Var4 = bm0Var.f33716a;
                    boolean z20 = am0Var4.f5453t;
                    org.telegram.ui.Components.m6 m6Var = am0Var4.F;
                    if (z20) {
                        m6Var.t(org.telegram.messenger.j6.m(zl0Var.f42902c, m6Var.f37375a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (m6Var != null) {
                        m6Var.t("", !z13, true);
                    }
                    am0 am0Var5 = bm0Var.f33716a;
                    Integer.toString(zl0Var.f42901b);
                    am0Var5.getClass();
                    bm0Var.f33716a.E.c(zl0Var.f42901b, !z13);
                    am0 am0Var6 = bm0Var.f33716a;
                    if (am0Var6.E != null && (am0Var6.v > 0 || am0Var6.f5453t)) {
                        float f11 = am0Var6.f5458z;
                        int ceil = (int) Math.ceil(qqVar.f38873m);
                        if (bm0Var.f33716a.f5453t) {
                            f10 = 4.0f;
                        }
                        am0Var6.f5458z = (int) (org.telegram.messenger.g0.L(f10) + ceil + bm0Var.f33716a.F.d + f11);
                    }
                    if (z13) {
                        am0 am0Var7 = bm0Var.f33716a;
                        am0Var7.f5437e = am0Var7.f5458z;
                    }
                    bm0Var.f33716a.A = org.telegram.messenger.g0.L(28.0f);
                    am0 am0Var8 = bm0Var.f33716a;
                    am0Var8.f5448o = bm0Var.f33719e;
                    if (bm0Var.f33722r) {
                        am0Var8.a();
                    }
                    if (!z13) {
                        bm0Var.requestLayout();
                    }
                    bm0 bm0Var2 = (bm0) view2;
                    if (zl0Var.f42900a.h != cm0Var.h) {
                        z18 = false;
                    }
                    bm0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                d11 d11Var = (d11) f1Var.f59122a;
                c11 c11Var = (c11) ((f11) obj).U.get(i7);
                f11 f11Var = d11Var.f34246s;
                org.telegram.ui.Components.q9 q9Var = d11Var.f34239a;
                c11 c11Var2 = d11Var.f34242e;
                if (c11Var2 == null || c11Var2.f33850a != c11Var.f33850a || !Objects.equals(c11Var2.f33851b, c11Var.f33851b)) {
                    z18 = false;
                }
                if (f11Var.f34874a0 >= 1.0f && f11Var.f34888k0 == null) {
                    d11Var.setScaleX(1.0f);
                    d11Var.setScaleY(1.0f);
                    d11Var.setAlpha(1.0f);
                }
                d11Var.f34242e = c11Var;
                if (!z18) {
                    q9Var.setAnimatedEmojiDrawable(null);
                    d11Var.h = null;
                    d11Var.f34244n = 0;
                    if (c11Var.f33850a != 0) {
                        d11Var.f34243f = null;
                        q9Var.setVisibility(0);
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(3, f11Var.f34873a, c11Var.f33850a);
                        d11Var.h = o5Var;
                        q9Var.setAnimatedEmojiDrawable(o5Var);
                    } else {
                        if (c11Var.f33851b.booleanValue()) {
                            i10 = 2131743754;
                        } else {
                            i10 = 2131743753;
                        }
                        d11Var.f34243f = gd.M0(i10, null);
                        q9Var.setVisibility(8);
                    }
                    d11Var.setContentDescription(d11Var.f34243f);
                }
                d11Var.a(z18);
                d11Var.requestLayout();
                d11Var.invalidate();
                return;
            case 6:
                return;
            case 7:
                mf0 mf0Var = (mf0) obj;
                ((lf0) f1Var.f59122a).a((TLObject) mf0Var.f49850c.get(i7), ((Integer) mf0Var.f49849b.get(i7)).intValue(), false);
                return;
            case 8:
                xh0 xh0Var = (xh0) obj;
                org.telegram.ui.ActionBar.i6 i6Var = xh0Var.f53861f;
                int i14 = f1Var.f59126f;
                View view3 = f1Var.f59122a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232561);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232562);
                            int i15 = org.telegram.ui.ActionBar.n6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.u6.x(i2Var, drawable, i15, i6Var, mode);
                            org.telegram.ui.ActionBar.u6.x(i2Var, drawable2, org.telegram.ui.ActionBar.n6.f29526k7, i6Var, mode);
                            mq mqVar = new mq(drawable, drawable2);
                            i2Var.f30804a.l(gd.M0(2131743566, null), false);
                            i2Var.f30805b.setImageDrawable(mqVar);
                            i2Var.f30806c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(gd.M0(2131743976, null));
                        return;
                    } else if (i7 == xh0Var.f53867y) {
                        n4Var.setText(gd.M0(2131744054, null));
                        return;
                    } else {
                        return;
                    }
                }
                wh0 wh0Var = (wh0) view3;
                int i16 = xh0Var.E;
                if (i7 >= i16 && i7 < xh0Var.F) {
                    vh0Var = (vh0) xh0Var.f53858b.get(i7 - i16);
                }
                int i17 = xh0Var.f53862n;
                if (i7 >= i17 && i7 < xh0Var.f53863r) {
                    vh0Var = (vh0) xh0Var.f53857a.get(i7 - i17);
                }
                if (vh0Var != null) {
                    if (wh0Var.f53444e == vh0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (vh0Var == xh0Var.H) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (xh0Var.J.get(vh0Var.f52796c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    wh0Var.f53444e = vh0Var;
                    wh0Var.f53441a.setText(vh0Var.f52798f);
                    if (i7 != xh0Var.F - 1) {
                        z17 = true;
                    }
                    wh0Var.d = z17;
                    wh0Var.f53442b.a(z15, z14);
                    wh0Var.f53443c.a(z16, z14);
                    return;
                }
                return;
            case 9:
                ((qc1) f1Var.f59122a).f51239a = WallpapersListActivity.f45375j0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f58654a == 1) {
                    ug.h hVar = (ug.h) f1Var.f59122a;
                    hVar.f58665c.setColorFilter(new PorterDuffColorFilter(iVar.f58673e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f58665c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f58655b));
                    hVar.f58663a.setText(((ug.g) arrayList2.get(i7)).f58656c);
                    hVar.f58664b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = f1Var.f59122a;
                ug.i1 i1Var = (ug.i1) obj;
                int i18 = i1Var.f58681f2;
                if (i7 >= i18 && i7 < i1Var.f58682g2) {
                    js0 js0Var = (js0) view4;
                    ws0 ws0Var = (ws0) i1Var.T1.get(i7 - i18);
                    if (i7 != i1Var.f58682g2 - 1) {
                        z17 = true;
                    }
                    js0Var.a(ws0Var, z17);
                    return;
                } else if (i7 >= i1Var.d2 && i7 < i1Var.f58680e2) {
                    i1Var.h1(view4);
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
        org.telegram.ui.Cells.n4 n4Var;
        View view;
        int intValue;
        int i16;
        ps0 ps0Var;
        int i17 = this.f9253c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((f6) obj).getContext());
                view2.f36392a = 0;
                return new v4.f1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f34074o2);
                ?? f1Var = new v4.f1(n0Var);
                f1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(30.0f)));
                return f1Var;
            case 2:
                return new v4.f1(((org.telegram.ui.Components.ka) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    frameLayout2.f37805a = h7Var;
                    h7Var.f30783r.setVisibility(8);
                    frameLayout2.addView(h7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(frameLayout);
            case 4:
                cm0 cm0Var = (cm0) obj;
                return new v4.f1(new bm0(cm0Var, cm0Var.getContext()));
            case 5:
                d11 d11Var = new d11((f11) obj, viewGroup.getContext());
                d11Var.setLayoutParams(new v4.q0(-2, -1));
                return new v4.f1(d11Var);
            case 6:
                au auVar = (au) obj;
                if (i7 == 0) {
                    linearLayout = auVar.Z1;
                } else if (i7 == 2) {
                    View view3 = auVar.f45673a2;
                    v4.q0 q0Var = new v4.q0(-1, -2);
                    int i19 = auVar.f30227u0;
                    ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i19;
                    view3.setLayoutParams(q0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.n6.f29339a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.u6.x(z8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    mq mqVar = new mq(colorDrawable, org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.n6.f29360b7));
                    mqVar.f37616x = true;
                    z8Var.setBackgroundDrawable(mqVar);
                    linearLayout = z8Var;
                }
                return new v4.f1(linearLayout);
            case 7:
                lf0 lf0Var = new lf0(viewGroup.getContext());
                lf0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.f1(lf0Var);
            case 8:
                org.telegram.ui.ActionBar.i6 i6Var = ((xh0) obj).f53861f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, i6Var);
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, n4Var2, i6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.c0) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, i6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, i2Var, i6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f53442b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.f29452g7, org.telegram.ui.ActionBar.n6.h7, i6Var);
                    boolean z10 = gd.f24216a0;
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
                    frameLayout3.addView(radioButton, c8.ma.d(22, 22.0f, i22, f10, 0.0f, i23, 0.0f));
                    mp mpVar = new mp(24, context2, i6Var);
                    frameLayout3.f53443c = mpVar;
                    int i24 = org.telegram.ui.ActionBar.n6.f29396d6;
                    mpVar.b(-1, i24, org.telegram.ui.ActionBar.n6.f29526k7);
                    mpVar.setDrawUnchecked(false);
                    mpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = gd.f24216a0;
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
                    frameLayout3.addView(mpVar, c8.ma.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    mpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f53441a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (gd.f24216a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z12 = gd.f24216a0;
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
                    frameLayout3.addView(textView, c8.ma.d(-2, -2.0f, i27, f12, 0.0f, i21, 0.0f));
                    org.telegram.ui.ActionBar.u6.h(i24, frameLayout3, i6Var);
                    n4Var = frameLayout3;
                }
                return i5.c.q(n4Var, n4Var, -1, -2);
            case 9:
                uc1 uc1Var = (uc1) obj;
                return new v4.f1(new qc1(uc1Var.F, uc1Var.f52522c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = iVar.f58594a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f58665c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.ma.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f58663a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.ma.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f58664b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29788y6, i6Var2);
                    textView3.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView3, c8.ma.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout4;
                }
                return i5.c.q(view, view, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.i1 i1Var = (ug.i1) obj;
                View i110 = i1Var.i1(context4, i7);
                if (i110 != null) {
                    return i5.c.q(i110, i110, -1, -2);
                }
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    ps0Var = new ps0(this, context4, i1Var.J0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, i1Var.J0);
                                    d0Var.setBackground(true);
                                    String M0 = gd.M0(2131749490, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.n6.Xc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(M0, i28, 0, new Runnable(this) {
                                        public final l4 f58672b;

                                        {
                                            this.f58672b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58672b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((i1) l4Var.d).f58691p2.getParentActivity(), gd.M0(2131743961, null));
                                                    return;
                                                default:
                                                    vf.c.t(((i1) l4Var.d).f58691p2.getParentActivity(), gd.M0(2131746588, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.R2(gd.M0(2131749491, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final l4 f58672b;

                                        {
                                            this.f58672b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            l4 l4Var = this.f58672b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((i1) l4Var.d).f58691p2.getParentActivity(), gd.M0(2131743961, null));
                                                    return;
                                                default:
                                                    vf.c.t(((i1) l4Var.d).f58691p2.getParentActivity(), gd.M0(2131746588, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    ps0Var = d0Var;
                                }
                            } else {
                                ps0Var = new ai.r2(context4);
                            }
                        } else {
                            ps0Var = new zh.f(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.n6.f29339a7;
                        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.n6.w0(i29, i1Var.J0), 0);
                        org.telegram.ui.ActionBar.u6.h(i29, y6Var, i1Var.J0);
                        ps0Var = y6Var;
                    }
                } else {
                    d61 d61Var = new d61(25, context4, this);
                    i1Var.f58690o2 = d61Var;
                    d61Var.setOrientation(1);
                    View view4 = i1Var.f58699x2;
                    if (view4 == null) {
                        i1Var.f58689n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.n6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.w0(i30, i1Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, i1Var.J0)));
                        i1Var.f58689n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = i1Var.f58689n2.f59462b;
                        fVar.f59446z = i30;
                        fVar.A = org.telegram.ui.ActionBar.n6.Ck;
                        fVar.b();
                        d61Var.addView(i1Var.f58689n2, c8.ma.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) i1Var.f58699x2.getParent()).removeView(i1Var.f58699x2);
                        }
                        i1Var.f1(d61Var);
                    }
                    if (i1Var.J2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        i1Var.J2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = i1Var.f58692q2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731v6, i1Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        i1Var.K2 = new k80[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            i1Var.K2[i31] = new bi.q2(7, context4, i1Var.J0);
                            k80 k80Var = i1Var.K2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            k80Var.setVisibility(i16);
                            i1Var.K2[i31].setTextSize(1, 16.0f);
                            i1Var.K2[i31].setTypeface(org.telegram.messenger.g0.o());
                            i1Var.K2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.u6.U(i1Var.K2[i31], org.telegram.ui.ActionBar.n6.G6, i1Var.J0);
                            org.telegram.ui.ActionBar.u6.G(i1Var.K2[i31], org.telegram.ui.ActionBar.n6.J6, i1Var.J0);
                            i1Var.J2.addView(i1Var.K2[i31], c8.ma.c(-2.0f, -1));
                        }
                    }
                    if (i1Var.J2.getParent() != null) {
                        ((ViewGroup) i1Var.J2.getParent()).removeView(i1Var.J2);
                    }
                    d61Var.addView(i1Var.J2, c8.ma.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (i1Var.L2 == null) {
                        k80 k80Var2 = new k80(i1Var.getContext(), i1Var.J0);
                        i1Var.L2 = k80Var2;
                        k80Var2.setTextSize(1, 14.0f);
                        i1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.u6.U(i1Var.L2, org.telegram.ui.ActionBar.n6.G6, i1Var.J0);
                        org.telegram.ui.ActionBar.u6.G(i1Var.L2, org.telegram.ui.ActionBar.n6.J6, i1Var.J0);
                    }
                    if (i1Var.L2.getParent() != null) {
                        ((ViewGroup) i1Var.L2.getParent()).removeView(i1Var.L2);
                    }
                    d61Var.addView(i1Var.L2, c8.ma.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    i1Var.k1(false);
                    i1Var.f58688m2 = new ki.f(context4, 5);
                    w01 w01Var = new w01(12, context4, this);
                    w01Var.setClipChildren(false);
                    w01Var.addView(i1Var.f58688m2);
                    w01Var.addView(d61Var);
                    bc bcVar = i1Var.f58689n2;
                    ps0Var = w01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(i1Var.f58688m2);
                        ps0Var = w01Var;
                    }
                }
                ps0Var.setLayoutParams(new v4.q0(-1, -2));
                i1Var.e1(i7, ps0Var);
                return new v4.f1(ps0Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        boolean z10;
        switch (this.f9253c) {
            case 4:
                cm0 cm0Var = (cm0) this.d;
                ArrayList arrayList = cm0Var.f34109r;
                int b10 = f1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    bm0 bm0Var = (bm0) f1Var.f59122a;
                    if (((zl0) arrayList.get(b10)).f42900a.h == cm0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bm0Var.a(z10, false);
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
