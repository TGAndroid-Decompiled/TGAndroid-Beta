package bi;

import a8.pf;
import android.content.Context;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.k60;
public final class x1 extends org.telegram.ui.Components.bb {
    public static final int A0 = 0;
    public final int X;
    public final LinearLayout Y;
    public final t1[] Z;
    public final ArrayList f5642a0;
    public final ArrayList f5643b0;
    public final ArrayList f5644c0;
    public final ArrayList f5645d0;
    public final a f5646e0;
    public final a f5647f0;
    public final a f5648g0;
    public final vz f5649h0;
    public final o1 f5650i0;
    public final w1 f5651j0;
    public q1 f5652k0;
    public final FrameLayout f5653l0;
    public final ImageView m0;
    public final ImageView f5654n0;
    public final p1 f5655o0;
    public final TextView f5656p0;
    public final View f5657q0;
    public final ch.f f5658r0;
    public final ch.b f5659s0;
    public s1 f5660t0;
    public final boolean f5661u0;
    public boolean f5662v0;
    public final ch.j f5663w0;
    public int f5664x0;
    public int f5665y0;
    public int f5666z0;

    public x1(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, u6Var);
        this.f5666z0 = 1;
        this.X = i10;
        this.f5661u0 = z10;
        ArrayList c10 = bg.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f5642a0 = c10;
        a aVar = new a(c10);
        this.f5646e0 = aVar;
        aVar.f4242a = false;
        ArrayList c11 = bg.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f5643b0 = c11;
        a aVar2 = new a(c11);
        this.f5647f0 = aVar2;
        aVar2.f4242a = false;
        this.f5644c0 = bg.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList2 = new ArrayList();
        this.f5645d0 = arrayList2;
        if (z10) {
            int i11 = 0;
            while (i11 < this.f5644c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f5644c0.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f5645d0.add(stargiftattributemodel);
                    this.f5644c0.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.f5642a0, Comparator$CC.comparingDouble(new m1(0)));
        List.EL.sort(this.f5643b0, Comparator$CC.comparingDouble(new m1(1)));
        List.EL.sort(this.f5644c0, Comparator$CC.comparingDouble(new m1(2)));
        List.EL.sort(this.f5645d0, Comparator$CC.comparingDouble(new m1(2)));
        a aVar3 = new a(this.f5644c0);
        this.f5648g0 = aVar3;
        aVar3.f4242a = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int Q = Q();
        this.f5665y0 = Q;
        setBackgroundColor(Q);
        fixNavigationBar();
        hh.c d = this.glassEngine.d(new n1(this));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.f5658r0 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(d);
            dVar.f12840f = d;
            dVar.d = fVar;
            dVar.e = -2;
            ch.b bVar = new ch.b(dVar);
            this.f5659s0 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.f6299b = dp;
            bVar.f6300c = dp;
        } else {
            this.f5658r0 = null;
            this.f5659s0 = new ch.b(d);
        }
        this.f5659s0.h = this.glassEngine;
        vz vzVar = new vz(3, false);
        this.f5649h0 = vzVar;
        vzVar.O = new ai.l(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(vzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ai.b(this, 4));
        this.glassEngine.b(this.d);
        ?? lVar = new s4.l();
        this.f5650i0 = lVar;
        lVar.C = false;
        lVar.f47798m = false;
        lVar.n(280L);
        lVar.o(ds.h);
        lVar.D = 30L;
        this.d.setItemAnimator(lVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5653l0 = frameLayout;
        frameLayout.setClipChildren(false);
        p1 p1Var = new p1(this, context, u6Var, new a3.d(this, 22), new bh.f(1), new bh.f(1), new bh.f(1), new bh.f(1), new bh.f(1), new bh.f(1));
        this.f5655o0 = p1Var;
        p1Var.d(new c6(1, 1));
        p1Var.setPreviewingAttributes(arrayList);
        p1Var.removeView(p1Var.P);
        int i12 = -1;
        frameLayout.addView(p1Var, kb1.g(-1.0f, -1));
        int i13 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i13, 0, i13, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.y6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ai.s(this, 6));
        kb1.b(imageView);
        frameLayout.addView(imageView, kb1.h(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5654n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new q(3, this, arrayList));
        kb1.b(imageView2);
        frameLayout.addView(imageView2, kb1.h(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i14 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, kb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f5656p0 = k10;
        float f7 = 13.0f;
        k10.setTextSize(1, 13.0f);
        k10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        k10.setGravity(17);
        int i15 = -1879048193;
        k10.setTextColor(-1879048193);
        frameLayout.addView(k10, kb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new t1[3];
        this.f5651j0 = new w1(context, u6Var, new ai.i(this, 5));
        int i16 = 0;
        while (true) {
            t1[] t1VarArr = this.Z;
            if (i16 < t1VarArr.length) {
                t1 t1Var = new t1(context);
                float f10 = f7;
                t1Var.setClipChildren(false);
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
                t1Var.f5438c = s6Var;
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextSize(AndroidUtilities.dp(f10));
                s6Var.setTextColor(i12);
                s6Var.setGravity(i14);
                t1Var.addView(s6Var, kb1.h(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                t1Var.f5437b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i15);
                textView2.setGravity(i14);
                t1Var.addView(textView2, kb1.h(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
                t1Var.d = s6Var2;
                s6Var2.setTypeface(AndroidUtilities.bold());
                s6Var2.setTextColor(i12);
                s6Var2.setGravity(5);
                s6Var2.getDrawable().T = true;
                s6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                s6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                s6Var2.setSizeableBackground(new p6(AndroidUtilities.dp(10.0f), 285212671));
                t1Var.addView(s6Var2, kb1.h(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                t1VarArr[i16] = t1Var;
                if (i16 == 0) {
                    ((TextView) this.Z[i16].f5437b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                } else if (i16 == 1) {
                    ((TextView) this.Z[i16].f5437b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                } else if (i16 == 2) {
                    ((TextView) this.Z[i16].f5437b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                }
                kb1.b(this.Z[i16]);
                this.Z[i16].setOnClickListener(new ai.w(this, i16, 1));
                this.Z[i16].setBackground(org.telegram.ui.ActionBar.y6.a0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                t1[] t1VarArr2 = this.Z;
                linearLayout2.addView(t1VarArr2[i16], kb1.t(0, 42, 1.0f, 7, 0, 0, i16 != t1VarArr2.length - 1 ? 11 : 0, 0));
                i16++;
                f7 = f10;
                i14 = 17;
                i12 = -1;
                i15 = -1879048193;
            } else {
                this.f5653l0.addView(this.Y, kb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f5653l0, kb1.i(-1, 315, 55));
                int Q2 = Q();
                View view = new View(context);
                this.f5657q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(Q2, 160), Q2 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams i17 = kb1.i(-1, 0, 48);
                i17.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, i17);
                this.f5651j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                eh.d c12 = this.f5659s0.c(this.f5651j0, null, false);
                c12.w(AndroidUtilities.dp(4.0f));
                c12.x(AndroidUtilities.dp(28.0f));
                c12.v(new fh.b(org.telegram.ui.ActionBar.y6.f23357d6, u6Var));
                this.f5651j0.setBackground(c12);
                this.containerView.addView(this.f5651j0, kb1.h(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f5660t0 = new s1((TL_stars.starGiftAttributeBackdrop) bg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) bg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) bg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f5652k0.O(false);
                U(false);
                nm0 nm0Var = this.d;
                ViewGroup viewGroup = this.containerView;
                Objects.requireNonNull(nm0Var);
                this.f5663w0 = new ch.j(nm0Var, viewGroup, new k60(nm0Var, 0));
                this.glassEngine.i(this.containerView);
                oi.q qVar = this.glassEngine;
                qVar.f19481a = new n1(this);
                qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
                return;
            }
        }
    }

    public static void P(x1 x1Var, int i10) {
        ch.f fVar = x1Var.f5658r0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (pf.a(i10, 4)) {
                fVar.h(x1Var.glassEngine.e());
            }
            fVar.e(x1Var.f5663w0, x1Var.containerView.getWidth(), x1Var.containerView.getHeight());
        }
    }

    public static double R(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final int Q() {
        return i0.a.f(0.1f, getThemedColor(org.telegram.ui.ActionBar.y6.f23448i5), getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
    }

    public final boolean S(s1 s1Var) {
        if (this.f5666z0 != 1) {
            int i10 = this.f5651j0.f5593s;
            s1 s1Var2 = this.f5660t0;
            if (s1Var2 != null) {
                if (i10 == 1) {
                    if (s1Var.f5384a != s1Var2.f5384a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (s1Var.f5385b != s1Var2.f5385b) {
                        return false;
                    }
                } else if (i10 != 0 || s1Var.f5386c != s1Var2.f5386c) {
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
        if (this.f5666z0 == i10) {
            return;
        }
        this.f5666z0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f5654n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f5656p0.setText(LocaleController.getString(i12));
        V();
    }

    public final void U(boolean z10) {
        p1 p1Var = this.f5655o0;
        if (p1Var.getUpgradeImageViewAttribute() != null && p1Var.getUpgradeBackdropAttribute() != null && p1Var.getUpgradePatternAttribute() != null) {
            t1[] t1VarArr = this.Z;
            ((org.telegram.ui.Components.s6) t1VarArr[0].f5438c).c(p1Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) t1VarArr[0].d).setText(h7.d2(p1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.s6) t1VarArr[1].f5438c).c(p1Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) t1VarArr[1].d).c(hi.k.F0(p1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.s6) t1VarArr[2].f5438c).c(p1Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) t1VarArr[2].d).c(hi.k.F0(p1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void V() {
        v1 v1Var;
        s1 s1Var;
        nm0 nm0Var = this.d;
        int childCount = nm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = nm0Var.getChildAt(i10);
            if ((childAt instanceof v1) && (s1Var = (v1Var = (v1) childAt).v) != null) {
                boolean S = S(s1Var);
                v1Var.f5540c.f(S, true);
                v1Var.f5543r.a(S, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f5653l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.f5664x0 != systemBottomInset) {
            this.f5664x0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            w1 w1Var = this.f5651j0;
            ((ViewGroup.MarginLayoutParams) w1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f5664x0;
            w1Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.glassEngine.g();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int Q = Q();
            if (Q != this.f5665y0) {
                this.f5665y0 = Q;
                setBackgroundColor(Q);
                View view = this.f5657q0;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(Q, 160), Q & 16777215});
                }
            }
            w1 w1Var = this.f5651j0;
            if (w1Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Wk;
                org.telegram.ui.ActionBar.u6 u6Var = w1Var.f5592r;
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.09411765f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                org.telegram.ui.ActionBar.y6.o1(0.1254902f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                w1Var.e.setColor(o12);
                w1Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        q1 q1Var = new q1(this, this.d, getContext(), this.X, new ai.e(this, 6), this.resourcesProvider);
        this.f5652k0 = q1Var;
        q1Var.f29878r = false;
        return q1Var;
    }

    @Override
    public final nm0 w(Context context) {
        return new r1(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
