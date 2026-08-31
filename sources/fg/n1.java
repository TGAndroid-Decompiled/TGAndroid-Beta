package fg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import eg.w2;
import java.util.ArrayList;
import k7.c6;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rw0;
import org.telegram.ui.sw0;
public final class n1 extends h3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public final sw0 G;
    public int H;
    public int I;
    public int J;
    public k1 K;
    public final org.telegram.ui.ActionBar.p2 f6411b;
    public final b1 f6412c;
    public final ArrayList d;
    public float f6413e;
    public float f6414f;
    public boolean h;
    public final h1 f6415n;
    public final ag.l f6416r;
    public int f6417s;
    public final FrameLayout v;
    public boolean f6418w;
    public final SvgHelper.SvgDrawable f6419x;
    public final int f6420y;

    public n1(Context context, int i10, g6 g6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, g6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        int i11;
        rw0 rw0Var = (rw0) this.d.get(i10);
        int i12 = rw0Var.f41056a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f6240b.setOnScrollListener(new e1(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new i2(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new z0(context, this.resourcesProvider);
            }
            return new t2(context, this.f6419x, this.currentAccount, rw0Var.f41056a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            m mVar = new m(context, i11, this.resourcesProvider);
            mVar.f6240b.setOnScrollListener(new e1(this, 0));
            return mVar;
        }
    }

    public final void B() {
        boolean z4 = this.C;
        b1 b1Var = this.f6412c;
        if (z4) {
            b1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.B) {
            int i10 = this.f6420y;
            if (i10 == 4) {
                b1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                b1Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                b1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                b1Var.setIcon(R.raw.unlock_icon);
            } else {
                b1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            b1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.G));
        }
    }

    public final void C() {
        this.C = true;
        b1 b1Var = this.f6412c;
        b1Var.h = false;
        b1Var.d(true);
        B();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            h1 h1Var = this.f6415n;
            if (i10 >= h1Var.getChildCount()) {
                return true;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i10);
            if (m1Var.f6390a == this.D) {
                ViewGroup viewGroup = m1Var.f6394f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f6240b.canScrollVertically(-1);
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
                b1 b1Var = this.f6412c;
                if (isPremium) {
                    b1Var.c(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                b1Var.h = false;
                b1Var.d(true);
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
        k1 k1Var = new k1(this, getContext(), 0);
        this.K = k1Var;
        k1Var.setBackgroundColor(getThemedColor(k6.f21731h5));
        this.K.setTitleColor(getThemedColor(k6.G6));
        this.K.B(getThemedColor(k6.f22055z8), false);
        k1 k1Var2 = this.K;
        int i10 = k6.f22038y8;
        k1Var2.C(getThemedColor(i10), false);
        this.K.C(getThemedColor(i10), true);
        this.K.setCastShadows(true);
        this.K.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.K.setBackButtonImage(R.drawable.ic_ab_back);
        this.K.setActionBarMenuOnItemClick(new l1(this, 0));
        this.containerView.addView(this.K, c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.K.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.K, false, 1.0f, false);
        int i11 = this.D;
        ArrayList arrayList = this.d;
        if (((rw0) arrayList.get(i11)).f41056a == 14) {
            this.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.K.requestLayout();
        } else if (((rw0) arrayList.get(this.D)).f41056a == 28) {
            this.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.K.requestLayout();
        } else if (((rw0) arrayList.get(this.D)).f41056a == 40) {
            this.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.K.requestLayout();
        } else {
            this.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.K.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        h1 h1Var = this.f6415n;
        if (h1Var.getChildCount() > 0) {
            m1 m1Var = (m1) h1Var.getChildAt(0);
            ViewGroup viewGroup = m1Var.f6394f;
            if (viewGroup instanceof z0) {
                z0 z0Var = (z0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.getMeasuredWidth(), 0.0f);
                z0Var.setOffset(m1Var.getMeasuredWidth());
                this.f6418w = true;
                ofFloat.addUpdateListener(new f2.d0(z0Var, 2));
                ofFloat.addListener(new w2(1, this, z0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(pr.h);
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
        h1 h1Var;
        int i10;
        float f10;
        View m9;
        View m10;
        int i11 = -1;
        boolean z4 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            h1Var = this.f6415n;
            if (i13 >= h1Var.getChildCount()) {
                break;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i13);
            int i14 = m1Var.f6390a;
            ViewGroup viewGroup = m1Var.f6394f;
            if (i14 == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f6241c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            if (m1Var.f6390a == this.E && (viewGroup instanceof b) && ((m9 = ((b) viewGroup).f6241c.m(0)) == null || (i12 = m9.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f6414f);
        if (this.f6413e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        ag.l lVar = this.f6416r;
        if (z10) {
            i10 = lVar.getMeasuredWidth();
        } else {
            i10 = -lVar.getMeasuredWidth();
        }
        lVar.setTranslationX(i10 * this.f6414f);
        if (i15 != this.J) {
            this.J = i15;
            for (int i16 = 0; i16 < h1Var.getChildCount(); i16++) {
                if (!((m1) h1Var.getChildAt(i16)).h) {
                    h1Var.getChildAt(i16).setTranslationY(this.J);
                }
            }
            lVar.setTranslationY(this.J);
            frameLayout.setTranslationY(this.J);
            this.containerView.invalidate();
            int i17 = this.J;
            if (this.f6420y == 40) {
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

    public n1(org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4) {
        this(p2Var, p2Var.getContext(), p2Var.getCurrentAccount(), false, i10, z4, null);
    }

    public n1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, int i11, boolean z4) {
        this(p2Var, context, i10, false, i11, z4, null);
    }

    public n1(org.telegram.ui.ActionBar.p2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.sw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: fg.n1.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.sw0):void");
    }

    public n1(org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, boolean z4, int i11, boolean z10, sw0 sw0Var, g6 g6Var) {
        super(context, g6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.H = 255;
        this.f6411b = p2Var;
        this.G = sw0Var;
        fixNavigationBar(getThemedColor(k6.f21731h5));
        this.f6420y = i11;
        this.B = z10;
        this.f6419x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        eg.s2 s2Var = new eg.s2(this, getContext(), 4);
        if (!z4 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new rw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((rw0) this.d.get(i12)).f41056a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z10) {
            this.d.clear();
            this.d.add((rw0) this.d.get(i12));
            i12 = 0;
        }
        rw0 rw0Var = (rw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        p1 p1Var = new p1(k6.ak, k6.bk, k6.ck, -1, null);
        p1Var.f6498o = 1.1f;
        p1Var.f6499p = 1.5f;
        p1Var.f6500q = -0.2f;
        p1Var.f6496m = true;
        ag.l lVar = new ag.l(this, getContext(), p1Var, 3);
        this.f6416r = lVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(k6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, c6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final n1 f6260b;

            {
                this.f6260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6260b.dismiss();
                        return;
                    default:
                        this.f6260b.dismiss();
                        return;
                }
            }
        });
        s2Var.addView(lVar, c6.t(-1, -2, 1, 0, 16, 0, 0));
        h1 h1Var = new h1(this, getContext());
        this.f6415n = h1Var;
        h1Var.setOverScrollMode(2);
        h1Var.setOffscreenPageLimit(0);
        h1Var.setAdapter(new i1(this, 0));
        this.D = i12;
        h1Var.setCurrentItem(i12);
        s2Var.addView(h1Var, c6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        s2Var.addView(frameLayout, c6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ka kaVar = new ka(getContext(), h1Var, this.d.size());
        h1Var.b(new j1(this, kaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(s2Var);
        linearLayout.setOrientation(1);
        int i13 = k6.V8;
        int i14 = k6.P9;
        kaVar.f28356n = i13;
        kaVar.f28357r = i14;
        if (!z10) {
            linearLayout.addView(kaVar, c6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        b1 b1Var = new b1(getContext(), g6Var, true);
        this.f6412c = b1Var;
        b1Var.f6250r.setOnClickListener(new d1(this, p2Var, z10, rw0Var, 0));
        b1Var.f6247e.setOnClickListener(new View.OnClickListener(this) {
            public final n1 f6260b;

            {
                this.f6260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6260b.dismiss();
                        return;
                    default:
                        this.f6260b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(b1Var, c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(k6.f21731h5));
        linearLayout.addView(frameLayout2, c6.q(-1, 68, 80));
        if (i11 == 40) {
            b1Var.c(g5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            b1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        eg.q1 q1Var = new eg.q1(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = q1Var;
        int i15 = this.backgroundPaddingLeft;
        q1Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
