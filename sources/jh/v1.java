package jh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

public final class v1 implements Runnable {

    public final int f14038a;

    public final e4 f14039b;

    public v1(e4 e4Var, int i10) {
        this.f14038a = i10;
        this.f14039b = e4Var;
    }

    @Override
    public final void run() {
        boolean zRelease;
        switch (this.f14038a) {
            case 0:
                this.f14039b.f13233f2.setVisibility(8);
                break;
            case 1:
                e4 e4Var = this.f14039b;
                if (!e4Var.F0.D0) {
                    e4Var.f13285v3 = null;
                    if (e4Var.D0 == null) {
                        lh.w3 w3Var = new lh.w3(e4Var.getContext(), 3);
                        w3Var.m(1.0f, -22.0f);
                        e4Var.D0 = w3Var;
                        w3Var.h(i0.b.k(i0.b.d(0.13f, -16777216, -1), 240));
                        lh.w3 w3Var2 = e4Var.D0;
                        w3Var2.Q = false;
                        w3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        e4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        e4Var.Y0.addView(e4Var.D0, h7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, e4Var.f13276t2 ? 0.0f : 56.0f));
                    }
                    e4Var.D0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.f14039b.Q0();
                break;
            case 3:
                ((z8) this.f14039b.M1).b(true);
                break;
            case 4:
                this.f14039b.r0(true);
                break;
            case 5:
                i9 i9Var = this.f14039b.F0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                }
                break;
            case 6:
                this.f14039b.O0();
                break;
            case 7:
                e4 e4Var2 = this.f14039b;
                e4Var2.H3 = 0L;
                o2 o2Var = e4Var2.X1;
                if (o2Var != null) {
                    o2Var.K(true);
                    e4Var2.X1.Q1();
                    e4Var2.r0(true);
                }
                break;
            case 8:
                e4 e4Var3 = this.f14039b;
                Activity activityFindActivity = AndroidUtilities.findActivity(e4Var3.getContext());
                if (activityFindActivity != null) {
                    hh.m5 m5Var = new hh.m5(22, e4Var3, activityFindActivity);
                    i9 i9Var2 = ((z8) e4Var3.M1).d;
                    h9 h9Var = i9Var2.f13510v0;
                    if (h9Var != null) {
                        zRelease = h9Var.release(m5Var);
                        i9Var2.f13510v0 = null;
                    } else {
                        zRelease = false;
                    }
                    if (!zRelease) {
                        AndroidUtilities.runOnUIThread(m5Var, 80L);
                    }
                    break;
                }
                break;
            case 9:
                i9 i9Var3 = ((z8) this.f14039b.M1).d;
                i9Var3.f13477e1 = false;
                i9Var3.P();
                break;
            case 10:
                this.f14039b.L0(null);
                break;
            case 11:
                this.f14039b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                e4 e4Var4 = this.f14039b;
                e4Var4.Q3 = true;
                e4Var4.setActive(false);
                break;
        }
    }
}
