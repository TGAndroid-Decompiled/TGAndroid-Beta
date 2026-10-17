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
import org.telegram.ui.ms;
public final class a2 extends org.telegram.ui.Components.bb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final w1[] Z;
    public final ArrayList f927a0;
    public final ArrayList f928b0;
    public final ArrayList f929c0;
    public final ArrayList f930d0;
    public final a f931e0;
    public final a f932f0;
    public final a f933g0;
    public final wz f934h0;
    public final r1 f935i0;
    public final z1 f936j0;
    public t1 f937k0;
    public final FrameLayout f938l0;
    public final ImageView m0;
    public final ImageView f939n0;
    public final s1 f940o0;
    public final TextView f941p0;
    public final View f942q0;
    public final bh.l f943r0;
    public final bh.f f944s0;
    public final gh.d f945t0;
    public final bh.b f946u0;
    public v1 f947v0;
    public final boolean f948w0;
    public boolean f949x0;
    public final RectF f950y0;
    public final PointF f951z0;

    public a2(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, d6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f950y0 = rectF;
        this.f951z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f948w0 = z10;
        im0 im0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(im0Var);
        this.f943r0 = new bh.l(im0Var, d3Var, new ms(im0Var, 0));
        ArrayList c10 = ag.e.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f927a0 = c10;
        a aVar = new a(c10);
        this.f931e0 = aVar;
        aVar.f920a = false;
        ArrayList c11 = ag.e.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f928b0 = c11;
        a aVar2 = new a(c11);
        this.f932f0 = aVar2;
        aVar2.f920a = false;
        this.f929c0 = ag.e.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f930d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f929c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f929c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f930d0.add(stargiftattributemodel);
                    this.f929c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f927a0, Comparator$CC.comparingDouble(new o1(0)));
        List.EL.sort(this.f928b0, Comparator$CC.comparingDouble(new o1(1)));
        List.EL.sort(this.f929c0, Comparator$CC.comparingDouble(new o1(2)));
        List.EL.sort(this.f930d0, Comparator$CC.comparingDouble(new o1(2)));
        a aVar3 = new a(this.f929c0);
        this.f933g0 = aVar3;
        aVar3.f920a = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.h6.f21074i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f21057h5;
        setBackgroundColor(i0.b.f(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        gh.c cVar = new gh.c();
        cVar.a(i0.b.f(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f944s0 = new bh.f(false);
            gh.d dVar = new gh.d(cVar);
            this.f945t0 = dVar;
            dVar.v = new Runnable(this) {
                public final a2 f1996b;

                {
                    this.f1996b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                a2 a2Var = this.f1996b;
                                if (a2Var.f944s0 != null) {
                                    a2Var.R(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f1996b.onBackPressed();
                            return;
                    }
                }
            };
            bh.b bVar = new bh.b(dVar);
            this.f946u0 = bVar;
            bVar.f4363i = LiteMode.isEnabled(262144);
        } else {
            this.f944s0 = null;
            this.f945t0 = null;
            this.f946u0 = new bh.b(cVar);
        }
        ih.j jVar = new ih.j(this.container);
        bh.b bVar2 = this.f946u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        bVar2.f4361f = jVar;
        bVar2.f4362g = d3Var2;
        wz wzVar = new wz(3, false);
        this.f934h0 = wzVar;
        wzVar.O = new q1(this, 0);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ah.d0(this, 2));
        ?? kVar = new s4.k();
        this.f935i0 = kVar;
        kVar.C = false;
        kVar.f45972m = false;
        kVar.n(280L);
        kVar.o(bs.h);
        kVar.D = 30L;
        this.d.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f938l0 = frameLayout;
        frameLayout.setClipChildren(false);
        s1 s1Var = new s1(this, context, d6Var, new Runnable(this) {
            public final a2 f1996b;

            {
                this.f1996b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            a2 a2Var = this.f1996b;
                            if (a2Var.f944s0 != null) {
                                a2Var.R(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f1996b.onBackPressed();
                        return;
                }
            }
        }, new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1));
        this.f940o0 = s1Var;
        s1Var.d(new g6(1, 1));
        s1Var.setPreviewingAttributes(arrayList);
        s1Var.removeView(s1Var.P);
        int i15 = -1;
        frameLayout.addView(s1Var, w7.z5.d(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.g0(this, 4));
        w7.b6.a(imageView);
        frameLayout.addView(imageView, w7.z5.a(32.0f, 12.0f, 14.0f, 0.0f, 0.0f, 32, 51));
        ImageView imageView2 = new ImageView(context);
        this.f939n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new p(3, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.a(32.0f, 0.0f, 14.0f, 12.0f, 0.0f, 32, 53));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView k10 = org.telegram.ui.Cells.t0.k(frameLayout, textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 102.0f, -1, 87), context);
        this.f941p0 = k10;
        float f7 = 13.0f;
        k10.setTextSize(1, 13.0f);
        k10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        k10.setGravity(17);
        int i18 = -1879048193;
        k10.setTextColor(-1879048193);
        frameLayout.addView(k10, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 82.0f, -1, 87));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new w1[3];
        this.f936j0 = new z1(context, d6Var, new r0(this, 1));
        int i19 = 0;
        while (true) {
            w1[] w1VarArr = this.Z;
            if (i19 < w1VarArr.length) {
                float f10 = f7;
                w1 w1Var = new w1(context, 0);
                w1Var.setClipChildren(false);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                w1Var.f2352c = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextSize(AndroidUtilities.dp(f10));
                q6Var.setTextColor(i15);
                q6Var.setGravity(i17);
                w1Var.addView(q6Var, w7.z5.a(16.0f, 4.0f, 6.0f, 4.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                w1Var.f2351b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                w1Var.addView(textView2, w7.z5.a(-2.0f, 4.0f, 20.0f, 4.0f, 0.0f, -1, 49));
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
                w1Var.d = q6Var2;
                q6Var2.setTypeface(AndroidUtilities.bold());
                q6Var2.setTextColor(i15);
                q6Var2.setGravity(5);
                q6Var2.getDrawable().T = true;
                q6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                q6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                q6Var2.setSizeableBackground(new t6(AndroidUtilities.dp(10.0f), 285212671));
                w1Var.addView(q6Var2, w7.z5.a(16.0f, 0.0f, -9.0f, -4.0f, 0.0f, -1, 53));
                w1VarArr[i19] = w1Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f2351b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f2351b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f2351b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.b6.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new n1(this, i19, 0));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                w1[] w1VarArr2 = this.Z;
                w1 w1Var2 = w1VarArr2[i19];
                if (i19 != w1VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(w1Var2, w7.z5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                f7 = f10;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f938l0.addView(this.Y, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 18.0f, -1, 87));
                this.containerView.addView(this.f938l0, w7.z5.e(-1, 315, 55));
                int f11 = i0.b.f(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f21074i5), getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
                View view = new View(context);
                this.f942q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.o(f11, 160), f11 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.z5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f936j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.f946u0.c(this.f936j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new eh.b(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
                this.f936j0.setBackground(c12);
                this.containerView.addView(this.f936j0, w7.z5.a(64.0f, 0.0f, 0.0f, 0.0f, 5.0f, 268, 81));
                this.f947v0 = new v1((TL_stars.starGiftAttributeBackdrop) ag.e.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) ag.e.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) ag.e.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f937k0.N(false);
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
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f944s0) != null) {
            if (w7.m6.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                z1 z1Var = this.f936j0;
                PointF pointF = this.f951z0;
                ih.j.b(z1Var, d3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f950y0;
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
            if (fVar.f4394j != 0) {
                fVar.e(this.f943r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean S(v1 v1Var) {
        if (this.C0 != 1) {
            int i10 = this.f936j0.f2514r;
            v1 v1Var2 = this.f947v0;
            if (v1Var2 != null) {
                if (i10 == 1) {
                    if (v1Var.f2284a != v1Var2.f2284a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (v1Var.f2285b != v1Var2.f2285b) {
                        return false;
                    }
                } else if (i10 != 0 || v1Var.f2286c != v1Var2.f2286c) {
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
        this.f939n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f941p0.setText(LocaleController.getString(i12));
        V();
    }

    public final void U(boolean z10) {
        s1 s1Var = this.f940o0;
        if (s1Var.getUpgradeImageViewAttribute() != null && s1Var.getUpgradeBackdropAttribute() != null && s1Var.getUpgradePatternAttribute() != null) {
            w1[] w1VarArr = this.Z;
            ((org.telegram.ui.Components.q6) w1VarArr[0].f2352c).c(s1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[0].d).setText(k7.W1(s1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.q6) w1VarArr[1].f2352c).c(s1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[1].d).c(gi.l.H0(s1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.q6) w1VarArr[2].f2352c).c(s1Var.getUpgradePatternAttribute().name, z10, true);
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
                y1Var.f2472c.f(S, true);
                y1Var.f2475r.a(S, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f938l0;
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
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f944s0) != null && (dVar = this.f945t0) != null && !dVar.f11061n && dVar.g(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21074i5));
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
            z1 z1Var = this.f936j0;
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
        this.f937k0 = t1Var;
        t1Var.f30200r = false;
        return t1Var;
    }

    @Override
    public final im0 y(Context context) {
        return new u1(this, context, this.resourcesProvider, 0);
    }
}
