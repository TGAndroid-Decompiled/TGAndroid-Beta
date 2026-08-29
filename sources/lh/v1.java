package lh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class v1 implements Runnable {
    public final int f16309a;
    public final d4 f16310b;

    public v1(d4 d4Var, int i10) {
        this.f16309a = i10;
        this.f16310b = d4Var;
    }

    @Override
    public final void run() {
        float f9;
        boolean z10;
        switch (this.f16309a) {
            case 0:
                this.f16310b.f15482f2.setVisibility(8);
                return;
            case 1:
                d4 d4Var = this.f16310b;
                if (!d4Var.F0.D0) {
                    d4Var.f15534v3 = null;
                    if (d4Var.D0 == null) {
                        nh.t3 t3Var = new nh.t3(d4Var.getContext(), 3);
                        t3Var.m(1.0f, -22.0f);
                        d4Var.D0 = t3Var;
                        t3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        nh.t3 t3Var2 = d4Var.D0;
                        t3Var2.Q = false;
                        t3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        d4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        h3 h3Var = d4Var.Y0;
                        nh.t3 t3Var3 = d4Var.D0;
                        if (d4Var.f15525t2) {
                            f9 = 0.0f;
                        } else {
                            f9 = 56.0f;
                        }
                        h3Var.addView(t3Var3, i7.f6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f9));
                    }
                    d4Var.D0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f16310b.Q0();
                return;
            case 3:
                ((z8) this.f16310b.M1).b(true);
                return;
            case 4:
                this.f16310b.r0(true);
                return;
            case 5:
                i9 i9Var = this.f16310b.F0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f16310b.O0();
                return;
            case 7:
                d4 d4Var2 = this.f16310b;
                d4Var2.H3 = 0L;
                n2 n2Var = d4Var2.X1;
                if (n2Var != null) {
                    n2Var.J(true);
                    d4Var2.X1.R1();
                    d4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                d4 d4Var3 = this.f16310b;
                Activity findActivity = AndroidUtilities.findActivity(d4Var3.getContext());
                if (findActivity != null) {
                    jh.w2 w2Var = new jh.w2(29, d4Var3, findActivity);
                    i9 i9Var2 = ((z8) d4Var3.M1).d;
                    h9 h9Var = i9Var2.f15788v0;
                    if (h9Var != null) {
                        z10 = h9Var.release(w2Var);
                        i9Var2.f15788v0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(w2Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                i9 i9Var3 = ((z8) this.f16310b.M1).d;
                i9Var3.f15755e1 = false;
                i9Var3.P();
                return;
            case 10:
                this.f16310b.L0(null);
                return;
            case 11:
                this.f16310b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                d4 d4Var4 = this.f16310b;
                d4Var4.Q3 = true;
                d4Var4.setActive(false);
                return;
        }
    }
}
