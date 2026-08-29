package jh;

import nh.gb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ko;
public final class w1 implements f5.d {
    public final int f13012a;
    public final long f13013b;
    public final Object f13014c;
    public final Object d;
    public final Object f13015e;

    public w1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f13012a = i10;
        this.f13014c = obj;
        this.d = obj2;
        this.f13013b = j10;
        this.f13015e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        eg.z1 z1Var;
        int i10 = this.f13012a;
        long j10 = this.f13013b;
        Object obj2 = this.d;
        Object obj3 = this.f13015e;
        Object obj4 = this.f13014c;
        switch (i10) {
            case 0:
                h5.D0((h5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f13013b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                lh.p pVar = (lh.p) obj4;
                lh.o oVar = (lh.o) obj3;
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gb E = gb.E(pVar.f16043a0.getParentActivity(), pVar.f16051f);
                    E.J = j10;
                    nh.wa waVar = E.Y0;
                    if (waVar != null) {
                        waVar.setDialogId(j10);
                    }
                    E.I = false;
                    E.R(nh.bb.c(oVar));
                    return;
                }
                return;
            case 2:
                lh.s6 s6Var = (lh.s6) obj4;
                f5.d dVar = (f5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f13013b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new w1(s6Var, dVar, j11, tL_premium_boostsStatus));
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                lh.s6 s6Var2 = (lh.s6) obj4;
                f5.d dVar2 = (f5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    dVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (s6Var2.j(j10)) {
                    z1Var = new eg.z1(s6Var2, j10, 7);
                } else {
                    z1Var = null;
                }
                int i11 = cg.v0.R0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    cg.v0 v0Var = new cg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    v0Var.G1(canApplyBoost);
                    v0Var.F1(tL_premium_boostsStatus2, true);
                    v0Var.H1(j10);
                    v0Var.M0 = z1Var;
                    v0Var.show();
                }
                dVar2.accept(Boolean.FALSE);
                return;
            default:
                ko.Y((ko) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f13013b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public w1(lh.s6 s6Var, f5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f13012a = 3;
        this.f13014c = s6Var;
        this.f13015e = dVar;
        this.f13013b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public w1(lh.s6 s6Var, f5.d dVar, MessagesController messagesController, long j10) {
        this.f13012a = 2;
        this.f13014c = s6Var;
        this.d = dVar;
        this.f13015e = messagesController;
        this.f13013b = j10;
    }

    public w1(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f13012a = 4;
        this.f13014c = koVar;
        this.f13015e = c2Var;
        this.d = tL_premium_boostsStatus;
        this.f13013b = j10;
    }
}
