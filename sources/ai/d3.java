package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class d3 implements Runnable {
    public final int f817a;
    public final f6 f818b;

    public d3(f6 f6Var, int i10) {
        this.f817a = i10;
        this.f818b = f6Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f817a) {
            case 0:
                this.f818b.f979j2.setVisibility(8);
                return;
            case 1:
                f6 f6Var = this.f818b;
                if (!f6Var.J0.H0) {
                    f6Var.f1029z3 = null;
                    if (f6Var.H0 == null) {
                        ci.d4 d4Var = new ci.d4(f6Var.getContext(), 3);
                        d4Var.l(1.0f, -22.0f);
                        f6Var.H0 = d4Var;
                        d4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ci.d4 d4Var2 = f6Var.H0;
                        d4Var2.U = false;
                        d4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        f6Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        b5 b5Var = f6Var.f955c1;
                        ci.d4 d4Var3 = f6Var.H0;
                        if (f6Var.f1021x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        b5Var.addView(d4Var3, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 85));
                    }
                    f6Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f818b.Q0();
                return;
            case 3:
                ((bc) this.f818b.Q1).b(true);
                return;
            case 4:
                this.f818b.r0(true);
                return;
            case 5:
                kc kcVar = this.f818b.J0;
                if (kcVar != null) {
                    kcVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f818b.O0();
                return;
            case 7:
                f6 f6Var2 = this.f818b;
                f6Var2.L3 = 0L;
                b4 b4Var = f6Var2.f952b2;
                if (b4Var != null) {
                    b4Var.I(true);
                    f6Var2.f952b2.Q1();
                    f6Var2.r0(true);
                    return;
                }
                return;
            case 8:
                f6 f6Var3 = this.f818b;
                Activity findActivity = AndroidUtilities.findActivity(f6Var3.getContext());
                if (findActivity != null) {
                    a1.f fVar = new a1.f(11, f6Var3, findActivity);
                    kc kcVar2 = ((bc) f6Var3.Q1).d;
                    jc jcVar = kcVar2.f1310z0;
                    if (jcVar != null) {
                        z10 = jcVar.release(fVar);
                        kcVar2.f1310z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(fVar, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                kc kcVar3 = ((bc) this.f818b.Q1).d;
                kcVar3.f1275i1 = false;
                kcVar3.P();
                return;
            case 10:
                this.f818b.L0(null);
                return;
            case 11:
                this.f818b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                f6 f6Var4 = this.f818b;
                f6Var4.U3 = true;
                f6Var4.setActive(false);
                return;
        }
    }
}
