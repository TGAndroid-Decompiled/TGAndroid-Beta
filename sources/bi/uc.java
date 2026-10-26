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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.un;
public final class uc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public j71 Y;
    public boolean Z;

    public uc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, u6Var);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.k(this, 4));
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        z90 z90Var = new z90(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        z90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new u6(this, 6)));
        z90Var.setGravity(17);
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
        frameLayout.addView(z90Var, gb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23427h5, frameLayout, u6Var);
        this.containerView.addView(new z00(getContext()), gb1.g(-1.0f, -1));
        j71 j71Var = this.Y;
        if (j71Var != null) {
            j71Var.O(false);
        }
    }

    public static void P(uc ucVar, int i10) {
        t61 G;
        j71 j71Var = ucVar.Y;
        if (j71Var != null && (G = j71Var.G(i10 - 1)) != null) {
            j71 j71Var2 = ucVar.Y;
            if (G.d == -1) {
                ucVar.Z = !ucVar.Z;
                j71Var2.O(true);
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

    public static void Q(uc ucVar, t61 t61Var, Boolean bool, String str) {
        if (ucVar.getContext() != null) {
            ucVar.dismiss();
            ca.y(ucVar.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) t61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.f35567x0.c(true);
                    }
                } else if (str != null) {
                    ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, j71 j71Var) {
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
                t61 K = t61.K(ic.class);
                K.d = -1;
                K.f32875l = string;
                K.f32870f = !this.Z;
                K.f32880q = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
        }
        arrayList.add(t61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (j71Var = this.Y) != null) {
            j71Var.O(true);
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
        hk hkVar;
        long j10 = ca.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof un) {
            un unVar = (un) R;
            if (unVar.F9() && (hkVar = unVar.Y) != null) {
                hkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 12), this.resourcesProvider);
        this.Y = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
