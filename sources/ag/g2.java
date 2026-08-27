package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import h7.z5;
import hh.i5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ia;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.hw0;

public final class g2 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public final hw0 F;
    public int G;
    public int H;
    public int I;
    public d2 J;

    public final org.telegram.ui.ActionBar.n2 f390b;

    public final s1 f391c;
    public final ArrayList d;

    public float f392e;

    public float f393f;
    public boolean h;

    public final a2 f394n;

    public final y1 f395r;

    public int f396s;
    public final FrameLayout v;

    public boolean f397w;

    public final SvgHelper.SvgDrawable f398x;

    public final int f399y;

    public g2(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
    }

    public final ViewGroup B(Context context, int i10) {
        gw0 gw0Var = (gw0) this.d.get(i10);
        int i11 = gw0Var.f38486a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.f292b.setOnScrollListener(new v1(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            o oVar = new o(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            oVar.f292b.setOnScrollListener(new v1(this, 0));
            return oVar;
        }
        if (i11 == 5) {
            return new w1(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new n1(context, this.resourcesProvider);
        }
        return new p3(context, this.f398x, this.currentAccount, gw0Var.f38486a, this.resourcesProvider);
    }

    public final void C() {
        boolean z10 = this.B;
        s1 s1Var = this.f391c;
        if (z10) {
            s1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.A) {
            s1Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.F));
            return;
        }
        int i10 = this.f399y;
        if (i10 == 4) {
            s1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            s1Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            s1Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            s1Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            s1Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void D() {
        this.B = true;
        s1 s1Var = this.f391c;
        s1Var.h = false;
        s1Var.d(true);
        C();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            a2 a2Var = this.f394n;
            if (i10 >= a2Var.getChildCount()) {
                return true;
            }
            f2 f2Var = (f2) a2Var.getChildAt(i10);
            if (f2Var.f375a == this.C) {
                ViewGroup viewGroup = f2Var.f379f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f292b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            C();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            s1 s1Var = this.f391c;
            if (zIsPremium) {
                s1Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                s1Var.h = false;
                s1Var.d(true);
            }
        }
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
        d2 d2Var = new d2(this, getContext(), 0);
        this.J = d2Var;
        d2Var.setBackgroundColor(getThemedColor(g6.f23124h5));
        this.J.setTitleColor(getThemedColor(g6.G6));
        this.J.C(getThemedColor(g6.f23443z8), false);
        d2 d2Var2 = this.J;
        int i10 = g6.f23425y8;
        d2Var2.D(getThemedColor(i10), false);
        this.J.D(getThemedColor(i10), true);
        this.J.setCastShadows(true);
        this.J.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.J.setBackButtonImage(R.drawable.ic_ab_back);
        this.J.setActionBarMenuOnItemClick(new e2(this, 0));
        this.containerView.addView(this.J, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.J, false, 1.0f, false);
        int i11 = this.C;
        ArrayList arrayList = this.d;
        if (((gw0) arrayList.get(i11)).f38486a == 14) {
            this.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).f38486a == 28) {
            this.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).f38486a == 40) {
            this.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.J.requestLayout();
        } else {
            this.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.J.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        a2 a2Var = this.f394n;
        if (a2Var.getChildCount() > 0) {
            int i10 = 0;
            f2 f2Var = (f2) a2Var.getChildAt(0);
            ViewGroup viewGroup = f2Var.f379f;
            if (viewGroup instanceof n1) {
                n1 n1Var = (n1) viewGroup;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2Var.getMeasuredWidth(), 0.0f);
                n1Var.setOffset(f2Var.getMeasuredWidth());
                this.f397w = true;
                valueAnimatorOfFloat.addUpdateListener(new q1(n1Var, 1));
                valueAnimatorOfFloat.addListener(new x1(i10, this, n1Var));
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.setStartDelay(100L);
                valueAnimatorOfFloat.setInterpolator(er.h);
                valueAnimatorOfFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void z() {
        a2 a2Var;
        View viewM;
        View viewM2;
        int top = -1;
        int top2 = -1;
        int i10 = 0;
        while (true) {
            a2Var = this.f394n;
            if (i10 >= a2Var.getChildCount()) {
                break;
            }
            f2 f2Var = (f2) a2Var.getChildAt(i10);
            int i11 = f2Var.f375a;
            ViewGroup viewGroup = f2Var.f379f;
            if (i11 == this.C && (viewGroup instanceof b) && ((viewM2 = ((b) viewGroup).f293c.m(0)) == null || (top = viewM2.getTop()) < 0)) {
                top = 0;
            }
            if (f2Var.f375a == this.D && (viewGroup instanceof b) && ((viewM = ((b) viewGroup).f293c.m(0)) == null || (top2 = viewM.getTop()) < 0)) {
                top2 = 0;
            }
            i10++;
        }
        int iMin = this.H;
        if (top >= 0) {
            float f10 = 1.0f - this.E;
            iMin = Math.min(iMin, (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, iMin, top * f10));
        }
        if (top2 >= 0) {
            float f11 = this.E;
            iMin = Math.min(iMin, (int) com.google.android.recaptcha.internal.a.z(1.0f, f11, this.H, top2 * f11));
        }
        float f12 = 1.0f - this.f393f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f12);
        if (this.f392e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        y1 y1Var = this.f395r;
        y1Var.setTranslationX((z10 ? y1Var.getMeasuredWidth() : -y1Var.getMeasuredWidth()) * this.f393f);
        if (iMin != this.I) {
            this.I = iMin;
            for (int i12 = 0; i12 < a2Var.getChildCount(); i12++) {
                if (!((f2) a2Var.getChildAt(i12)).h) {
                    a2Var.getChildAt(i12).setTranslationY(this.I);
                }
            }
            y1Var.setTranslationY(this.I);
            frameLayout.setTranslationY(this.I);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.J, this.I < AndroidUtilities.dp(this.f399y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, hw0 hw0Var) {
        c6 resourceProvider;
        if (n2Var == null) {
            resourceProvider = null;
        } else if (n2Var.getLastStoryViewer() != null && !n2Var.getLastStoryViewer().D0) {
            resourceProvider = n2Var.getLastStoryViewer().f13515y;
        } else {
            resourceProvider = n2Var.getResourceProvider();
        }
        this(n2Var, context, i10, z10, i11, z11, hw0Var, resourceProvider);
    }

    public g2(org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, hw0 hw0Var, c6 c6Var) {
        super(context, c6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.G = 255;
        this.f390b = n2Var;
        this.F = hw0Var;
        fixNavigationBar(getThemedColor(g6.f23124h5));
        this.f399y = i11;
        this.A = z11;
        this.f398x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p1 p1Var = new p1(this, getContext(), 1);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new gw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((gw0) this.d.get(i12)).f38486a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            gw0 gw0Var = (gw0) this.d.get(i12);
            this.d.clear();
            this.d.add(gw0Var);
            i12 = 0;
        }
        gw0 gw0Var2 = (gw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        i2 i2Var = new i2(g6.ak, g6.bk, g6.ck, -1, null);
        i2Var.f466o = 1.1f;
        i2Var.f467p = 1.5f;
        i2Var.f468q = -0.2f;
        i2Var.f464m = true;
        y1 y1Var = new y1(this, getContext(), i2Var, 0);
        this.f395r = y1Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int iDp = AndroidUtilities.dp(12.0f);
        int iK = i0.b.k(-1, 40);
        int iK2 = i0.b.k(-1, 100);
        imageView.setBackground(g6.i0(iDp, iDp, iDp, iDp, iK, iK2, iK2));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {

            public final g2 f664b;

            {
                this.f664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f664b.dismiss();
                        break;
                    default:
                        this.f664b.dismiss();
                        break;
                }
            }
        });
        p1Var.addView(y1Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        a2 a2Var = new a2(this, getContext());
        this.f394n = a2Var;
        a2Var.setOverScrollMode(2);
        a2Var.setOffscreenPageLimit(0);
        a2Var.setAdapter(new b2(this, i13));
        this.C = i12;
        a2Var.setCurrentItem(i12);
        p1Var.addView(a2Var, z5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        p1Var.addView(frameLayout, z5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ia iaVar = new ia(getContext(), a2Var, this.d.size());
        a2Var.b(new c2(this, iaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p1Var);
        linearLayout.setOrientation(1);
        int i14 = g6.V8;
        int i15 = g6.P9;
        iaVar.f29324n = i14;
        iaVar.f29325r = i15;
        if (!z11) {
            linearLayout.addView(iaVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        s1 s1Var = new s1(getContext(), c6Var, true);
        this.f391c = s1Var;
        s1Var.f647r.setOnClickListener(new u1(this, n2Var, z11, gw0Var2, 0));
        final int i16 = 1;
        s1Var.f644e.setOnClickListener(new View.OnClickListener(this) {

            public final g2 f664b;

            {
                this.f664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.f664b.dismiss();
                        break;
                    default:
                        this.f664b.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(s1Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(g6.f23124h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            s1Var.c(i5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            s1Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        C();
        this.customViewGravity = 83;
        w wVar = new w(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = wVar;
        int i17 = this.backgroundPaddingLeft;
        wVar.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
