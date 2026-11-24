package defpackage;

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
import org.telegram.tgnet.tl.TL_stars;
public final class kna extends fy0 {
    public final int S1;
    public final LinearLayout T1;
    public final eb0[] U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ee0 Z1;
    public final ee0 a2;
    public final ee0 b2;
    public final w64 c2;
    public final dna d2;
    public final jna e2;
    public fna f2;
    public final FrameLayout g2;
    public final ImageView h2;
    public final ImageView i2;
    public final ena j2;
    public final TextView k2;
    public final View l2;
    public final cq3 m2;
    public final kl0 n2;
    public gna o2;
    public final boolean p2;
    public boolean q2;
    public final mdc r2;
    public int s2;
    public int t2;
    public int u2;

    public kna(Context context, wjb wjbVar, int i, String str, ArrayList arrayList, boolean z) {
        super(context, null, false, false, wjbVar);
        kl0 kl0Var;
        int i2;
        int L;
        this.u2 = 1;
        this.S1 = i;
        this.p2 = z;
        ArrayList c = apb.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.V1 = c;
        ee0 ee0Var = new ee0(c);
        this.Z1 = ee0Var;
        ee0Var.b = false;
        ArrayList c2 = apb.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.W1 = c2;
        ee0 ee0Var2 = new ee0(c2);
        this.a2 = ee0Var2;
        ee0Var2.b = false;
        this.X1 = apb.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Y1 = arrayList2;
        if (z) {
            int i3 = 0;
            while (i3 < this.X1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.X1.get(i3);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Y1.add(stargiftattributemodel);
                    this.X1.remove(i3);
                    i3--;
                }
                i3++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.V1, Comparator$CC.comparingDouble(new mm7((byte) 3)));
        List.EL.sort(this.W1, Comparator$CC.comparingDouble(new mm7((byte) 4)));
        List.EL.sort(this.X1, Comparator$CC.comparingDouble(new mm7((byte) 5)));
        List.EL.sort(this.Y1, Comparator$CC.comparingDouble(new mm7((byte) 5)));
        ee0 ee0Var3 = new ee0(this.X1);
        this.b2 = ee0Var3;
        ee0Var3.b = false;
        ViewParent parent = this.o1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.o1);
        }
        this.F1 = false;
        this.E1 = gl.L(6.0f);
        this.x = true;
        int Y0 = Y0();
        this.t2 = Y0;
        s0(Y0);
        K();
        ix4 d = this.X0.d(new cna(this));
        if (Build.VERSION.SDK_INT >= 31 && gba.f()) {
            cq3 cq3Var = new cq3(false);
            this.m2 = cq3Var;
            this.X0.a(cq3Var);
            lx4 lx4Var = new lx4(d);
            lx4Var.f = d;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            this.n2 = kl0Var;
            kl0Var.k = true;
            if (e66.e(262144)) {
                L = gl.L(8.0f);
            } else {
                L = gl.L(48.0f);
            }
            kl0Var.d = L;
            kl0Var.e = L;
        } else {
            this.m2 = null;
            kl0 kl0Var2 = new kl0(d, d, d);
            this.n2 = kl0Var2;
            kl0Var = kl0Var2;
        }
        kl0Var.j = this.X0;
        w64 w64Var = new w64(3, false);
        this.c2 = w64Var;
        w64Var.O = new nq1(this, (byte) 17);
        this.n1.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(74.0f));
        this.n1.setClipToPadding(false);
        this.n1.setLayoutManager(w64Var);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.j(new n58(this, (byte) 24));
        this.X0.b(this.n1);
        ?? gb3Var = new gb3();
        this.d2 = gb3Var;
        gb3Var.C = false;
        gb3Var.m = false;
        gb3Var.n(280L);
        gb3Var.o(s33.h);
        gb3Var.D = (byte) 30;
        this.n1.setItemAnimator(gb3Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        frameLayout.setClipChildren(false);
        ena enaVar = new ena(this, context, wjbVar, new z6a(this, (byte) 14), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1));
        this.j2 = enaVar;
        enaVar.d(new xpa(1, 1));
        enaVar.setPreviewingAttributes(arrayList);
        enaVar.removeView(enaVar.Q);
        int i4 = -1;
        frameLayout.addView(enaVar, nme.c(-1.0f, -1));
        int i5 = this.u0;
        frameLayout.setPadding(i5, 0, i5, 0);
        ImageView imageView = new ImageView(context);
        this.h2 = imageView;
        imageView.setBackground(bkb.Z(0, 285212671, 16, 16));
        imageView.setImageResource(2131231243);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new bna(this, (byte) 0));
        ote.a(imageView);
        frameLayout.addView(imageView, nme.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.i2 = imageView2;
        imageView2.setBackground(bkb.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(2131231116);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new b99(this, arrayList, (byte) 11));
        ote.a(imageView2);
        frameLayout.addView(imageView2, nme.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i6 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.k2 = l;
        float f = 13.0f;
        ir2.r(13.0f, 1, 2131750045, l, null);
        l.setGravity(17);
        int i7 = -1879048193;
        l.setTextColor(-1879048193);
        frameLayout.addView(l, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.U1 = new eb0[3];
        this.e2 = new jna(context, wjbVar, new ae9(this, (byte) 7));
        int i8 = 0;
        while (true) {
            eb0[] eb0VarArr = this.U1;
            if (i8 < eb0VarArr.length) {
                eb0 eb0Var = new eb0(context);
                float f2 = f;
                eb0Var.setClipChildren(false);
                hn hnVar = new hn(context, true, false, false);
                eb0Var.c = hnVar;
                hnVar.setTypeface(gl.o());
                hnVar.setTextSize(gl.L(f2));
                hnVar.setTextColor(i4);
                hnVar.setGravity(i6);
                eb0Var.addView(hnVar, nme.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                eb0Var.b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i7);
                textView2.setGravity(i6);
                eb0Var.addView(textView2, nme.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                hn hnVar2 = new hn(context, false, false, false);
                eb0Var.d = hnVar2;
                hnVar2.setTypeface(gl.o());
                hnVar2.setTextColor(i4);
                hnVar2.setGravity(5);
                hnVar2.getDrawable().U = true;
                hnVar2.setTextSize(gl.L(11.0f));
                hnVar2.setPadding(gl.L(4.0f), gl.L(1.0f), gl.L(4.0f), gl.L(1.0f));
                hnVar2.setSizeableBackground(new iqa(gl.L(10.0f), 285212671));
                eb0Var.addView(hnVar2, nme.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                eb0VarArr[i8] = eb0Var;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            ((TextView) this.U1[i8].b).setText(k96.M0(2131749452, null));
                        }
                    } else {
                        ((TextView) this.U1[i8].b).setText(k96.M0(2131749471, null));
                    }
                } else {
                    ((TextView) this.U1[i8].b).setText(k96.M0(2131749454, null));
                }
                ote.a(this.U1[i8]);
                this.U1[i8].setOnClickListener(new v0(this, i8, (byte) 23));
                this.U1[i8].setBackground(bkb.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.T1;
                eb0[] eb0VarArr2 = this.U1;
                eb0 eb0Var2 = eb0VarArr2[i8];
                if (i8 != eb0VarArr2.length - 1) {
                    i2 = 11;
                } else {
                    i2 = 0;
                }
                linearLayout2.addView(eb0Var2, nme.q(0, 42, 1.0f, 7, 0, 0, i2, 0));
                i8++;
                f = f2;
                i4 = -1;
                i7 = -1879048193;
                i6 = 17;
            } else {
                this.g2.addView(this.T1, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.g2, nme.e(-1, 315, 55));
                int Y02 = Y0();
                View view = new View(context);
                this.l2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bm2.o(Y02, 160), Y02 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = nme.e(-1, 0, 48);
                e.height = gl.m;
                this.b.addView(view, e);
                this.e2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                il0 c3 = this.n2.c(this.e2, null, false);
                c3.q(gl.L(4.0f));
                c3.r(gl.L(28.0f));
                c3.p(new bl0(bkb.c6, wjbVar));
                this.e2.setBackground(c3);
                this.b.addView(this.e2, nme.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.o2 = new gna((TL_stars.starGiftAttributeBackdrop) apb.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) apb.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) apb.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f2.O(false);
                c1(false);
                o39 o39Var = this.n1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(o39Var);
                this.r2 = new mdc(o39Var, viewGroup, new ga5(o39Var, (byte) 0));
                this.X0.i(this.b);
                qw4 qw4Var = this.X0;
                qw4Var.a = new cna(this);
                qw4Var.d = new ax4(gl.L(48.0f));
                return;
            }
        }
    }

    public static double Z0(TL_stars.StarGiftAttribute starGiftAttribute) {
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
    public final n39 G0(o39 o39Var) {
        fna fnaVar = new fna(this, this.n1, getContext(), this.S1, new tf8(this, (byte) 23), this.J0);
        this.f2 = fnaVar;
        fnaVar.r = false;
        return fnaVar;
    }

    @Override
    public final o39 H0(Context context) {
        return new ns9(this, context, this.J0, (byte) 4);
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public final boolean U(float f, float f2) {
        FrameLayout frameLayout = this.g2;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f2) {
            return true;
        }
        return false;
    }

    public final int Y0() {
        return bm2.f(0.1f, bkb.v0(bkb.h5, this.J0), bkb.v0(bkb.g5, this.J0));
    }

    public final boolean a1(gna gnaVar) {
        if (this.u2 != 1) {
            int i = this.e2.s;
            gna gnaVar2 = this.o2;
            if (gnaVar2 != null) {
                if (i == 1) {
                    if (gnaVar.a != gnaVar2.a) {
                        return false;
                    }
                } else if (i == 2) {
                    if (gnaVar.b != gnaVar2.b) {
                        return false;
                    }
                } else if (i != 0 || gnaVar.c != gnaVar2.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b1(int i) {
        int i2;
        int i3;
        if (this.u2 == i) {
            return;
        }
        this.u2 = i;
        if (i == 2) {
            i2 = 2131231117;
        } else {
            i2 = 2131231116;
        }
        this.i2.setImageResource(i2);
        if (i == 2) {
            i3 = 2131750044;
        } else {
            i3 = 2131750045;
        }
        this.k2.setText(k96.M0(i3, null));
        d1();
    }

    public final void c1(boolean z) {
        ena enaVar = this.j2;
        if (enaVar.getUpgradeImageViewAttribute() != null && enaVar.getUpgradeBackdropAttribute() != null && enaVar.getUpgradePatternAttribute() != null) {
            eb0[] eb0VarArr = this.U1;
            ((hn) eb0VarArr[0].c).c(enaVar.getUpgradeImageViewAttribute().name, z, true);
            ((hn) eb0VarArr[0].d).setText(vqa.z1(enaVar.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((hn) eb0VarArr[1].c).c(enaVar.getUpgradeBackdropAttribute().name, z, true);
            ((hn) eb0VarArr[1].d).c(bc.I0(enaVar.getUpgradeBackdropAttribute().getRarityPermille()), z, true);
            ((hn) eb0VarArr[2].c).c(enaVar.getUpgradePatternAttribute().name, z, true);
            ((hn) eb0VarArr[2].d).c(bc.I0(enaVar.getUpgradePatternAttribute().getRarityPermille()), z, true);
        }
    }

    public final void d1() {
        ina inaVar;
        gna gnaVar;
        o39 o39Var = this.n1;
        int childCount = o39Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = o39Var.getChildAt(i);
            if ((childAt instanceof ina) && (gnaVar = (inaVar = (ina) childAt).w) != null) {
                boolean a1 = a1(gnaVar);
                inaVar.c.f(a1, true);
                inaVar.r.a(a1, true);
            }
        }
    }

    @Override
    public final void m0() {
        int i;
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            i = windowInsets.getSystemWindowInsetBottom();
        } else {
            i = 0;
        }
        if (this.s2 != i) {
            this.s2 = i;
            this.n1.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(74.0f) + i);
            jna jnaVar = this.e2;
            ((ViewGroup.MarginLayoutParams) jnaVar.getLayoutParams()).bottomMargin = gl.L(5.0f) + this.s2;
            jnaVar.requestLayout();
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int Y0 = Y0();
            if (Y0 != this.t2) {
                this.t2 = Y0;
                s0(Y0);
                View view = this.l2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{bm2.o(Y0, 160), Y0 & 16777215});
                }
            }
            jna jnaVar = this.e2;
            if (jnaVar != null) {
                int i = bkb.Ml;
                wjb wjbVar = jnaVar.r;
                int p1 = bkb.p1(0.09411765f, bkb.v0(i, wjbVar));
                bkb.p1(0.1254902f, bkb.v0(i, wjbVar));
                jnaVar.e.setColor(p1);
                jnaVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void x() {
        this.X0.g();
    }
}
