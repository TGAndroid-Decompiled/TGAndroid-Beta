package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.UserInfoActivity;
public final class di3 implements Runnable {
    public final byte a;
    public final nk3 b;

    public di3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void run() {
        sxb sxbVar;
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.getNotificationCenter().k(24, new Object[0]);
                return;
            case 1:
                nk3Var.i3();
                return;
            case 2:
                nk3Var.q5();
                return;
            case 3:
                nk3Var.L3();
                return;
            case 4:
                nk3Var.getMessagesController().p4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 5:
                hg5 hg5Var = nk3Var.r0;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                nk3Var.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 6:
                nk3Var.f0[0].d.f();
                return;
            case 7:
                SharedPreferences d1 = oc7.d1();
                long j = d1.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                d1.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                nk3Var.q5();
                return;
            case 8:
                UndoView w3 = nk3Var.w3();
                if (w3 != null) {
                    w3.l(0L, 15, null, new kh3(nk3Var, (byte) 17));
                    return;
                }
                return;
            case 9:
                nk3Var.u4();
                return;
            case 10:
                nk3Var.getClass();
                nk3Var.presentFragment(new UserInfoActivity());
                return;
            case 11:
                nk3Var.Q3();
                return;
            case 12:
                nk3Var.W3();
                return;
            case 13:
                ?? obj = new Object();
                obj.a = true;
                nk3Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                nk3Var.U4(false, true);
                if (nk3Var.f0 != null) {
                    int i = 0;
                    while (true) {
                        mk3[] mk3VarArr = nk3Var.f0;
                        if (i < mk3VarArr.length) {
                            if (mk3VarArr[i].getVisibility() == 0) {
                                mk3 mk3Var = nk3Var.f0[i];
                                if (!mk3Var.d.H) {
                                    mk3Var.b(false);
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
            case 15:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", nk3Var.a3);
                nk3Var.presentFragment(new po2(bundle));
                return;
            case 16:
                nk3Var.presentFragment(new goc());
                return;
            case 17:
                nk3Var.f0[0].a.requestLayout();
                dj3 dj3Var = nk3Var.H3;
                if (dj3Var != null && (dj3Var.getFragment() instanceof sxb)) {
                    sxbVar = (sxb) nk3Var.H3.getFragment();
                } else {
                    sxbVar = null;
                }
                if (sxbVar != null) {
                    sxbVar.C0();
                }
                nk3Var.c3(false);
                nk3Var.o5();
                sj3 sj3Var = nk3Var.D0;
                if (sj3Var != null) {
                    sj3Var.invalidate();
                    return;
                }
                return;
            case 18:
                nk3Var.y5();
                return;
            default:
                u31.e();
                nk3Var.presentFragment(new SessionsActivity(0));
                return;
        }
    }
}
