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
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.qc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.n40;
public final class i1 extends org.telegram.ui.Components.ja {
    public static final int f8762w2 = 0;
    public final int T1;
    public final LinearLayout U1;
    public final e1[] V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final com.google.android.gms.common.api.internal.p f8763a2;
    public final com.google.android.gms.common.api.internal.p f8764b2;
    public final com.google.android.gms.common.api.internal.p f8765c2;
    public final oy d2;
    public final z0 f8766e2;
    public final h1 f8767f2;
    public b1 f8768g2;
    public final FrameLayout f8769h2;
    public final ImageView f8770i2;
    public final ImageView f8771j2;
    public final a1 f8772k2;
    public final TextView f8773l2;
    public final View f8774m2;
    public final dh.g f8775n2;
    public final dh.c f8776o2;
    public d1 f8777p2;
    public final boolean f8778q2;
    public boolean f8779r2;
    public final dh.k f8780s2;
    public int f8781t2;
    public int f8782u2;
    public int f8783v2;

    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, e6Var);
        int i10;
        int L;
        this.f8783v2 = 1;
        this.T1 = i7;
        this.f8778q2 = z10;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.W1 = c10;
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(c10);
        this.f8763a2 = pVar;
        pVar.f6062b = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.X1 = c11;
        com.google.android.gms.common.api.internal.p pVar2 = new com.google.android.gms.common.api.internal.p(c11);
        this.f8764b2 = pVar2;
        pVar2.f6062b = false;
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
        List.EL.sort(this.W1, Comparator$CC.comparingDouble(new x0(0)));
        List.EL.sort(this.X1, Comparator$CC.comparingDouble(new x0(1)));
        List.EL.sort(this.Y1, Comparator$CC.comparingDouble(new x0(2)));
        List.EL.sort(this.Z1, Comparator$CC.comparingDouble(new x0(2)));
        com.google.android.gms.common.api.internal.p pVar3 = new com.google.android.gms.common.api.internal.p(this.Y1);
        this.f8765c2 = pVar3;
        pVar3.f6062b = false;
        ViewParent parent = this.f35932p1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f35932p1);
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f29721x = true;
        int d12 = d1();
        this.f8782u2 = d12;
        v0(d12);
        O();
        ui.c d = this.Y0.d(new y0(this));
        if (Build.VERSION.SDK_INT >= 31 && gz.f()) {
            dh.g gVar = new dh.g(false);
            this.f8775n2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f58440f = d;
            fVar.d = gVar;
            fVar.f58439e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f8776o2 = cVar;
            cVar.f8100k = true;
            if (qc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8095e = L;
        } else {
            this.f8775n2 = null;
            this.f8776o2 = new dh.c(d, d, d);
        }
        this.f8776o2.f8099j = this.Y0;
        oy oyVar = new oy(3, false);
        this.d2 = oyVar;
        oyVar.O = new bi.y1(this, 4);
        this.f35931o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.f35931o1.setClipToPadding(false);
        this.f35931o1.setLayoutManager(oyVar);
        this.f35931o1.setSelectorType(9);
        this.f35931o1.setSelectorDrawableColor(0);
        this.f35931o1.j(new bi.z4(this, 7));
        this.Y0.b(this.f35931o1);
        ?? kVar = new v4.k();
        this.f8766e2 = kVar;
        kVar.C = false;
        kVar.f58564m = false;
        kVar.n(280L);
        kVar.o(er.h);
        kVar.D = 30L;
        this.f35931o1.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8769h2 = frameLayout;
        frameLayout.setClipChildren(false);
        a1 a1Var = new a1(this, context, e6Var, new ch.w(this, 11), new bi.o(4), new bi.o(4), new bi.o(4), new bi.o(4), new bi.o(4), new bi.o(4));
        this.f8772k2 = a1Var;
        a1Var.d(new b5(1, 1));
        a1Var.setPreviewingAttributes(arrayList);
        a1Var.removeView(a1Var.Q);
        int i12 = -1;
        frameLayout.addView(a1Var, c8.ja.c(-1.0f, -1));
        int i13 = this.f29717u0;
        frameLayout.setPadding(i13, 0, i13, 0);
        ImageView imageView = new ImageView(context);
        this.f8770i2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(2131231240);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 13));
        c8.na.a(imageView);
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f8771j2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(2131231114);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ai.v2(10, this, arrayList));
        c8.na.a(imageView2);
        frameLayout.addView(imageView2, c8.ja.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i14 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f8773l2 = k10;
        i5.c.w(k10, 1, 13.0f, null, 2131750061);
        k10.setGravity(17);
        int i15 = -1879048193;
        k10.setTextColor(-1879048193);
        frameLayout.addView(k10, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V1 = new e1[3];
        this.f8767f2 = new h1(context, e6Var, new ai.g0(this, 9));
        int i16 = 0;
        while (true) {
            e1[] e1VarArr = this.V1;
            if (i16 < e1VarArr.length) {
                e1 e1Var = new e1(context);
                e1Var.setClipChildren(false);
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
                e1Var.f8442c = h6Var;
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                h6Var.setTextColor(i12);
                h6Var.setGravity(i14);
                e1Var.addView(h6Var, c8.ja.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                e1Var.f8441b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i15);
                textView2.setGravity(i14);
                e1Var.addView(textView2, c8.ja.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
                e1Var.d = h6Var2;
                h6Var2.setTypeface(org.telegram.messenger.g0.o());
                h6Var2.setTextColor(i12);
                h6Var2.setGravity(5);
                h6Var2.getDrawable().U = true;
                h6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                h6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
                h6Var2.setSizeableBackground(new m5(org.telegram.messenger.g0.L(10.0f), 285212671));
                e1Var.addView(h6Var2, c8.ja.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                e1VarArr[i16] = e1Var;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            ((TextView) this.V1[i16].f8441b).setText(hd.M0(2131749624, null));
                        }
                    } else {
                        ((TextView) this.V1[i16].f8441b).setText(hd.M0(2131749643, null));
                    }
                } else {
                    ((TextView) this.V1[i16].f8441b).setText(hd.M0(2131749626, null));
                }
                c8.na.a(this.V1[i16]);
                this.V1[i16].setOnClickListener(new ci.q(this, i16, 1));
                this.V1[i16].setBackground(org.telegram.ui.ActionBar.j6.b0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.U1;
                e1[] e1VarArr2 = this.V1;
                e1 e1Var2 = e1VarArr2[i16];
                if (i16 != e1VarArr2.length - 1) {
                    i10 = 11;
                } else {
                    i10 = 0;
                }
                linearLayout2.addView(e1Var2, c8.ja.q(0, 42, 1.0f, 7, 0, 0, i10, 0));
                i16++;
                i14 = 17;
                i12 = -1;
                i15 = -1879048193;
            } else {
                this.f8769h2.addView(this.U1, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.f29682b.addView(this.f8769h2, c8.ja.e(-1, 315, 55));
                int d13 = d1();
                View view = new View(context);
                this.f8774m2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, 160), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.ja.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.f23605m;
                this.f29682b.addView(view, e10);
                this.f8767f2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.f8776o2.c(this.f8767f2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
                this.f8767f2.setBackground(c12);
                this.f29682b.addView(this.f8767f2, c8.ja.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f8777p2 = new d1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f8768g2.O(false);
                h1(false);
                uj0 uj0Var = this.f35931o1;
                ViewGroup viewGroup = this.f29682b;
                Objects.requireNonNull(uj0Var);
                this.f8780s2 = new dh.k(uj0Var, viewGroup, new n40(uj0Var, 0));
                this.Y0.i(this.f29682b);
                ri.q qVar = this.Y0;
                qVar.f56120a = new y0(this);
                qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
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
    public final tj0 L0(uj0 uj0Var) {
        b1 b1Var = new b1(this, this.f35931o1, getContext(), this.T1, new bi.b(this, 16), this.J0);
        this.f8768g2 = b1Var;
        b1Var.f38199r = false;
        return b1Var;
    }

    @Override
    public final uj0 M0(Context context) {
        return new c1(this, context, this.J0, 0);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final boolean Y(float f10, float f11) {
        FrameLayout frameLayout = this.f8769h2;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0));
    }

    public final boolean f1(d1 d1Var) {
        if (this.f8783v2 != 1) {
            int i7 = this.f8767f2.f8684s;
            d1 d1Var2 = this.f8777p2;
            if (d1Var2 != null) {
                if (i7 == 1) {
                    if (d1Var.f8384a != d1Var2.f8384a) {
                        return false;
                    }
                } else if (i7 == 2) {
                    if (d1Var.f8385b != d1Var2.f8385b) {
                        return false;
                    }
                } else if (i7 != 0 || d1Var.f8386c != d1Var2.f8386c) {
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
        if (this.f8783v2 == i7) {
            return;
        }
        this.f8783v2 = i7;
        if (i7 == 2) {
            i10 = 2131231115;
        } else {
            i10 = 2131231114;
        }
        this.f8771j2.setImageResource(i10);
        if (i7 == 2) {
            i11 = 2131750060;
        } else {
            i11 = 2131750061;
        }
        this.f8773l2.setText(hd.M0(i11, null));
        i1();
    }

    public final void h1(boolean z10) {
        a1 a1Var = this.f8772k2;
        if (a1Var.getUpgradeImageViewAttribute() != null && a1Var.getUpgradeBackdropAttribute() != null && a1Var.getUpgradePatternAttribute() != null) {
            e1[] e1VarArr = this.V1;
            ((org.telegram.ui.Components.h6) e1VarArr[0].f8442c).c(a1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) e1VarArr[0].d).setText(c6.G1(a1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.h6) e1VarArr[1].f8442c).c(a1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) e1VarArr[1].d).c(ki.k.J0(a1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.h6) e1VarArr[2].f8442c).c(a1Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.h6) e1VarArr[2].d).c(ki.k.J0(a1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void i1() {
        g1 g1Var;
        d1 d1Var;
        uj0 uj0Var = this.f35931o1;
        int childCount = uj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = uj0Var.getChildAt(i7);
            if ((childAt instanceof g1) && (d1Var = (g1Var = (g1) childAt).f8603w) != null) {
                boolean f12 = f1(d1Var);
                g1Var.f8597c.f(f12, true);
                g1Var.f8601r.a(f12, true);
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
        if (this.f8781t2 != i7) {
            this.f8781t2 = i7;
            this.f35931o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + i7);
            h1 h1Var = this.f8767f2;
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.f8781t2;
            h1Var.requestLayout();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.f8782u2) {
                this.f8782u2 = d12;
                v0(d12);
                View view = this.f8774m2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, 160), d12 & 16777215});
                }
            }
            h1 h1Var = this.f8767f2;
            if (h1Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Nl;
                org.telegram.ui.ActionBar.e6 e6Var = h1Var.f8683r;
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.09411765f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                org.telegram.ui.ActionBar.j6.r1(0.1254902f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                h1Var.f55596e.setColor(r12);
                h1Var.invalidate();
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
