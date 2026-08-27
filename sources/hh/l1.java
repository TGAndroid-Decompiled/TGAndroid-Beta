package hh;

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
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.os;

public final class l1 extends org.telegram.ui.Components.qa {

    public static final int f9637z0 = 0;
    public final int T;
    public final LinearLayout U;
    public final h1[] V;
    public final ArrayList W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;

    public final com.google.android.gms.common.api.internal.r f9638a0;

    public final com.google.android.gms.common.api.internal.r f9639b0;

    public final com.google.android.gms.common.api.internal.r f9640c0;

    public final bz f9641d0;

    public final c1 f9642e0;

    public final k1 f9643f0;

    public e1 f9644g0;

    public final FrameLayout f9645h0;

    public final ImageView f9646i0;

    public final ImageView f9647j0;

    public final d1 f9648k0;

    public final TextView f9649l0;
    public final View m0;

    public final jg.k f9650n0;

    public final jg.e f9651o0;

    public final og.d f9652p0;

    public final jg.a f9653q0;

    public g1 f9654r0;

    public final boolean f9655s0;

    public boolean f9656t0;

    public final RectF f9657u0;

    public final PointF f9658v0;

    public final ArrayList f9659w0;

    public int f9660x0;

    public int f9661y0;

    public l1(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, false, 1, c6Var);
        this.f9661y0 = 1;
        RectF rectF = new RectF();
        this.f9657u0 = rectF;
        this.f9658v0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.f9659w0 = arrayList2;
        arrayList2.add(rectF);
        this.T = i10;
        this.f9655s0 = z10;
        zk0 zk0Var = this.d;
        org.telegram.ui.ActionBar.c3 c3Var = this.container;
        Objects.requireNonNull(zk0Var);
        this.f9650n0 = new jg.k(zk0Var, c3Var, new os(zk0Var, 0));
        ArrayList arrayListC = hf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.W = arrayListC;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayListC);
        this.f9638a0 = rVar;
        rVar.f3339b = false;
        ArrayList arrayListC2 = hf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.X = arrayListC2;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(arrayListC2);
        this.f9639b0 = rVar2;
        rVar2.f3339b = false;
        this.Y = hf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.Z = arrayList3;
        if (z10) {
            int i11 = 0;
            while (i11 < this.Y.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Y.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Z.add(stargiftattributemodel);
                    this.Y.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.W, Comparator$CC.comparingDouble(new a1(0)));
        List.EL.sort(this.X, Comparator$CC.comparingDouble(new a1(1)));
        List.EL.sort(this.Y, Comparator$CC.comparingDouble(new a1(2)));
        List.EL.sort(this.Z, Comparator$CC.comparingDouble(new a1(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Y);
        this.f9640c0 = rVar3;
        rVar3.f3339b = false;
        ViewParent parent = this.f31853e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f31853e);
        }
        this.H = false;
        this.G = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i12 = org.telegram.ui.ActionBar.g6.f23143i5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.g6.f23124h5;
        setBackgroundColor(i0.b.d(0.1f, themedColor, getThemedColor(i13)));
        fixNavigationBar();
        og.c cVar = new og.c();
        cVar.a(i0.b.d(0.1f, getThemedColor(i12), getThemedColor(i13)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.f9651o0 = null;
            this.f9652p0 = null;
            this.f9653q0 = new jg.a(cVar);
        } else {
            this.f9651o0 = new jg.e(false);
            og.d dVar = new og.d(cVar);
            this.f9652p0 = dVar;
            final int i14 = 0;
            dVar.v = new Runnable(this) {

                public final l1 f8988b;

                {
                    this.f8988b = this;
                }

                @Override
                public final void run() {
                    switch (i14) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                l1 l1Var = this.f8988b;
                                if (l1Var.f9651o0 != null) {
                                    l1Var.Q(2);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.f8988b.onBackPressed();
                            break;
                    }
                }
            };
            jg.a aVar = new jg.a(dVar);
            this.f9653q0 = aVar;
            aVar.f12944f = LiteMode.isEnabled(262144);
        }
        qg.j jVar = new qg.j(this.container);
        jg.a aVar2 = this.f9653q0;
        org.telegram.ui.ActionBar.c3 c3Var2 = this.container;
        aVar2.d = jVar;
        aVar2.f12943e = c3Var2;
        bz bzVar = new bz(3, false);
        this.f9641d0 = bzVar;
        bzVar.O = new gh.u5(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(bzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ag.z2(this, 7));
        c1 c1Var = new c1();
        this.f9642e0 = c1Var;
        c1Var.C = false;
        c1Var.f5819m = false;
        c1Var.n(280L);
        c1Var.o(er.h);
        c1Var.D = 30L;
        this.d.setItemAnimator(c1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9645h0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i15 = 1;
        d1 d1Var = new d1(this, context, c6Var, new Runnable(this) {

            public final l1 f8988b;

            {
                this.f8988b = this;
            }

            @Override
            public final void run() {
                switch (i15) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            l1 l1Var = this.f8988b;
                            if (l1Var.f9651o0 != null) {
                                l1Var.Q(2);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f8988b.onBackPressed();
                        break;
                }
            }
        }, new ag.l2(4), new ag.l2(4), new ag.l2(4), new ag.l2(4), new ag.l2(4), new ag.l2(4));
        this.f9648k0 = d1Var;
        d1Var.d(new j4(1, 1));
        d1Var.setPreviewingAttributes(arrayList);
        d1Var.removeView(d1Var.K);
        int i16 = -1;
        frameLayout.addView(d1Var, h7.z5.c(-1.0f, -1));
        int i17 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i17, 0, i17, 0);
        ImageView imageView = new ImageView(context);
        this.f9646i0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ag.w0(this, 13));
        h7.b6.a(imageView);
        frameLayout.addView(imageView, h7.z5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9647j0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ag.q0(16, this, arrayList));
        h7.b6.a(imageView2);
        frameLayout.addView(imageView2, h7.z5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i18 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout, textView, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f9649l0 = textViewH;
        textViewH.setTextSize(1, 13.0f);
        textViewH.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        textViewH.setGravity(17);
        int i19 = -1879048193;
        textViewH.setTextColor(-1879048193);
        frameLayout.addView(textViewH, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V = new h1[3];
        this.f9643f0 = new k1(context, c6Var, new ag.n0(this, 14));
        int i20 = 0;
        while (true) {
            h1[] h1VarArr = this.V;
            if (i20 >= h1VarArr.length) {
                this.f9645h0.addView(this.U, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f9645h0, h7.z5.e(-1, 315, 55));
                int iD = i0.b.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f23143i5), getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                View view = new View(context);
                this.m0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.k(iD, 160), iD & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, 0, 48);
                layoutParamsE.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, layoutParamsE);
                this.f9643f0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                lg.d dVarC = this.f9653q0.c(this.f9643f0, null, false);
                dVarC.o(AndroidUtilities.dp(4.0f));
                dVarC.p(AndroidUtilities.dp(28.0f));
                dVarC.n(new mg.b(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                this.f9643f0.setBackground(dVarC);
                this.containerView.addView(this.f9643f0, h7.z5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f9654r0 = new g1((TL_stars.starGiftAttributeBackdrop) hf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) hf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) hf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f9644g0.N(false);
                T(false);
                return;
            }
            h1 h1Var = new h1(context);
            h1Var.setClipChildren(false);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
            h1Var.f9371c = j6Var;
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setTextSize(AndroidUtilities.dp(13.0f));
            j6Var.setTextColor(i16);
            j6Var.setGravity(i18);
            h1Var.addView(j6Var, h7.z5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            h1Var.f9370b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i19);
            textView2.setGravity(i18);
            h1Var.addView(textView2, h7.z5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
            h1Var.d = j6Var2;
            j6Var2.setTypeface(AndroidUtilities.bold());
            j6Var2.setTextColor(i16);
            j6Var2.setGravity(5);
            j6Var2.getDrawable().N = true;
            j6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            j6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            j6Var2.setSizeableBackground(new u4(AndroidUtilities.dp(10.0f), 285212671));
            h1Var.addView(j6Var2, h7.z5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            h1VarArr[i20] = h1Var;
            if (i20 == 0) {
                ((TextView) this.V[i20].f9370b).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i20 == 1) {
                ((TextView) this.V[i20].f9370b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i20 == 2) {
                ((TextView) this.V[i20].f9370b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            h7.b6.a(this.V[i20]);
            this.V[i20].setOnClickListener(new z0(this, i20, 0));
            this.V[i20].setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.U;
            h1[] h1VarArr2 = this.V;
            linearLayout2.addView(h1VarArr2[i20], h7.z5.p(0, 42, 1.0f, 7, 0, 0, i20 != h1VarArr2.length - 1 ? 11 : 0, 0));
            i20++;
            i18 = 17;
            i16 = -1;
            i19 = -1879048193;
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
        return starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon ? 0.04d : 0.0d;
    }

    public final void Q(int i10) {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f9651o0) == null) {
            return;
        }
        if (h7.a8.a(i10, 2)) {
            org.telegram.ui.ActionBar.c3 c3Var = this.container;
            k1 k1Var = this.f9643f0;
            PointF pointF = this.f9658v0;
            qg.j.b(k1Var, c3Var, pointF);
            float f10 = pointF.x;
            RectF rectF = this.f9657u0;
            rectF.left = f10;
            rectF.top = pointF.y;
            rectF.right = f10 + k1Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + k1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f11 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f11, f11);
            eVar.g(1, this.f9659w0);
        }
        if (eVar.f12979j == 0) {
            return;
        }
        eVar.e(this.f9650n0, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean R(g1 g1Var) {
        if (this.f9661y0 == 1) {
            return false;
        }
        int i10 = this.f9643f0.f9573r;
        g1 g1Var2 = this.f9654r0;
        if (g1Var2 == null) {
            return false;
        }
        if (i10 == 1) {
            if (g1Var.f9291a != g1Var2.f9291a) {
                return false;
            }
        } else if (i10 == 2) {
            if (g1Var.f9292b != g1Var2.f9292b) {
                return false;
            }
        } else if (i10 != 0 || g1Var.f9293c != g1Var2.f9293c) {
            return false;
        }
        return true;
    }

    public final void S(int i10) {
        if (this.f9661y0 == i10) {
            return;
        }
        this.f9661y0 = i10;
        this.f9647j0.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.f9649l0.setText(LocaleController.getString(i10 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        U();
    }

    public final void T(boolean z10) {
        d1 d1Var = this.f9648k0;
        if (d1Var.getUpgradeImageViewAttribute() == null || d1Var.getUpgradeBackdropAttribute() == null || d1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        h1[] h1VarArr = this.V;
        ((org.telegram.ui.Components.j6) h1VarArr[0].f9371c).c(d1Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[0].d).setText(i5.J1(d1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.j6) h1VarArr[1].f9371c).c(d1Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[1].d).c(nh.k.G0(d1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[2].f9371c).c(d1Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[2].d).c(nh.k.G0(d1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void U() {
        j1 j1Var;
        g1 g1Var;
        zk0 zk0Var = this.d;
        int childCount = zk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt instanceof j1) && (g1Var = (j1Var = (j1) childAt).v) != null) {
                boolean zR = R(g1Var);
                j1Var.f9512c.f(zR, true);
                j1Var.f9516r.a(zR, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.f9645h0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        jg.e eVar;
        og.d dVar;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (eVar = this.f9651o0) == null || (dVar = this.f9652p0) == null || dVar.f19455n || !dVar.e(width, height)) {
            return;
        }
        RecordingCanvas recordingCanvasA = dVar.a(width, height);
        recordingCanvasA.drawColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23143i5));
        eVar.b(recordingCanvasA, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.b();
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.f9660x0 != systemBottomInset) {
            this.f9660x0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            k1 k1Var = this.f9643f0;
            ((ViewGroup.MarginLayoutParams) k1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f9660x0;
            k1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        e1 e1Var = new e1(this, this.d, getContext(), this.T, new ch.c(this, 16), this.resourcesProvider);
        this.f9644g0 = e1Var;
        e1Var.f26942r = false;
        return e1Var;
    }

    @Override
    public final zk0 x(Context context) {
        return new f1(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
