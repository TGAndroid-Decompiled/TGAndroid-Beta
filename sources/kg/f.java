package kg;

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
import java.util.ArrayList;
import jg.z2;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.k6;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.du0;
import org.telegram.ui.je1;
import org.telegram.ui.ne1;
import org.telegram.ui.og0;
import org.telegram.ui.pg0;
import org.telegram.ui.r00;
import org.telegram.ui.rt0;
import org.telegram.ui.s71;
import org.telegram.ui.ui0;
import org.telegram.ui.vi0;
import org.telegram.ui.wi0;
import org.telegram.ui.yu;
import rh.e4;
import w7.b6;
public final class f extends tk0 {
    public final int f11062c;
    public final Object d;

    public f(Object obj, int i10) {
        this.f11062c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f11062c) {
            case 0:
                return false;
            case 1:
                if (c1Var.f47912f == 1) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                int i10 = c1Var.f47912f;
                if (i10 == 1 || i10 == 2) {
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
                int i11 = c1Var.f47912f;
                if (i11 != 0 && i11 != 2) {
                    return false;
                }
                return true;
            case 8:
                return true;
            case 9:
                return false;
            default:
                return true;
        }
    }

    public kj E(int i10) {
        hm0 hm0Var = (hm0) this.d;
        int i11 = hm0Var.f26865w;
        if (i10 >= i11 && i10 < hm0Var.f26866x) {
            return (kj) hm0Var.e.get(i10 - i11);
        }
        int i12 = hm0Var.D;
        if (i10 >= i12 && i10 < hm0Var.E) {
            return (kj) hm0Var.f26861f.get(i10 - i12);
        }
        return null;
    }

    public void H(int i10, int i11) {
        int[] iArr = ((e4) this.d).K2;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        f();
    }

    @Override
    public final int b() {
        switch (this.f11062c) {
            case 0:
                return ((l) this.d).d.size();
            case 1:
                return ((v1) this.d).X1;
            case 2:
                return 1;
            case 3:
                return ((hm0) this.d).f26863r;
            case 4:
                return ((sm0) this.d).f30340r.size();
            case 5:
                if (((yu) this.d).Y1.h()) {
                    return 1;
                }
                return 3;
            case 6:
                return ((pg0) this.d).f40477c.size();
            case 7:
                return ((wi0) this.d).h;
            case 8:
                return 12;
            case 9:
                return ((e4) this.d).K2.length;
            default:
                return ((zf.g0) this.d).f55518e3.size();
        }
    }

    @Override
    public long c(int i10) {
        ui0 ui0Var;
        switch (this.f11062c) {
            case 7:
                wi0 wi0Var = (wi0) this.d;
                int i11 = wi0Var.D;
                if (i10 >= i11 && i10 < wi0Var.E) {
                    ui0Var = (ui0) wi0Var.f43112b.get(i10 - i11);
                } else {
                    int i12 = wi0Var.f43115n;
                    if (i10 >= i12 && i10 < wi0Var.f43116r) {
                        ui0Var = (ui0) wi0Var.f43111a.get(i10 - i12);
                    } else {
                        ui0Var = null;
                    }
                }
                if (ui0Var != null) {
                    return ui0Var.f41957c;
                }
                wi0Var.getClass();
                if (i10 == 0) {
                    return 1L;
                }
                if (i10 == wi0Var.f43120y) {
                    return 2L;
                }
                if (i10 == wi0Var.f43117s) {
                    return 3L;
                }
                if (i10 == wi0Var.f43118w) {
                    return 4L;
                }
                if (i10 == wi0Var.f43119x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i10);
        }
    }

    @Override
    public int d(int i10) {
        switch (this.f11062c) {
            case 0:
                return ((j) ((l) this.d).d.get(i10)).f11128a;
            case 1:
                v1 v1Var = (v1) this.d;
                if (i10 != v1Var.Y1) {
                    if (i10 >= v1Var.Z1 && i10 < v1Var.a2) {
                        return v1Var.f1();
                    }
                    if (i10 >= v1Var.f11294b2 && i10 < v1Var.f11295c2) {
                        return 1;
                    }
                    if (i10 == v1Var.f11296d2) {
                        return 2;
                    }
                    if (i10 == v1Var.f11297e2) {
                        return 3;
                    }
                    if (i10 == 0) {
                        return 4;
                    }
                    if (i10 == v1Var.f11298f2) {
                        return 5;
                    }
                }
                return 0;
            case 2:
                return i10;
            case 3:
                hm0 hm0Var = (hm0) this.d;
                if (i10 != hm0Var.f26864s && i10 != hm0Var.f26867y) {
                    kj E = E(i10);
                    if (E == null || !E.I3()) {
                        return 1;
                    }
                    return 2;
                }
                return 0;
            case 4:
            case 6:
            default:
                return super.d(i10);
            case 5:
                return i10;
            case 7:
                wi0 wi0Var = (wi0) this.d;
                if (i10 >= wi0Var.D && i10 < wi0Var.E) {
                    return 0;
                }
                wi0Var.getClass();
                if (i10 != 0 && i10 != wi0Var.f43120y) {
                    if (i10 == wi0Var.f43117s) {
                        return 2;
                    }
                    if (i10 != wi0Var.f43118w && i10 != wi0Var.f43119x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int f12;
        boolean z11;
        int f13;
        boolean z12;
        String L0;
        String L02;
        boolean z13;
        kq kqVar;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f11062c;
        float f7 = 0.0f;
        ui0 ui0Var = null;
        boolean z17 = false;
        boolean z18 = true;
        Object obj = this.d;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                ArrayList arrayList = lVar.d;
                if (((j) arrayList.get(i10)).f11128a == 1) {
                    k kVar = (k) c1Var.f47909a;
                    kVar.f11138c.setColorFilter(new PorterDuffColorFilter(lVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    kVar.f11138c.setImageDrawable(lVar.getContext().getDrawable(((j) arrayList.get(i10)).f11129b));
                    kVar.f11136a.setText(((j) arrayList.get(i10)).f11130c);
                    kVar.f11137b.setText(((j) arrayList.get(i10)).d);
                    return;
                }
                return;
            case 1:
                View view = c1Var.f47909a;
                v1 v1Var = (v1) obj;
                int i12 = v1Var.f11294b2;
                if (i10 >= i12 && i10 < v1Var.f11295c2) {
                    rt0 rt0Var = (rt0) view;
                    du0 du0Var = (du0) v1Var.P1.get(i10 - i12);
                    if (i10 != v1Var.f11295c2 - 1) {
                        z17 = true;
                    }
                    rt0Var.a(du0Var, z17);
                    return;
                } else if (i10 >= v1Var.Z1 && i10 < v1Var.a2) {
                    v1Var.g1(view);
                    return;
                } else {
                    return;
                }
            case 2:
                return;
            case 3:
                hm0 hm0Var = (hm0) obj;
                r00 r00Var = hm0Var.J;
                int i13 = c1Var.f47912f;
                View view2 = c1Var.f47909a;
                if (i13 == 0) {
                    z3 z3Var = (z3) view2;
                    if (i10 == hm0Var.f26864s) {
                        String L03 = dd.L0(2131751345, null);
                        if (z3Var.getText().equals(L03)) {
                            if (hm0Var.H) {
                                L02 = dd.L0(2131747449, null);
                            } else {
                                L02 = dd.L0(2131746070, null);
                            }
                            boolean z19 = hm0Var.H;
                            y3 y3Var = z3Var.f23640b;
                            y3Var.c(L02, true, z19);
                            y3Var.setVisibility(0);
                            return;
                        }
                        if (hm0Var.H) {
                            L0 = dd.L0(2131747449, null);
                        } else {
                            L0 = dd.L0(2131746070, null);
                        }
                        z3Var.b(L03, L0, new gm0(this));
                        return;
                    } else if (i10 == hm0Var.f26867y) {
                        z3Var.b(dd.L0(2131746377, null), dd.L0(2131745512, null), new db0(this, 8));
                        return;
                    } else {
                        return;
                    }
                }
                kj E = E(i10);
                if (E != null) {
                    if (hm0Var.I.f() && i10 >= hm0Var.f26865w && i10 < hm0Var.f26866x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i13 == 1) {
                        em0 em0Var = (em0) view2;
                        a7.i(t6.f20930d6, em0Var, null);
                        l7 l7Var = em0Var.f25884a;
                        if (l7Var.getMessage() == null) {
                            f13 = 0;
                        } else {
                            f13 = l7Var.getMessage().f1();
                        }
                        l7Var.c(E, true);
                        int f14 = l7Var.getMessage().f1();
                        r00Var.f40933a = kj.B0(l7Var.getMessage().f16690k);
                        r00Var.f40934b = f14;
                        boolean b10 = hm0Var.I.b(r00Var);
                        if (f13 == E.f1()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l7Var.b(b10, z12);
                        if (f13 == E.f1()) {
                            z17 = true;
                        }
                        if (l7Var.O != z10) {
                            l7Var.O = z10;
                            if (!z17) {
                                if (z10) {
                                    f7 = 1.0f;
                                }
                                l7Var.P = f7;
                            }
                            l7Var.invalidate();
                            return;
                        }
                        return;
                    } else if (i13 == 2) {
                        k7 k7Var = (k7) view2;
                        if (k7Var.getMessage() == null) {
                            f12 = 0;
                        } else {
                            f12 = k7Var.getMessage().f1();
                        }
                        k7Var.f(E, true);
                        int f15 = k7Var.getMessage().f1();
                        r00Var.f40933a = kj.B0(k7Var.getMessage().f16690k);
                        r00Var.f40934b = f15;
                        boolean b11 = hm0Var.I.b(r00Var);
                        if (f12 == E.f1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k7Var.e(b11, z11);
                        if (f12 == E.f1()) {
                            z17 = true;
                        }
                        if (k7Var.f22162d0 != z10) {
                            k7Var.f22162d0 = z10;
                            if (!z17) {
                                if (z10) {
                                    f7 = 1.0f;
                                }
                                k7Var.f22163e0 = f7;
                            }
                            k7Var.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                View view3 = c1Var.f47909a;
                sm0 sm0Var = (sm0) obj;
                ArrayList arrayList2 = sm0Var.f30340r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    pm0 pm0Var = (pm0) arrayList2.get(i10);
                    rm0 rm0Var = (rm0) view3;
                    sg.o0 o0Var = rm0Var.d;
                    if (o0Var != null && o0Var.equals(pm0Var.f29453a)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = pm0Var.f29453a.g();
                        tL_reactionCount.count = pm0Var.f29454b;
                        sm0 sm0Var2 = rm0Var.f30024s;
                        qm0 qm0Var = new qm0(rm0Var, sm0Var2.f30335a, rm0Var, tL_reactionCount, sm0Var2.f30337c);
                        rm0Var.f30018a = qm0Var;
                        qm0Var.E.d(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(100.0f));
                        qm0 qm0Var2 = rm0Var.f30018a;
                        qm0Var2.f48420p = true;
                        qm0Var2.R = true;
                    } else {
                        rm0Var.f30018a.v = pm0Var.f29454b;
                    }
                    rm0Var.d = pm0Var.f29453a;
                    if (!z13) {
                        qm0 qm0Var3 = rm0Var.f30018a;
                        qm0Var3.e = qm0Var3.f48429z;
                    }
                    rm0Var.f30018a.f48429z = org.telegram.messenger.i0.L(44.33f);
                    rm0Var.f30018a.f48424t = !TextUtils.isEmpty(pm0Var.f29455c);
                    qm0 qm0Var4 = rm0Var.f30018a;
                    boolean z20 = qm0Var4.f48424t;
                    e6 e6Var = qm0Var4.F;
                    if (z20) {
                        e6Var.t(k6.m(pm0Var.f29455c, e6Var.f25742a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (e6Var != null) {
                        e6Var.t("", !z13, true);
                    }
                    qm0 qm0Var5 = rm0Var.f30018a;
                    Integer.toString(pm0Var.f29454b);
                    qm0Var5.getClass();
                    rm0Var.f30018a.E.c(pm0Var.f29454b, !z13);
                    qm0 qm0Var6 = rm0Var.f30018a;
                    if (qm0Var6.E != null && (qm0Var6.v > 0 || qm0Var6.f48424t)) {
                        float f10 = qm0Var6.f48429z;
                        int ceil = (int) Math.ceil(kqVar.f27929m);
                        if (rm0Var.f30018a.f48424t) {
                            f7 = 4.0f;
                        }
                        qm0Var6.f48429z = (int) (org.telegram.messenger.i0.L(f7) + ceil + rm0Var.f30018a.F.d + f10);
                    }
                    if (z13) {
                        qm0 qm0Var7 = rm0Var.f30018a;
                        qm0Var7.e = qm0Var7.f48429z;
                    }
                    rm0Var.f30018a.A = org.telegram.messenger.i0.L(28.0f);
                    qm0 qm0Var8 = rm0Var.f30018a;
                    qm0Var8.f48419o = rm0Var.e;
                    if (rm0Var.f30023r) {
                        qm0Var8.a();
                    }
                    if (!z13) {
                        rm0Var.requestLayout();
                    }
                    rm0 rm0Var2 = (rm0) view3;
                    if (pm0Var.f29453a.h != sm0Var.h) {
                        z18 = false;
                    }
                    rm0Var2.a(z18, false);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                pg0 pg0Var = (pg0) obj;
                ((og0) c1Var.f47909a).a((TLObject) pg0Var.f40477c.get(i10), ((Integer) pg0Var.f40476b.get(i10)).intValue(), false);
                return;
            case 7:
                wi0 wi0Var = (wi0) obj;
                p6 p6Var = wi0Var.f43114f;
                int i14 = c1Var.f47912f;
                View view4 = c1Var.f47909a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view4;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232556);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232557);
                            int i15 = t6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            a7.y(i2Var, drawable, i15, p6Var, mode);
                            a7.y(i2Var, drawable2, t6.f21060k7, p6Var, mode);
                            eq eqVar = new eq(drawable, drawable2);
                            i2Var.f22026a.l(dd.L0(2131743829, null), false);
                            i2Var.f22027b.setImageDrawable(eqVar);
                            i2Var.f22028c = false;
                            return;
                        }
                        return;
                    }
                    p4 p4Var = (p4) view4;
                    if (i10 == 0) {
                        p4Var.setText(dd.L0(2131744236, null));
                        return;
                    } else if (i10 == wi0Var.f43120y) {
                        p4Var.setText(dd.L0(2131744315, null));
                        return;
                    } else {
                        return;
                    }
                }
                vi0 vi0Var = (vi0) view4;
                int i16 = wi0Var.D;
                if (i10 >= i16 && i10 < wi0Var.E) {
                    ui0Var = (ui0) wi0Var.f43112b.get(i10 - i16);
                }
                int i17 = wi0Var.f43115n;
                if (i10 >= i17 && i10 < wi0Var.f43116r) {
                    ui0Var = (ui0) wi0Var.f43111a.get(i10 - i17);
                }
                if (ui0Var != null) {
                    if (vi0Var.e == ui0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (ui0Var == wi0Var.G) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (wi0Var.I.get(ui0Var.f41957c) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    vi0Var.e = ui0Var;
                    vi0Var.f42536a.setText(ui0Var.f41958f);
                    if (i10 != wi0Var.E - 1) {
                        z17 = true;
                    }
                    vi0Var.d = z17;
                    vi0Var.f42537b.a(z15, z14);
                    vi0Var.f42538c.a(z16, z14);
                    return;
                }
                return;
            case 8:
                ((je1) c1Var.f47909a).f38375a = WallpapersListActivity.f35478i0[i10];
                return;
            case 9:
                int[] iArr = ((e4) obj).K2;
                z9 z9Var = (z9) c1Var.f47909a;
                int i18 = iArr[(iArr.length - 1) - i10];
                if (z9Var.f33081a != i18) {
                    z9Var.f33081a = i18;
                    z9Var.requestLayout();
                    return;
                }
                return;
            default:
                ((zf.f0) c1Var).v.setData((zf.e0) ((zf.g0) obj).f55518e3.get(i10));
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int intValue;
        int i11;
        u1 u1Var;
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        p4 p4Var;
        int i19 = this.f11062c;
        int i20 = 5;
        Object obj = this.d;
        switch (i19) {
            case 0:
                l lVar = (l) obj;
                p6 p6Var = lVar.f10989a;
                if (i10 == 0) {
                    view = new i(lVar, lVar.getContext());
                } else if (i10 == 2) {
                    view = new x3(lVar.getContext(), 16);
                } else {
                    Context context = lVar.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout2.f11138c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout2.addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout2.f11136a = textView;
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    a7.V(textView, t6.G6, p6Var);
                    textView.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f11137b = textView2;
                    a7.V(textView2, t6.f21312y6, p6Var);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout2;
                }
                return sc.e.o(view, view, -1, -2);
            case 1:
                Context context2 = viewGroup.getContext();
                v1 v1Var = (v1) obj;
                View h12 = v1Var.h1(context2, i10);
                if (h12 != null) {
                    return sc.e.o(h12, h12, -1, -2);
                }
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    u1Var = new u1(this, context2, v1Var.I0);
                                } else {
                                    og.f0 f0Var = new og.f0(context2, v1Var.I0);
                                    f0Var.setBackground(true);
                                    String L0 = dd.L0(2131749671, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i21 = t6.Uc;
                                    f0Var.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.R2(L0, i21, 0, new Runnable(this) {
                                        public final f f11269b;

                                        {
                                            this.f11269b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i22 = r2;
                                            f fVar = this.f11269b;
                                            switch (i22) {
                                                case 0:
                                                    gf.f.r(((v1) fVar.d).f11304l2.getParentActivity(), dd.L0(2131744221, null));
                                                    return;
                                                default:
                                                    gf.f.r(((v1) fVar.d).f11304l2.getParentActivity(), dd.L0(2131746796, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.i0.R2(dd.L0(2131749672, "GiftPremiumPrivacyPolicy"), i21, 0, new Runnable(this) {
                                        public final f f11269b;

                                        {
                                            this.f11269b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i22 = r2;
                                            f fVar = this.f11269b;
                                            switch (i22) {
                                                case 0:
                                                    gf.f.r(((v1) fVar.d).f11304l2.getParentActivity(), dd.L0(2131744221, null));
                                                    return;
                                                default:
                                                    gf.f.r(((v1) fVar.d).f11304l2.getParentActivity(), dd.L0(2131746796, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    u1Var = f0Var;
                                }
                            } else {
                                u1Var = new z2(context2);
                            }
                        } else {
                            u1Var = new bn(context2, 2);
                        }
                    } else {
                        int i22 = t6.f20873a7;
                        c7 c7Var = new c7(context2, t6.w0(i22, v1Var.I0), 0);
                        a7.i(i22, c7Var, v1Var.I0);
                        u1Var = c7Var;
                    }
                } else {
                    s71 s71Var = new s71(this, context2, 3);
                    v1Var.f11303k2 = s71Var;
                    s71Var.setOrientation(1);
                    View view2 = v1Var.f11312t2;
                    if (view2 == null) {
                        v1Var.f11302j2 = new h(context2, 1, 0, 1);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i23 = t6.Ak;
                        canvas.drawColor(i0.b.f(0.5f, t6.w0(i23, v1Var.I0), t6.w0(t6.f21002h5, v1Var.I0)));
                        v1Var.f11302j2.setBackgroundBitmap(createBitmap);
                        lg.h hVar = v1Var.f11302j2.f11920b;
                        hVar.f11898z = i23;
                        hVar.A = t6.zk;
                        hVar.b();
                        s71Var.addView(v1Var.f11302j2, b6.r(160, 160, 1));
                    } else {
                        if (view2.getParent() != null) {
                            ((ViewGroup) v1Var.f11312t2.getParent()).removeView(v1Var.f11312t2);
                        }
                        v1Var.e1(s71Var);
                    }
                    if (v1Var.F2 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(context2);
                        v1Var.F2 = frameLayout3;
                        frameLayout3.setClipChildren(false);
                        Integer num = v1Var.f11305m2;
                        if (num == null) {
                            intValue = t6.w0(t6.f21260v6, v1Var.I0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        v1Var.G2 = new p80[2];
                        for (int i24 = 0; i24 < 2; i24++) {
                            v1Var.G2[i24] = new t1(0, context2, v1Var.I0);
                            p80 p80Var = v1Var.G2[i24];
                            if (i24 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            p80Var.setVisibility(i11);
                            v1Var.G2[i24].setTextSize(1, 16.0f);
                            v1Var.G2[i24].setTypeface(org.telegram.messenger.i0.o());
                            v1Var.G2[i24].setGravity(1);
                            a7.V(v1Var.G2[i24], t6.G6, v1Var.I0);
                            a7.H(v1Var.G2[i24], t6.J6, v1Var.I0);
                            v1Var.F2.addView(v1Var.G2[i24], b6.c(-2.0f, -1));
                        }
                    }
                    if (v1Var.F2.getParent() != null) {
                        ((ViewGroup) v1Var.F2.getParent()).removeView(v1Var.F2);
                    }
                    s71Var.addView(v1Var.F2, b6.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (v1Var.H2 == null) {
                        p80 p80Var2 = new p80(v1Var.getContext(), v1Var.I0);
                        v1Var.H2 = p80Var2;
                        p80Var2.setTextSize(1, 14.0f);
                        v1Var.H2.setGravity(1);
                        a7.V(v1Var.H2, t6.G6, v1Var.I0);
                        a7.H(v1Var.H2, t6.J6, v1Var.I0);
                    }
                    if (v1Var.H2.getParent() != null) {
                        ((ViewGroup) v1Var.H2.getParent()).removeView(v1Var.H2);
                    }
                    s71Var.addView(v1Var.H2, b6.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    v1Var.j1(false);
                    v1Var.f11301i2 = new g(context2, 1);
                    jg.l0 l0Var = new jg.l0(this, context2, 6);
                    l0Var.setClipChildren(false);
                    l0Var.addView(v1Var.f11301i2);
                    l0Var.addView(s71Var);
                    h hVar2 = v1Var.f11302j2;
                    u1Var = l0Var;
                    if (hVar2 != null) {
                        hVar2.setStarParticlesView(v1Var.f11301i2);
                        u1Var = l0Var;
                    }
                }
                u1Var.setLayoutParams(new s4.o0(-1, -2));
                v1Var.d1(i10, u1Var);
                return new s4.c1(u1Var);
            case 2:
                return new s4.c1(((aa) obj).P1);
            case 3:
                if (i10 == 0) {
                    frameLayout = new z3(viewGroup.getContext(), null);
                } else if (i10 == 1) {
                    Context context3 = viewGroup.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    l7 l7Var = new l7(2, context3, null);
                    frameLayout4.f25884a = l7Var;
                    l7Var.f22253r.setVisibility(8);
                    frameLayout4.addView(l7Var);
                    frameLayout = frameLayout4;
                } else {
                    frameLayout = new k7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new s4.c1(frameLayout);
            case 4:
                sm0 sm0Var = (sm0) obj;
                return new s4.c1(new rm0(sm0Var, sm0Var.getContext()));
            case 5:
                yu yuVar = (yu) obj;
                if (i10 == 0) {
                    linearLayout = yuVar.V1;
                } else if (i10 == 2) {
                    View view3 = yuVar.W1;
                    s4.o0 o0Var = new s4.o0(-1, -2);
                    int i25 = yuVar.f21616t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i25;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i25;
                    view3.setLayoutParams(o0Var);
                    linearLayout = view3;
                } else {
                    b9 b9Var = new b9(viewGroup.getContext());
                    b9Var.setFixedSize(12);
                    int i26 = t6.f20873a7;
                    ColorDrawable colorDrawable = new ColorDrawable(t6.x0(null, i26, false));
                    a7.y(b9Var, colorDrawable, i26, null, PorterDuff.Mode.SRC_IN);
                    eq eqVar = new eq(colorDrawable, t6.Y0(viewGroup.getContext(), 2131231231, t6.f20893b7));
                    eqVar.f25909x = true;
                    b9Var.setBackgroundDrawable(eqVar);
                    linearLayout = b9Var;
                }
                return new s4.c1(linearLayout);
            case 6:
                og0 og0Var = new og0(viewGroup.getContext());
                og0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(50.0f)));
                return new s4.c1(og0Var);
            case 7:
                p6 p6Var2 = ((wi0) obj).f43114f;
                Context context4 = viewGroup.getContext();
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            p4 p4Var2 = new p4(context4, p6Var2);
                            a7.i(t6.f20930d6, p4Var2, p6Var2);
                            p4Var = p4Var2;
                        } else {
                            p4Var = new c7(context4, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context4, p6Var2);
                        i2Var.d = 61;
                        a7.i(t6.f20930d6, i2Var, p6Var2);
                        p4Var = i2Var;
                    }
                } else {
                    ?? frameLayout5 = new FrameLayout(context4);
                    RadioButton radioButton = new RadioButton(context4);
                    frameLayout5.f42537b = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    a7.P(radioButton, t6.f20987g7, t6.f21004h7, p6Var2);
                    boolean z10 = dd.X;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i27 = i12 | 16;
                    int i28 = 20;
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = 20;
                    }
                    float f7 = i13;
                    if (!z10) {
                        i28 = 0;
                    }
                    frameLayout5.addView(radioButton, b6.d(22, 22.0f, i27, f7, 0.0f, i28, 0.0f));
                    ep epVar = new ep(24, context4, p6Var2);
                    frameLayout5.f42538c = epVar;
                    int i29 = t6.f20930d6;
                    epVar.b(-1, i29, t6.f21060k7);
                    epVar.setDrawUnchecked(false);
                    epVar.setDrawBackgroundAsArc(3);
                    boolean z11 = dd.X;
                    if (z11) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i30 = i14 | 16;
                    if (z11) {
                        i15 = 0;
                    } else {
                        i15 = 18;
                    }
                    float f10 = i15;
                    if (z11) {
                        i16 = 18;
                    } else {
                        i16 = 0;
                    }
                    frameLayout5.addView(epVar, b6.d(26, 26.0f, i30, f10, 0.0f, i16, 0.0f));
                    epVar.a(true, false);
                    TextView textView3 = new TextView(context4);
                    frameLayout5.f42536a = textView3;
                    a7.V(textView3, t6.G6, p6Var2);
                    a30.o(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    if (dd.X) {
                        i17 = 5;
                    } else {
                        i17 = 3;
                    }
                    textView3.setGravity(i17 | 16);
                    boolean z12 = dd.X;
                    if (!z12) {
                        i20 = 3;
                    }
                    int i31 = i20 | 16;
                    int i32 = 23;
                    if (z12) {
                        i18 = 23;
                    } else {
                        i18 = 61;
                    }
                    float f11 = i18;
                    if (z12) {
                        i32 = 61;
                    }
                    frameLayout5.addView(textView3, b6.d(-2, -2.0f, i31, f11, 0.0f, i32, 0.0f));
                    a7.i(i29, frameLayout5, p6Var2);
                    p4Var = frameLayout5;
                }
                return sc.e.o(p4Var, p4Var, -1, -2);
            case 8:
                ne1 ne1Var = (ne1) obj;
                return new s4.c1(new je1(ne1Var.E, ne1Var.f39887c));
            case 9:
                ?? view4 = new View(((e4) obj).getContext());
                view4.f33081a = 0;
                return new s4.c1(view4);
            default:
                zf.d0 d0Var = new zf.d0(viewGroup.getContext(), ((zf.g0) obj).f31008n2);
                ?? c1Var = new s4.c1(d0Var);
                c1Var.v = d0Var;
                d0Var.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(30.0f)));
                return c1Var;
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean z10;
        switch (this.f11062c) {
            case 4:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.f30340r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    rm0 rm0Var = (rm0) c1Var.f47909a;
                    if (((pm0) arrayList.get(b10)).f29453a.h == sm0Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rm0Var.a(z10, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void F(s4.c1 c1Var, int i10) {
    }

    private final void G(s4.c1 c1Var, int i10) {
    }
}
