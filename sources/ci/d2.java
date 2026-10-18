package ci;

import ai.pa;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class d2 implements Runnable {
    public final int f5315a;
    public final q4 f5316b;

    public d2(q4 q4Var, int i10) {
        this.f5315a = i10;
        this.f5316b = q4Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f5315a) {
            case 0:
                this.f5316b.f5796j2.setVisibility(8);
                return;
            case 1:
                q4 q4Var = this.f5316b;
                if (!q4Var.J0.H0) {
                    q4Var.f5847z3 = null;
                    if (q4Var.H0 == null) {
                        ei.x3 x3Var = new ei.x3(q4Var.getContext(), 3);
                        x3Var.l(1.0f, -22.0f);
                        q4Var.H0 = x3Var;
                        x3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        ei.x3 x3Var2 = q4Var.H0;
                        x3Var2.U = false;
                        x3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q4Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        r3 r3Var = q4Var.f5772c1;
                        ei.x3 x3Var3 = q4Var.H0;
                        if (q4Var.f5839x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        r3Var.addView(x3Var3, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 85));
                    }
                    q4Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f5316b.Q0();
                return;
            case 3:
                ((r9) this.f5316b.Q1).b(true);
                return;
            case 4:
                this.f5316b.r0(true);
                return;
            case 5:
                aa aaVar = this.f5316b.J0;
                if (aaVar != null) {
                    aaVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f5316b.O0();
                return;
            case 7:
                q4 q4Var2 = this.f5316b;
                q4Var2.L3 = 0L;
                v2 v2Var = q4Var2.f5769b2;
                if (v2Var != null) {
                    v2Var.I(true);
                    q4Var2.f5769b2.Q1();
                    q4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                q4 q4Var3 = this.f5316b;
                Activity findActivity = AndroidUtilities.findActivity(q4Var3.getContext());
                if (findActivity != null) {
                    pa paVar = new pa(15, q4Var3, findActivity);
                    aa aaVar2 = ((r9) q4Var3.Q1).d;
                    z9 z9Var = aaVar2.f5233z0;
                    if (z9Var != null) {
                        z10 = z9Var.release(paVar);
                        aaVar2.f5233z0 = null;
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
                aa aaVar3 = ((r9) this.f5316b.Q1).d;
                aaVar3.f5198i1 = false;
                aaVar3.P();
                return;
            case 10:
                this.f5316b.L0(null);
                return;
            case 11:
                this.f5316b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                q4 q4Var4 = this.f5316b;
                q4Var4.U3 = true;
                q4Var4.setActive(false);
                return;
        }
    }
}
