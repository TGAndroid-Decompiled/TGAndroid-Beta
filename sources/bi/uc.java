package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wn;
public final class uc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public k71 Y;
    public boolean Z;

    public uc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, u6Var);
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.k(this, 4));
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        aa0 aa0Var = new aa0(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        aa0Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new u6(this, 6)));
        aa0Var.setGravity(17);
        aa0Var.setMaxWidth(fi.v3.a(aa0Var.getText(), aa0Var.getPaint()));
        frameLayout.addView(aa0Var, kb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, frameLayout, u6Var);
        this.containerView.addView(new z00(getContext()), kb1.g(-1.0f, -1));
        k71 k71Var = this.Y;
        if (k71Var != null) {
            k71Var.O(false);
        }
    }

    public static void P(uc ucVar, int i10) {
        u61 G;
        k71 k71Var = ucVar.Y;
        if (k71Var != null && (G = k71Var.G(i10 - 1)) != null) {
            k71 k71Var2 = ucVar.Y;
            if (G.d == -1) {
                ucVar.Z = !ucVar.Z;
                k71Var2.O(true);
                ucVar.d.w0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(ucVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null) {
                    ca.y(ucVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new m5(3, ucVar, G), null);
                }
            }
        }
    }

    public static void Q(uc ucVar, u61 u61Var, Boolean bool, String str) {
        if (ucVar.getContext() != null) {
            ucVar.dismiss();
            ca.y(ucVar.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) u61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.f35591x0.c(true);
                    }
                } else if (str != null) {
                    ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, k71 k71Var) {
        int i10;
        ic.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = ca.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(oc.a(i13, i12, tL_starsTopupOption));
                    i12++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i11 > 0) {
                if (z11) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i14 = ic.f4848a;
                u61 K = u61.K(ic.class);
                K.d = -1;
                K.f33249l = string;
                K.f33244f = !this.Z;
                K.f33254q = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
        }
        arrayList.add(u61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k71Var = this.Y) != null) {
            k71Var.O(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        jk jkVar;
        long j10 = ca.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.I9() && (jkVar = wnVar.Y) != null) {
                jkVar.L();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 12), this.resourcesProvider);
        this.Y = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
