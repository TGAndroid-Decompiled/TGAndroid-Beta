package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class c3 implements Runnable {
    public final int f622a;
    public final f6 f623b;

    public c3(f6 f6Var, int i10) {
        this.f622a = i10;
        this.f623b = f6Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f622a) {
            case 0:
                this.f623b.f827j2.setVisibility(8);
                return;
            case 1:
                f6 f6Var = this.f623b;
                if (!f6Var.J0.H0) {
                    f6Var.f877z3 = null;
                    if (f6Var.H0 == null) {
                        ci.f4 f4Var = new ci.f4(f6Var.getContext(), 3);
                        f4Var.l(1.0f, -22.0f);
                        f6Var.H0 = f4Var;
                        f4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ci.f4 f4Var2 = f6Var.H0;
                        f4Var2.U = false;
                        f4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        f6Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        a5 a5Var = f6Var.f803c1;
                        ci.f4 f4Var3 = f6Var.H0;
                        if (f6Var.f869x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        a5Var.addView(f4Var3, w7.x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    f6Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f623b.Q0();
                return;
            case 3:
                ((ac) this.f623b.Q1).b(true);
                return;
            case 4:
                this.f623b.r0(true);
                return;
            case 5:
                jc jcVar = this.f623b.J0;
                if (jcVar != null) {
                    jcVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f623b.O0();
                return;
            case 7:
                f6 f6Var2 = this.f623b;
                f6Var2.L3 = 0L;
                a4 a4Var = f6Var2.f800b2;
                if (a4Var != null) {
                    a4Var.L(true);
                    f6Var2.f800b2.S1();
                    f6Var2.r0(true);
                    return;
                }
                return;
            case 8:
                f6 f6Var3 = this.f623b;
                Activity findActivity = AndroidUtilities.findActivity(f6Var3.getContext());
                if (findActivity != null) {
                    a1.e eVar = new a1.e(11, f6Var3, findActivity);
                    jc jcVar2 = ((ac) f6Var3.Q1).d;
                    ic icVar = jcVar2.f1123z0;
                    if (icVar != null) {
                        z10 = icVar.release(eVar);
                        jcVar2.f1123z0 = null;
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
                jc jcVar3 = ((ac) this.f623b.Q1).d;
                jcVar3.f1088i1 = false;
                jcVar3.P();
                return;
            case 10:
                this.f623b.L0(null);
                return;
            case 11:
                this.f623b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                f6 f6Var4 = this.f623b;
                f6Var4.U3 = true;
                f6Var4.setActive(false);
                return;
        }
    }
}
