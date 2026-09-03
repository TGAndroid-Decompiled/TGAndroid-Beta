package mh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.us;
import org.telegram.ui.yh;
public final class i1 extends org.telegram.ui.Components.sa {
    public static final int A0 = 0;
    public final int U;
    public final LinearLayout V;
    public final eg.t3[] W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList f14202a0;
    public final com.google.android.gms.common.api.internal.r f14203b0;
    public final com.google.android.gms.common.api.internal.r f14204c0;
    public final com.google.android.gms.common.api.internal.r f14205d0;
    public final pz f14206e0;
    public final a1 f14207f0;
    public final h1 f14208g0;
    public c1 f14209h0;
    public final FrameLayout f14210i0;
    public final ImageView f14211j0;
    public final ImageView f14212k0;
    public final b1 f14213l0;
    public final TextView m0;
    public final View f14214n0;
    public final og.k f14215o0;
    public final og.e f14216p0;
    public final tg.d f14217q0;
    public final og.a f14218r0;
    public e1 f14219s0;
    public final boolean f14220t0;
    public boolean f14221u0;
    public final RectF f14222v0;
    public final PointF f14223w0;
    public final ArrayList f14224x0;
    public int f14225y0;
    public int f14226z0;

    public i1(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, String str, ArrayList arrayList, boolean z4) {
        super(context, null, false, false, false, 1, g6Var);
        int i11;
        this.f14226z0 = 1;
        RectF rectF = new RectF();
        this.f14222v0 = rectF;
        this.f14223w0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.f14224x0 = arrayList2;
        arrayList2.add(rectF);
        this.U = i10;
        this.f14220t0 = z4;
        sl0 sl0Var = this.d;
        org.telegram.ui.ActionBar.f3 f3Var = this.container;
        Objects.requireNonNull(sl0Var);
        this.f14215o0 = new og.k(sl0Var, f3Var, new us(sl0Var, 0));
        ArrayList c3 = mf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.X = c3;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c3);
        this.f14203b0 = rVar;
        rVar.f2799b = false;
        ArrayList c10 = mf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.Y = c10;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c10);
        this.f14204c0 = rVar2;
        rVar2.f2799b = false;
        this.Z = mf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f14202a0 = arrayList3;
        if (z4) {
            int i12 = 0;
            while (i12 < this.Z.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Z.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f14202a0.add(stargiftattributemodel);
                    this.Z.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.X, Comparator$CC.comparingDouble(new y0(0)));
        List.EL.sort(this.Y, Comparator$CC.comparingDouble(new y0(1)));
        List.EL.sort(this.Z, Comparator$CC.comparingDouble(new y0(2)));
        List.EL.sort(this.f14202a0, Comparator$CC.comparingDouble(new y0(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Z);
        this.f14205d0 = rVar3;
        rVar3.f2799b = false;
        ViewParent parent = this.f31015e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f31015e);
        }
        this.I = false;
        this.H = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.k6.f21751i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.k6.f21733h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        tg.c cVar = new tg.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f14216p0 = new og.e(false);
            tg.d dVar = new tg.d(cVar);
            this.f14217q0 = dVar;
            dVar.v = new Runnable(this) {
                public final i1 f15129b;

                {
                    this.f15129b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                i1 i1Var = this.f15129b;
                                if (i1Var.f14216p0 != null) {
                                    i1Var.Q(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f15129b.onBackPressed();
                            return;
                    }
                }
            };
            og.a aVar = new og.a(dVar);
            this.f14218r0 = aVar;
            aVar.f16757f = LiteMode.isEnabled(262144);
        } else {
            this.f14216p0 = null;
            this.f14217q0 = null;
            this.f14218r0 = new og.a(cVar);
        }
        vg.i iVar = new vg.i(this.container);
        og.a aVar2 = this.f14218r0;
        org.telegram.ui.ActionBar.f3 f3Var2 = this.container;
        aVar2.d = iVar;
        aVar2.f16756e = f3Var2;
        pz pzVar = new pz(3, false);
        this.f14206e0 = pzVar;
        pzVar.O = new lh.n5(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(pzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new fg.e2(this, 7));
        ?? lVar = new f2.l();
        this.f14207f0 = lVar;
        lVar.C = false;
        lVar.f5910m = false;
        lVar.n(280L);
        lVar.o(pr.h);
        lVar.D = 30L;
        this.d.setItemAnimator(lVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14210i0 = frameLayout;
        frameLayout.setClipChildren(false);
        b1 b1Var = new b1(this, context, g6Var, new Runnable(this) {
            public final i1 f15129b;

            {
                this.f15129b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            i1 i1Var = this.f15129b;
                            if (i1Var.f14216p0 != null) {
                                i1Var.Q(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f15129b.onBackPressed();
                        return;
                }
            }
        }, new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5));
        this.f14213l0 = b1Var;
        b1Var.d(new c5.d(1, 1));
        b1Var.setPreviewingAttributes(arrayList);
        b1Var.removeView(b1Var.L);
        int i15 = -1;
        frameLayout.addView(b1Var, k7.c6.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.f14211j0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 17));
        k7.e6.a(imageView);
        frameLayout.addView(imageView, k7.c6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14212k0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new dg.n(19, this, arrayList));
        k7.e6.a(imageView2);
        frameLayout.addView(imageView2, k7.c6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView h = yh.h(frameLayout, textView, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.m0 = h;
        h.setTextSize(1, 13.0f);
        h.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        h.setGravity(17);
        int i18 = -1879048193;
        h.setTextColor(-1879048193);
        frameLayout.addView(h, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.W = new eg.t3[3];
        this.f14208g0 = new h1(context, g6Var, new dg.h0(this, 19));
        int i19 = 0;
        while (true) {
            eg.t3[] t3VarArr = this.W;
            if (i19 < t3VarArr.length) {
                eg.t3 t3Var = new eg.t3(context);
                t3Var.setClipChildren(false);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                t3Var.d = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextSize(AndroidUtilities.dp(13.0f));
                k6Var.setTextColor(i15);
                k6Var.setGravity(i17);
                t3Var.addView(k6Var, k7.c6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                t3Var.f5497c = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                t3Var.addView(textView2, k7.c6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
                t3Var.f5496b = k6Var2;
                k6Var2.setTypeface(AndroidUtilities.bold());
                k6Var2.setTextColor(i15);
                k6Var2.setGravity(5);
                k6Var2.getDrawable().N = true;
                k6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                k6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                k6Var2.setSizeableBackground(new s4(AndroidUtilities.dp(10.0f), 285212671));
                t3Var.addView(k6Var2, k7.c6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                t3VarArr[i19] = t3Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.W[i19].f5497c).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.W[i19].f5497c).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.W[i19].f5497c).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                k7.e6.a(this.W[i19]);
                this.W[i19].setOnClickListener(new x0(this, i19, 0));
                this.W[i19].setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.V;
                eg.t3[] t3VarArr2 = this.W;
                eg.t3 t3Var2 = t3VarArr2[i19];
                if (i19 != t3VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(t3Var2, k7.c6.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f14210i0.addView(this.V, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f14210i0, k7.c6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.f21751i5), getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
                View view = new View(context);
                this.f14214n0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e6 = k7.c6.e(-1, 0, 48);
                e6.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e6);
                this.f14208g0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                qg.b c11 = this.f14218r0.c(this.f14208g0, null, false);
                c11.o(AndroidUtilities.dp(4.0f));
                c11.p(AndroidUtilities.dp(28.0f));
                c11.n(new rg.b(org.telegram.ui.ActionBar.k6.f21661d6, g6Var));
                this.f14208g0.setBackground(c11);
                this.containerView.addView(this.f14208g0, k7.c6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f14219s0 = new e1((TL_stars.starGiftAttributeBackdrop) mf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) mf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) mf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f14209h0.N(false);
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
        og.e eVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f14216p0) != null) {
            if (k7.x8.a(i10, 2)) {
                org.telegram.ui.ActionBar.f3 f3Var = this.container;
                h1 h1Var = this.f14208g0;
                PointF pointF = this.f14223w0;
                vg.i.b(h1Var, f3Var, pointF);
                float f10 = pointF.x;
                RectF rectF = this.f14222v0;
                rectF.left = f10;
                rectF.top = pointF.y;
                rectF.right = f10 + h1Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + h1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f11 = -dp;
                    rectF.inset(f11, f11);
                    eVar.g(1, this.f14224x0);
                } else {
                    return;
                }
            }
            if (eVar.f16792j != 0) {
                eVar.e(this.f14215o0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(e1 e1Var) {
        if (this.f14226z0 != 1) {
            int i10 = this.f14208g0.f14156r;
            e1 e1Var2 = this.f14219s0;
            if (e1Var2 != null) {
                if (i10 == 1) {
                    if (e1Var.f13932a != e1Var2.f13932a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (e1Var.f13933b != e1Var2.f13933b) {
                        return false;
                    }
                } else if (i10 != 0 || e1Var.f13934c != e1Var2.f13934c) {
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
        if (this.f14226z0 == i10) {
            return;
        }
        this.f14226z0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f14212k0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.m0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z4) {
        b1 b1Var = this.f14213l0;
        if (b1Var.getUpgradeImageViewAttribute() != null && b1Var.getUpgradeBackdropAttribute() != null && b1Var.getUpgradePatternAttribute() != null) {
            eg.t3[] t3VarArr = this.W;
            ((org.telegram.ui.Components.k6) t3VarArr[0].d).c(b1Var.getUpgradeImageViewAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) t3VarArr[0].f5496b).setText(g5.J1(b1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.k6) t3VarArr[1].d).c(b1Var.getUpgradeBackdropAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) t3VarArr[1].f5496b).c(sh.j.G0(b1Var.getUpgradeBackdropAttribute().getRarityPermille()), z4, true);
            ((org.telegram.ui.Components.k6) t3VarArr[2].d).c(b1Var.getUpgradePatternAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) t3VarArr[2].f5496b).c(sh.j.G0(b1Var.getUpgradePatternAttribute().getRarityPermille()), z4, true);
        }
    }

    public final void U() {
        g1 g1Var;
        e1 e1Var;
        sl0 sl0Var = this.d;
        int childCount = sl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sl0Var.getChildAt(i10);
            if ((childAt instanceof g1) && (e1Var = (g1Var = (g1) childAt).v) != null) {
                boolean R = R(e1Var);
                g1Var.f14070c.f(R, true);
                g1Var.f14074r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.f14210i0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        og.e eVar;
        tg.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (eVar = this.f14216p0) != null && (dVar = this.f14217q0) != null && !dVar.f48128n && dVar.f(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21751i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            eVar.b(a2, i10);
            dVar.c();
        }
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.f14225y0 != systemBottomInset) {
            this.f14225y0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            h1 h1Var = this.f14208g0;
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f14225y0;
            h1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        c1 c1Var = new c1(this, this.d, getContext(), this.U, new eg.p1(this, 17), this.resourcesProvider);
        this.f14209h0 = c1Var;
        c1Var.f32651r = false;
        return c1Var;
    }

    @Override
    public final sl0 w(Context context) {
        return new d1(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
