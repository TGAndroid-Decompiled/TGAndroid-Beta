package di;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.PremiumPreviewFragment;
public final class c2 implements Runnable {
    public final int f8449a;
    public final q4 f8450b;

    public c2(q4 q4Var, int i10) {
        this.f8449a = i10;
        this.f8450b = q4Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f8449a) {
            case 0:
                this.f8450b.Y1.setVisibility(8);
                return;
            case 1:
                q4 q4Var = this.f8450b;
                if (!q4Var.f9047y0.H0) {
                    q4Var.f9010o3 = null;
                    if (q4Var.f9039w0 == null) {
                        fi.v3 v3Var = new fi.v3(q4Var.getContext(), 3);
                        v3Var.l(1.0f, -22.0f);
                        q4Var.f9039w0 = v3Var;
                        v3Var.h(i0.a.o(i0.a.f(0.13f, -16777216, -1), 240));
                        fi.v3 v3Var2 = q4Var.f9039w0;
                        v3Var2.U = false;
                        v3Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        q4Var.f9039w0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        q3 q3Var = q4Var.R0;
                        fi.v3 v3Var3 = q4Var.f9039w0;
                        if (q4Var.f9001m2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        q3Var.addView(v3Var3, gb1.h(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    q4Var.f9039w0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f8450b.O0();
                return;
            case 3:
                ((p9) this.f8450b.F1).b(true);
                return;
            case 4:
                this.f8450b.p0(true);
                return;
            case 5:
                y9 y9Var = this.f8450b.f9047y0;
                if (y9Var != null) {
                    y9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f8450b.M0();
                return;
            case 7:
                q4 q4Var2 = this.f8450b;
                q4Var2.A3 = 0L;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.G(true);
                    q4Var2.Q1.O1();
                    q4Var2.p0(true);
                    return;
                }
                return;
            case 8:
                q4 q4Var3 = this.f8450b;
                Activity findActivity = AndroidUtilities.findActivity(q4Var3.getContext());
                if (findActivity != null) {
                    bi.f2 f2Var = new bi.f2(29, q4Var3, findActivity);
                    y9 y9Var2 = ((p9) q4Var3.F1).d;
                    x9 x9Var = y9Var2.f9472z0;
                    if (x9Var != null) {
                        z10 = x9Var.release(f2Var);
                        y9Var2.f9472z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(f2Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                y9 y9Var3 = ((p9) this.f8450b.F1).d;
                y9Var3.f9437i1 = false;
                y9Var3.P();
                return;
            case 10:
                this.f8450b.J0(null);
                return;
            case 11:
                this.f8450b.a1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                q4 q4Var4 = this.f8450b;
                q4Var4.J3 = true;
                q4Var4.setActive(false);
                return;
        }
    }
}
