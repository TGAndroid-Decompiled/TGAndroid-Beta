package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class r2 implements Runnable {
    public final int f3608a;
    public final q5 f3609b;

    public r2(q5 q5Var, int i10) {
        this.f3608a = i10;
        this.f3609b = q5Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f3608a) {
            case 0:
                this.f3609b.f3539j2.setVisibility(8);
                return;
            case 1:
                q5 q5Var = this.f3609b;
                if (!q5Var.J0.H0) {
                    q5Var.f3590z3 = null;
                    if (q5Var.H0 == null) {
                        di.d4 d4Var = new di.d4(q5Var.getContext(), 3);
                        d4Var.l(1.0f, -22.0f);
                        q5Var.H0 = d4Var;
                        d4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        di.d4 d4Var2 = q5Var.H0;
                        d4Var2.U = false;
                        d4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q5Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        o4 o4Var = q5Var.f3515c1;
                        di.d4 d4Var3 = q5Var.H0;
                        if (q5Var.f3582x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        o4Var.addView(d4Var3, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 85));
                    }
                    q5Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f3609b.Q0();
                return;
            case 3:
                ((jb) this.f3609b.Q1).b(true);
                return;
            case 4:
                this.f3609b.r0(true);
                return;
            case 5:
                sb sbVar = this.f3609b.J0;
                if (sbVar != null) {
                    sbVar.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f3609b.O0();
                return;
            case 7:
                q5 q5Var2 = this.f3609b;
                q5Var2.L3 = 0L;
                q3 q3Var = q5Var2.f3512b2;
                if (q3Var != null) {
                    q3Var.I(true);
                    q5Var2.f3512b2.O1();
                    q5Var2.r0(true);
                    return;
                }
                return;
            case 8:
                q5 q5Var3 = this.f3609b;
                Activity findActivity = AndroidUtilities.findActivity(q5Var3.getContext());
                if (findActivity != null) {
                    a1.f fVar = new a1.f(22, q5Var3, findActivity);
                    sb sbVar2 = ((jb) q5Var3.Q1).d;
                    rb rbVar = sbVar2.f3720z0;
                    if (rbVar != null) {
                        z10 = rbVar.release(fVar);
                        sbVar2.f3720z0 = null;
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
                sb sbVar3 = ((jb) this.f3609b.Q1).d;
                sbVar3.f3685i1 = false;
                sbVar3.P();
                return;
            case 10:
                this.f3609b.L0(null);
                return;
            case 11:
                this.f3609b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                q5 q5Var4 = this.f3609b;
                q5Var4.U3 = true;
                q5Var4.setActive(false);
                return;
        }
    }
}
