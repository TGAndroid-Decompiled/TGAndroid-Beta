package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.ks;
public final class a2 extends org.telegram.ui.Components.bb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final w1[] Z;
    public final ArrayList f925a0;
    public final ArrayList f926b0;
    public final ArrayList f927c0;
    public final ArrayList f928d0;
    public final a f929e0;
    public final a f930f0;
    public final a f931g0;
    public final wz f932h0;
    public final r1 f933i0;
    public final z1 f934j0;
    public t1 f935k0;
    public final FrameLayout f936l0;
    public final ImageView m0;
    public final ImageView f937n0;
    public final s1 f938o0;
    public final TextView f939p0;
    public final View f940q0;
    public final bh.l f941r0;
    public final bh.f f942s0;
    public final gh.d f943t0;
    public final bh.b f944u0;
    public v1 f945v0;
    public final boolean f946w0;
    public boolean f947x0;
    public final RectF f948y0;
    public final PointF f949z0;

    public a2(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, d6Var);
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f948y0 = rectF;
        this.f949z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f946w0 = z10;
        im0 im0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(im0Var);
        this.f941r0 = new bh.l(im0Var, d3Var, new ks(im0Var, 0));
        ArrayList c10 = ag.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f925a0 = c10;
        a aVar = new a(c10);
        this.f929e0 = aVar;
        aVar.f918a = false;
        ArrayList c11 = ag.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f926b0 = c11;
        a aVar2 = new a(c11);
        this.f930f0 = aVar2;
        aVar2.f918a = false;
        this.f927c0 = ag.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f928d0 = arrayList3;
        if (z10) {
            int i11 = 0;
            while (i11 < this.f927c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f927c0.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f928d0.add(stargiftattributemodel);
                    this.f927c0.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f925a0, Comparator$CC.comparingDouble(new o1(0)));
        List.EL.sort(this.f926b0, Comparator$CC.comparingDouble(new o1(1)));
        List.EL.sort(this.f927c0, Comparator$CC.comparingDouble(new o1(2)));
        List.EL.sort(this.f928d0, Comparator$CC.comparingDouble(new o1(2)));
        a aVar3 = new a(this.f927c0);
        this.f931g0 = aVar3;
        aVar3.f918a = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i12 = org.telegram.ui.ActionBar.h6.f21075i5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.h6.f21058h5;
        setBackgroundColor(i0.a.f(0.1f, themedColor, getThemedColor(i13)));
        fixNavigationBar();
        gh.c cVar = new gh.c();
        cVar.a(i0.a.f(0.1f, getThemedColor(i12), getThemedColor(i13)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f942s0 = new bh.f(false);
            gh.d dVar = new gh.d(cVar);
            this.f943t0 = dVar;
            dVar.v = new Runnable(this) {
                public final a2 f1984b;

                {
                    this.f1984b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                a2 a2Var = this.f1984b;
                                if (a2Var.f942s0 != null) {
                                    a2Var.R(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f1984b.onBackPressed();
                            return;
                    }
                }
            };
            bh.b bVar = new bh.b(dVar);
            this.f944u0 = bVar;
            bVar.f4360i = LiteMode.isEnabled(262144);
        } else {
            this.f942s0 = null;
            this.f943t0 = null;
            this.f944u0 = new bh.b(cVar);
        }
        ih.j jVar = new ih.j(this.container);
        bh.b bVar2 = this.f944u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        bVar2.f4358f = jVar;
        bVar2.f4359g = d3Var2;
        wz wzVar = new wz(3, false);
        this.f932h0 = wzVar;
        wzVar.O = new q1(this, 0);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ah.d0(this, 2));
        ?? kVar = new s4.k();
        this.f933i0 = kVar;
        kVar.C = false;
        kVar.f45946m = false;
        kVar.n(280L);
        kVar.o(bs.h);
        kVar.D = 30L;
        this.d.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f936l0 = frameLayout;
        frameLayout.setClipChildren(false);
        s1 s1Var = new s1(this, context, d6Var, new Runnable(this) {
            public final a2 f1984b;

            {
                this.f1984b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            a2 a2Var = this.f1984b;
                            if (a2Var.f942s0 != null) {
                                a2Var.R(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f1984b.onBackPressed();
                        return;
                }
            }
        }, new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1));
        this.f938o0 = s1Var;
        s1Var.d(new h6(1, 1));
        s1Var.setPreviewingAttributes(arrayList);
        s1Var.removeView(s1Var.P);
        int i14 = -1;
        frameLayout.addView(s1Var, w7.z5.c(-1.0f, -1));
        int i15 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i15, 0, i15, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.g0(this, 4));
        w7.b6.a(imageView);
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f937n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new p(3, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i16 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f939p0 = j10;
        float f7 = 13.0f;
        j10.setTextSize(1, 13.0f);
        j10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        j10.setGravity(17);
        int i17 = -1879048193;
        j10.setTextColor(-1879048193);
        frameLayout.addView(j10, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new w1[3];
        this.f934j0 = new z1(context, d6Var, new r0(this, 1));
        int i18 = 0;
        while (true) {
            w1[] w1VarArr = this.Z;
            if (i18 < w1VarArr.length) {
                w1 w1Var = new w1(context);
                float f10 = f7;
                w1Var.setClipChildren(false);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                w1Var.f2342c = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextSize(AndroidUtilities.dp(f10));
                q6Var.setTextColor(i14);
                q6Var.setGravity(i16);
                w1Var.addView(q6Var, w7.z5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                w1Var.f2341b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i17);
                textView2.setGravity(i16);
                w1Var.addView(textView2, w7.z5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
                w1Var.d = q6Var2;
                q6Var2.setTypeface(AndroidUtilities.bold());
                q6Var2.setTextColor(i14);
                q6Var2.setGravity(5);
                q6Var2.getDrawable().T = true;
                q6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                q6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                q6Var2.setSizeableBackground(new u6(AndroidUtilities.dp(10.0f), 285212671));
                w1Var.addView(q6Var2, w7.z5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                w1VarArr[i18] = w1Var;
                if (i18 == 0) {
                    ((TextView) this.Z[i18].f2341b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                } else if (i18 == 1) {
                    ((TextView) this.Z[i18].f2341b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                } else if (i18 == 2) {
                    ((TextView) this.Z[i18].f2341b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                }
                w7.b6.a(this.Z[i18]);
                this.Z[i18].setOnClickListener(new n1(this, i18, 0));
                this.Z[i18].setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                w1[] w1VarArr2 = this.Z;
                linearLayout2.addView(w1VarArr2[i18], w7.z5.p(0, 42, 1.0f, 7, 0, 0, i18 != w1VarArr2.length - 1 ? 11 : 0, 0));
                i18++;
                f7 = f10;
                i16 = 17;
                i14 = -1;
                i17 = -1879048193;
            } else {
                this.f936l0.addView(this.Y, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f936l0, w7.z5.e(-1, 315, 55));
                int f11 = i0.a.f(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f21075i5), getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
                View view = new View(context);
                this.f940q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(f11, 160), f11 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.z5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f934j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.f944u0.c(this.f934j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new eh.b(org.telegram.ui.ActionBar.h6.f20987d6, d6Var));
                this.f934j0.setBackground(c12);
                this.containerView.addView(this.f934j0, w7.z5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f945v0 = new v1((TL_stars.starGiftAttributeBackdrop) ag.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) ag.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) ag.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f935k0.N(false);
                U(false);
                return;
            }
        }
    }

    public static double Q(TL_stars.StarGiftAttribute starGiftAttribute) {
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
    public final CharSequence A() {
        return null;
    }

    public final void R(int i10) {
        bh.f fVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f942s0) != null) {
            if (w7.j6.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                z1 z1Var = this.f934j0;
                PointF pointF = this.f949z0;
                ih.j.b(z1Var, d3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f948y0;
                rectF.left = f7;
                rectF.top = pointF.y;
                rectF.right = f7 + z1Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + z1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f10 = -dp;
                    rectF.inset(f10, f10);
                    fVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (fVar.f4391j != 0) {
                fVar.e(this.f941r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean S(v1 v1Var) {
        if (this.C0 != 1) {
            int i10 = this.f934j0.f2527r;
            v1 v1Var2 = this.f945v0;
            if (v1Var2 != null) {
                if (i10 == 1) {
                    if (v1Var.f2285a != v1Var2.f2285a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (v1Var.f2286b != v1Var2.f2286b) {
                        return false;
                    }
                } else if (i10 != 0 || v1Var.f2287c != v1Var2.f2287c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T(int i10) {
        int i11;
        int i12;
        if (this.C0 == i10) {
            return;
        }
        this.C0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f937n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f939p0.setText(LocaleController.getString(i12));
        V();
    }

    public final void U(boolean z10) {
        s1 s1Var = this.f938o0;
        if (s1Var.getUpgradeImageViewAttribute() != null && s1Var.getUpgradeBackdropAttribute() != null && s1Var.getUpgradePatternAttribute() != null) {
            w1[] w1VarArr = this.Z;
            ((org.telegram.ui.Components.q6) w1VarArr[0].f2342c).c(s1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[0].d).setText(l7.e2(s1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.q6) w1VarArr[1].f2342c).c(s1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[1].d).c(gi.l.H0(s1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[2].f2342c).c(s1Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[2].d).c(gi.l.H0(s1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void V() {
        y1 y1Var;
        v1 v1Var;
        im0 im0Var = this.d;
        int childCount = im0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = im0Var.getChildAt(i10);
            if ((childAt instanceof y1) && (v1Var = (y1Var = (y1) childAt).v) != null) {
                boolean S = S(v1Var);
                y1Var.f2469c.f(S, true);
                y1Var.f2472r.a(S, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f936l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        bh.f fVar;
        gh.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f942s0) != null && (dVar = this.f943t0) != null && !dVar.f11060n && dVar.g(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21075i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            fVar.b(a2, i10);
            dVar.c();
        }
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.B0 != systemBottomInset) {
            this.B0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            z1 z1Var = this.f934j0;
            ((ViewGroup.MarginLayoutParams) z1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            z1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        R(2);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t1 t1Var = new t1(this, this.d, getContext(), this.X, new q(this, 3), this.resourcesProvider);
        this.f935k0 = t1Var;
        t1Var.f30436r = false;
        return t1Var;
    }

    @Override
    public final im0 y(Context context) {
        return new u1(this, context, this.resourcesProvider, 0);
    }
}
