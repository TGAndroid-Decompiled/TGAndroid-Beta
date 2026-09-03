package lh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ro;
public final class w1 implements h5.d {
    public final int f13262a;
    public final long f13263b;
    public final Object f13264c;
    public final Object d;
    public final Object e;

    public w1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f13262a = i10;
        this.f13264c = obj;
        this.d = obj2;
        this.f13263b = j10;
        this.e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        gg.y1 y1Var;
        int i10 = this.f13262a;
        long j10 = this.f13263b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f13264c;
        switch (i10) {
            case 0:
                g5.D0((g5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f13263b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                nh.q qVar = (nh.q) obj4;
                nh.p pVar = (nh.p) obj3;
                ((org.telegram.ui.ActionBar.d2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ph.da E = ph.da.E(qVar.f15738b0.getParentActivity(), qVar.f15743f);
                    E.K = j10;
                    ph.t9 t9Var = E.Z0;
                    if (t9Var != null) {
                        t9Var.setDialogId(j10);
                    }
                    E.J = false;
                    E.R(ph.y9.c(pVar));
                    return;
                }
                return;
            case 2:
                nh.t6 t6Var = (nh.t6) obj4;
                h5.d dVar = (h5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f13263b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new w1(t6Var, dVar, j11, tL_premium_boostsStatus));
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                nh.t6 t6Var2 = (nh.t6) obj4;
                h5.d dVar2 = (h5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    dVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (t6Var2.j(j10)) {
                    y1Var = new gg.y1(t6Var2, j10, 7);
                } else {
                    y1Var = null;
                }
                int i11 = eg.v0.S0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    eg.v0 v0Var = new eg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    v0Var.G1(canApplyBoost);
                    v0Var.F1(tL_premium_boostsStatus2, true);
                    v0Var.H1(j10);
                    v0Var.N0 = y1Var;
                    v0Var.show();
                }
                dVar2.accept(Boolean.FALSE);
                return;
            default:
                ro.Y((ro) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f13263b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public w1(nh.t6 t6Var, h5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f13262a = 3;
        this.f13264c = t6Var;
        this.e = dVar;
        this.f13263b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public w1(nh.t6 t6Var, h5.d dVar, MessagesController messagesController, long j10) {
        this.f13262a = 2;
        this.f13264c = t6Var;
        this.d = dVar;
        this.e = messagesController;
        this.f13263b = j10;
    }

    public w1(ro roVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f13262a = 4;
        this.f13264c = roVar;
        this.e = d2Var;
        this.d = tL_premium_boostsStatus;
        this.f13263b = j10;
    }
}
