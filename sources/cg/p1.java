package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bg.c3;
import bg.x2;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fw0;
import org.telegram.ui.gw0;
public final class p1 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public final gw0 F;
    public int G;
    public int H;
    public int I;
    public m1 J;
    public final org.telegram.ui.ActionBar.o2 f3263b;
    public final d1 f3264c;
    public final ArrayList d;
    public float f3265e;
    public float f3266f;
    public boolean h;
    public final j1 f3267n;
    public final bg.d1 f3268r;
    public int f3269s;
    public final FrameLayout v;
    public boolean f3270w;
    public final SvgHelper.SvgDrawable f3271x;
    public final int f3272y;

    public p1(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        int i11;
        fw0 fw0Var = (fw0) this.d.get(i10);
        int i12 = fw0Var.f38243a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f3070b.setOnScrollListener(new g1(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new k2(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new a1(context, this.resourcesProvider);
            }
            return new w2(context, this.f3271x, this.currentAccount, fw0Var.f38243a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            m mVar = new m(context, i11, this.resourcesProvider);
            mVar.f3070b.setOnScrollListener(new g1(this, 0));
            return mVar;
        }
    }

    public final void B() {
        boolean z10 = this.B;
        d1 d1Var = this.f3264c;
        if (z10) {
            d1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.A) {
            int i10 = this.f3272y;
            if (i10 == 4) {
                d1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                d1Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                d1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                d1Var.setIcon(R.raw.unlock_icon);
            } else {
                d1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            d1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.F));
        }
    }

    public final void C() {
        this.B = true;
        d1 d1Var = this.f3264c;
        d1Var.h = false;
        d1Var.d(true);
        B();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            j1 j1Var = this.f3267n;
            if (i10 >= j1Var.getChildCount()) {
                return true;
            }
            o1 o1Var = (o1) j1Var.getChildAt(i10);
            if (o1Var.f3239a == this.C) {
                ViewGroup viewGroup = o1Var.f3243f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f3070b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.billingProductDetailsUpdated && i10 != NotificationCenter.premiumPromoUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
                d1 d1Var = this.f3264c;
                if (isPremium) {
                    d1Var.c(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                d1Var.h = false;
                d1Var.d(true);
                return;
            }
            return;
        }
        B();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        m1 m1Var = new m1(this, getContext(), 0);
        this.J = m1Var;
        m1Var.setBackgroundColor(getThemedColor(g6.f23133h5));
        this.J.setTitleColor(getThemedColor(g6.G6));
        this.J.B(getThemedColor(g6.f23452z8), false);
        m1 m1Var2 = this.J;
        int i10 = g6.y8;
        m1Var2.C(getThemedColor(i10), false);
        this.J.C(getThemedColor(i10), true);
        this.J.setCastShadows(true);
        this.J.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.J.setBackButtonImage(R.drawable.ic_ab_back);
        this.J.setActionBarMenuOnItemClick(new n1(this, 0));
        this.containerView.addView(this.J, f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.J, false, 1.0f, false);
        int i11 = this.C;
        ArrayList arrayList = this.d;
        if (((fw0) arrayList.get(i11)).f38243a == 14) {
            this.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.J.requestLayout();
        } else if (((fw0) arrayList.get(this.C)).f38243a == 28) {
            this.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.J.requestLayout();
        } else if (((fw0) arrayList.get(this.C)).f38243a == 40) {
            this.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.J.requestLayout();
        } else {
            this.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.J.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        j1 j1Var = this.f3267n;
        if (j1Var.getChildCount() > 0) {
            o1 o1Var = (o1) j1Var.getChildAt(0);
            ViewGroup viewGroup = o1Var.f3243f;
            if (viewGroup instanceof a1) {
                a1 a1Var = (a1) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o1Var.getMeasuredWidth(), 0.0f);
                a1Var.setOffset(o1Var.getMeasuredWidth());
                this.f3270w = true;
                ofFloat.addUpdateListener(new c1(a1Var, 1));
                ofFloat.addListener(new c3(1, this, a1Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(jr.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void y() {
        j1 j1Var;
        int i10;
        float f9;
        View m10;
        View m11;
        int i11 = -1;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            j1Var = this.f3267n;
            if (i13 >= j1Var.getChildCount()) {
                break;
            }
            o1 o1Var = (o1) j1Var.getChildAt(i13);
            int i14 = o1Var.f3239a;
            ViewGroup viewGroup = o1Var.f3243f;
            if (i14 == this.C && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f3071c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (o1Var.f3239a == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f3071c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.H;
        if (i11 >= 0) {
            float f10 = 1.0f - this.E;
            i15 = Math.min(i15, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.E;
            i15 = Math.min(i15, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, this.H, i12 * f11));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f3266f);
        if (this.f3265e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        bg.d1 d1Var = this.f3268r;
        if (z11) {
            i10 = d1Var.getMeasuredWidth();
        } else {
            i10 = -d1Var.getMeasuredWidth();
        }
        d1Var.setTranslationX(i10 * this.f3266f);
        if (i15 != this.I) {
            this.I = i15;
            for (int i16 = 0; i16 < j1Var.getChildCount(); i16++) {
                if (!((o1) j1Var.getChildAt(i16)).h) {
                    j1Var.getChildAt(i16).setTranslationY(this.I);
                }
            }
            d1Var.setTranslationY(this.I);
            frameLayout.setTranslationY(this.I);
            this.containerView.invalidate();
            int i17 = this.I;
            if (this.f3272y == 40) {
                f9 = 5.0f;
            } else {
                f9 = 30.0f;
            }
            if (i17 < AndroidUtilities.dp(f9)) {
                z10 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.J, z10, 1.0f, true);
        }
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, int i11, boolean z10) {
        this(o2Var, context, i10, false, i11, z10, null);
    }

    public p1(org.telegram.ui.ActionBar.o2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.gw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: cg.p1.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.gw0):void");
    }

    public p1(org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, gw0 gw0Var, c6 c6Var) {
        super(context, c6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.G = 255;
        this.f3263b = o2Var;
        this.F = gw0Var;
        fixNavigationBar(getThemedColor(g6.f23133h5));
        this.f3272y = i11;
        this.A = z11;
        this.f3271x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        x2 x2Var = new x2(this, getContext(), 4);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new fw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((fw0) this.d.get(i12)).f38243a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((fw0) this.d.get(i12));
            i12 = 0;
        }
        fw0 fw0Var = (fw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        r1 r1Var = new r1(g6.ak, g6.bk, g6.ck, -1, null);
        r1Var.f3327o = 1.1f;
        r1Var.f3328p = 1.5f;
        r1Var.f3329q = -0.2f;
        r1Var.f3325m = true;
        bg.d1 d1Var = new bg.d1(this, getContext(), r1Var, 1);
        this.f3268r = d1Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k9 = i0.a.k(-1, 40);
        int k10 = i0.a.k(-1, 100);
        imageView.setBackground(g6.i0(dp, dp, dp, dp, k9, k10, k10));
        frameLayout.addView(imageView, f6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f3110b;

            {
                this.f3110b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3110b.dismiss();
                        return;
                    default:
                        this.f3110b.dismiss();
                        return;
                }
            }
        });
        x2Var.addView(d1Var, f6.t(-1, -2, 1, 0, 16, 0, 0));
        j1 j1Var = new j1(this, getContext());
        this.f3267n = j1Var;
        j1Var.setOverScrollMode(2);
        j1Var.setOffscreenPageLimit(0);
        j1Var.setAdapter(new k1(this, 0));
        this.C = i12;
        j1Var.setCurrentItem(i12);
        x2Var.addView(j1Var, f6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        x2Var.addView(frameLayout, f6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        pa paVar = new pa(getContext(), j1Var, this.d.size());
        j1Var.b(new l1(this, paVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(x2Var);
        linearLayout.setOrientation(1);
        int i13 = g6.V8;
        int i14 = g6.P9;
        paVar.f31626n = i13;
        paVar.f31627r = i14;
        if (!z11) {
            linearLayout.addView(paVar, f6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        d1 d1Var2 = new d1(getContext(), c6Var, true);
        this.f3264c = d1Var2;
        d1Var2.f3095r.setOnClickListener(new f1(this, o2Var, z11, fw0Var, 0));
        d1Var2.f3092e.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f3110b;

            {
                this.f3110b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3110b.dismiss();
                        return;
                    default:
                        this.f3110b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(d1Var2, f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(g6.f23133h5));
        linearLayout.addView(frameLayout2, f6.q(-1, 68, 80));
        if (i11 == 40) {
            d1Var2.c(h5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            d1Var2.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        bg.u1 u1Var = new bg.u1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = u1Var;
        int i15 = this.backgroundPaddingLeft;
        u1Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
