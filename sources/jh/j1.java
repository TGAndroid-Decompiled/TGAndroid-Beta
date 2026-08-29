package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.ms;
import org.telegram.ui.th;
public final class j1 extends org.telegram.ui.Components.xa {
    public static final int f12282z0 = 0;
    public final int T;
    public final LinearLayout U;
    public final bg.z3[] V;
    public final ArrayList W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final com.google.android.gms.common.api.internal.r f12283a0;
    public final com.google.android.gms.common.api.internal.r f12284b0;
    public final com.google.android.gms.common.api.internal.r f12285c0;
    public final iz f12286d0;
    public final b1 f12287e0;
    public final i1 f12288f0;
    public d1 f12289g0;
    public final FrameLayout f12290h0;
    public final ImageView f12291i0;
    public final ImageView f12292j0;
    public final c1 f12293k0;
    public final TextView f12294l0;
    public final View m0;
    public final lg.k f12295n0;
    public final lg.e f12296o0;
    public final qg.d f12297p0;
    public final lg.a f12298q0;
    public f1 f12299r0;
    public final boolean f12300s0;
    public boolean f12301t0;
    public final RectF f12302u0;
    public final PointF f12303v0;
    public final ArrayList f12304w0;
    public int f12305x0;
    public int f12306y0;

    public j1(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, false, 1, c6Var);
        int i11;
        this.f12306y0 = 1;
        RectF rectF = new RectF();
        this.f12302u0 = rectF;
        this.f12303v0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.f12304w0 = arrayList2;
        arrayList2.add(rectF);
        this.T = i10;
        this.f12300s0 = z10;
        jl0 jl0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(jl0Var);
        this.f12295n0 = new lg.k(jl0Var, d3Var, new ms(jl0Var, 0));
        ArrayList c3 = kf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.W = c3;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c3);
        this.f12283a0 = rVar;
        rVar.f3908b = false;
        ArrayList c6 = kf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.X = c6;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c6);
        this.f12284b0 = rVar2;
        rVar2.f3908b = false;
        this.Y = kf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.Z = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.Y.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Y.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Z.add(stargiftattributemodel);
                    this.Y.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.W, Comparator$CC.comparingDouble(new z0(0)));
        List.EL.sort(this.X, Comparator$CC.comparingDouble(new z0(1)));
        List.EL.sort(this.Y, Comparator$CC.comparingDouble(new z0(2)));
        List.EL.sort(this.Z, Comparator$CC.comparingDouble(new z0(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Y);
        this.f12285c0 = rVar3;
        rVar3.f3908b = false;
        ViewParent parent = this.f34660e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f34660e);
        }
        this.H = false;
        this.G = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.g6.f23151i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.g6.f23133h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        qg.c cVar = new qg.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f12296o0 = new lg.e(false);
            qg.d dVar = new qg.d(cVar);
            this.f12297p0 = dVar;
            dVar.v = new Runnable(this) {
                public final j1 f11707b;

                {
                    this.f11707b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                j1 j1Var = this.f11707b;
                                if (j1Var.f12296o0 != null) {
                                    j1Var.Q(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f11707b.onBackPressed();
                            return;
                    }
                }
            };
            lg.a aVar = new lg.a(dVar);
            this.f12298q0 = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
        } else {
            this.f12296o0 = null;
            this.f12297p0 = null;
            this.f12298q0 = new lg.a(cVar);
        }
        sg.i iVar = new sg.i(this.container);
        lg.a aVar2 = this.f12298q0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        aVar2.d = iVar;
        aVar2.f15224e = d3Var2;
        iz izVar = new iz(3, false);
        this.f12286d0 = izVar;
        izVar.O = new ih.n5(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(izVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new cg.g2(this, 7));
        ?? lVar = new f2.l();
        this.f12287e0 = lVar;
        lVar.C = false;
        lVar.f6463m = false;
        lVar.n(280L);
        lVar.o(jr.h);
        lVar.D = 30L;
        this.d.setItemAnimator(lVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12290h0 = frameLayout;
        frameLayout.setClipChildren(false);
        c1 c1Var = new c1(this, context, c6Var, new Runnable(this) {
            public final j1 f11707b;

            {
                this.f11707b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            j1 j1Var = this.f11707b;
                            if (j1Var.f12296o0 != null) {
                                j1Var.Q(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f11707b.onBackPressed();
                        return;
                }
            }
        }, new bg.n(5), new bg.n(5), new bg.n(5), new bg.n(5), new bg.n(5), new bg.n(5));
        this.f12293k0 = c1Var;
        c1Var.d(new a5.d(1, 1));
        c1Var.setPreviewingAttributes(arrayList);
        c1Var.removeView(c1Var.K);
        int i15 = -1;
        frameLayout.addView(c1Var, i7.f6.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.f12291i0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ag.o(this, 17));
        i7.h6.a(imageView);
        frameLayout.addView(imageView, i7.f6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12292j0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ag.n(19, this, arrayList));
        i7.h6.a(imageView2);
        frameLayout.addView(imageView2, i7.f6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView h = th.h(frameLayout, textView, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f12294l0 = h;
        h.setTextSize(1, 13.0f);
        h.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        h.setGravity(17);
        int i18 = -1879048193;
        h.setTextColor(-1879048193);
        frameLayout.addView(h, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V = new bg.z3[3];
        this.f12288f0 = new i1(context, c6Var, new ag.i0(this, 19));
        int i19 = 0;
        while (true) {
            bg.z3[] z3VarArr = this.V;
            if (i19 < z3VarArr.length) {
                bg.z3 z3Var = new bg.z3(context);
                z3Var.setClipChildren(false);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                z3Var.d = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextSize(AndroidUtilities.dp(13.0f));
                o6Var.setTextColor(i15);
                o6Var.setGravity(i17);
                z3Var.addView(o6Var, i7.f6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                z3Var.f2640c = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                z3Var.addView(textView2, i7.f6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
                z3Var.f2639b = o6Var2;
                o6Var2.setTypeface(AndroidUtilities.bold());
                o6Var2.setTextColor(i15);
                o6Var2.setGravity(5);
                o6Var2.getDrawable().N = true;
                o6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                o6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                o6Var2.setSizeableBackground(new t4(AndroidUtilities.dp(10.0f), 285212671));
                z3Var.addView(o6Var2, i7.f6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                z3VarArr[i19] = z3Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.V[i19].f2640c).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.V[i19].f2640c).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.V[i19].f2640c).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                i7.h6.a(this.V[i19]);
                this.V[i19].setOnClickListener(new y0(this, i19, 0));
                this.V[i19].setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.U;
                bg.z3[] z3VarArr2 = this.V;
                bg.z3 z3Var2 = z3VarArr2[i19];
                if (i19 != z3VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(z3Var2, i7.f6.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f12290h0.addView(this.U, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f12290h0, i7.f6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f23151i5), getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
                View view = new View(context);
                this.m0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = i7.f6.e(-1, 0, 48);
                e10.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e10);
                this.f12288f0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ng.d c10 = this.f12298q0.c(this.f12288f0, null, false);
                c10.o(AndroidUtilities.dp(4.0f));
                c10.p(AndroidUtilities.dp(28.0f));
                c10.n(new og.b(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                this.f12288f0.setBackground(c10);
                this.containerView.addView(this.f12288f0, i7.f6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f12299r0 = new f1((TL_stars.starGiftAttributeBackdrop) kf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) kf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) kf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f12289g0.N(false);
                T(false);
                return;
            }
        }
    }

    public static double P(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void Q(int i10) {
        lg.e eVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f12296o0) != null) {
            if (i7.n8.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                i1 i1Var = this.f12288f0;
                PointF pointF = this.f12303v0;
                sg.i.b(i1Var, d3Var, pointF);
                float f9 = pointF.x;
                RectF rectF = this.f12302u0;
                rectF.left = f9;
                rectF.top = pointF.y;
                rectF.right = f9 + i1Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + i1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f10 = -dp;
                    rectF.inset(f10, f10);
                    eVar.g(1, this.f12304w0);
                } else {
                    return;
                }
            }
            if (eVar.f15260j != 0) {
                eVar.e(this.f12295n0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(f1 f1Var) {
        if (this.f12306y0 != 1) {
            int i10 = this.f12288f0.f12235r;
            f1 f1Var2 = this.f12299r0;
            if (f1Var2 != null) {
                if (i10 == 1) {
                    if (f1Var.f12043a != f1Var2.f12043a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (f1Var.f12044b != f1Var2.f12044b) {
                        return false;
                    }
                } else if (i10 != 0 || f1Var.f12045c != f1Var2.f12045c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void S(int i10) {
        int i11;
        int i12;
        if (this.f12306y0 == i10) {
            return;
        }
        this.f12306y0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f12292j0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f12294l0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z10) {
        c1 c1Var = this.f12293k0;
        if (c1Var.getUpgradeImageViewAttribute() != null && c1Var.getUpgradeBackdropAttribute() != null && c1Var.getUpgradePatternAttribute() != null) {
            bg.z3[] z3VarArr = this.V;
            ((org.telegram.ui.Components.o6) z3VarArr[0].d).c(c1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) z3VarArr[0].f2639b).setText(h5.J1(c1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.o6) z3VarArr[1].d).c(c1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) z3VarArr[1].f2639b).c(ph.j.G0(c1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.o6) z3VarArr[2].d).c(c1Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) z3VarArr[2].f2639b).c(ph.j.G0(c1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void U() {
        h1 h1Var;
        f1 f1Var;
        jl0 jl0Var = this.d;
        int childCount = jl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt instanceof h1) && (f1Var = (h1Var = (h1) childAt).v) != null) {
                boolean R = R(f1Var);
                h1Var.f12148c.f(R, true);
                h1Var.f12152r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f9, float f10) {
        FrameLayout frameLayout = this.f12290h0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        lg.e eVar;
        qg.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (eVar = this.f12296o0) != null && (dVar = this.f12297p0) != null && !dVar.f46673n && dVar.e(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23151i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            eVar.b(a2, i10);
            dVar.b();
        }
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.f12305x0 != systemBottomInset) {
            this.f12305x0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            i1 i1Var = this.f12288f0;
            ((ViewGroup.MarginLayoutParams) i1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f12305x0;
            i1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        d1 d1Var = new d1(this, this.d, getContext(), this.T, new bg.t1(this, 17), this.resourcesProvider);
        this.f12289g0 = d1Var;
        d1Var.f29939r = false;
        return d1Var;
    }

    @Override
    public final jl0 w(Context context) {
        return new e1(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
