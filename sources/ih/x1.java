package ih;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class x1 implements Runnable {
    public final int f12314a;
    public final i4 f12315b;

    public x1(i4 i4Var, int i9) {
        this.f12314a = i9;
        this.f12315b = i4Var;
    }

    @Override
    public final void run() {
        float f10;
        boolean z10;
        switch (this.f12314a) {
            case 0:
                this.f12315b.f11546f2.setVisibility(8);
                return;
            case 1:
                i4 i4Var = this.f12315b;
                if (!i4Var.F0.D0) {
                    i4Var.f11598v3 = null;
                    if (i4Var.D0 == null) {
                        kh.x3 x3Var = new kh.x3(i4Var.getContext(), 3);
                        x3Var.m(1.0f, -22.0f);
                        i4Var.D0 = x3Var;
                        x3Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        kh.x3 x3Var2 = i4Var.D0;
                        x3Var2.Q = false;
                        x3Var2.t(LocaleController.getString(R.string.ReactionLongTapHint));
                        i4Var.D0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        l3 l3Var = i4Var.Y0;
                        kh.x3 x3Var3 = i4Var.D0;
                        if (i4Var.f11589t2) {
                            f10 = 0.0f;
                        } else {
                            f10 = 56.0f;
                        }
                        l3Var.addView(x3Var3, g7.e6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f10));
                    }
                    i4Var.D0.v();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f12315b.Q0();
                return;
            case 3:
                ((d9) this.f12315b.M1).b(true);
                return;
            case 4:
                this.f12315b.r0(true);
                return;
            case 5:
                m9 m9Var = this.f12315b.F0;
                if (m9Var != null) {
                    m9Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f12315b.O0();
                return;
            case 7:
                i4 i4Var2 = this.f12315b;
                i4Var2.H3 = 0L;
                p2 p2Var = i4Var2.X1;
                if (p2Var != null) {
                    p2Var.J(true);
                    i4Var2.X1.R1();
                    i4Var2.r0(true);
                    return;
                }
                return;
            case 8:
                i4 i4Var3 = this.f12315b;
                Activity findActivity = AndroidUtilities.findActivity(i4Var3.getContext());
                if (findActivity != null) {
                    h3.g0 g0Var = new h3.g0(13, i4Var3, findActivity);
                    m9 m9Var2 = ((d9) i4Var3.M1).d;
                    l9 l9Var = m9Var2.f11829v0;
                    if (l9Var != null) {
                        z10 = l9Var.release(g0Var);
                        m9Var2.f11829v0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(g0Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                m9 m9Var3 = ((d9) this.f12315b.M1).d;
                m9Var3.f11796e1 = false;
                m9Var3.P();
                return;
            case 10:
                this.f12315b.L0(null);
                return;
            case 11:
                this.f12315b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                i4 i4Var4 = this.f12315b;
                i4Var4.Q3 = true;
                i4Var4.setActive(false);
                return;
        }
    }
}
