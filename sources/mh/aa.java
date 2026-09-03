package mh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public final class aa extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout U;
    public w51 V;
    public boolean W;

    public aa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, 1, g6Var);
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ag.h(this, 11));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        this.f31015e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        g90 g90Var = new g90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        g90Var.setTextSize(1, 12.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, g6Var));
        g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new lh.c3(this, 18)));
        g90Var.setGravity(17);
        g90Var.setMaxWidth(qh.e3.a(g90Var.getText(), g90Var.getPaint()));
        frameLayout.addView(g90Var, k7.c6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        this.containerView.addView(new s00(getContext()), k7.c6.c(-1.0f, -1));
        w51 w51Var = this.V;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(aa aaVar, int i10) {
        h51 G;
        w51 w51Var = aaVar.V;
        if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
            w51 w51Var2 = aaVar.V;
            if (G.d == -1) {
                aaVar.W = !aaVar.W;
                w51Var2.N(true);
                aaVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(aaVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null) {
                    t7.y(aaVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new eh.w(6, aaVar, G), null);
                }
            }
        }
    }

    public static void Q(aa aaVar, h51 h51Var, Boolean bool, String str) {
        if (aaVar.getContext() != null) {
            aaVar.dismiss();
            t7.y(aaVar.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    qc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h51Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity != null) {
                        launchActivity.f34174u0.c(true);
                    }
                } else if (str != null) {
                    yh.s(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        int i10;
        yh.r(R.string.TelegramStarsChoose, arrayList);
        ArrayList z4 = t7.y(this.currentAccount, false).z();
        if (z4 != null && !z4.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z4.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z4.get(i13);
                if (tL_starsTopupOption.extended && !this.W) {
                    i11++;
                } else {
                    arrayList.add(v9.a(i13, i12, tL_starsTopupOption));
                    i12++;
                }
            }
            boolean z10 = this.W;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i14 = p9.f14611a;
                h51 J = h51.J(p9.class);
                J.d = -1;
                J.f27375l = string;
                J.f27370f = !this.W;
                J.f27380q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
        }
        arrayList.add(h51.k(this.U));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w51Var = this.V) != null) {
            w51Var.N(true);
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
        long j10 = t7.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 22), this.resourcesProvider);
        this.V = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
