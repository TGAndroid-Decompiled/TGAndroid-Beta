package ci;

import ai.pa;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class c2 implements Runnable {
    public final int f5212a;
    public final p4 f5213b;

    public c2(p4 p4Var, int i10) {
        this.f5212a = i10;
        this.f5213b = p4Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f5212a) {
            case 0:
                this.f5213b.f5676j2.setVisibility(8);
                return;
            case 1:
                p4 p4Var = this.f5213b;
                if (!p4Var.J0.H0) {
                    p4Var.f5727z3 = null;
                    if (p4Var.H0 == null) {
                        ei.x3 x3Var = new ei.x3(p4Var.getContext(), 3);
                        x3Var.l(1.0f, -22.0f);
                        p4Var.H0 = x3Var;
                        x3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        ei.x3 x3Var2 = p4Var.H0;
                        x3Var2.U = false;
                        x3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        p4Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        q3 q3Var = p4Var.f5652c1;
                        ei.x3 x3Var3 = p4Var.H0;
                        if (p4Var.f5719x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        q3Var.addView(x3Var3, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    p4Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f5213b.Q0();
                return;
            case 3:
                ((q9) this.f5213b.Q1).b(true);
                return;
            case 4:
                this.f5213b.r0(true);
                return;
            case 5:
                z9 z9Var = this.f5213b.J0;
                if (z9Var != null) {
                    z9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f5213b.O0();
                return;
            case 7:
                p4 p4Var2 = this.f5213b;
                p4Var2.L3 = 0L;
                u2 u2Var = p4Var2.f5649b2;
                if (u2Var != null) {
                    u2Var.I(true);
                    p4Var2.f5649b2.Q1();
                    p4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                p4 p4Var3 = this.f5213b;
                Activity findActivity = AndroidUtilities.findActivity(p4Var3.getContext());
                if (findActivity != null) {
                    pa paVar = new pa(15, p4Var3, findActivity);
                    z9 z9Var2 = ((q9) p4Var3.Q1).d;
                    y9 y9Var = z9Var2.f6265z0;
                    if (y9Var != null) {
                        z10 = y9Var.release(paVar);
                        z9Var2.f6265z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(paVar, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                z9 z9Var3 = ((q9) this.f5213b.Q1).d;
                z9Var3.f6230i1 = false;
                z9Var3.P();
                return;
            case 10:
                this.f5213b.L0(null);
                return;
            case 11:
                this.f5213b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                p4 p4Var4 = this.f5213b;
                p4Var4.U3 = true;
                p4Var4.setActive(false);
                return;
        }
    }
}
