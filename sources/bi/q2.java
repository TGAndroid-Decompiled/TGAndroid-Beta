package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class q2 implements Runnable {
    public final int f3594a;
    public final o5 f3595b;

    public q2(o5 o5Var, int i10) {
        this.f3594a = i10;
        this.f3595b = o5Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f3594a) {
            case 0:
                this.f3595b.f3433j2.setVisibility(8);
                return;
            case 1:
                o5 o5Var = this.f3595b;
                if (!o5Var.J0.H0) {
                    o5Var.f3483z3 = null;
                    if (o5Var.H0 == null) {
                        di.f4 f4Var = new di.f4(o5Var.getContext(), 3);
                        f4Var.l(1.0f, -22.0f);
                        o5Var.H0 = f4Var;
                        f4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        di.f4 f4Var2 = o5Var.H0;
                        f4Var2.U = false;
                        f4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        o5Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        l4 l4Var = o5Var.f3409c1;
                        di.f4 f4Var3 = o5Var.H0;
                        if (o5Var.f3475x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        l4Var.addView(f4Var3, w7.x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    o5Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f3595b.Q0();
                return;
            case 3:
                ((gb) this.f3595b.Q1).b(true);
                return;
            case 4:
                this.f3595b.r0(true);
                return;
            case 5:
                pb pbVar = this.f3595b.J0;
                if (pbVar != null) {
                    pbVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f3595b.O0();
                return;
            case 7:
                o5 o5Var2 = this.f3595b;
                o5Var2.L3 = 0L;
                n3 n3Var = o5Var2.f3406b2;
                if (n3Var != null) {
                    n3Var.K(true);
                    o5Var2.f3406b2.R1();
                    o5Var2.r0(true);
                    return;
                }
                return;
            case 8:
                o5 o5Var3 = this.f3595b;
                Activity findActivity = AndroidUtilities.findActivity(o5Var3.getContext());
                if (findActivity != null) {
                    a1.e eVar = new a1.e(20, o5Var3, findActivity);
                    pb pbVar2 = ((gb) o5Var3.Q1).d;
                    ob obVar = pbVar2.f3588z0;
                    if (obVar != null) {
                        z10 = obVar.release(eVar);
                        pbVar2.f3588z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(eVar, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                pb pbVar3 = ((gb) this.f3595b.Q1).d;
                pbVar3.f3553i1 = false;
                pbVar3.P();
                return;
            case 10:
                this.f3595b.L0(null);
                return;
            case 11:
                this.f3595b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                o5 o5Var4 = this.f3595b;
                o5Var4.U3 = true;
                o5Var4.setActive(false);
                return;
        }
    }
}
