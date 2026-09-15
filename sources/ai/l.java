package ai;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wo;
public final class l implements e2.h {
    public final int f1159a;
    public final long f1160b;
    public final Object f1161c;
    public final Object d;
    public final Object e;

    public l(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f1159a = i10;
        this.f1161c = obj;
        this.d = obj2;
        this.f1160b = j3;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        j jVar;
        int i10 = this.f1159a;
        long j3 = this.f1160b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f1161c;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj4;
                a0 a0Var = (a0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.oc E = ci.oc.E(b0Var.f542e0.getParentActivity(), b0Var.f543f);
                    E.N = j3;
                    ci.ec ecVar = E.f5208c1;
                    if (ecVar != null) {
                        ecVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(ci.jc.c(a0Var));
                    return;
                }
                return;
            case 1:
                l9 l9Var = (l9) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    hVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j10 = this.f1160b;
                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new l(l9Var, hVar, j10, tL_premium_boostsStatus, 2));
                hVar.accept(Boolean.FALSE);
                return;
            case 2:
                l9 l9Var2 = (l9) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    hVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (l9Var2.j(j3)) {
                    jVar = new j(l9Var2, j3, 3);
                } else {
                    jVar = null;
                }
                int i11 = rg.j0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    rg.j0 j0Var = new rg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.G1(canApplyBoost);
                    j0Var.F1(tL_premium_boostsStatus2, true);
                    j0Var.H1(j3);
                    j0Var.Q0 = jVar;
                    j0Var.show();
                }
                hVar2.accept(Boolean.FALSE);
                return;
            case 3:
                wo.X((wo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f1160b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                yh.a4.d0((yh.a4) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f1160b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public l(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f1159a = i10;
        this.f1161c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1160b = j3;
    }
}
