package eg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import dg.y2;
import java.util.ArrayList;
import k7.b6;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.nr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pw0;
import org.telegram.ui.qw0;
public final class o1 extends g3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public final qw0 G;
    public int H;
    public int I;
    public int J;
    public l1 K;
    public final org.telegram.ui.ActionBar.p2 f5391b;
    public final c1 f5392c;
    public final ArrayList d;
    public float e;
    public float f5393f;
    public boolean h;
    public final i1 f5394n;
    public final ah.d f5395r;
    public int f5396s;
    public final FrameLayout v;
    public boolean f5397w;
    public final SvgHelper.SvgDrawable f5398x;
    public final int f5399y;

    public o1(Context context, int i10, f6 f6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, f6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        int i11;
        pw0 pw0Var = (pw0) this.d.get(i10);
        int i12 = pw0Var.f37545a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f5219b.setOnScrollListener(new f1(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new j2(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new z0(context, this.resourcesProvider);
            }
            return new u2(context, this.f5398x, this.currentAccount, pw0Var.f37545a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            m mVar = new m(context, i11, this.resourcesProvider);
            mVar.f5219b.setOnScrollListener(new f1(this, 0));
            return mVar;
        }
    }

    public final void B() {
        boolean z4 = this.C;
        c1 c1Var = this.f5392c;
        if (z4) {
            c1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.B) {
            int i10 = this.f5399y;
            if (i10 == 4) {
                c1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                c1Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                c1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                c1Var.setIcon(R.raw.unlock_icon);
            } else {
                c1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            c1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.G));
        }
    }

    public final void C() {
        this.C = true;
        c1 c1Var = this.f5392c;
        c1Var.h = false;
        c1Var.d(true);
        B();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            i1 i1Var = this.f5394n;
            if (i10 >= i1Var.getChildCount()) {
                return true;
            }
            n1 n1Var = (n1) i1Var.getChildAt(i10);
            if (n1Var.f5368a == this.D) {
                ViewGroup viewGroup = n1Var.f5371f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f5219b.canScrollVertically(-1);
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
                c1 c1Var = this.f5392c;
                if (isPremium) {
                    c1Var.c(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                c1Var.h = false;
                c1Var.d(true);
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
        l1 l1Var = new l1(this, getContext(), 0);
        this.K = l1Var;
        l1Var.setBackgroundColor(getThemedColor(j6.f19977h5));
        this.K.setTitleColor(getThemedColor(j6.G6));
        this.K.B(getThemedColor(j6.f20300z8), false);
        l1 l1Var2 = this.K;
        int i10 = j6.f20283y8;
        l1Var2.C(getThemedColor(i10), false);
        this.K.C(getThemedColor(i10), true);
        this.K.setCastShadows(true);
        this.K.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.K.setBackButtonImage(R.drawable.ic_ab_back);
        this.K.setActionBarMenuOnItemClick(new m1(this, 0));
        this.containerView.addView(this.K, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.K.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.K, false, 1.0f, false);
        int i11 = this.D;
        ArrayList arrayList = this.d;
        if (((pw0) arrayList.get(i11)).f37545a == 14) {
            this.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.K.requestLayout();
        } else if (((pw0) arrayList.get(this.D)).f37545a == 28) {
            this.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.K.requestLayout();
        } else if (((pw0) arrayList.get(this.D)).f37545a == 40) {
            this.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.K.requestLayout();
        } else {
            this.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.K.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        i1 i1Var = this.f5394n;
        if (i1Var.getChildCount() > 0) {
            n1 n1Var = (n1) i1Var.getChildAt(0);
            ViewGroup viewGroup = n1Var.f5371f;
            if (viewGroup instanceof z0) {
                z0 z0Var = (z0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.getMeasuredWidth(), 0.0f);
                z0Var.setOffset(n1Var.getMeasuredWidth());
                this.f5397w = true;
                ofFloat.addUpdateListener(new b1(z0Var, 1));
                ofFloat.addListener(new y2(1, this, z0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(nr.h);
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
        i1 i1Var;
        int i10;
        float f10;
        View m9;
        View m10;
        int i11 = -1;
        boolean z4 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            i1Var = this.f5394n;
            if (i13 >= i1Var.getChildCount()) {
                break;
            }
            n1 n1Var = (n1) i1Var.getChildAt(i13);
            int i14 = n1Var.f5368a;
            ViewGroup viewGroup = n1Var.f5371f;
            if (i14 == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f5220c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            if (n1Var.f5368a == this.E && (viewGroup instanceof b) && ((m9 = ((b) viewGroup).f5220c.m(0)) == null || (i12 = m9.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.I;
        if (i11 >= 0) {
            float f11 = 1.0f - this.F;
            i15 = Math.min(i15, (int) e2.c.w(1.0f, f11, i15, i11 * f11));
        }
        if (i12 >= 0) {
            float f12 = this.F;
            i15 = Math.min(i15, (int) e2.c.w(1.0f, f12, this.I, i12 * f12));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f5393f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        ah.d dVar = this.f5395r;
        if (z10) {
            i10 = dVar.getMeasuredWidth();
        } else {
            i10 = -dVar.getMeasuredWidth();
        }
        dVar.setTranslationX(i10 * this.f5393f);
        if (i15 != this.J) {
            this.J = i15;
            for (int i16 = 0; i16 < i1Var.getChildCount(); i16++) {
                if (!((n1) i1Var.getChildAt(i16)).h) {
                    i1Var.getChildAt(i16).setTranslationY(this.J);
                }
            }
            dVar.setTranslationY(this.J);
            frameLayout.setTranslationY(this.J);
            this.containerView.invalidate();
            int i17 = this.J;
            if (this.f5399y == 40) {
                f10 = 5.0f;
            } else {
                f10 = 30.0f;
            }
            if (i17 < AndroidUtilities.dp(f10)) {
                z4 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.K, z4, 1.0f, true);
        }
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4) {
        this(p2Var, p2Var.getContext(), p2Var.getCurrentAccount(), false, i10, z4, null);
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, int i11, boolean z4) {
        this(p2Var, context, i10, false, i11, z4, null);
    }

    public o1(org.telegram.ui.ActionBar.p2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.qw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: eg.o1.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.qw0):void");
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, qw0 qw0Var, f6 f6Var) {
        super(context, f6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.H = 255;
        this.f5391b = p2Var;
        this.G = qw0Var;
        fixNavigationBar(getThemedColor(j6.f19977h5));
        this.f5399y = i11;
        this.B = z10;
        this.f5398x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        dg.u2 u2Var = new dg.u2(this, getContext(), 4);
        if (!z4 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new pw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((pw0) this.d.get(i12)).f37545a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            this.d.clear();
            this.d.add((pw0) this.d.get(i12));
            i12 = 0;
        }
        pw0 pw0Var = (pw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        q1 q1Var = new q1(j6.ak, j6.bk, j6.ck, -1, null);
        q1Var.f5465o = 1.1f;
        q1Var.f5466p = 1.5f;
        q1Var.f5467q = -0.2f;
        q1Var.f5463m = true;
        ah.d dVar = new ah.d(this, getContext(), q1Var, 2);
        this.f5395r = dVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(j6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f5247b;

            {
                this.f5247b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5247b.dismiss();
                        return;
                    default:
                        this.f5247b.dismiss();
                        return;
                }
            }
        });
        u2Var.addView(dVar, b6.t(-1, -2, 1, 0, 16, 0, 0));
        i1 i1Var = new i1(this, getContext());
        this.f5394n = i1Var;
        i1Var.setOverScrollMode(2);
        i1Var.setOffscreenPageLimit(0);
        i1Var.setAdapter(new j1(this, 0));
        this.D = i12;
        i1Var.setCurrentItem(i12);
        u2Var.addView(i1Var, b6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        u2Var.addView(frameLayout, b6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ka kaVar = new ka(getContext(), i1Var, this.d.size());
        i1Var.b(new k1(this, kaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(u2Var);
        linearLayout.setOrientation(1);
        int i13 = j6.V8;
        int i14 = j6.P9;
        kaVar.f26244n = i13;
        kaVar.f26245r = i14;
        if (!z10) {
            linearLayout.addView(kaVar, b6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        c1 c1Var = new c1(getContext(), f6Var, true);
        this.f5392c = c1Var;
        c1Var.f5232r.setOnClickListener(new e1(this, p2Var, z10, pw0Var, 0));
        c1Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final o1 f5247b;

            {
                this.f5247b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5247b.dismiss();
                        return;
                    default:
                        this.f5247b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(c1Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(j6.f19977h5));
        linearLayout.addView(frameLayout2, b6.q(-1, 68, 80));
        if (i11 == 40) {
            c1Var.c(g5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            c1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        dg.s1 s1Var = new dg.s1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = s1Var;
        int i15 = this.backgroundPaddingLeft;
        s1Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
