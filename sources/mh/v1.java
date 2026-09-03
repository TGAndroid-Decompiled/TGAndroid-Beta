package mh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.po;
public final class v1 implements h5.d {
    public final int f14925a;
    public final long f14926b;
    public final Object f14927c;
    public final Object d;
    public final Object f14928e;

    public v1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f14925a = i10;
        this.f14927c = obj;
        this.d = obj2;
        this.f14926b = j10;
        this.f14928e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        hg.y1 y1Var;
        int i10 = this.f14925a;
        long j10 = this.f14926b;
        Object obj2 = this.d;
        Object obj3 = this.f14928e;
        Object obj4 = this.f14927c;
        switch (i10) {
            case 0:
                g5.D0((g5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f14926b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                oh.p pVar = (oh.p) obj4;
                oh.o oVar = (oh.o) obj3;
                ((org.telegram.ui.ActionBar.d2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    qh.ba E = qh.ba.E(pVar.f17579b0.getParentActivity(), pVar.f17585f);
                    E.K = j10;
                    qh.q9 q9Var = E.Z0;
                    if (q9Var != null) {
                        q9Var.setDialogId(j10);
                    }
                    E.J = false;
                    E.R(qh.w9.c(oVar));
                    return;
                }
                return;
            case 2:
                oh.t6 t6Var = (oh.t6) obj4;
                h5.d dVar = (h5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f14926b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new v1(t6Var, dVar, j11, tL_premium_boostsStatus));
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                oh.t6 t6Var2 = (oh.t6) obj4;
                h5.d dVar2 = (h5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    dVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (t6Var2.j(j10)) {
                    y1Var = new hg.y1(t6Var2, j10, 7);
                } else {
                    y1Var = null;
                }
                int i11 = fg.v0.S0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    fg.v0 v0Var = new fg.v0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    v0Var.G1(canApplyBoost);
                    v0Var.F1(tL_premium_boostsStatus2, true);
                    v0Var.H1(j10);
                    v0Var.N0 = y1Var;
                    v0Var.show();
                }
                dVar2.accept(Boolean.FALSE);
                return;
            default:
                po.Y((po) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f14926b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public v1(oh.t6 t6Var, h5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f14925a = 3;
        this.f14927c = t6Var;
        this.f14928e = dVar;
        this.f14926b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public v1(oh.t6 t6Var, h5.d dVar, MessagesController messagesController, long j10) {
        this.f14925a = 2;
        this.f14927c = t6Var;
        this.d = dVar;
        this.f14928e = messagesController;
        this.f14926b = j10;
    }

    public v1(po poVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f14925a = 4;
        this.f14927c = poVar;
        this.f14928e = d2Var;
        this.d = tL_premium_boostsStatus;
        this.f14926b = j10;
    }
}
