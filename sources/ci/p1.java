package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i40;
public final class p1 extends org.telegram.ui.Components.ma {
    public static final int f5721t2 = 0;
    public final int Q1;
    public final LinearLayout R1;
    public final l1[] S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final a X1;
    public final a Y1;
    public final a Z1;
    public final hy f5722a2;
    public final g1 f5723b2;
    public final o1 c2;
    public i1 f5724d2;
    public final FrameLayout f5725e2;
    public final ImageView f5726f2;
    public final ImageView f5727g2;
    public final h1 f5728h2;
    public final TextView f5729i2;
    public final View f5730j2;
    public final eh.g f5731k2;
    public final eh.c f5732l2;
    public k1 f5733m2;
    public final boolean f5734n2;
    public boolean f5735o2;
    public final eh.k f5736p2;
    public int f5737q2;
    public int f5738r2;
    public int f5739s2;

    public p1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, e6Var);
        int i10;
        int L;
        this.f5739s2 = 1;
        this.Q1 = i3;
        this.f5734n2 = z10;
        ArrayList c2 = dg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.T1 = c2;
        a aVar = new a(c2);
        this.X1 = aVar;
        aVar.f4782a = false;
        ArrayList c10 = dg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.U1 = c10;
        a aVar2 = new a(c10);
        this.Y1 = aVar2;
        aVar2.f4782a = false;
        this.V1 = dg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.W1 = arrayList2;
        if (z10) {
            int i11 = 0;
            while (i11 < this.V1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.V1.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.W1.add(stargiftattributemodel);
                    this.V1.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.T1, Comparator$CC.comparingDouble(new c1(0)));
        List.EL.sort(this.U1, Comparator$CC.comparingDouble(new c1(1)));
        List.EL.sort(this.V1, Comparator$CC.comparingDouble(new c1(2)));
        List.EL.sort(this.W1, Comparator$CC.comparingDouble(new c1(2)));
        a aVar3 = new a(this.V1);
        this.Z1 = aVar3;
        aVar3.f4782a = false;
        ViewParent parent = this.m1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.m1);
        }
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(6.0f);
        this.f28622x = true;
        int d12 = d1();
        this.f5738r2 = d12;
        v0(d12);
        N();
        si.c d = this.Y0.d(new f1(this));
        if (Build.VERSION.SDK_INT >= 31 && az.f()) {
            eh.g gVar = new eh.g(false);
            this.f5731k2 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(d);
            fVar.f54756f = d;
            fVar.d = gVar;
            fVar.f54755e = -2;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.f5732l2 = cVar;
            cVar.f9988k = true;
            if (org.telegram.messenger.lc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f9983e = L;
        } else {
            this.f5731k2 = null;
            this.f5732l2 = new eh.c(d, d, d);
        }
        this.f5732l2.f9987j = this.Y0;
        hy hyVar = new hy(3, false);
        this.f5722a2 = hyVar;
        hyVar.O = new ai.g2(this, 4);
        this.f36102l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.setLayoutManager(hyVar);
        this.f36102l1.setSelectorType(9);
        this.f36102l1.setSelectorDrawableColor(0);
        this.f36102l1.j(new ai.j5(this, 6));
        this.Y0.b(this.f36102l1);
        ?? kVar = new u4.k();
        this.f5723b2 = kVar;
        kVar.C = false;
        kVar.f55567m = false;
        kVar.n(280L);
        kVar.o(xq.h);
        kVar.D = 30L;
        this.f36102l1.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5725e2 = frameLayout;
        frameLayout.setClipChildren(false);
        h1 h1Var = new h1(this, context, e6Var, new d1(this, 0), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3));
        this.f5728h2 = h1Var;
        h1Var.d(new k5(1, 1));
        h1Var.setPreviewingAttributes(arrayList);
        h1Var.removeView(h1Var.Q);
        int i12 = -1;
        frameLayout.addView(h1Var, mf.c(-1.0f, -1));
        int i13 = this.f28618u0;
        frameLayout.setPadding(i13, 0, i13, 0);
        ImageView imageView = new ImageView(context);
        this.f5726f2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ai.b(this, 9));
        pf.a(imageView);
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5727g2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(2131231114);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ai.d(8, this, arrayList));
        pf.a(imageView2);
        frameLayout.addView(imageView2, mf.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i14 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f5729i2 = m10;
        k2.p1.u(m10, 1, 13.0f, null, 2131750069);
        m10.setGravity(17);
        int i15 = -1879048193;
        m10.setTextColor(-1879048193);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.S1 = new l1[3];
        this.c2 = new o1(context, e6Var, new ai.v2(this, 9));
        int i16 = 0;
        while (true) {
            l1[] l1VarArr = this.S1;
            if (i16 < l1VarArr.length) {
                l1 l1Var = new l1(context);
                l1Var.setClipChildren(false);
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
                l1Var.f5432c = h6Var;
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                h6Var.setTextColor(i12);
                h6Var.setGravity(i14);
                l1Var.addView(h6Var, mf.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                l1Var.f5431b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i15);
                textView2.setGravity(i14);
                l1Var.addView(textView2, mf.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
                l1Var.d = h6Var2;
                h6Var2.setTypeface(org.telegram.messenger.g0.o());
                h6Var2.setTextColor(i12);
                h6Var2.setGravity(5);
                h6Var2.getDrawable().T = true;
                h6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                h6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
                h6Var2.setSizeableBackground(new v5(org.telegram.messenger.g0.L(10.0f), 285212671));
                l1Var.addView(h6Var2, mf.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                l1VarArr[i16] = l1Var;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            ((TextView) this.S1[i16].f5431b).setText(bd.M0(2131749632, null));
                        }
                    } else {
                        ((TextView) this.S1[i16].f5431b).setText(bd.M0(2131749651, null));
                    }
                } else {
                    ((TextView) this.S1[i16].f5431b).setText(bd.M0(2131749634, null));
                }
                pf.a(this.S1[i16]);
                this.S1[i16].setOnClickListener(new bi.q(this, i16, 1));
                this.S1[i16].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.R1;
                l1[] l1VarArr2 = this.S1;
                l1 l1Var2 = l1VarArr2[i16];
                if (i16 != l1VarArr2.length - 1) {
                    i10 = 11;
                } else {
                    i10 = 0;
                }
                linearLayout2.addView(l1Var2, mf.q(0, 42, 1.0f, 7, 0, 0, i10, 0));
                i16++;
                i14 = 17;
                i12 = -1;
                i15 = -1879048193;
            } else {
                this.f5725e2.addView(this.R1, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.f28586b.addView(this.f5725e2, mf.e(-1, 315, 55));
                int d13 = d1();
                View view = new View(context);
                this.f5730j2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, 160), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = mf.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.f22602m;
                this.f28586b.addView(view, e10);
                this.c2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                gh.g c11 = this.f5732l2.c(this.c2, null, false);
                c11.q(org.telegram.messenger.g0.L(4.0f));
                c11.r(org.telegram.messenger.g0.L(28.0f));
                c11.p(new hh.b(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
                this.c2.setBackground(c11);
                this.f28586b.addView(this.c2, mf.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f5733m2 = new k1((TL_stars.starGiftAttributeBackdrop) dg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) dg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) dg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f5724d2.O(false);
                h1(false);
                tj0 tj0Var = this.f36102l1;
                ViewGroup viewGroup = this.f28586b;
                Objects.requireNonNull(tj0Var);
                this.f5736p2 = new eh.k(tj0Var, viewGroup, new i40(tj0Var, 0));
                this.Y0.i(this.f28586b);
                pi.q qVar = this.Y0;
                qVar.f53602a = new f1(this);
                qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
        }
    }

    public static double e1(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            return 0.04d;
        }
        return 0.0d;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        i1 i1Var = new i1(this, this.f36102l1, getContext(), this.Q1, new ai.c(this, 15), this.J0);
        this.f5724d2 = i1Var;
        i1Var.f33698r = false;
        return i1Var;
    }

    @Override
    public final tj0 M0(Context context) {
        return new j1(this, context, this.J0, 0);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.f5725e2;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, this.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0));
    }

    public final boolean f1(k1 k1Var) {
        if (this.f5739s2 != 1) {
            int i3 = this.c2.f5671s;
            k1 k1Var2 = this.f5733m2;
            if (k1Var2 != null) {
                if (i3 == 1) {
                    if (k1Var.f5371a != k1Var2.f5371a) {
                        return false;
                    }
                } else if (i3 == 2) {
                    if (k1Var.f5372b != k1Var2.f5372b) {
                        return false;
                    }
                } else if (i3 != 0 || k1Var.f5373c != k1Var2.f5373c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g1(int i3) {
        int i10;
        int i11;
        if (this.f5739s2 == i3) {
            return;
        }
        this.f5739s2 = i3;
        if (i3 == 2) {
            i10 = 2131231115;
        } else {
            i10 = 2131231114;
        }
        this.f5727g2.setImageResource(i10);
        if (i3 == 2) {
            i11 = 2131750068;
        } else {
            i11 = 2131750069;
        }
        this.f5729i2.setText(bd.M0(i11, null));
        i1();
    }

    public final void h1(boolean z10) {
        h1 h1Var = this.f5728h2;
        if (h1Var.getUpgradeImageViewAttribute() != null && h1Var.getUpgradeBackdropAttribute() != null && h1Var.getUpgradePatternAttribute() != null) {
            l1[] l1VarArr = this.S1;
            ((org.telegram.ui.Components.h6) l1VarArr[0].f5432c).c(h1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) l1VarArr[0].d).setText(l6.G1(h1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.h6) l1VarArr[1].f5432c).c(h1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) l1VarArr[1].d).c(ii.k.J0(h1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.h6) l1VarArr[2].f5432c).c(h1Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) l1VarArr[2].d).c(ii.k.J0(h1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void i1() {
        n1 n1Var;
        k1 k1Var;
        tj0 tj0Var = this.f36102l1;
        int childCount = tj0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt instanceof n1) && (k1Var = (n1Var = (n1) childAt).f5584w) != null) {
                boolean f12 = f1(k1Var);
                n1Var.f5578c.f(f12, true);
                n1Var.f5582r.a(f12, true);
            }
        }
    }

    @Override
    public final void p0() {
        int i3;
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            i3 = windowInsets.getSystemWindowInsetBottom();
        } else {
            i3 = 0;
        }
        if (this.f5737q2 != i3) {
            this.f5737q2 = i3;
            this.f36102l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + i3);
            o1 o1Var = this.c2;
            ((ViewGroup.MarginLayoutParams) o1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.f5737q2;
            o1Var.requestLayout();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.f5738r2) {
                this.f5738r2 = d12;
                v0(d12);
                View view = this.f5730j2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, 160), d12 & 16777215});
                }
            }
            o1 o1Var = this.c2;
            if (o1Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Kl;
                org.telegram.ui.ActionBar.e6 e6Var = o1Var.f5670r;
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                o1Var.f54542e.setColor(r12);
                o1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.Y0.g();
    }
}
