package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class c3 implements Runnable {
    public final int f637a;
    public final e6 f638b;

    public c3(e6 e6Var, int i10) {
        this.f637a = i10;
        this.f638b = e6Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f637a) {
            case 0:
                this.f638b.f800j2.setVisibility(8);
                return;
            case 1:
                e6 e6Var = this.f638b;
                if (!e6Var.J0.H0) {
                    e6Var.f850z3 = null;
                    if (e6Var.H0 == null) {
                        ci.e4 e4Var = new ci.e4(e6Var.getContext(), 3);
                        e4Var.l(1.0f, -22.0f);
                        e6Var.H0 = e4Var;
                        e4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ci.e4 e4Var2 = e6Var.H0;
                        e4Var2.U = false;
                        e4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        e6Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        a5 a5Var = e6Var.f776c1;
                        ci.e4 e4Var3 = e6Var.H0;
                        if (e6Var.f842x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        a5Var.addView(e4Var3, w7.y5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    e6Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f638b.Q0();
                return;
            case 3:
                ((ac) this.f638b.Q1).b(true);
                return;
            case 4:
                this.f638b.r0(true);
                return;
            case 5:
                jc jcVar = this.f638b.J0;
                if (jcVar != null) {
                    jcVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f638b.O0();
                return;
            case 7:
                e6 e6Var2 = this.f638b;
                e6Var2.L3 = 0L;
                a4 a4Var = e6Var2.f773b2;
                if (a4Var != null) {
                    a4Var.K(true);
                    e6Var2.f773b2.R1();
                    e6Var2.r0(true);
                    return;
                }
                return;
            case 8:
                e6 e6Var3 = this.f638b;
                Activity findActivity = AndroidUtilities.findActivity(e6Var3.getContext());
                if (findActivity != null) {
                    a1.e eVar = new a1.e(11, e6Var3, findActivity);
                    jc jcVar2 = ((ac) e6Var3.Q1).d;
                    ic icVar = jcVar2.f1114z0;
                    if (icVar != null) {
                        z10 = icVar.release(eVar);
                        jcVar2.f1114z0 = null;
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
                jc jcVar3 = ((ac) this.f638b.Q1).d;
                jcVar3.f1079i1 = false;
                jcVar3.P();
                return;
            case 10:
                this.f638b.L0(null);
                return;
            case 11:
                this.f638b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                e6 e6Var4 = this.f638b;
                e6Var4.U3 = true;
                e6Var4.setActive(false);
                return;
        }
    }
}
