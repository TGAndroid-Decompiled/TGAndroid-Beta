package jh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class z9 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout T;
    public k51 U;
    public boolean V;

    public z9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, 1, c6Var);
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bg.o(this, 10));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f34660e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        y80 y80Var = new y80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new o(this, 16)));
        y80Var.setGravity(17);
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()));
        frameLayout.addView(y80Var, i7.f6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        this.containerView.addView(new n00(getContext()), i7.f6.c(-1.0f, -1));
        k51 k51Var = this.U;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    public static void P(z9 z9Var, int i10) {
        w41 G;
        k51 k51Var = z9Var.U;
        if (k51Var != null && (G = k51Var.G(i10 - 1)) != null) {
            k51 k51Var2 = z9Var.U;
            if (G.d == -1) {
                z9Var.V = !z9Var.V;
                k51Var2.N(true);
                z9Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(u9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(z9Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null) {
                    s7.y(z9Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bh.v(6, z9Var, G), null);
                }
            }
        }
    }

    public static void Q(z9 z9Var, w41 w41Var, Boolean bool, String str) {
        if (z9Var.getContext() != null) {
            z9Var.dismiss();
            s7.y(z9Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    tc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w41Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.f35599t0.c(true);
                    }
                } else if (str != null) {
                    th.r(R.string.UnknownErrorCode, new Object[]{str}, tc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, k51 k51Var) {
        int i10;
        th.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = s7.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.V) {
                    i11++;
                } else {
                    arrayList.add(u9.a(i13, i12, tL_starsTopupOption));
                    i12++;
                }
            }
            boolean z11 = this.V;
            if (!z11 && i11 > 0) {
                if (z11) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i14 = o9.f12588a;
                w41 J = w41.J(o9.class);
                J.d = -1;
                J.f34300l = string;
                J.f34295f = !this.V;
                J.f34305q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
            arrayList.add(w41.n(31));
        }
        arrayList.add(w41.k(this.T));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k51Var = this.U) != null) {
            k51Var.N(true);
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
        dk dkVar;
        long j10 = s7.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof tn) {
            tn tnVar = (tn) R;
            if (tnVar.x9() && (dkVar = tnVar.U) != null) {
                dkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 22), this.resourcesProvider);
        this.U = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
