package di;

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
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.pc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.uy;
import org.telegram.ui.q40;
public final class h1 extends org.telegram.ui.Components.sa {
    public static final int f8893w2 = 0;
    public final int T1;
    public final LinearLayout U1;
    public final d1[] V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final com.google.android.gms.common.api.internal.p f8894a2;
    public final com.google.android.gms.common.api.internal.p f8895b2;
    public final com.google.android.gms.common.api.internal.p f8896c2;
    public final uy d2;
    public final y0 f8897e2;
    public final g1 f8898f2;
    public a1 f8899g2;
    public final FrameLayout f8900h2;
    public final ImageView f8901i2;
    public final ImageView f8902j2;
    public final z0 f8903k2;
    public final TextView f8904l2;
    public final View f8905m2;
    public final dh.g f8906n2;
    public final dh.c f8907o2;
    public c1 f8908p2;
    public final boolean f8909q2;
    public boolean f8910r2;
    public final dh.k f8911s2;
    public int f8912t2;
    public int f8913u2;
    public int f8914v2;

    public h1(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, i6Var);
        int i10;
        int L;
        this.f8914v2 = 1;
        this.T1 = i7;
        this.f8909q2 = z10;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.W1 = c10;
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(c10);
        this.f8894a2 = pVar;
        pVar.f6342b = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.X1 = c11;
        com.google.android.gms.common.api.internal.p pVar2 = new com.google.android.gms.common.api.internal.p(c11);
        this.f8895b2 = pVar2;
        pVar2.f6342b = false;
        this.Y1 = cg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Z1 = arrayList2;
        if (z10) {
            int i11 = 0;
            while (i11 < this.Y1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Y1.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Z1.add(stargiftattributemodel);
                    this.Y1.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.W1, Comparator$CC.comparingDouble(new w0(0)));
        List.EL.sort(this.X1, Comparator$CC.comparingDouble(new w0(1)));
        List.EL.sort(this.Y1, Comparator$CC.comparingDouble(new w0(2)));
        List.EL.sort(this.Z1, Comparator$CC.comparingDouble(new w0(2)));
        com.google.android.gms.common.api.internal.p pVar3 = new com.google.android.gms.common.api.internal.p(this.Y1);
        this.f8896c2 = pVar3;
        pVar3.f6342b = false;
        ViewParent parent = this.f39535p1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f39535p1);
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f30229x = true;
        int e12 = e1();
        this.f8913u2 = e12;
        v0(e12);
        O();
        ui.c d = this.Y0.d(new x0(this));
        if (Build.VERSION.SDK_INT >= 31 && bz.f()) {
            dh.g gVar = new dh.g(false);
            this.f8906n2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f59008f = d;
            fVar.d = gVar;
            fVar.f59007e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f8907o2 = cVar;
            cVar.f8379k = true;
            if (pc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8374e = L;
        } else {
            this.f8906n2 = null;
            this.f8907o2 = new dh.c(d, d, d);
        }
        this.f8907o2.f8378j = this.Y0;
        uy uyVar = new uy(3, false);
        this.d2 = uyVar;
        uyVar.O = new bi.s2(this, 4);
        this.f39534o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.f39534o1.setClipToPadding(false);
        this.f39534o1.setLayoutManager(uyVar);
        this.f39534o1.setSelectorType(9);
        this.f39534o1.setSelectorDrawableColor(0);
        this.f39534o1.j(new bi.q1(this, 8));
        this.Y0.b(this.f39534o1);
        ?? kVar = new v4.k();
        this.f8897e2 = kVar;
        kVar.C = false;
        kVar.f59152m = false;
        kVar.n(280L);
        kVar.o(lr.h);
        kVar.D = 30L;
        this.f39534o1.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8900h2 = frameLayout;
        frameLayout.setClipChildren(false);
        z0 z0Var = new z0(this, context, i6Var, new ca.r(this, 15), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6));
        this.f8903k2 = z0Var;
        z0Var.d(new e5(1, 1));
        z0Var.setPreviewingAttributes(arrayList);
        z0Var.removeView(z0Var.Q);
        int i12 = -1;
        frameLayout.addView(z0Var, c8.ma.c(-1.0f, -1));
        int i13 = this.f30225u0;
        frameLayout.setPadding(i13, 0, i13, 0);
        ImageView imageView = new ImageView(context);
        this.f8901i2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 15));
        c8.ra.a(imageView);
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f8902j2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(2131231114);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ai.v2(12, this, arrayList));
        c8.ra.a(imageView2);
        frameLayout.addView(imageView2, c8.ma.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i14 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f8904l2 = m10;
        float f10 = 13.0f;
        i5.c.r(13.0f, 1, 2131750045, m10, null);
        m10.setGravity(17);
        int i15 = -1879048193;
        m10.setTextColor(-1879048193);
        frameLayout.addView(m10, c8.ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V1 = new d1[3];
        this.f8898f2 = new g1(context, i6Var, new ai.g0(this, 10));
        int i16 = 0;
        while (true) {
            d1[] d1VarArr = this.V1;
            float f11 = f10;
            if (i16 < d1VarArr.length) {
                d1 d1Var = new d1(context);
                d1Var.setClipChildren(false);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
                d1Var.f8643c = n6Var;
                n6Var.setTypeface(org.telegram.messenger.g0.o());
                n6Var.setTextSize(org.telegram.messenger.g0.L(f11));
                n6Var.setTextColor(i12);
                n6Var.setGravity(i14);
                d1Var.addView(n6Var, c8.ma.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                d1Var.f8642b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i15);
                textView2.setGravity(i14);
                d1Var.addView(textView2, c8.ma.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, false, false);
                d1Var.d = n6Var2;
                n6Var2.setTypeface(org.telegram.messenger.g0.o());
                n6Var2.setTextColor(i12);
                n6Var2.setGravity(5);
                n6Var2.getDrawable().U = true;
                n6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                n6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
                n6Var2.setSizeableBackground(new p5(org.telegram.messenger.g0.L(10.0f), 285212671));
                d1Var.addView(n6Var2, c8.ma.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                d1VarArr[i16] = d1Var;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            ((TextView) this.V1[i16].f8642b).setText(gd.M0(2131749452, null));
                        }
                    } else {
                        ((TextView) this.V1[i16].f8642b).setText(gd.M0(2131749471, null));
                    }
                } else {
                    ((TextView) this.V1[i16].f8642b).setText(gd.M0(2131749454, null));
                }
                c8.ra.a(this.V1[i16]);
                this.V1[i16].setOnClickListener(new ci.q(this, i16, 1));
                this.V1[i16].setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.U1;
                d1[] d1VarArr2 = this.V1;
                d1 d1Var2 = d1VarArr2[i16];
                if (i16 != d1VarArr2.length - 1) {
                    i10 = 11;
                } else {
                    i10 = 0;
                }
                linearLayout2.addView(d1Var2, c8.ma.q(0, 42, 1.0f, 7, 0, 0, i10, 0));
                i16++;
                f10 = f11;
                i14 = 17;
                i12 = -1;
                i15 = -1879048193;
            } else {
                this.f8900h2.addView(this.U1, c8.ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.f30190b.addView(this.f8900h2, c8.ma.e(-1, 315, 55));
                int e13 = e1();
                View view = new View(context);
                this.f8905m2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(e13, 160), e13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.ma.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.f24112m;
                this.f30190b.addView(view, e10);
                this.f8898f2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.f8907o2.c(this.f8898f2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.n6.f29394d6, i6Var));
                this.f8898f2.setBackground(c12);
                this.f30190b.addView(this.f8898f2, c8.ma.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f8908p2 = new c1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f8899g2.O(false);
                i1(false);
                ck0 ck0Var = this.f39534o1;
                ViewGroup viewGroup = this.f30190b;
                Objects.requireNonNull(ck0Var);
                this.f8911s2 = new dh.k(ck0Var, viewGroup, new q40(ck0Var, 0));
                this.Y0.i(this.f30190b);
                ri.q qVar = this.Y0;
                qVar.f56694a = new x0(this);
                qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
        }
    }

    public static double f1(TL_stars.StarGiftAttribute starGiftAttribute) {
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
    public final bk0 M0(ck0 ck0Var) {
        a1 a1Var = new a1(this, this.f39534o1, getContext(), this.T1, new bi.b(this, 16), this.J0);
        this.f8899g2 = a1Var;
        a1Var.f42809r = false;
        return a1Var;
    }

    @Override
    public final ck0 N0(Context context) {
        return new b1(this, context, this.J0, 0);
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final boolean Y(float f10, float f11) {
        FrameLayout frameLayout = this.f8900h2;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    public final int e1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29485i5, this.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.J0));
    }

    public final boolean g1(c1 c1Var) {
        if (this.f8914v2 != 1) {
            int i7 = this.f8898f2.f8849s;
            c1 c1Var2 = this.f8908p2;
            if (c1Var2 != null) {
                if (i7 == 1) {
                    if (c1Var.f8588a != c1Var2.f8588a) {
                        return false;
                    }
                } else if (i7 == 2) {
                    if (c1Var.f8589b != c1Var2.f8589b) {
                        return false;
                    }
                } else if (i7 != 0 || c1Var.f8590c != c1Var2.f8590c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(int i7) {
        int i10;
        int i11;
        if (this.f8914v2 == i7) {
            return;
        }
        this.f8914v2 = i7;
        if (i7 == 2) {
            i10 = 2131231115;
        } else {
            i10 = 2131231114;
        }
        this.f8902j2.setImageResource(i10);
        if (i7 == 2) {
            i11 = 2131750044;
        } else {
            i11 = 2131750045;
        }
        this.f8904l2.setText(gd.M0(i11, null));
        j1();
    }

    public final void i1(boolean z10) {
        z0 z0Var = this.f8903k2;
        if (z0Var.getUpgradeImageViewAttribute() != null && z0Var.getUpgradeBackdropAttribute() != null && z0Var.getUpgradePatternAttribute() != null) {
            d1[] d1VarArr = this.V1;
            ((org.telegram.ui.Components.n6) d1VarArr[0].f8643c).c(z0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.n6) d1VarArr[0].d).setText(f6.L1(z0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.n6) d1VarArr[1].f8643c).c(z0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.n6) d1VarArr[1].d).c(ki.k.J0(z0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.n6) d1VarArr[2].f8643c).c(z0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.n6) d1VarArr[2].d).c(ki.k.J0(z0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void j1() {
        f1 f1Var;
        c1 c1Var;
        ck0 ck0Var = this.f39534o1;
        int childCount = ck0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ck0Var.getChildAt(i7);
            if ((childAt instanceof f1) && (c1Var = (f1Var = (f1) childAt).f8754w) != null) {
                boolean g12 = g1(c1Var);
                f1Var.f8748c.f(g12, true);
                f1Var.f8752r.a(g12, true);
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
        if (this.f8912t2 != i7) {
            this.f8912t2 = i7;
            this.f39534o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + i7);
            g1 g1Var = this.f8898f2;
            ((ViewGroup.MarginLayoutParams) g1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.f8912t2;
            g1Var.requestLayout();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int e12 = e1();
            if (e12 != this.f8913u2) {
                this.f8913u2 = e12;
                v0(e12);
                View view = this.f8905m2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(e12, 160), e12 & 16777215});
                }
            }
            g1 g1Var = this.f8898f2;
            if (g1Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Nl;
                org.telegram.ui.ActionBar.i6 i6Var = g1Var.f8848r;
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.09411765f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                org.telegram.ui.ActionBar.n6.r1(0.1254902f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                g1Var.f56170e.setColor(r12);
                g1Var.invalidate();
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
