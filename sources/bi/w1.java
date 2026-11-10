package bi;

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
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.q40;
public final class w1 extends org.telegram.ui.Components.ma {
    public static final int f4933v2 = 0;
    public final int S1;
    public final LinearLayout T1;
    public final s1[] U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final a Z1;
    public final a f4934a2;
    public final a f4935b2;
    public final jy f4936c2;
    public final n1 d2;
    public final v1 f4937e2;
    public p1 f4938f2;
    public final FrameLayout f4939g2;
    public final ImageView f4940h2;
    public final ImageView f4941i2;
    public final o1 f4942j2;
    public final TextView f4943k2;
    public final View f4944l2;
    public final dh.g f4945m2;
    public final dh.c f4946n2;
    public r1 f4947o2;
    public final boolean f4948p2;
    public boolean f4949q2;
    public final dh.k f4950r2;
    public int f4951s2;
    public int f4952t2;
    public int f4953u2;

    public w1(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, String str, ArrayList arrayList, boolean z9) {
        super(context, null, false, false, h6Var);
        int i10;
        int L;
        this.f4953u2 = 1;
        this.S1 = i7;
        this.f4948p2 = z9;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.V1 = c10;
        a aVar = new a(c10);
        this.Z1 = aVar;
        aVar.f3412a = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.W1 = c11;
        a aVar2 = new a(c11);
        this.f4934a2 = aVar2;
        aVar2.f3412a = false;
        this.X1 = cg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Y1 = arrayList2;
        if (z9) {
            int i11 = 0;
            while (i11 < this.X1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.X1.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Y1.add(stargiftattributemodel);
                    this.X1.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.V1, Comparator$CC.comparingDouble(new j1(0)));
        List.EL.sort(this.W1, Comparator$CC.comparingDouble(new j1(1)));
        List.EL.sort(this.X1, Comparator$CC.comparingDouble(new j1(2)));
        List.EL.sort(this.Y1, Comparator$CC.comparingDouble(new j1(2)));
        a aVar3 = new a(this.X1);
        this.f4935b2 = aVar3;
        aVar3.f3412a = false;
        ViewParent parent = this.f35902o1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f35902o1);
        }
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(6.0f);
        this.f28710x = true;
        int d12 = d1();
        this.f4952t2 = d12;
        v0(d12);
        N();
        ri.c d = this.X0.d(new m1(this));
        if (Build.VERSION.SDK_INT >= 31 && iz.f()) {
            dh.g gVar = new dh.g(false);
            this.f4945m2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f54584f = d;
            fVar.d = gVar;
            fVar.f54583e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f4946n2 = cVar;
            cVar.f8713k = true;
            if (org.telegram.messenger.sc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8708e = L;
        } else {
            this.f4945m2 = null;
            this.f4946n2 = new dh.c(d, d, d);
        }
        this.f4946n2.f8712j = this.X0;
        jy jyVar = new jy(3, false);
        this.f4936c2 = jyVar;
        jyVar.O = new ai.l(this, 1);
        this.n1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.n1.setClipToPadding(false);
        this.n1.setLayoutManager(jyVar);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.j(new ai.b(this, 3));
        this.X0.b(this.n1);
        ?? kVar = new v4.k();
        this.d2 = kVar;
        kVar.C = false;
        kVar.f57079m = false;
        kVar.n(280L);
        kVar.o(wq.h);
        kVar.D = 30L;
        this.n1.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4939g2 = frameLayout;
        frameLayout.setClipChildren(false);
        o1 o1Var = new o1(this, context, h6Var, new a3.f(this, 20), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0));
        this.f4942j2 = o1Var;
        o1Var.d(new g6(1, 1));
        o1Var.setPreviewingAttributes(arrayList);
        o1Var.removeView(o1Var.P);
        frameLayout.addView(o1Var, c8.ha.c(-1.0f, -1));
        int i12 = this.f28705t0;
        frameLayout.setPadding(i12, 0, i12, 0);
        ImageView imageView = new ImageView(context);
        this.f4940h2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 6));
        c8.ka.a(imageView);
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f4941i2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(2131231114);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new r(3, this, arrayList));
        c8.ka.a(imageView2);
        frameLayout.addView(imageView2, c8.ha.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i13 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView i14 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f4943k2 = i14;
        jg.g.v(i14, 1, 13.0f, null, 2131750061);
        i14.setGravity(17);
        int i15 = -1879048193;
        i14.setTextColor(-1879048193);
        frameLayout.addView(i14, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.U1 = new s1[3];
        int i16 = 5;
        this.f4937e2 = new v1(context, h6Var, new ai.i(this, 5));
        int i17 = 0;
        while (true) {
            s1[] s1VarArr = this.U1;
            if (i17 < s1VarArr.length) {
                s1 s1Var = new s1(context);
                s1Var.setClipChildren(false);
                org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
                s1Var.f4663c = i6Var;
                i6Var.setTypeface(org.telegram.messenger.g0.o());
                i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                i6Var.setTextColor(-1);
                i6Var.setGravity(i13);
                s1Var.addView(i6Var, c8.ha.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                s1Var.f4662b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i15);
                textView2.setGravity(i13);
                s1Var.addView(textView2, c8.ha.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, false, false);
                s1Var.d = i6Var2;
                i6Var2.setTypeface(org.telegram.messenger.g0.o());
                i6Var2.setTextColor(-1);
                i6Var2.setGravity(i16);
                i6Var2.getDrawable().T = true;
                i6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
                i6Var2.setSizeableBackground(new t6(org.telegram.messenger.g0.L(10.0f), 285212671));
                s1Var.addView(i6Var2, c8.ha.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                s1VarArr[i17] = s1Var;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            ((TextView) this.U1[i17].f4662b).setText(org.telegram.messenger.id.M0(2131749624, null));
                        }
                    } else {
                        ((TextView) this.U1[i17].f4662b).setText(org.telegram.messenger.id.M0(2131749643, null));
                    }
                } else {
                    ((TextView) this.U1[i17].f4662b).setText(org.telegram.messenger.id.M0(2131749626, null));
                }
                c8.ka.a(this.U1[i17]);
                this.U1[i17].setOnClickListener(new ai.v(this, i17, 1));
                this.U1[i17].setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.T1;
                s1[] s1VarArr2 = this.U1;
                s1 s1Var2 = s1VarArr2[i17];
                if (i17 != s1VarArr2.length - 1) {
                    i10 = 11;
                } else {
                    i10 = 0;
                }
                linearLayout2.addView(s1Var2, c8.ha.q(0, 42, 1.0f, 7, 0, 0, i10, 0));
                i17++;
                i13 = 17;
                i15 = -1879048193;
                i16 = 5;
            } else {
                this.f4939g2.addView(this.T1, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.f28672b.addView(this.f4939g2, c8.ha.e(-1, 315, 55));
                int d13 = d1();
                View view = new View(context);
                this.f4944l2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, 160), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.f22561m;
                this.f28672b.addView(view, e10);
                this.f4937e2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.f4946n2.c(this.f4937e2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.m6.f27890d6, h6Var));
                this.f4937e2.setBackground(c12);
                this.f28672b.addView(this.f4937e2, c8.ha.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f4947o2 = new r1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f4938f2.O(false);
                h1(false);
                pj0 pj0Var = this.n1;
                ViewGroup viewGroup = this.f28672b;
                Objects.requireNonNull(pj0Var);
                this.f4950r2 = new dh.k(pj0Var, viewGroup, new q40(pj0Var, 0));
                this.X0.i(this.f28672b);
                oi.q qVar = this.X0;
                qVar.f21104a = new m1(this);
                qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
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
    public final oj0 L0(pj0 pj0Var) {
        p1 p1Var = new p1(this, this.n1, getContext(), this.S1, new ai.e(this, 5), this.I0);
        this.f4938f2 = p1Var;
        p1Var.f35845r = false;
        return p1Var;
    }

    @Override
    public final pj0 M0(Context context) {
        return new q1(this, context, this.I0, 0);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.f4939g2;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27981i5, this.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0));
    }

    public final boolean f1(r1 r1Var) {
        if (this.f4953u2 != 1) {
            int i7 = this.f4937e2.f4863s;
            r1 r1Var2 = this.f4947o2;
            if (r1Var2 != null) {
                if (i7 == 1) {
                    if (r1Var.f4604a != r1Var2.f4604a) {
                        return false;
                    }
                } else if (i7 == 2) {
                    if (r1Var.f4605b != r1Var2.f4605b) {
                        return false;
                    }
                } else if (i7 != 0 || r1Var.f4606c != r1Var2.f4606c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g1(int i7) {
        int i10;
        int i11;
        if (this.f4953u2 == i7) {
            return;
        }
        this.f4953u2 = i7;
        if (i7 == 2) {
            i10 = 2131231115;
        } else {
            i10 = 2131231114;
        }
        this.f4941i2.setImageResource(i10);
        if (i7 == 2) {
            i11 = 2131750060;
        } else {
            i11 = 2131750061;
        }
        this.f4943k2.setText(org.telegram.messenger.id.M0(i11, null));
        i1();
    }

    public final void h1(boolean z9) {
        o1 o1Var = this.f4942j2;
        if (o1Var.getUpgradeImageViewAttribute() != null && o1Var.getUpgradeBackdropAttribute() != null && o1Var.getUpgradePatternAttribute() != null) {
            s1[] s1VarArr = this.U1;
            ((org.telegram.ui.Components.i6) s1VarArr[0].f4663c).c(o1Var.getUpgradeImageViewAttribute().name, z9, true);
            ((org.telegram.ui.Components.i6) s1VarArr[0].d).setText(k7.F1(o1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.i6) s1VarArr[1].f4663c).c(o1Var.getUpgradeBackdropAttribute().name, z9, true);
            ((org.telegram.ui.Components.i6) s1VarArr[1].d).c(hi.j.J0(o1Var.getUpgradeBackdropAttribute().getRarityPermille()), z9, true);
            ((org.telegram.ui.Components.i6) s1VarArr[2].f4663c).c(o1Var.getUpgradePatternAttribute().name, z9, true);
            ((org.telegram.ui.Components.i6) s1VarArr[2].d).c(hi.j.J0(o1Var.getUpgradePatternAttribute().getRarityPermille()), z9, true);
        }
    }

    public final void i1() {
        u1 u1Var;
        r1 r1Var;
        pj0 pj0Var = this.n1;
        int childCount = pj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = pj0Var.getChildAt(i7);
            if ((childAt instanceof u1) && (r1Var = (u1Var = (u1) childAt).f4791w) != null) {
                boolean f12 = f1(r1Var);
                u1Var.f4785c.f(f12, true);
                u1Var.f4789r.a(f12, true);
            }
        }
    }

    @Override
    public final void p0() {
        int i7;
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            i7 = windowInsets.getSystemWindowInsetBottom();
        } else {
            i7 = 0;
        }
        if (this.f4951s2 != i7) {
            this.f4951s2 = i7;
            this.n1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + i7);
            v1 v1Var = this.f4937e2;
            ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.f4951s2;
            v1Var.requestLayout();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.f4952t2) {
                this.f4952t2 = d12;
                v0(d12);
                View view = this.f4944l2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, 160), d12 & 16777215});
                }
            }
            v1 v1Var = this.f4937e2;
            if (v1Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Kl;
                org.telegram.ui.ActionBar.h6 h6Var = v1Var.f4862r;
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.09411765f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                org.telegram.ui.ActionBar.m6.r1(0.1254902f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                v1Var.f54163e.setColor(r12);
                v1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.X0.g();
    }
}
