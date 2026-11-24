package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.UserInfoActivity;
public final class sg3 implements Runnable {
    public final byte a;
    public final cj3 b;

    public sg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void run() {
        qvb qvbVar;
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.g3();
                return;
            case 1:
                cj3Var.m5();
                return;
            case 2:
                cj3Var.J3();
                return;
            case 3:
                cj3Var.getMessagesController().n4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 4:
                je5 je5Var = cj3Var.r0;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                cj3Var.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 5:
                cj3Var.f0[0].d.f();
                return;
            case 6:
                SharedPreferences c1 = na7.c1();
                long j = c1.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                c1.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                cj3Var.m5();
                return;
            case 7:
                UndoView u3 = cj3Var.u3();
                if (u3 != null) {
                    u3.l(0L, 15, null, new wf3(cj3Var, (byte) 17));
                    return;
                }
                return;
            case 8:
                cj3Var.r4();
                return;
            case 9:
                cj3Var.getClass();
                cj3Var.presentFragment(new UserInfoActivity());
                return;
            case 10:
                cj3Var.N3();
                return;
            case 11:
                cj3Var.T3();
                return;
            case 12:
                ?? obj = new Object();
                obj.a = true;
                cj3Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 13:
                cj3Var.Q4(false, true);
                if (cj3Var.f0 != null) {
                    int i = 0;
                    while (true) {
                        bj3[] bj3VarArr = cj3Var.f0;
                        if (i < bj3VarArr.length) {
                            if (bj3VarArr[i].getVisibility() == 0) {
                                bj3 bj3Var = cj3Var.f0[i];
                                if (!bj3Var.d.H) {
                                    bj3Var.b(false);
                                }
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 14:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cj3Var.a3);
                cj3Var.presentFragment(new en2(bundle));
                return;
            case 15:
                cj3Var.presentFragment(new hmc());
                return;
            case 16:
                cj3Var.f0[0].a.requestLayout();
                rh3 rh3Var = cj3Var.H3;
                if (rh3Var != null && (rh3Var.getFragment() instanceof qvb)) {
                    qvbVar = (qvb) cj3Var.H3.getFragment();
                } else {
                    qvbVar = null;
                }
                if (qvbVar != null) {
                    qvbVar.B0();
                }
                cj3Var.a3(false);
                cj3Var.k5();
                hi3 hi3Var = cj3Var.D0;
                if (hi3Var != null) {
                    hi3Var.invalidate();
                    return;
                }
                return;
            case 17:
                cj3Var.u5();
                return;
            default:
                m21.e();
                cj3Var.presentFragment(new SessionsActivity(0));
                return;
        }
    }
}
