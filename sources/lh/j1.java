package lh;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.ts;
import org.telegram.ui.yh;
public final class j1 extends org.telegram.ui.Components.sa {
    public static final int A0 = 0;
    public final int U;
    public final LinearLayout V;
    public final dg.v3[] W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList f12636a0;
    public final com.google.android.gms.common.api.internal.r f12637b0;
    public final com.google.android.gms.common.api.internal.r f12638c0;
    public final com.google.android.gms.common.api.internal.r f12639d0;
    public final nz f12640e0;
    public final b1 f12641f0;
    public final i1 f12642g0;
    public d1 f12643h0;
    public final FrameLayout f12644i0;
    public final ImageView f12645j0;
    public final ImageView f12646k0;
    public final c1 f12647l0;
    public final TextView m0;
    public final View f12648n0;
    public final ng.k f12649o0;
    public final ng.e f12650p0;
    public final sg.d f12651q0;
    public final ng.a f12652r0;
    public f1 f12653s0;
    public final boolean f12654t0;
    public boolean f12655u0;
    public final RectF f12656v0;
    public final PointF f12657w0;
    public final ArrayList f12658x0;
    public int f12659y0;
    public int f12660z0;

    public j1(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, String str, ArrayList arrayList, boolean z4) {
        super(context, null, false, false, false, 1, f6Var);
        int i11;
        this.f12660z0 = 1;
        RectF rectF = new RectF();
        this.f12656v0 = rectF;
        this.f12657w0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.f12658x0 = arrayList2;
        arrayList2.add(rectF);
        this.U = i10;
        this.f12654t0 = z4;
        sl0 sl0Var = this.d;
        org.telegram.ui.ActionBar.e3 e3Var = this.container;
        Objects.requireNonNull(sl0Var);
        this.f12649o0 = new ng.k(sl0Var, e3Var, new ts(sl0Var, 0));
        ArrayList c3 = mf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.X = c3;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c3);
        this.f12637b0 = rVar;
        rVar.f2862b = false;
        ArrayList c10 = mf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.Y = c10;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c10);
        this.f12638c0 = rVar2;
        rVar2.f2862b = false;
        this.Z = mf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f12636a0 = arrayList3;
        if (z4) {
            int i12 = 0;
            while (i12 < this.Z.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Z.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f12636a0.add(stargiftattributemodel);
                    this.Z.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.X, Comparator$CC.comparingDouble(new z0(0)));
        List.EL.sort(this.Y, Comparator$CC.comparingDouble(new z0(1)));
        List.EL.sort(this.Z, Comparator$CC.comparingDouble(new z0(2)));
        List.EL.sort(this.f12636a0, Comparator$CC.comparingDouble(new z0(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Z);
        this.f12639d0 = rVar3;
        rVar3.f2862b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.I = false;
        this.H = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.j6.f19995i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.f19977h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        sg.c cVar = new sg.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f12650p0 = new ng.e(false);
            sg.d dVar = new sg.d(cVar);
            this.f12651q0 = dVar;
            dVar.v = new Runnable(this) {
                public final j1 f12089b;

                {
                    this.f12089b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                j1 j1Var = this.f12089b;
                                if (j1Var.f12650p0 != null) {
                                    j1Var.Q(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f12089b.onBackPressed();
                            return;
                    }
                }
            };
            ng.a aVar = new ng.a(dVar);
            this.f12652r0 = aVar;
            aVar.f14972f = LiteMode.isEnabled(262144);
        } else {
            this.f12650p0 = null;
            this.f12651q0 = null;
            this.f12652r0 = new ng.a(cVar);
        }
        ug.i iVar = new ug.i(this.container);
        ng.a aVar2 = this.f12652r0;
        org.telegram.ui.ActionBar.e3 e3Var2 = this.container;
        aVar2.d = iVar;
        aVar2.e = e3Var2;
        nz nzVar = new nz(3, false);
        this.f12640e0 = nzVar;
        nzVar.O = new kh.n5(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new eg.f2(this, 7));
        ?? lVar = new f2.l();
        this.f12641f0 = lVar;
        lVar.C = false;
        lVar.f5818m = false;
        lVar.n(280L);
        lVar.o(nr.h);
        lVar.D = 30L;
        this.d.setItemAnimator(lVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12644i0 = frameLayout;
        frameLayout.setClipChildren(false);
        c1 c1Var = new c1(this, context, f6Var, new Runnable(this) {
            public final j1 f12089b;

            {
                this.f12089b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            j1 j1Var = this.f12089b;
                            if (j1Var.f12650p0 != null) {
                                j1Var.Q(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f12089b.onBackPressed();
                        return;
                }
            }
        }, new dg.m(5), new dg.m(5), new dg.m(5), new dg.m(5), new dg.m(5), new dg.m(5));
        this.f12647l0 = c1Var;
        c1Var.d(new c5.d(1, 1));
        c1Var.setPreviewingAttributes(arrayList);
        c1Var.removeView(c1Var.L);
        int i15 = -1;
        frameLayout.addView(c1Var, k7.b6.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.f12645j0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 17));
        k7.d6.a(imageView);
        frameLayout.addView(imageView, k7.b6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12646k0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new cg.n(19, this, arrayList));
        k7.d6.a(imageView2);
        frameLayout.addView(imageView2, k7.b6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView i18 = yh.i(frameLayout, textView, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.m0 = i18;
        i18.setTextSize(1, 13.0f);
        i18.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        i18.setGravity(17);
        int i19 = -1879048193;
        i18.setTextColor(-1879048193);
        frameLayout.addView(i18, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.W = new dg.v3[3];
        this.f12642g0 = new i1(context, f6Var, new cg.h0(this, 19));
        int i20 = 0;
        while (true) {
            dg.v3[] v3VarArr = this.W;
            if (i20 < v3VarArr.length) {
                dg.v3 v3Var = new dg.v3(context);
                v3Var.setClipChildren(false);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                v3Var.d = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextSize(AndroidUtilities.dp(13.0f));
                k6Var.setTextColor(i15);
                k6Var.setGravity(i17);
                v3Var.addView(k6Var, k7.b6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                v3Var.f4832c = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i19);
                textView2.setGravity(i17);
                v3Var.addView(textView2, k7.b6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
                v3Var.f4831b = k6Var2;
                k6Var2.setTypeface(AndroidUtilities.bold());
                k6Var2.setTextColor(i15);
                k6Var2.setGravity(5);
                k6Var2.getDrawable().N = true;
                k6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                k6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                k6Var2.setSizeableBackground(new s4(AndroidUtilities.dp(10.0f), 285212671));
                v3Var.addView(k6Var2, k7.b6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                v3VarArr[i20] = v3Var;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            ((TextView) this.W[i20].f4832c).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.W[i20].f4832c).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.W[i20].f4832c).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                k7.d6.a(this.W[i20]);
                this.W[i20].setOnClickListener(new y0(this, i20, 0));
                this.W[i20].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.V;
                dg.v3[] v3VarArr2 = this.W;
                dg.v3 v3Var2 = v3VarArr2[i20];
                if (i20 != v3VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(v3Var2, k7.b6.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i20++;
                i17 = 17;
                i15 = -1;
                i19 = -1879048193;
            } else {
                this.f12644i0.addView(this.V, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f12644i0, k7.b6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.f19995i5), getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
                View view = new View(context);
                this.f12648n0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = k7.b6.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f12642g0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                pg.b c11 = this.f12652r0.c(this.f12642g0, null, false);
                c11.o(AndroidUtilities.dp(4.0f));
                c11.p(AndroidUtilities.dp(28.0f));
                c11.n(new qg.b(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                this.f12642g0.setBackground(c11);
                this.containerView.addView(this.f12642g0, k7.b6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f12653s0 = new f1((TL_stars.starGiftAttributeBackdrop) mf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) mf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) mf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f12643h0.N(false);
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
        ng.e eVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f12650p0) != null) {
            if (k7.w8.a(i10, 2)) {
                org.telegram.ui.ActionBar.e3 e3Var = this.container;
                i1 i1Var = this.f12642g0;
                PointF pointF = this.f12657w0;
                ug.i.b(i1Var, e3Var, pointF);
                float f10 = pointF.x;
                RectF rectF = this.f12656v0;
                rectF.left = f10;
                rectF.top = pointF.y;
                rectF.right = f10 + i1Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + i1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f11 = -dp;
                    rectF.inset(f11, f11);
                    eVar.g(1, this.f12658x0);
                } else {
                    return;
                }
            }
            if (eVar.f15003j != 0) {
                eVar.e(this.f12649o0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(f1 f1Var) {
        if (this.f12660z0 != 1) {
            int i10 = this.f12642g0.f12578r;
            f1 f1Var2 = this.f12653s0;
            if (f1Var2 != null) {
                if (i10 == 1) {
                    if (f1Var.f12393a != f1Var2.f12393a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (f1Var.f12394b != f1Var2.f12394b) {
                        return false;
                    }
                } else if (i10 != 0 || f1Var.f12395c != f1Var2.f12395c) {
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
        if (this.f12660z0 == i10) {
            return;
        }
        this.f12660z0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f12646k0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.m0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z4) {
        c1 c1Var = this.f12647l0;
        if (c1Var.getUpgradeImageViewAttribute() != null && c1Var.getUpgradeBackdropAttribute() != null && c1Var.getUpgradePatternAttribute() != null) {
            dg.v3[] v3VarArr = this.W;
            ((org.telegram.ui.Components.k6) v3VarArr[0].d).c(c1Var.getUpgradeImageViewAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) v3VarArr[0].f4831b).setText(g5.J1(c1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.k6) v3VarArr[1].d).c(c1Var.getUpgradeBackdropAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) v3VarArr[1].f4831b).c(rh.k.G0(c1Var.getUpgradeBackdropAttribute().getRarityPermille()), z4, true);
            ((org.telegram.ui.Components.k6) v3VarArr[2].d).c(c1Var.getUpgradePatternAttribute().name, z4, true);
            ((org.telegram.ui.Components.k6) v3VarArr[2].f4831b).c(rh.k.G0(c1Var.getUpgradePatternAttribute().getRarityPermille()), z4, true);
        }
    }

    public final void U() {
        h1 h1Var;
        f1 f1Var;
        sl0 sl0Var = this.d;
        int childCount = sl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sl0Var.getChildAt(i10);
            if ((childAt instanceof h1) && (f1Var = (h1Var = (h1) childAt).v) != null) {
                boolean R = R(f1Var);
                h1Var.f12530c.f(R, true);
                h1Var.f12533r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.f12644i0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f11) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        ng.e eVar;
        sg.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (eVar = this.f12650p0) != null && (dVar = this.f12651q0) != null && !dVar.f44314n && dVar.e(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19995i5));
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
        if (this.f12659y0 != systemBottomInset) {
            this.f12659y0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            i1 i1Var = this.f12642g0;
            ((ViewGroup.MarginLayoutParams) i1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f12659y0;
            i1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        d1 d1Var = new d1(this, this.d, getContext(), this.U, new dg.r1(this, 17), this.resourcesProvider);
        this.f12643h0 = d1Var;
        d1Var.f30240r = false;
        return d1Var;
    }

    @Override
    public final sl0 w(Context context) {
        return new e1(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
