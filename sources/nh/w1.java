package nh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class w1 implements Runnable {
    public final int f15999a;
    public final d4 f16000b;

    public w1(d4 d4Var, int i10) {
        this.f15999a = i10;
        this.f16000b = d4Var;
    }

    @Override
    public final void run() {
        float f10;
        boolean z4;
        switch (this.f15999a) {
            case 0:
                this.f16000b.f15180g2.setVisibility(8);
                return;
            case 1:
                d4 d4Var = this.f16000b;
                if (!d4Var.G0.E0) {
                    d4Var.f15232w3 = null;
                    if (d4Var.E0 == null) {
                        ph.f3 f3Var = new ph.f3(d4Var.getContext(), 3);
                        f3Var.l(1.0f, -22.0f);
                        d4Var.E0 = f3Var;
                        f3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        ph.f3 f3Var2 = d4Var.E0;
                        f3Var2.R = false;
                        f3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        d4Var.E0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        i3 i3Var = d4Var.Z0;
                        ph.f3 f3Var3 = d4Var.E0;
                        if (d4Var.f15223u2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        i3Var.addView(f3Var3, k7.b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    d4Var.E0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f16000b.Q0();
                return;
            case 3:
                ((z8) this.f16000b.N1).b(true);
                return;
            case 4:
                this.f16000b.r0(true);
                return;
            case 5:
                i9 i9Var = this.f16000b.G0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f16000b.O0();
                return;
            case 7:
                d4 d4Var2 = this.f16000b;
                d4Var2.I3 = 0L;
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null) {
                    o2Var.J(true);
                    d4Var2.Y1.R1();
                    d4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                d4 d4Var3 = this.f16000b;
                Activity findActivity = AndroidUtilities.findActivity(d4Var3.getContext());
                if (findActivity != null) {
                    lh.n2 n2Var = new lh.n2(28, d4Var3, findActivity);
                    i9 i9Var2 = ((z8) d4Var3.N1).d;
                    h9 h9Var = i9Var2.f15476w0;
                    if (h9Var != null) {
                        z4 = h9Var.release(n2Var);
                        i9Var2.f15476w0 = null;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        AndroidUtilities.runOnUIThread(n2Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                i9 i9Var3 = ((z8) this.f16000b.N1).d;
                i9Var3.f15443f1 = false;
                i9Var3.P();
                return;
            case 10:
                this.f16000b.L0(null);
                return;
            case 11:
                this.f16000b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                d4 d4Var4 = this.f16000b;
                d4Var4.R3 = true;
                d4Var4.setActive(false);
                return;
        }
    }
}
