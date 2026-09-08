package bi;

import di.fc;
import di.kc;
import di.pc;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xo;
public final class i implements e2.h {
    public final int f3105a;
    public final long f3106b;
    public final Object f3107c;
    public final Object d;
    public final Object f3108e;

    public i(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f3105a = i10;
        this.f3107c = obj;
        this.d = obj2;
        this.f3106b = j3;
        this.f3108e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        g gVar;
        int i10 = this.f3105a;
        long j3 = this.f3106b;
        Object obj2 = this.f3108e;
        Object obj3 = this.d;
        Object obj4 = this.f3107c;
        switch (i10) {
            case 0:
                v vVar = (v) obj4;
                u uVar = (u) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    pc E = pc.E(vVar.f3881e0.getParentActivity(), vVar.f3882f);
                    E.N = j3;
                    fc fcVar = E.f7878c1;
                    if (fcVar != null) {
                        fcVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(kc.c(uVar));
                    return;
                }
                return;
            case 1:
                u8 u8Var = (u8) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    hVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j10 = this.f3106b;
                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new i(u8Var, hVar, j10, tL_premium_boostsStatus, 2));
                hVar.accept(Boolean.FALSE);
                return;
            case 2:
                u8 u8Var2 = (u8) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    hVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (u8Var2.j(j3)) {
                    gVar = new g(u8Var2, j3, 3);
                } else {
                    gVar = null;
                }
                int i11 = sg.k0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    sg.k0 k0Var = new sg.k0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    k0Var.G1(canApplyBoost);
                    k0Var.F1(tL_premium_boostsStatus2, true);
                    k0Var.H1(j3);
                    k0Var.Q0 = gVar;
                    k0Var.show();
                }
                hVar2.accept(Boolean.FALSE);
                return;
            case 3:
                xo.X((xo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f3106b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                zh.w3.d0((zh.w3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.f3106b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public i(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f3105a = i10;
        this.f3107c = obj;
        this.d = obj2;
        this.f3108e = obj3;
        this.f3106b = j3;
    }
}
