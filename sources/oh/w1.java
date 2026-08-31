package oh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class w1 implements Runnable {
    public final int f17887a;
    public final f4 f17888b;

    public w1(f4 f4Var, int i10) {
        this.f17887a = i10;
        this.f17888b = f4Var;
    }

    @Override
    public final void run() {
        float f10;
        boolean z4;
        switch (this.f17887a) {
            case 0:
                this.f17888b.f17070g2.setVisibility(8);
                return;
            case 1:
                f4 f4Var = this.f17888b;
                if (!f4Var.G0.E0) {
                    f4Var.f17122w3 = null;
                    if (f4Var.E0 == null) {
                        qh.f3 f3Var = new qh.f3(f4Var.getContext(), 3);
                        f3Var.m(1.0f, -22.0f);
                        f4Var.E0 = f3Var;
                        f3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        qh.f3 f3Var2 = f4Var.E0;
                        f3Var2.R = false;
                        f3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        f4Var.E0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        j3 j3Var = f4Var.Z0;
                        qh.f3 f3Var3 = f4Var.E0;
                        if (f4Var.f17113u2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        j3Var.addView(f3Var3, k7.c6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    f4Var.E0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f17888b.Q0();
                return;
            case 3:
                ((z8) this.f17888b.N1).b(true);
                return;
            case 4:
                this.f17888b.r0(true);
                return;
            case 5:
                i9 i9Var = this.f17888b.G0;
                if (i9Var != null) {
                    i9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f17888b.O0();
                return;
            case 7:
                f4 f4Var2 = this.f17888b;
                f4Var2.I3 = 0L;
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null) {
                    p2Var.J(true);
                    f4Var2.Y1.R1();
                    f4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                f4 f4Var3 = this.f17888b;
                Activity findActivity = AndroidUtilities.findActivity(f4Var3.getContext());
                if (findActivity != null) {
                    z1 z1Var = new z1(1, f4Var3, findActivity);
                    i9 i9Var2 = ((z8) f4Var3.N1).d;
                    h9 h9Var = i9Var2.f17301w0;
                    if (h9Var != null) {
                        z4 = h9Var.release(z1Var);
                        i9Var2.f17301w0 = null;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        AndroidUtilities.runOnUIThread(z1Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                i9 i9Var3 = ((z8) this.f17888b.N1).d;
                i9Var3.f17268f1 = false;
                i9Var3.P();
                return;
            case 10:
                this.f17888b.L0(null);
                return;
            case 11:
                this.f17888b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                f4 f4Var4 = this.f17888b;
                f4Var4.R3 = true;
                f4Var4.setActive(false);
                return;
        }
    }
}
