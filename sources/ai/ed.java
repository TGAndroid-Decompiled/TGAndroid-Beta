package ai;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.sn;
public final class ed extends org.telegram.ui.Components.za implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public a71 Y;
    public boolean Z;

    public ed(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, g6Var);
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new xa(this, 3));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        w90 w90Var = new w90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        w90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.B6, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new a3.d(this, 25)));
        w90Var.setGravity(17);
        w90Var.setMaxWidth(ei.x3.a(w90Var.getText(), w90Var.getPaint()));
        frameLayout.addView(w90Var, w7.z5.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout, g6Var);
        this.containerView.addView(new x00(getContext()), w7.z5.c(-1.0f, -1));
        a71 a71Var = this.Y;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void P(ed edVar, int i10) {
        l61 G;
        a71 a71Var = edVar.Y;
        if (a71Var != null && (G = a71Var.G(i10 - 1)) != null) {
            a71 a71Var2 = edVar.Y;
            if (G.d == -1) {
                edVar.Z = !edVar.Z;
                a71Var2.N(true);
                edVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(yc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(edVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null) {
                    ha.y(edVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new r5(3, edVar, G), null);
                }
            }
        }
    }

    public static void Q(ed edVar, l61 l61Var, Boolean bool, String str) {
        if (edVar.getContext() != null) {
            edVar.dismiss();
            ha.y(edVar.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.vc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.f33503x0.c(true);
                    }
                } else if (str != null) {
                    i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.vc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, a71 a71Var) {
        int i10;
        i2.o1.q(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = ha.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(yc.a(i13, i12, tL_starsTopupOption));
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
                int i14 = rc.f2138a;
                l61 J = l61.J(rc.class);
                J.d = -1;
                J.f28227l = string;
                J.f28222f = !this.Z;
                J.f28232q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
        }
        arrayList.add(l61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (a71Var = this.Y) != null) {
            a71Var.N(true);
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
        gk gkVar;
        long j10 = ha.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (gkVar = snVar.Y) != null) {
                gkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 9), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
